package s06;

/* loaded from: classes16.dex */
public final class b extends o06.y2 {

    /* renamed from: c, reason: collision with root package name */
    public static final s06.b f483514c = new s06.b();

    public b() {
        super("protected_and_package", true);
    }

    @Override // o06.y2
    public java.lang.Integer a(o06.y2 visibility) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibility, "visibility");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this, visibility)) {
            return 0;
        }
        if (visibility == o06.p2.f423511c) {
            return null;
        }
        java.util.Map map = o06.x2.f423538a;
        return java.lang.Integer.valueOf(visibility == o06.s2.f423516c || visibility == o06.t2.f423524c ? 1 : -1);
    }

    @Override // o06.y2
    public java.lang.String b() {
        return "protected/*protected and package*/";
    }

    @Override // o06.y2
    public o06.y2 c() {
        return o06.u2.f423532c;
    }
}
