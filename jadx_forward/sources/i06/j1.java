package i06;

/* loaded from: classes15.dex */
public final /* synthetic */ class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final i06.j1 f368199d = new i06.j1();

    public j1() {
        super(2);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e, f06.c
    /* renamed from: getName */
    public final java.lang.String mo9624xfb82e301() {
        return "loadProperty";
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: getOwner */
    public final f06.f mo9625x74f198fd() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(b26.s0.class);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: getSignature */
    public final java.lang.String mo9626x3f6b0a02() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        b26.s0 p07 = (b26.s0) obj;
        i16.u0 p17 = (i16.u0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        return p07.f(p17);
    }
}
