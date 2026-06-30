package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f170291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f170292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f170293g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f170294h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f170295i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t f170296m;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t tVar, int i17, int i18, int i19, int i27, com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2, int i28) {
        this.f170296m = tVar;
        this.f170290d = i17;
        this.f170291e = i18;
        this.f170292f = i19;
        this.f170293g = i27;
        this.f170294h = c4216x654bedf2;
        this.f170295i = i28;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f170290d, this.f170291e);
        layoutParams.setMargins(this.f170292f, this.f170293g, 0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t tVar = this.f170296m;
        hh.g gVar = tVar.f170317e;
        android.widget.FrameLayout frameLayout = tVar.f170316d;
        int i17 = this.f170295i;
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f170294h;
        int a17 = gVar.a(frameLayout, c4216x654bedf2, i17);
        if (a17 == -2) {
            c4216x654bedf2.setLayoutParams(layoutParams);
            c4216x654bedf2.requestLayout();
        } else {
            tVar.f170316d.removeView(c4216x654bedf2);
            tVar.f170316d.addView(c4216x654bedf2, a17, layoutParams);
        }
        c4216x654bedf2.m34868x1c0e5b23(false);
    }
}
