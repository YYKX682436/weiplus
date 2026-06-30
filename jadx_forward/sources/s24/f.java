package s24;

/* loaded from: classes.dex */
public abstract class f extends a24.i implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a {

    /* renamed from: g, reason: collision with root package name */
    public android.content.Intent f483892g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f483893h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f483894i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f483895m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f483896n;

    /* renamed from: o, reason: collision with root package name */
    public final float f483897o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f483893h = "";
        this.f483894i = new android.view.View(m80379x76847179());
        this.f483895m = true;
        this.f483896n = "";
        this.f483897o = 1.0f;
    }

    /* renamed from: A7 */
    public java.lang.String getF243406p() {
        return this.f483893h;
    }

    /* renamed from: B7 */
    public android.view.View getF243407q() {
        return this.f483894i;
    }

    public java.lang.String C7() {
        return this.f483896n;
    }

    /* renamed from: D7 */
    public java.lang.Integer getF243410t() {
        return null;
    }

    /* renamed from: E7 */
    public java.lang.Integer getF243408r() {
        return null;
    }

    /* renamed from: F7 */
    public java.lang.Integer getF243409s() {
        return null;
    }

    public void G7(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.h.class);
    }

    public void H7(android.view.View view) {
        this.f483894i = view;
    }

    public void I7(java.lang.Integer num) {
    }

    public void J7(java.lang.Integer num) {
    }

    public void K7(java.lang.Integer num) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean W5() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Y3(boolean z17) {
        if (z17) {
            J7(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f572034wv));
            K7(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.asx));
        } else {
            I7(null);
            K7(null);
            J7(null);
        }
        w7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return true;
    }

    @Override // a24.i
    public int Z6() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void c1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar) {
    }

    @Override // a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar, boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(this, rVar, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        return getF243406p();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        if (getF243407q() == null) {
            H7(new android.view.View(m80379x76847179()));
        }
        return getF243407q();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean o0(boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return true;
    }

    public float x7() {
        return this.f483897o;
    }

    public boolean y(boolean z17) {
        if (z17) {
            I7(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.b8i));
            return true;
        }
        I7(null);
        K7(null);
        J7(null);
        return true;
    }

    public java.lang.Integer y7() {
        return null;
    }

    public boolean z7() {
        return this.f483895m;
    }
}
