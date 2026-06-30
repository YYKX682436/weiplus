package vi1;

/* loaded from: classes7.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yz5 f518970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f518971e;

    public r0(r45.yz5 yz5Var, vi1.b1 b1Var) {
        this.f518970d = yz5Var;
        this.f518971e = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Long valueOf;
        int i17 = this.f518970d.f473071d;
        vi1.b1 b1Var = this.f518971e;
        if (i17 == 0) {
            vi1.l2 l2Var = vi1.l2.f518934a;
            vi1.j2 a17 = l2Var.a(b1Var.f518807b);
            if (a17 == null) {
                return;
            }
            vi1.j2 a18 = l2Var.a(b1Var.f518807b);
            valueOf = a18 != null ? java.lang.Long.valueOf(a18.f518897m) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            a17.f518897m = valueOf.longValue() + 1;
            return;
        }
        if (i17 == 1) {
            vi1.l2 l2Var2 = vi1.l2.f518934a;
            vi1.j2 a19 = l2Var2.a(b1Var.f518807b);
            if (a19 != null) {
                vi1.j2 a27 = l2Var2.a(b1Var.f518807b);
                valueOf = a27 != null ? java.lang.Long.valueOf(a27.f518898n) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                a19.f518898n = valueOf.longValue() + 1;
            }
            java.lang.String string = b1Var.f518806a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571679m7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            b1Var.a(string);
            return;
        }
        if (i17 == 2) {
            vi1.l2 l2Var3 = vi1.l2.f518934a;
            vi1.j2 a28 = l2Var3.a(b1Var.f518807b);
            if (a28 != null) {
                vi1.j2 a29 = l2Var3.a(b1Var.f518807b);
                valueOf = a29 != null ? java.lang.Long.valueOf(a29.f518898n) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                a28.f518898n = valueOf.longValue() + 1;
            }
            java.lang.String string2 = b1Var.f518806a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571680m8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            b1Var.a(string2);
            return;
        }
        vi1.l2 l2Var4 = vi1.l2.f518934a;
        vi1.j2 a37 = l2Var4.a(b1Var.f518807b);
        if (a37 != null) {
            vi1.j2 a38 = l2Var4.a(b1Var.f518807b);
            valueOf = a38 != null ? java.lang.Long.valueOf(a38.f518898n) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            a37.f518898n = valueOf.longValue() + 1;
        }
        java.lang.String string3 = b1Var.f518806a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571679m7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        b1Var.a(string3);
    }
}
