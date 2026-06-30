package com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\t\b\u0016¢\u0006\u0004\b\r\u0010\u000eB/\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\r\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016¨\u0006\u001a"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/bizvideochannel/JsApiOpenWebViewUseFastLoad$OpenWebViewUseFastLoad", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "Landroid/os/Parcel;", "src", org.chromium.base.BaseSwitches.V, "parcel", "", "flags", "writeToParcel", "describeContents", "<init>", "()V", "Lcom/tencent/mm/plugin/appbrand/jsapi/k0;", "api", "Lcom/tencent/mm/plugin/appbrand/jsapi/l;", "service", "callbackId", "Lorg/json/JSONObject;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "(Lcom/tencent/mm/plugin/appbrand/jsapi/k0;Lcom/tencent/mm/plugin/appbrand/jsapi/l;ILorg/json/JSONObject;)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/bizvideochannel/a", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class JsApiOpenWebViewUseFastLoad$OpenWebViewUseFastLoad extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.a CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel.a(null);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f80022f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f80023g;

    /* renamed from: h, reason: collision with root package name */
    public final int f80024h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONObject f80025i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f80026m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f80027n;

    public JsApiOpenWebViewUseFastLoad$OpenWebViewUseFastLoad() {
        this.f80027n = "";
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        java.lang.String str;
        super.v(parcel);
        if (parcel == null || (str = parcel.readString()) == null) {
            str = "";
        }
        this.f80025i = new org.json.JSONObject(str);
        boolean z17 = false;
        if (parcel != null && parcel.readInt() == 1) {
            z17 = true;
        }
        this.f80026m = z17;
        java.lang.String readString = parcel != null ? parcel.readString() : null;
        this.f80027n = readString != null ? readString : "";
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        super.writeToParcel(parcel, i17);
        org.json.JSONObject jSONObject = this.f80025i;
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f80026m ? 1 : 0);
        parcel.writeString(this.f80027n);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        x();
        boolean z17 = this.f80026m;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f80022f;
        int i17 = this.f80024h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80023g;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWebViewUseFastLoad", "openWebViewUseFastLoad success");
            if (lVar != null) {
                lVar.a(i17, k0Var != null ? k0Var.o("ok") : null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWebViewUseFastLoad", "openWebViewUseFastLoad failed %s", this.f80027n);
        if (lVar != null) {
            if (k0Var != null) {
                r1 = k0Var.o("failed: " + this.f80027n);
            }
            lVar.a(i17, r1);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        if (!com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(5)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWebViewUseFastLoad", "openWebViewUseFastLoad abtest closed");
            this.f80026m = false;
            this.f80027n = "abtest closed";
            c();
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).t(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f80025i, hashMap);
        this.f80026m = kotlin.jvm.internal.o.b(hashMap.get(ya.b.SUCCESS), java.lang.Boolean.TRUE);
        java.lang.Object obj = hashMap.get("desc");
        this.f80027n = obj != null ? (java.lang.String) obj : "";
        c();
    }

    public JsApiOpenWebViewUseFastLoad$OpenWebViewUseFastLoad(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f80027n = "";
        this.f80022f = k0Var;
        this.f80023g = lVar;
        this.f80024h = i17;
        this.f80025i = jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsApiOpenWebViewUseFastLoad$OpenWebViewUseFastLoad(android.os.Parcel parcel) {
        this();
        kotlin.jvm.internal.o.g(parcel, "parcel");
        v(parcel);
    }
}
