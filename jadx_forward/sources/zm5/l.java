package zm5;

/* loaded from: classes3.dex */
public final class l extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public fn5.a f555766d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e f555767e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f555768f;

    /* renamed from: g, reason: collision with root package name */
    public int f555769g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f555770h;

    /* renamed from: i, reason: collision with root package name */
    public long f555771i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f555772m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f555773n;

    /* renamed from: o, reason: collision with root package name */
    public int f555774o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f555775p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f555768f = new java.util.ArrayList();
        this.f555769g = -1;
        this.f555770h = "";
        this.f555771i = -1L;
        this.f555772m = "";
        this.f555773n = true;
        this.f555774o = -1;
        this.f555775p = true;
    }

    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f O6() {
        fn5.a aVar;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.f555767e;
        if (c21520x5bb48e5e == null || (aVar = this.f555766d) == null) {
            return null;
        }
        return aVar.f(c21520x5bb48e5e.m80830xfda78ef6(), true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f555769g = m158359x1e885992().getIntExtra("KEY_IMAGE_CURRENT_INDEX", -1);
        java.util.ArrayList parcelableArrayListExtra = m158359x1e885992().getParcelableArrayListExtra("KEY_IMAGE_DATA");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new java.util.ArrayList();
        }
        this.f555768f = parcelableArrayListExtra;
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("KEY_IMAGE_KEY_WORDS");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f555770h = stringExtra;
        this.f555771i = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) this.f555768f.get(this.f555769g)).f134736d;
        this.f555772m = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) this.f555768f.get(this.f555769g)).f134743n;
        this.f555774o = this.f555769g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryPageUIC", "currentIndex: " + this.f555769g + ", imageDataSize: " + this.f555768f.size() + ", matchKeywords: " + this.f555770h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryPageUIC", " " + com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x + ", " + com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
        this.f555766d = new fn5.a(m158354x19263085(), this.f555768f);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.h_b);
        this.f555767e = c21520x5bb48e5e;
        if (c21520x5bb48e5e != null) {
            c21520x5bb48e5e.setVerticalFadingEdgeEnabled(false);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e2 = this.f555767e;
        if (c21520x5bb48e5e2 != null) {
            c21520x5bb48e5e2.setHorizontalFadingEdgeEnabled(false);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e3 = this.f555767e;
        if (c21520x5bb48e5e3 != null) {
            c21520x5bb48e5e3.mo79170x2d3430b4(new zm5.h(this));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e4 = this.f555767e;
        if (c21520x5bb48e5e4 != null) {
            c21520x5bb48e5e4.m80853x40341e13(1);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e5 = this.f555767e;
        if (c21520x5bb48e5e5 != null) {
            c21520x5bb48e5e5.mo79164x6cab2c8d(this.f555766d);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e6 = this.f555767e;
        if (c21520x5bb48e5e6 != null) {
            c21520x5bb48e5e6.m80844x940d026a(this.f555769g);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e7 = this.f555767e;
        if (c21520x5bb48e5e7 != null) {
            c21520x5bb48e5e7.m79165xf6f0b249(zm5.i.f555758a);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e8 = this.f555767e;
        if (c21520x5bb48e5e8 != null) {
            c21520x5bb48e5e8.m79169xf8a6a4f2(new zm5.j(this));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e9 = this.f555767e;
        if (c21520x5bb48e5e9 != null) {
            c21520x5bb48e5e9.m79173x3be48126(new zm5.k(this));
        }
    }
}
