package h06;

/* loaded from: classes16.dex */
public final /* synthetic */ class d extends p3321xbce91901.jvm.p3324x21ffc6bd.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final h06.d f359473d = new h06.d();

    public d() {
        super(2);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e, f06.c
    /* renamed from: getName */
    public final java.lang.String mo9624xfb82e301() {
        return "loadFunction";
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: getOwner */
    public final f06.f mo9625x74f198fd() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(b26.s0.class);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: getSignature */
    public final java.lang.String mo9626x3f6b0a02() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        b26.s0 p07 = (b26.s0) obj;
        i16.j0 p17 = (i16.j0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        return p07.e(p17);
    }
}
