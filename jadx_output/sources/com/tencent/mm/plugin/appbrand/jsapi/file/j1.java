package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class j1 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f81073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.n1 f81075d;

    public j1(com.tencent.mm.plugin.appbrand.jsapi.file.n1 n1Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, android.content.Context context, int i17) {
        this.f81075d = n1Var;
        this.f81072a = lVar;
        this.f81073b = context;
        this.f81074c = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        int i17;
        com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.OpenResult openResult = (com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.OpenResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81072a;
        if (lVar.isRunning()) {
            com.tencent.mm.plugin.appbrand.jsapi.file.n1 n1Var = this.f81075d;
            if (openResult == null || (i17 = openResult.f81023d) == 2147483645) {
                str = "fail env error";
            } else if (i17 != 0) {
                switch (i17) {
                    case 2147483646:
                        str = "fail no third apps supported";
                        break;
                    case Integer.MAX_VALUE:
                        str = "fail user cancel";
                        break;
                    default:
                        str = "fail file type not supported " + openResult.f81023d;
                        break;
                }
            } else {
                n1Var.f81102h = new rh1.a(new ak3.i((android.app.Activity) this.f81073b));
                str = "ok";
            }
            lVar.a(this.f81074c, n1Var.o(str));
        }
    }
}
