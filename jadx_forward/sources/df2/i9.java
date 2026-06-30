package df2;

/* loaded from: classes.dex */
public final class i9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final df2.i9 f311918d = new df2.i9();

    public i9() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.jw1 it = (r45.jw1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(it.m75945x2fec8307(2));
        sb6.append(" port:");
        r45.b8 b8Var = (r45.b8) it.m75936x14adae67(1);
        sb6.append(b8Var != null ? b8Var.m75945x2fec8307(0) : null);
        sb6.append(", duration");
        r45.b8 b8Var2 = (r45.b8) it.m75936x14adae67(1);
        sb6.append(b8Var2 != null ? java.lang.Integer.valueOf(b8Var2.m75939xb282bd08(1)) : null);
        sb6.append(", land:");
        r45.b8 b8Var3 = (r45.b8) it.m75936x14adae67(0);
        sb6.append(b8Var3 != null ? b8Var3.m75945x2fec8307(0) : null);
        sb6.append(", duration:");
        r45.b8 b8Var4 = (r45.b8) it.m75936x14adae67(0);
        sb6.append(b8Var4 != null ? java.lang.Integer.valueOf(b8Var4.m75939xb282bd08(1)) : null);
        return sb6.toString();
    }
}
