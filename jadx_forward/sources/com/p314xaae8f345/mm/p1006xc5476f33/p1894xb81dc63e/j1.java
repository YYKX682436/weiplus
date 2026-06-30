package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

@j95.b
/* loaded from: classes8.dex */
public final class j1 extends jm0.o implements com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.k0 {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(ik3.q.class);
        set.add(ik3.t.class);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c Zi(java.lang.String multiTaskId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskId, "multiTaskId");
        if (!jm0.g.class.isAssignableFrom(ik3.q.class)) {
            throw new java.lang.IllegalArgumentException(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j1.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(ik3.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ik3.q qVar = (ik3.q) ((jm0.g) a17);
        lk3.b U6 = qVar.U6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c Y6 = U6 != null ? U6.Y6(multiTaskId, i17) : null;
        if (Y6 != null) {
            return Y6;
        }
        bw5.a40 c17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.d.f299039b.c(multiTaskId, qVar.T6(i17));
        if (!c17.f106544g[1] || !c17.b().f107274r[3] || !c17.b().f107274r[1]) {
            return null;
        }
        bw5.bl0 b17 = c17.b();
        if ((b17.f107274r[11] ? b17.f107273q : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b) != null) {
            return qVar.W6(0, c17);
        }
        return null;
    }

    public void aj(kk3.b bVar) {
        if (!jm0.g.class.isAssignableFrom(ik3.q.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(ik3.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.d.f299039b.b(((java.lang.Number) ((jz5.n) r0.f373443g).mo141623x754a37bb()).intValue(), new ik3.j((ik3.q) ((jm0.g) a17), bVar));
    }
}
