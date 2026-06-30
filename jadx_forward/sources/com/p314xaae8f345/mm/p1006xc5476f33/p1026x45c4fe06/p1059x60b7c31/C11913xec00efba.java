package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask */
/* loaded from: classes.dex */
public class C11913xec00efba extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11913xec00efba> f33648x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x2();

    /* renamed from: f, reason: collision with root package name */
    public int f160024f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f160025g = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f160026h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f160027i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160024f = parcel.readInt();
        this.f160025g = parcel.readLong();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f160024f);
        parcel.writeLong(this.f160025g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.Runnable runnable = this.f160027i;
        if (runnable != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w2) runnable).run();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "runInMainProcess flag:%d", java.lang.Integer.valueOf(this.f160024f));
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5154x4abd99ec> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5154x4abd99ec>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.1
            {
                this.f39173x3fe91575 = 1058823164;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5154x4abd99ec c5154x4abd99ec) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5154x4abd99ec c5154x4abd99ec2 = c5154x4abd99ec;
                if (!(c5154x4abd99ec2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5154x4abd99ec)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiAddNativeDownloadTask", "mismatched event");
                    return false;
                }
                am.j jVar = c5154x4abd99ec2.f135503g;
                if (jVar.f88519a != 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "not jsapi api callback");
                    return false;
                }
                boolean z17 = jVar.f88520b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11913xec00efba c11913xec00efba = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11913xec00efba.this;
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "AddNativeDownloadTaskTask callback, cancel");
                    c11913xec00efba.f160024f = 0;
                    c11913xec00efba.c();
                } else if (jVar.f88521c > 0) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    am.j jVar2 = c5154x4abd99ec2.f135503g;
                    hashMap.put("download_id", java.lang.Long.valueOf(jVar2.f88521c));
                    long j17 = jVar2.f88521c;
                    c11913xec00efba.f160025g = j17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "AddNativeDownloadTaskTask callback, ok downloadId:%s", java.lang.Long.valueOf(j17));
                    c11913xec00efba.f160024f = 2;
                    c11913xec00efba.c();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "AddNativeDownloadTaskTask callback, failed");
                    c11913xec00efba.f160024f = 1;
                    c11913xec00efba.c();
                }
                c11913xec00efba.f160026h.mo48814x2efc64();
                return true;
            }
        };
        this.f160026h = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }
}
