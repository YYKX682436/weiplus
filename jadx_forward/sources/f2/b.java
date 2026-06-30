package f2;

/* loaded from: classes14.dex */
public final class b implements f2.x {

    /* renamed from: b, reason: collision with root package name */
    public final int f340324b;

    public b(int i17) {
        this.f340324b = i17;
    }

    @Override // f2.x
    public int a(int i17) {
        return i17;
    }

    @Override // f2.x
    public f2.r b(f2.r fontWeight) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontWeight, "fontWeight");
        int i17 = this.f340324b;
        return (i17 == 0 || i17 == Integer.MAX_VALUE) ? fontWeight : new f2.r(e06.p.f(fontWeight.f340358d + i17, 1, 1000));
    }

    @Override // f2.x
    public f2.h c(f2.h hVar) {
        return hVar;
    }

    @Override // f2.x
    public int d(int i17) {
        return i17;
    }

    /* renamed from: equals */
    public boolean m128738xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2.b) && this.f340324b == ((f2.b) obj).f340324b;
    }

    /* renamed from: hashCode */
    public int m128739x8cdac1b() {
        return java.lang.Integer.hashCode(this.f340324b);
    }

    /* renamed from: toString */
    public java.lang.String m128740x9616526c() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f340324b + ')';
    }
}
