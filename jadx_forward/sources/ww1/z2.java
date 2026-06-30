package ww1;

/* loaded from: classes9.dex */
public abstract class z2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f531909d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f531910e;

    public z2() {
        a();
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
        android.widget.TextView textView = this.f531909d;
        if (textView == null) {
            return true;
        }
        if (z17) {
            textView.setVisibility(0);
            return true;
        }
        textView.setVisibility(8);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    public abstract void a();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void c1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar, boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(this, rVar, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean o0(boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        return com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean y(boolean z17) {
        android.widget.ImageView imageView = this.f531910e;
        if (imageView == null) {
            return true;
        }
        if (z17) {
            imageView.setVisibility(0);
            return true;
        }
        imageView.setVisibility(8);
        return true;
    }
}
