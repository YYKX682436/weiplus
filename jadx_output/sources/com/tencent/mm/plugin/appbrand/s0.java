package com.tencent.mm.plugin.appbrand;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.s0 f88438a = new com.tencent.mm.plugin.appbrand.s0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f88439b = jz5.h.b(com.tencent.mm.plugin.appbrand.n0.f86017d);

    public final void a(java.lang.String appId, int i17, int i18) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.autogen.mmdata.rpt.WAAfterCloseGuideReportStruct wAAfterCloseGuideReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WAAfterCloseGuideReportStruct();
        wAAfterCloseGuideReportStruct.f61878d = wAAfterCloseGuideReportStruct.b("appid", appId, true);
        wAAfterCloseGuideReportStruct.f61879e = i17;
        wAAfterCloseGuideReportStruct.f61880f = i18;
        wAAfterCloseGuideReportStruct.k();
    }

    public final void b(android.content.Context context, java.lang.String str, int i17, android.graphics.Bitmap bitmap, yz5.a aVar) {
        java.lang.CharSequence charSequence;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.appbrand.m0 m0Var = (com.tencent.mm.plugin.appbrand.m0) ((java.util.List) ((jz5.n) f88439b).getValue()).get(i17);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, m0Var.f85682d, 0, false);
        z2Var.i(com.tencent.mm.R.layout.ali);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.f485201gw0);
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxAppBrandSwitch()) == 1;
        mMPAGView.o(z17);
        java.lang.String str2 = m0Var.f85680b;
        if (z17) {
            com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(context.getAssets(), str2);
            if (bitmap != null) {
                Load.replaceImage(0, com.tencent.mm.rfx.RfxPagImage.FromBitmap(bitmap));
            }
            mMPAGView.setComposition(Load);
        } else {
            org.libpag.PAGFile Load2 = org.libpag.PAGFile.Load(context.getAssets(), str2);
            if (bitmap != null) {
                Load2.replaceImage(0, org.libpag.PAGImage.FromBitmap(bitmap));
            }
            mMPAGView.setComposition(Load2);
        }
        mMPAGView.setRepeatCount(m0Var.f85681c);
        mMPAGView.g();
        ((android.widget.TextView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.r__)).setText(m0Var.f85679a);
        java.lang.CharSequence charSequence2 = m0Var.f85683e;
        if (charSequence2 != null) {
            z2Var.y(charSequence2);
            z2Var.x(1);
            z2Var.F = new com.tencent.mm.plugin.appbrand.o0(z2Var, aVar, str, i17);
        }
        java.lang.CharSequence charSequence3 = m0Var.f85684f;
        if (charSequence3 != null && (charSequence = m0Var.f85685g) != null) {
            z2Var.m(charSequence3, charSequence);
            com.tencent.mm.plugin.appbrand.p0 p0Var = new com.tencent.mm.plugin.appbrand.p0(z2Var, aVar, str, i17);
            com.tencent.mm.plugin.appbrand.q0 q0Var = new com.tencent.mm.plugin.appbrand.q0(context, aVar, str, i17);
            z2Var.D = p0Var;
            z2Var.E = q0Var;
        }
        z2Var.C();
        if (str == null) {
            str = "";
        }
        a(str, i17, 2);
    }
}
