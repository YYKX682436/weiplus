package com.tencent.mm.plugin.appbrand.trade;

/* loaded from: classes7.dex */
public final class i implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f89246a;

    public i(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f89246a = o6Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        boolean z17;
        boolean z18;
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f70711b.f70700a) != null && (fVar instanceof r45.j6)) {
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AfterLaunchWxaAppResponse");
            r45.j6 j6Var = (r45.j6) fVar;
            java.lang.String str2 = j6Var.f377603g;
            if (!(!(str2 == null || str2.length() == 0))) {
                str2 = null;
            }
            if (str2 != null) {
                com.tencent.mm.plugin.appbrand.o6 o6Var = this.f89246a;
                o6Var.I1(new com.tencent.mm.plugin.appbrand.trade.f(o6Var, str2));
            }
            com.tencent.mm.plugin.appbrand.o6 runtime = this.f89246a;
            if (j6Var.f377602f == 1) {
                com.tencent.mm.plugin.appbrand.trade.j jVar = new com.tencent.mm.plugin.appbrand.trade.j(runtime);
                kotlin.jvm.internal.o.g(runtime, "runtime");
                if (mi1.o0.f326653b) {
                    java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.n3x);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    mi1.z0 z0Var = mi1.z0.f326739e;
                    mi1.r1 r1Var = new mi1.r1(string, null, null, java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cl9), 128, true, 0, new mi1.n0(runtime), 70, null);
                    runtime.f74821z.f326706e.c(new mi1.j0(1, 0, 2, 1500L, r1Var.f326676e, 0L, r1Var, 0, 0L, jVar, 418, null));
                } else {
                    com.tencent.mars.xlog.Log.w("Luggage.CapsuleAnimatorEventHelper", "showLowScoreTips: isEnable = false");
                }
                z17 = true;
            } else {
                mi1.m0 m0Var = runtime.f74821z.f326706e;
                mi1.z0 z0Var2 = mi1.z0.f326739e;
                java.util.LinkedList linkedList = m0Var.f326620f;
                mi1.j0 j0Var = (mi1.j0) linkedList.peekFirst();
                if ((j0Var != null ? j0Var.f326589e : Integer.MIN_VALUE) == 128) {
                    linkedList.clear();
                }
                z17 = false;
            }
            if (z17) {
                return;
            }
            r45.jd7 jd7Var = j6Var.f377601e;
            if (!(jd7Var != null) || com.tencent.mm.sdk.platformtools.t8.K0(jd7Var.f377731d)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response.comment_dish:");
                sb6.append(j6Var.f377601e);
                sb6.append(" response.comment_dish.text:");
                r45.jd7 jd7Var2 = j6Var.f377601e;
                sb6.append(jd7Var2 != null ? jd7Var2.f377731d : null);
                sb6.append(" is null ");
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTradeManager", sb6.toString());
                z18 = false;
            } else {
                com.tencent.mm.plugin.appbrand.o6 o6Var2 = this.f89246a;
                kotlin.jvm.internal.o.g(o6Var2, "<this>");
                com.tencent.mm.plugin.appbrand.page.o oVar2 = (com.tencent.mm.plugin.appbrand.page.o) o6Var2.k(com.tencent.mm.plugin.appbrand.page.o.class);
                if (oVar2 == null) {
                    oVar2 = new com.tencent.mm.plugin.appbrand.page.o();
                    o6Var2.l(oVar2);
                }
                r45.jd7 jd7Var3 = j6Var.f377601e;
                oVar2.f86934d = jd7Var3;
                mi1.o0 o0Var = mi1.o0.f326652a;
                com.tencent.mm.plugin.appbrand.o6 o6Var3 = this.f89246a;
                java.lang.String text = jd7Var3.f377731d;
                kotlin.jvm.internal.o.f(text, "text");
                r45.jd7 jd7Var4 = j6Var.f377601e;
                java.lang.String str3 = jd7Var4.f377734g;
                java.lang.String str4 = str3 == null ? "" : str3;
                java.lang.String str5 = jd7Var4.f377735h;
                if (str5 == null) {
                    str5 = "";
                }
                mi1.z0 z0Var3 = mi1.z0.f326739e;
                o0Var.b(o6Var3, new mi1.r1(text, str4, str5, null, 64, true, 0, new com.tencent.mm.plugin.appbrand.trade.g(this.f89246a), 64, null), 1, new com.tencent.mm.plugin.appbrand.trade.h(this.f89246a));
                z18 = true;
            }
            r45.kd7 kd7Var = j6Var.f377600d;
            if (kd7Var != null) {
                java.lang.String str6 = kd7Var.f378610d;
                if ((str6 == null || str6.length() == 0) || z18) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTradeManager", "[cgiGetScoreAfterLaunch] content = " + j6Var.f377600d);
                jz5.l lVar = new jz5.l("key_type", mi1.a.TRADE);
                jz5.l lVar2 = new jz5.l("key_appid", this.f89246a.f74803n);
                r45.kd7 kd7Var2 = j6Var.f377600d;
                java.util.Map k17 = kz5.c1.k(lVar, lVar2, new jz5.l("key_img_url", kd7Var2.f378613g), new jz5.l("key_img_url_dark", kd7Var2.f378614h), new jz5.l("key_content", kd7Var2.f378610d), new jz5.l("key_show_duration", java.lang.Long.valueOf(kd7Var2.f378612f * 1000)), new jz5.l("key_allow_animation", java.lang.Boolean.FALSE), new jz5.l("key_show_duration_after_intercepted", 5000L));
                com.tencent.mm.plugin.appbrand.o6 o6Var4 = this.f89246a;
                long j17 = j6Var.f377600d.f378611e * 1000;
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = o6Var4.Q;
                if (lifecycleScope != null) {
                    kotlinx.coroutines.l.d(lifecycleScope, null, null, new com.tencent.mm.plugin.appbrand.trade.k(j17, o6Var4, k17, null), 3, null);
                }
            }
        }
    }
}
