package sa1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sa1.i f486809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f486810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f486811f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f486812g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f486813h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f486814i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f486815m;

    public f(sa1.i iVar, com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2, int i17, int i18, int i19, int i27, int i28) {
        this.f486809d = iVar;
        this.f486810e = c4216x654bedf2;
        this.f486811f = i17;
        this.f486812g = i18;
        this.f486813h = i19;
        this.f486814i = i27;
        this.f486815m = i28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context f229340d;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b V0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo51311x3eebbc35;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b V02;
        android.content.Context f229340d2;
        sa1.i iVar = this.f486809d;
        java.lang.Float f17 = null;
        if (iVar.f486825e == null) {
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) iVar.f486792d.F();
            iVar.f486825e = (yVar == null || (f229340d2 = yVar.getF229340d()) == null) ? null : new android.widget.FrameLayout(f229340d2);
            if (iVar.f486825e != null) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) iVar.f486792d.F();
                if (((yVar2 == null || (V02 = yVar2.V0()) == null) ? null : V02.mo51311x3eebbc35()) != null) {
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar3 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) iVar.f486792d.F();
                    if (yVar3 != null && (V0 = yVar3.V0()) != null && (mo51311x3eebbc35 = V0.mo51311x3eebbc35()) != null) {
                        android.widget.FrameLayout frameLayout = iVar.f486825e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.he.a(mo51311x3eebbc35, frameLayout);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LegacyScreenCanvasViewDelegate", "hy: component or context already released!");
            return;
        }
        hh.g gVar = iVar.f486826f;
        android.widget.FrameLayout frameLayout2 = iVar.f486825e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout2);
        int i17 = this.f486811f;
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f486810e;
        int a17 = gVar.a(frameLayout2, c4216x654bedf2, i17);
        c4216x654bedf2.m34868x1c0e5b23(false);
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar4 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) iVar.f486792d.F();
        if (yVar4 != null && (f229340d = yVar4.getF229340d()) != null && (resources = f229340d.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f17 = java.lang.Float.valueOf(displayMetrics.density);
        }
        int i18 = this.f486812g;
        int i19 = this.f486813h;
        if (f17 != null) {
            f17.floatValue();
            if (i18 <= 0) {
                i18 = (int) (100 * f17.floatValue());
            }
            if (i19 <= 0) {
                i19 = (int) (100 * f17.floatValue());
            }
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i18, i19);
        layoutParams.setMargins(this.f486814i, this.f486815m, 0, 0);
        android.widget.FrameLayout frameLayout3 = iVar.f486825e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout3);
        frameLayout3.addView(c4216x654bedf2, a17, layoutParams);
        c4216x654bedf2.m34868x1c0e5b23(false);
    }
}
