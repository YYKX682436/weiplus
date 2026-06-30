package o06;

/* loaded from: classes16.dex */
public abstract class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f423541a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f423542b;

    public y2(java.lang.String name, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f423541a = name;
        this.f423542b = z17;
    }

    public java.lang.Integer a(o06.y2 visibility) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibility, "visibility");
        java.util.Map map = o06.x2.f423538a;
        if (this == visibility) {
            return 0;
        }
        lz5.m mVar = (lz5.m) o06.x2.f423538a;
        java.lang.Integer num = (java.lang.Integer) mVar.get(this);
        java.lang.Integer num2 = (java.lang.Integer) mVar.get(visibility);
        if (num == null || num2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(num, num2)) {
            return null;
        }
        return java.lang.Integer.valueOf(num.intValue() - num2.intValue());
    }

    public java.lang.String b() {
        return this.f423541a;
    }

    public o06.y2 c() {
        return this;
    }

    /* renamed from: toString */
    public final java.lang.String m150398x9616526c() {
        return b();
    }
}
