package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes8.dex */
public class s2 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.t2 f81125a;

    public s2(com.tencent.mm.plugin.appbrand.jsapi.file.t2 t2Var) {
        this.f81125a = t2Var;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.ui.MMActivity activityContext;
        com.tencent.mm.ui.MMActivity activityContext2;
        com.tencent.mm.plugin.appbrand.jsapi.file.t2 t2Var = this.f81125a;
        activityContext = t2Var.f81132d.f81133a.getActivityContext();
        activityContext2 = t2Var.f81132d.f81133a.getActivityContext();
        dp.a.makeText(activityContext, activityContext2.getString(com.tencent.mm.R.string.jzm, q75.c.c(str2)), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.ui.MMActivity activityContext;
        com.tencent.mm.ui.MMActivity activityContext2;
        com.tencent.mm.plugin.appbrand.jsapi.file.t2 t2Var = this.f81125a;
        activityContext = t2Var.f81132d.f81133a.getActivityContext();
        activityContext2 = t2Var.f81132d.f81133a.getActivityContext();
        dp.a.makeText(activityContext, activityContext2.getString(com.tencent.mm.R.string.jzl), 1).show();
    }
}
