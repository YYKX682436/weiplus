package gr5;

/* loaded from: classes8.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final gr5.y f356487b = new gr5.y(null, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final gr5.a0 f356488a;

    public y(gr5.a0 panToScaleTransformer, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 1) != 0) {
            gr5.a0.f356441a.getClass();
            panToScaleTransformer = gr5.z.f356490b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panToScaleTransformer, "panToScaleTransformer");
        this.f356488a = panToScaleTransformer;
    }

    /* renamed from: equals */
    public boolean m132135xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr5.y) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f356488a, ((gr5.y) obj).f356488a);
    }

    /* renamed from: hashCode */
    public int m132136x8cdac1b() {
        return ((gr5.t) this.f356488a).f356480b;
    }

    /* renamed from: toString */
    public java.lang.String m132137x9616526c() {
        return "OneFingerScaleSpec(panToScaleTransformer=" + this.f356488a + ')';
    }
}
