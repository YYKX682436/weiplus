package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f170277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f170278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f170279f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f170280g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f170281h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f170282i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t f170283m;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t tVar, com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2, int i17, int i18, int i19, int i27, int i28) {
        this.f170283m = tVar;
        this.f170277d = c4216x654bedf2;
        this.f170278e = i17;
        this.f170279f = i18;
        this.f170280g = i19;
        this.f170281h = i27;
        this.f170282i = i28;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t tVar = this.f170283m;
        if (tVar.f170316d == null) {
            tVar.f170316d = new android.widget.FrameLayout(tVar.f170318f.f170329f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.he.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) tVar.f170318f.f170330g.F()).V0().mo51311x3eebbc35(), tVar.f170316d);
        }
        hh.g gVar = tVar.f170317e;
        android.widget.FrameLayout frameLayout = tVar.f170316d;
        int i17 = this.f170278e;
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f170277d;
        int a17 = gVar.a(frameLayout, c4216x654bedf2, i17);
        c4216x654bedf2.m34868x1c0e5b23(false);
        int i18 = (int) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) tVar.f170318f.f170330g.F()).getF229340d().getResources().getDisplayMetrics().density;
        int i19 = this.f170279f;
        if (i19 <= 0) {
            i19 = i18 * 100;
        }
        int i27 = this.f170280g;
        if (i27 <= 0) {
            i27 = i18 * 100;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i19, i27);
        layoutParams.setMargins(this.f170281h, this.f170282i, 0, 0);
        tVar.f170316d.addView(c4216x654bedf2, a17, layoutParams);
        c4216x654bedf2.m34868x1c0e5b23(false);
    }
}
