package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class mg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14901x16d3f6f2 f205522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ng f205523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14901x16d3f6f2 c14901x16d3f6f2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ng ngVar) {
        super(0);
        this.f205522d = c14901x16d3f6f2;
        this.f205523e = ngVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14901x16d3f6f2 c14901x16d3f6f2 = this.f205522d;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = c14901x16d3f6f2.m158358x197d1fc6();
        if (!(m158358x197d1fc6 != null && m158358x197d1fc6.m7482xefa32bc())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileTemplateUIC", "[updateState] state=" + c14901x16d3f6f2.R6().f187640e + " cachedState=" + c14901x16d3f6f2.R6().f187641f);
            android.widget.FrameLayout frameLayout3 = c14901x16d3f6f2.f205006t;
            if (frameLayout3 != null) {
                frameLayout3.setOnClickListener(null);
                frameLayout3.setVisibility(8);
            }
            if (c14901x16d3f6f2.R6().f187641f == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bp.f187937e) {
                c14901x16d3f6f2.Q6().m82565x6107557d(false);
                int ordinal = c14901x16d3f6f2.R6().f187640e.ordinal();
                if (ordinal == 1) {
                    android.widget.FrameLayout frameLayout4 = c14901x16d3f6f2.f205006t;
                    if (frameLayout4 != null) {
                        frameLayout4.setVisibility(0);
                        c14901x16d3f6f2.S6().f516061e.setVisibility(8);
                        c14901x16d3f6f2.S6().f516062f.setVisibility(8);
                        c14901x16d3f6f2.S6().f516060d.setVisibility(0);
                    }
                } else if (ordinal == 2) {
                    android.widget.FrameLayout frameLayout5 = c14901x16d3f6f2.f205006t;
                    if (frameLayout5 != null) {
                        frameLayout5.setVisibility(c14901x16d3f6f2.m58720x17be6422() ? 8 : 0);
                        c14901x16d3f6f2.S6().f516061e.setVisibility(0);
                        c14901x16d3f6f2.S6().f516062f.setVisibility(8);
                        c14901x16d3f6f2.S6().f516060d.setVisibility(8);
                    }
                } else if (ordinal == 3 && (frameLayout2 = c14901x16d3f6f2.f205006t) != null) {
                    frameLayout2.setVisibility(0);
                    c14901x16d3f6f2.S6().f516061e.setVisibility(8);
                    c14901x16d3f6f2.S6().f516062f.setVisibility(0);
                    c14901x16d3f6f2.S6().f516060d.setVisibility(8);
                    frameLayout2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.lg(c14901x16d3f6f2, this.f205523e));
                }
            } else {
                c14901x16d3f6f2.Q6().m82565x6107557d(true);
            }
            int ordinal2 = c14901x16d3f6f2.R6().f187640e.ordinal();
            if (ordinal2 == 0 || ordinal2 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14901x16d3f6f2.P6(c14901x16d3f6f2);
            } else if (ordinal2 == 4 && (frameLayout = c14901x16d3f6f2.f205006t) != null) {
                frameLayout.setVisibility(0);
                c14901x16d3f6f2.S6().f516061e.setVisibility(8);
                c14901x16d3f6f2.S6().f516062f.setVisibility(8);
                c14901x16d3f6f2.S6().f516060d.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
