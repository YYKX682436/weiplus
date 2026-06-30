package zm5;

/* loaded from: classes10.dex */
public final class w0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f555812d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f555813e;

    /* renamed from: f, reason: collision with root package name */
    public int f555814f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f555815g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f555816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f555812d = jz5.h.b(new zm5.s0(this));
        this.f555813e = "";
        this.f555815g = new java.util.ArrayList();
        this.f555816h = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("KEY_CROP_IMAGE_PATH");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f555813e = stringExtra;
        java.util.ArrayList parcelableArrayListExtra = m158359x1e885992().getParcelableArrayListExtra("KEY_PERSON_IMAGE_LIST");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new java.util.ArrayList();
        }
        this.f555816h = parcelableArrayListExtra;
        this.f555814f = parcelableArrayListExtra.size();
        bm5.v0 v0Var = bm5.v0.f104287a;
        java.util.ArrayList arrayList = this.f555816h;
        java.util.ArrayList arrayList2 = this.f555815g;
        v0Var.a(arrayList, arrayList2);
        arrayList2.add(0, new aq.d("TOP", new java.util.ArrayList()));
        ((com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197) ((jz5.n) this.f555812d).mo141623x754a37bb()).m47820xe9f5bdb7(u0.j.c(1756060911, true, new zm5.v0(this)));
    }
}
