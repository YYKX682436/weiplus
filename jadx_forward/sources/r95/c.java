package r95;

/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.n8 f474985a;

    public final com.p176xb6135e39.p283xc50a8b8b.n8 a() {
        com.p176xb6135e39.p283xc50a8b8b.n8 n8Var = this.f474985a;
        if (n8Var != null) {
            return n8Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("innerBuilder");
        throw null;
    }

    public byte[] b() {
        com.p176xb6135e39.p283xc50a8b8b.n8 n8Var = this.f474985a;
        if (n8Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("innerBuilder");
            throw null;
        }
        byte[] mo20648x5f01b1f6 = n8Var.mo20556x59bc66e().mo20648x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.c(mo20648x5f01b1f6, "innerBuilder.build().toByteArray()");
        return mo20648x5f01b1f6;
    }
}
