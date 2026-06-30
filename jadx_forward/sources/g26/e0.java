package g26;

/* loaded from: classes16.dex */
public final /* synthetic */ class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.l implements yz5.p {
    public e0(java.lang.Object obj) {
        super(2, obj);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e, f06.c
    /* renamed from: getName */
    public final java.lang.String mo9624xfb82e301() {
        return "isStrictSupertype";
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: getOwner */
    public final f06.f mo9625x74f198fd() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(g26.g0.class);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: getSignature */
    public final java.lang.String mo9626x3f6b0a02() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        f26.o0 p07 = (f26.o0) obj;
        f26.o0 p17 = (f26.o0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        ((g26.g0) this.f72685xcfcbe9ef).getClass();
        g26.u.f349547b.getClass();
        g26.v vVar = g26.t.f349546b;
        return java.lang.Boolean.valueOf(vVar.b(p07, p17) && !vVar.b(p17, p07));
    }
}
