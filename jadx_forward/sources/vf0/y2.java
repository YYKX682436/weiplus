package vf0;

@j95.b
/* loaded from: classes12.dex */
public final class y2 extends jm0.o implements wf0.b2 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f517839m = jz5.h.b(vf0.x2.f517835d);

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(yf0.k0.class);
        set.add(yf0.a.class);
        set.add(vf0.q2.class);
        set.add(vf0.f3.class);
        set.add(vf0.b3.class);
        set.add(vf0.c3.class);
    }

    public void Zi(wf0.j1 taskListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskListener, "taskListener");
        ((java.util.concurrent.CopyOnWriteArraySet) ((jz5.n) this.f517839m).mo141623x754a37bb()).add(taskListener);
    }

    public boolean aj(java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        return r26.i0.y(fileName, "NS", false);
    }

    public qi3.b0 bj(vf0.h3 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        return new zf0.v0(params);
    }

    public float cj(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker) {
        float floatValue;
        vf0.h3 h3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        yf0.p pVar = yf0.k0.f543109o;
        d75.c cVar = (d75.c) pVar.b().get(msgIdTalker.m66995x9616526c());
        java.lang.Object obj = cVar != null ? (qi3.b0) cVar.get() : null;
        zf0.v0 v0Var = obj instanceof zf0.v0 ? (zf0.v0) obj : null;
        if (v0Var == null || (h3Var = v0Var.f554096i) == null) {
            java.lang.Float f17 = (java.lang.Float) ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).aj().get(msgIdTalker.m66995x9616526c());
            floatValue = f17 != null ? f17.floatValue() : 0.0f;
        } else {
            java.lang.Object obj2 = h3Var.f517719m.get();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            floatValue = ((java.lang.Number) obj2).floatValue();
        }
        msgIdTalker.m66995x9616526c();
        pVar.b().size();
        return floatValue;
    }

    public boolean fj(vf0.j3 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20540xbb77632f());
        if (c17 <= 0) {
            return false;
        }
        int ordinal = scene.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return false;
                            }
                            throw new jz5.j();
                        }
                        if ((c17 & 16) != 16) {
                            return false;
                        }
                    } else if ((c17 & 8) != 8) {
                        return false;
                    }
                } else if ((c17 & 4) != 4) {
                    return false;
                }
            } else if ((c17 & 2) != 2) {
                return false;
            }
        } else if ((c17 & 1) != 1) {
            return false;
        }
        return true;
    }

    public boolean hj() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20540xbb77632f()) == -1;
    }

    public boolean ij(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker) {
        qi3.b0 b0Var;
        qi3.g0 g0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        yf0.p pVar = yf0.k0.f543109o;
        pVar.a().getClass();
        d75.c cVar = (d75.c) pVar.b().get(msgIdTalker.m66995x9616526c());
        return (cVar == null || (b0Var = (qi3.b0) cVar.get()) == null || (g0Var = ((qi3.c) b0Var).f445210f) == qi3.g0.f445245n || g0Var == qi3.g0.f445246o) ? false : true;
    }

    public void mj(wf0.j1 taskListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskListener, "taskListener");
        ((java.util.concurrent.CopyOnWriteArraySet) ((jz5.n) this.f517839m).mo141623x754a37bb()).remove(taskListener);
    }
}
