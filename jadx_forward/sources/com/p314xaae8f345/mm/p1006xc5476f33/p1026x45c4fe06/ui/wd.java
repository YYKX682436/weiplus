package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public abstract class wd {
    public static final void a(android.widget.ImageView iv6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iv6, "iv");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.FlagshipSetting flagshipSetting = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().f158750p0;
        java.lang.String str = com.p314xaae8f345.mm.ui.bk.C() ? flagshipSetting.f158778d : flagshipSetting.f158781g;
        int i17 = com.p314xaae8f345.mm.ui.bk.C() ? flagshipSetting.f158779e : flagshipSetting.f158782h;
        int i18 = com.p314xaae8f345.mm.ui.bk.C() ? flagshipSetting.f158780f : flagshipSetting.f158783i;
        boolean z17 = false;
        if (!(str == null || str.length() == 0) && i17 > 0 && i18 > 0) {
            z17 = true;
        }
        java.lang.String str2 = null;
        if ((z17 ? str : null) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = iv6.getLayoutParams();
            layoutParams.width = a06.d.b((layoutParams.height * i17) / i18);
            iv6.setLayoutParams(layoutParams);
            str2 = l01.d0.f396294a.a(iv6, str, com.p314xaae8f345.mm.R.C30861xcebc809e.bvb, null);
        }
        if (str2 == null) {
            iv6.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bvb);
        }
    }
}
