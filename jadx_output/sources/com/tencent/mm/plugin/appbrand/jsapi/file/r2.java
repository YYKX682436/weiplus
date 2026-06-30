package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes8.dex */
public class r2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.u2 f81120d;

    public r2(com.tencent.mm.plugin.appbrand.jsapi.file.u2 u2Var) {
        this.f81120d = u2Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        com.tencent.mm.plugin.appbrand.jsapi.file.u2 u2Var = this.f81120d;
        string = u2Var.f81133a.getString(com.tencent.mm.R.string.f492836i24);
        g4Var.f(0, string);
        if (u2Var.f81133a.getAppBrandTaskProxyUI() != null && u2Var.f81133a.getAppBrandTaskProxyUI().f78369q != null) {
            string5 = u2Var.f81133a.getString(com.tencent.mm.R.string.cfd);
            g4Var.f(3, string5);
        }
        string2 = u2Var.f81133a.getString(com.tencent.mm.R.string.f490899b74);
        g4Var.f(1, string2);
        string3 = u2Var.f81133a.getString(com.tencent.mm.R.string.c__);
        g4Var.f(4, string3);
        string4 = u2Var.f81133a.getString(com.tencent.mm.R.string.f491158c60);
        g4Var.f(5, string4);
    }
}
