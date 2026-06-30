package oa;

/* loaded from: classes15.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f425311a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.drawable.Drawable f425312b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f425313c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f425314d;

    /* renamed from: e, reason: collision with root package name */
    public int f425315e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f425316f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f425317g;

    /* renamed from: h, reason: collision with root package name */
    public oa.k f425318h;

    public boolean a() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f425317g;
        if (c2718xca2902ff != null) {
            return c2718xca2902ff.m20352xe06bcb0d() == this.f425315e;
        }
        throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public void b() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f425317g;
        if (c2718xca2902ff == null) {
            throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c2718xca2902ff.q(this, true);
    }

    public oa.i c(int i17) {
        this.f425316f = android.view.LayoutInflater.from(this.f425318h.getContext()).inflate(i17, (android.view.ViewGroup) this.f425318h, false);
        f();
        return this;
    }

    public oa.i d(android.view.View view) {
        this.f425316f = view;
        f();
        return this;
    }

    public oa.i e(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(this.f425314d) && !android.text.TextUtils.isEmpty(charSequence)) {
            this.f425318h.setContentDescription(charSequence);
        }
        this.f425313c = charSequence;
        f();
        return this;
    }

    public void f() {
        oa.k kVar = this.f425318h;
        if (kVar != null) {
            kVar.a();
        }
    }
}
