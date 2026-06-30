package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class l0 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f202260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f202261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f202262c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 f202263d;

    public l0(gk2.e eVar, int i17, boolean z17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var) {
        this.f202260a = eVar;
        this.f202261b = z17;
        this.f202262c = i18;
        this.f202263d = t0Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        int i19 = this.f202262c;
        gk2.e eVar = this.f202260a;
        boolean z17 = this.f202261b;
        if (z17) {
            mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            c1Var.p8(i19 & (-4194305));
        } else {
            mm2.c1 c1Var2 = (mm2.c1) eVar.a(mm2.c1.class);
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            c1Var2.p8(i19 | 4194304);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f202263d.D;
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftWallSwitchBtn");
            throw null;
        }
        viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(!z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("optGiftWall failed, flag:4194304", (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        gk2.e eVar = this.f202260a;
        ((mm2.c1) eVar.a(mm2.c1.class)).q8(j17);
        ((mm2.c1) eVar.a(mm2.c1.class)).Z9(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.e("optGiftWall succ, flag:4194304", (int) ((mm2.c1) eVar.a(mm2.c1.class)).f410399q);
    }
}
