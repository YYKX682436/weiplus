package y;

/* loaded from: classes14.dex */
public abstract class y0 {
    static {
        new y.z0(new y.a2(null, null, null, null, 15, null));
    }

    public y0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final y.y0 a(y.y0 enter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enter, "enter");
        y.a2 a2Var = ((y.z0) this).f540019a;
        y.i1 i1Var = a2Var.f539839a;
        if (i1Var == null) {
            i1Var = ((y.z0) enter).f540019a.f539839a;
        }
        y.t1 t1Var = a2Var.f539840b;
        if (t1Var == null) {
            t1Var = ((y.z0) enter).f540019a.f539840b;
        }
        y.u uVar = a2Var.f539841c;
        if (uVar == null) {
            uVar = ((y.z0) enter).f540019a.f539841c;
        }
        a2Var.getClass();
        ((y.z0) enter).f540019a.getClass();
        return new y.z0(new y.a2(i1Var, t1Var, uVar, null));
    }

    /* renamed from: equals */
    public boolean m176241xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof y.y0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((y.z0) ((y.y0) obj)).f540019a, ((y.z0) this).f540019a);
    }

    /* renamed from: hashCode */
    public int m176242x8cdac1b() {
        return ((y.z0) this).f540019a.m176199x8cdac1b();
    }
}
