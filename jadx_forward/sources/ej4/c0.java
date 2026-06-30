package ej4;

/* loaded from: classes11.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ej4.c0 f334868a = new ej4.c0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f334869b;

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cclover_test", "[init] call, start observe");
        ai4.m0 m0Var = ai4.m0.f86706a;
        m0Var.G().d(new ej4.l());
        m0Var.J(new ej4.m(), null);
        ni4.x xVar = ni4.x.f419309d;
        xVar.h().add(ej4.n.f334904d);
        xVar.k().add(ej4.o.f334905d);
        xVar.n().add(ej4.p.f334906d);
        f334869b = new java.util.LinkedHashMap();
    }

    public static /* synthetic */ void d(ej4.c0 c0Var, java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str2 = "";
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        c0Var.c(str, str2, z17);
    }

    public final void a(java.lang.String _key, java.lang.Object subject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_key, "_key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subject, "subject");
        java.util.Map map = f334869b;
        synchronized (map) {
            ej4.r rVar = (ej4.r) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(subject.hashCode()));
            if (rVar != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(_key, rVar.f334907a)) {
                map.remove(java.lang.Integer.valueOf(subject.hashCode()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEventCenter", "cancelListener ".concat(_key));
            }
        }
    }

    public final void b(java.lang.Object listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.Map map = f334869b;
        synchronized (map) {
            if (((ej4.r) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(listener.hashCode()))) != null) {
                map.remove(java.lang.Integer.valueOf(listener.hashCode()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEventCenter", "forceCancelListener: " + listener);
            }
        }
    }

    public final void c(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEventCenter", "onNotify " + str + ", " + f334869b.size() + ", " + str2);
        ((ku5.t0) ku5.t0.f394148d).B(new ej4.b0(str, str2, z17));
    }
}
