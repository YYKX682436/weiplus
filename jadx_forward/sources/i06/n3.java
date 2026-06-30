package i06;

/* loaded from: classes16.dex */
public abstract class n3 extends i06.h3 implements f06.h {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f368238o = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(i06.n3.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

    /* renamed from: m, reason: collision with root package name */
    public final i06.c4 f368239m = i06.f4.a(new i06.m3(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f368240n = jz5.h.a(jz5.i.f384363e, new i06.l3(this));

    /* renamed from: equals */
    public boolean m134378xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof i06.n3) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(q(), ((i06.n3) obj).q());
    }

    @Override // f06.c
    /* renamed from: getName */
    public java.lang.String mo9624xfb82e301() {
        return "<set-" + q().f368265n + '>';
    }

    /* renamed from: hashCode */
    public int m134379x8cdac1b() {
        return q().m134398x8cdac1b();
    }

    @Override // i06.k0
    public j06.k i() {
        return (j06.k) this.f368240n.mo141623x754a37bb();
    }

    @Override // i06.k0
    public o06.d l() {
        f06.v vVar = f368238o[0];
        java.lang.Object mo152xb9724478 = this.f368239m.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        return (o06.q1) mo152xb9724478;
    }

    @Override // i06.h3
    public o06.n1 p() {
        f06.v vVar = f368238o[0];
        java.lang.Object mo152xb9724478 = this.f368239m.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        return (o06.q1) mo152xb9724478;
    }

    /* renamed from: toString */
    public java.lang.String m134380x9616526c() {
        return "setter of " + q();
    }
}
