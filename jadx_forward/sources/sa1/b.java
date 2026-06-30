package sa1;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f486793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f486794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f486795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sa1.e f486796g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f486797h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f486798i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f486799m;

    public b(com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2, int i17, int i18, sa1.e eVar, int i19, int i27, int i28) {
        this.f486793d = c4216x654bedf2;
        this.f486794e = i17;
        this.f486795f = i18;
        this.f486796g = eVar;
        this.f486797h = i19;
        this.f486798i = i27;
        this.f486799m = i28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b V0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo51311x3eebbc35;
        android.content.Context f229340d;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        this.f486793d.m34868x1c0e5b23(false);
        float f17 = this.f486794e;
        float f18 = this.f486795f;
        sa1.e eVar = this.f486796g;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) eVar.f486792d.F();
        java.lang.Float valueOf = (yVar == null || (f229340d = yVar.getF229340d()) == null || (resources = f229340d.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? null : java.lang.Float.valueOf(displayMetrics.density);
        if (valueOf != null) {
            valueOf.floatValue();
            if (f17 <= 0.0f) {
                f17 = 100 * valueOf.floatValue();
            }
            if (f18 <= 0.0f) {
                f18 = 100 * valueOf.floatValue();
            }
        }
        float[] fArr = {this.f486797h, this.f486798i, f17, f18, this.f486799m};
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar2 = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) eVar.f486792d.F();
        if (yVar2 == null || (V0 = yVar2.V0()) == null || (mo51311x3eebbc35 = V0.mo51311x3eebbc35()) == null) {
            return;
        }
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f486793d;
        mo51311x3eebbc35.e(c4216x654bedf2, c4216x654bedf2.getVirtualElementId(), 0, fArr, 0, false);
    }
}
