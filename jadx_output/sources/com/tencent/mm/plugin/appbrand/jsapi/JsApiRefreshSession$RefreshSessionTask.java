package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class JsApiRefreshSession$RefreshSessionTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.fc();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.k0 f78600f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f78601g;

    /* renamed from: h, reason: collision with root package name */
    public int f78602h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f78603i;

    /* renamed from: m, reason: collision with root package name */
    public int f78604m;

    /* renamed from: n, reason: collision with root package name */
    public int f78605n;

    /* renamed from: o, reason: collision with root package name */
    public int f78606o;

    /* renamed from: p, reason: collision with root package name */
    public int f78607p;

    /* renamed from: q, reason: collision with root package name */
    public int f78608q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f78609r;

    public JsApiRefreshSession$RefreshSessionTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78604m = parcel.readInt();
        this.f78605n = parcel.readInt();
        this.f78606o = parcel.readInt();
        this.f78602h = parcel.readInt();
        this.f78603i = parcel.readString();
        this.f78607p = parcel.readInt();
        this.f78608q = parcel.readInt();
        this.f78609r = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f78604m);
        parcel.writeInt(this.f78605n);
        parcel.writeInt(this.f78606o);
        parcel.writeInt(this.f78602h);
        parcel.writeString(this.f78603i);
        parcel.writeInt(this.f78607p);
        parcel.writeInt(this.f78608q);
        parcel.writeString(this.f78609r);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.String format;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = this.f78606o;
        if (i17 != 1) {
            if (i17 != 2) {
                format = com.tencent.mm.sdk.platformtools.t8.K0(this.f78609r) ? "fail" : java.lang.String.format("fail:%s", this.f78609r);
                hashMap.put("errCode", "-1");
                this.f78601g.a(this.f78602h, this.f78600f.p(format, hashMap));
            } else {
                format = com.tencent.mm.sdk.platformtools.t8.K0(this.f78609r) ? "fail" : java.lang.String.format("fail:%s", this.f78609r);
                hashMap.put("errCode", this.f78605n + "");
                this.f78601g.a(this.f78602h, this.f78600f.p(format, hashMap));
            }
        } else {
            hashMap.put("expireIn", this.f78604m + "");
            hashMap.put("errCode", this.f78605n + "");
            this.f78601g.a(this.f78602h, this.f78600f.p("ok", hashMap));
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.o24();
        lVar.f70665b = new r45.p24();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/js-refreshsession";
        lVar.f70667d = tj.f.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        r45.o24 o24Var = new r45.o24();
        o24Var.f381845d = this.f78603i;
        o24Var.f381846e = this.f78607p;
        lVar.f70664a = o24Var;
        if (this.f78608q > 0) {
            r45.nd7 nd7Var = new r45.nd7();
            o24Var.f381847f = nd7Var;
            nd7Var.f381296e = this.f78608q;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRefreshSession", "refreshSession appId %s, versionType, statScene %d", this.f78603i, java.lang.Integer.valueOf(this.f78607p), java.lang.Integer.valueOf(this.f78608q));
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.appbrand.jsapi.ec(this), true);
    }

    public JsApiRefreshSession$RefreshSessionTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
