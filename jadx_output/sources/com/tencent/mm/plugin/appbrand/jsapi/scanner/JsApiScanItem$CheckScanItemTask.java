package com.tencent.mm.plugin.appbrand.jsapi.scanner;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\u0013"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiScanItem$CheckScanItemTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "in", org.chromium.base.BaseSwitches.V, "Lcom/tencent/mm/plugin/appbrand/jsapi/scanner/s;", "api", "<init>", "(Lcom/tencent/mm/plugin/appbrand/jsapi/scanner/s;)V", "inParcel", "(Landroid/os/Parcel;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class JsApiScanItem$CheckScanItemTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanItem$CheckScanItemTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.scanner.q();

    /* renamed from: f, reason: collision with root package name */
    public int f82942f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f82943g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.scanner.s f82944h;

    public JsApiScanItem$CheckScanItemTask(com.tencent.mm.plugin.appbrand.jsapi.scanner.s sVar) {
        this.f82943g = "";
        this.f82944h = sVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        this.f82942f = in6.readInt();
        java.lang.String readString = in6.readString();
        if (readString == null) {
            readString = "";
        }
        this.f82943g = readString;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.f82942f);
        dest.writeString(this.f82943g);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        x();
        com.tencent.mm.plugin.appbrand.jsapi.scanner.s sVar = this.f82944h;
        if (sVar != null) {
            int i17 = this.f82942f;
            java.lang.String str = this.f82943g;
            if (i17 != 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("errCode", java.lang.Integer.valueOf(i17));
                if (!(str.length() > 0)) {
                    str = "unknown error";
                }
                com.tencent.mm.plugin.appbrand.service.c0 c0Var = sVar.f82975g;
                if (c0Var != null) {
                    c0Var.a(sVar.f82977i, sVar.p("fail: ".concat(str), hashMap));
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = sVar.f82975g;
            java.lang.String str2 = sVar.f82976h;
            int i18 = sVar.f82977i;
            android.app.Activity Z0 = c0Var2 != null ? c0Var2.Z0() : null;
            if (Z0 == null) {
                if (c0Var2 != null) {
                    c0Var2.a(i18, sVar.o("fail:internal error invalid android context"));
                    return;
                }
                return;
            }
            nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.scanner.r(sVar, c0Var2, i18));
            com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest = new com.tencent.mm.plugin.scanner.api.ScanGoodsRequest();
            scanGoodsRequest.f158669n = 2;
            scanGoodsRequest.f158670o = 1;
            scanGoodsRequest.f158662d = true;
            scanGoodsRequest.f158663e = false;
            scanGoodsRequest.f158664f = false;
            scanGoodsRequest.f158665g = false;
            scanGoodsRequest.f158666h = true;
            scanGoodsRequest.f158678w = str2;
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).getClass();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (iq.b.i(context, false, null) || iq.b.x(context) || iq.b.c(context, false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiScanItem", "scanItem camera is using now, can not call scanItem");
            this.f82942f = 1001;
            this.f82943g = "camera is using";
        } else {
            this.f82942f = 0;
            this.f82943g = "ok";
        }
        c();
    }

    public JsApiScanItem$CheckScanItemTask(android.os.Parcel inParcel) {
        kotlin.jvm.internal.o.g(inParcel, "inParcel");
        this.f82943g = "";
        v(inParcel);
    }
}
