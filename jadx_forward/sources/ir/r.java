package ir;

/* loaded from: classes12.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f375428a;

    public r(int i17) {
        this.f375428a = i17;
    }

    public boolean a(java.lang.String groupId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c(), groupId);
    }

    public boolean b(java.lang.Object obj) {
        if (mo139717xb2c87fbf(obj) && (obj instanceof ir.r)) {
            ir.r rVar = (ir.r) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.d(), d()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.e(), e())) {
                return true;
            }
        }
        return false;
    }

    public abstract java.lang.String c();

    public abstract java.lang.String d();

    public abstract java.lang.String e();

    /* renamed from: equals */
    public boolean mo139717xb2c87fbf(java.lang.Object obj) {
        if (obj != null && (obj instanceof ir.r) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj.getClass(), getClass())) {
            ir.r rVar = (ir.r) obj;
            if (rVar.f375428a == this.f375428a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.c(), c())) {
                return true;
            }
        }
        return false;
    }
}
