package sa1;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f486802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f486803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f486804f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f486805g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f486806h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sa1.e f486807i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f486808m;

    public d(int i17, int i18, int i19, int i27, int i28, sa1.e eVar, com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2) {
        this.f486802d = i17;
        this.f486803e = i18;
        this.f486804f = i19;
        this.f486805g = i27;
        this.f486806h = i28;
        this.f486807i = eVar;
        this.f486808m = c4216x654bedf2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b V0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo51311x3eebbc35;
        float[] fArr = {this.f486802d, this.f486803e, this.f486804f, this.f486805g, this.f486806h};
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) this.f486807i.f486792d.F();
        if (yVar == null || (V0 = yVar.V0()) == null || (mo51311x3eebbc35 = V0.mo51311x3eebbc35()) == null) {
            return;
        }
        int virtualElementId = this.f486808m.getVirtualElementId();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        mo51311x3eebbc35.w(virtualElementId, fArr, 0, bool, bool);
    }
}
