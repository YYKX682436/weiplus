package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public final class r9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI f74159d;

    public r9(com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI mMLoginVerifyPwdUI) {
        this.f74159d = mMLoginVerifyPwdUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI activity = this.f74159d;
        kotlin.jvm.internal.o.g(activity, "activity");
        m71.g gVar = (m71.g) pf5.z.f353948a.a(activity).a(m71.g.class);
        int i17 = com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI.f73470t;
        m71.a aVar = new m71.a(activity.b7(), null, null, null, activity.f73476r);
        com.tencent.mm.plugin.account.ui.q9 q9Var = com.tencent.mm.plugin.account.ui.q9.f74135d;
        gVar.getClass();
        gVar.f324491d = aVar;
        gVar.f324493f = q9Var;
        com.tencent.mm.plugin.account.ui.w6 w6Var = aVar.f324479a;
        java.lang.String str = w6Var.f74286b;
        java.lang.String str2 = w6Var.f74287c;
        java.lang.String str3 = aVar.f324480b;
        if (str3 == null) {
            str3 = "";
        }
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(str, str2, str3, 0);
        java.lang.String str4 = aVar.f324481c;
        if (str4 != null) {
            v0Var.f71436q = str4;
        }
        java.lang.String str5 = aVar.f324482d;
        if (str5 != null) {
            v0Var.f71437r = str5;
        }
        java.lang.String str6 = aVar.f324483e;
        if (str6 != null) {
            v0Var.f71438s = str6;
        }
        gm0.j1.d().g(v0Var);
        gVar.f324492e = db5.e1.Q(gVar.getActivity(), gVar.getContext().getString(com.tencent.mm.R.string.f490573yv), gVar.getContext().getString(com.tencent.mm.R.string.gic), true, true, new m71.b(v0Var, gVar));
    }
}
