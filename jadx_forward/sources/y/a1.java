package y;

/* loaded from: classes14.dex */
public abstract class a1 {
    static {
        new y.b1(new y.a2(null, null, null, null, 15, null));
    }

    public a1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final y.a1 a(y.a1 exit) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exit, "exit");
        y.a2 a2Var = ((y.b1) this).f539845a;
        y.i1 i1Var = a2Var.f539839a;
        if (i1Var == null) {
            i1Var = ((y.b1) exit).f539845a.f539839a;
        }
        y.t1 t1Var = a2Var.f539840b;
        if (t1Var == null) {
            t1Var = ((y.b1) exit).f539845a.f539840b;
        }
        y.u uVar = a2Var.f539841c;
        if (uVar == null) {
            uVar = ((y.b1) exit).f539845a.f539841c;
        }
        a2Var.getClass();
        ((y.b1) exit).f539845a.getClass();
        return new y.b1(new y.a2(i1Var, t1Var, uVar, null));
    }

    /* renamed from: equals */
    public boolean m176196xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof y.a1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((y.b1) ((y.a1) obj)).f539845a, ((y.b1) this).f539845a);
    }

    /* renamed from: hashCode */
    public int m176197x8cdac1b() {
        return ((y.b1) this).f539845a.m176199x8cdac1b();
    }
}
