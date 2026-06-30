package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public abstract class wd {
    public static final void a(android.widget.ImageView iv6) {
        kotlin.jvm.internal.o.g(iv6, "iv");
        com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.FlagshipSetting flagshipSetting = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77217p0;
        java.lang.String str = com.tencent.mm.ui.bk.C() ? flagshipSetting.f77245d : flagshipSetting.f77248g;
        int i17 = com.tencent.mm.ui.bk.C() ? flagshipSetting.f77246e : flagshipSetting.f77249h;
        int i18 = com.tencent.mm.ui.bk.C() ? flagshipSetting.f77247f : flagshipSetting.f77250i;
        boolean z17 = false;
        if (!(str == null || str.length() == 0) && i17 > 0 && i18 > 0) {
            z17 = true;
        }
        java.lang.String str2 = null;
        if ((z17 ? str : null) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = iv6.getLayoutParams();
            layoutParams.width = a06.d.b((layoutParams.height * i17) / i18);
            iv6.setLayoutParams(layoutParams);
            str2 = l01.d0.f314761a.a(iv6, str, com.tencent.mm.R.drawable.bvb, null);
        }
        if (str2 == null) {
            iv6.setImageResource(com.tencent.mm.R.drawable.bvb);
        }
    }
}
