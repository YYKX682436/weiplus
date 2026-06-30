package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes5.dex */
public final class c6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f215500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 f215501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647) {
        super(2);
        this.f215500d = s0Var;
        this.f215501e = c15442xfd56d647;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        in5.s0 s0Var = this.f215500d;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(s0Var.f374654e);
        boolean z17 = s0Var.f374654e.getResources().getConfiguration().orientation == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletUIC", "onKeyboardChange: isShow=" + booleanValue + ", height=" + intValue + ", navigationBarHeight=" + c17 + ", isPortrait=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = this.f215501e;
        if (booleanValue) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 W6 = c15442xfd56d647.W6();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, intValue);
            if (z17) {
                layoutParams.bottomMargin = c17;
            } else {
                layoutParams.setMarginEnd(c17);
            }
            W6.setLayoutParams(layoutParams);
            c15442xfd56d647.c7(false);
        } else if (c15442xfd56d647.f215029f == 1) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 W62 = c15442xfd56d647.W6();
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, 0);
            if (z17) {
                layoutParams2.bottomMargin = c17;
            } else {
                layoutParams2.setMarginEnd(c17);
            }
            W62.setLayoutParams(layoutParams2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14447x781b0cb T6 = c15442xfd56d647.T6();
            if (T6 != null) {
                T6.a();
            }
        }
        return jz5.f0.f384359a;
    }
}
