package com.tencent.mm.plugin.appbrand.jsapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.x2();

    /* renamed from: f, reason: collision with root package name */
    public int f78491f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f78492g = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f78493h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f78494i;

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78491f = parcel.readInt();
        this.f78492g = parcel.readLong();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f78491f);
        parcel.writeLong(this.f78492g);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f78494i;
        if (runnable != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.w2) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "runInMainProcess flag:%d", java.lang.Integer.valueOf(this.f78491f));
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AddDownloadTaskEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AddDownloadTaskEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.1
            {
                this.__eventId = 1058823164;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AddDownloadTaskEvent addDownloadTaskEvent) {
                com.tencent.mm.autogen.events.AddDownloadTaskEvent addDownloadTaskEvent2 = addDownloadTaskEvent;
                if (!(addDownloadTaskEvent2 instanceof com.tencent.mm.autogen.events.AddDownloadTaskEvent)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiAddNativeDownloadTask", "mismatched event");
                    return false;
                }
                am.j jVar = addDownloadTaskEvent2.f53970g;
                if (jVar.f6986a != 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "not jsapi api callback");
                    return false;
                }
                boolean z17 = jVar.f6987b;
                com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask = com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.this;
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "AddNativeDownloadTaskTask callback, cancel");
                    jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.f78491f = 0;
                    jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.c();
                } else if (jVar.f6988c > 0) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    am.j jVar2 = addDownloadTaskEvent2.f53970g;
                    hashMap.put("download_id", java.lang.Long.valueOf(jVar2.f6988c));
                    long j17 = jVar2.f6988c;
                    jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.f78492g = j17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "AddNativeDownloadTaskTask callback, ok downloadId:%s", java.lang.Long.valueOf(j17));
                    jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.f78491f = 2;
                    jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.c();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "AddNativeDownloadTaskTask callback, failed");
                    jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.f78491f = 1;
                    jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.c();
                }
                jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.f78493h.dead();
                return true;
            }
        };
        this.f78493h = iListener;
        iListener.alive();
    }
}
