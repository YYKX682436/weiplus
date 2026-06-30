package fp4;

/* loaded from: classes10.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f346878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f346879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d f346880g;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d c18799x4530423d, int i17, int i18, int i19) {
        this.f346880g = c18799x4530423d;
        this.f346877d = i17;
        this.f346878e = i18;
        this.f346879f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18799x4530423d c18799x4530423d = this.f346880g;
        int i17 = c18799x4530423d.f257456p * 2;
        int i18 = this.f346877d;
        if (i18 <= i17) {
            throw new java.lang.IllegalStateException("MaxExtent can not less than sliderWidth * 2");
        }
        c18799x4530423d.f257448e = true;
        int i19 = this.f346878e;
        c18799x4530423d.D = i19;
        c18799x4530423d.f257450g = java.lang.Math.min(i18, c18799x4530423d.getWidth() - (i19 * 2));
        c18799x4530423d.f257451h = java.lang.Math.max(this.f346879f, c18799x4530423d.f257456p * 2);
        c18799x4530423d.e();
        if (c18799x4530423d.F == null && c18799x4530423d.G == null) {
            c18799x4530423d.F = new android.graphics.Rect(c18799x4530423d.f257454n.getBounds().left, c18799x4530423d.f257454n.getBounds().top, c18799x4530423d.f257454n.getBounds().right, c18799x4530423d.f257454n.getBounds().bottom);
            c18799x4530423d.G = new android.graphics.Rect(c18799x4530423d.f257455o.getBounds().left, c18799x4530423d.f257455o.getBounds().top, c18799x4530423d.f257455o.getBounds().right, c18799x4530423d.f257455o.getBounds().bottom);
        }
        c18799x4530423d.invalidate();
    }
}
