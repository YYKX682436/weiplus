package gr2;

/* loaded from: classes2.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f356356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gr2.t0 f356357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i17, gr2.t0 t0Var) {
        super(0);
        this.f356356d = i17;
        this.f356357e = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        oa.i k17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onThemeTagChange position: ");
        int i17 = this.f356356d;
        sb6.append(i17);
        sb6.append(" tabLayout: ");
        gr2.t0 t0Var = this.f356357e;
        sb6.append(t0Var.f356363c);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ThemeTagListWidget", sb6.toString());
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = t0Var.f356363c;
        if (c2718xca2902ff != null && (k17 = c2718xca2902ff.k(i17)) != null && !k17.a()) {
            k17.b();
        }
        return jz5.f0.f384359a;
    }
}
