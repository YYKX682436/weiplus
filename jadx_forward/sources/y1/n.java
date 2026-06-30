package y1;

/* loaded from: classes14.dex */
public final class n extends u1.p0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u1.c1 wrapped, y1.o modifier) {
        super(wrapped, modifier);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wrapped, "wrapped");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
    }

    @Override // u1.p0
    public void a() {
        this.f505190g = true;
        u1.r1 r1Var = this.f505187d.f505087h.f505222m;
        if (r1Var != null) {
            ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) r1Var).n();
        }
    }

    @Override // u1.p0
    public void b() {
        this.f505190g = false;
        u1.r1 r1Var = this.f505187d.f505087h.f505222m;
        if (r1Var != null) {
            ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) r1Var).n();
        }
    }

    public final y1.l c() {
        y1.n nVar = (y1.n) this.f505189f;
        y1.n nVar2 = null;
        if (nVar == null) {
            u1.c1 j07 = this.f505187d.j0();
            if (j07 != null) {
                while (j07 != null && !u1.p.a(j07.f505101y, 2)) {
                    j07 = j07.j0();
                }
                if (j07 != null && (nVar = (y1.n) j07.f505101y[2]) != null) {
                    u1.c1 c1Var = nVar.f505187d;
                    while (c1Var != null) {
                        if (nVar != null) {
                            nVar2 = nVar;
                            break;
                        }
                        c1Var = c1Var.j0();
                        nVar = c1Var != null ? (y1.n) c1Var.f505101y[2] : null;
                    }
                }
            }
        } else {
            u1.c1 c1Var2 = nVar.f505187d;
            while (c1Var2 != null) {
                if (nVar != null) {
                    nVar2 = nVar;
                    break;
                }
                c1Var2 = c1Var2.j0();
                nVar = c1Var2 != null ? (y1.n) c1Var2.f505101y[2] : null;
            }
        }
        z0.t tVar = this.f505188e;
        if (nVar2 != null) {
            y1.l lVar = ((y1.q) ((y1.o) tVar)).f540320e;
            if (!lVar.f540301f) {
                lVar.getClass();
                y1.l lVar2 = new y1.l();
                lVar2.f540300e = lVar.f540300e;
                lVar2.f540301f = lVar.f540301f;
                lVar2.f540299d.putAll(lVar.f540299d);
                y1.l peer = nVar2.c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(peer, "peer");
                if (peer.f540300e) {
                    lVar2.f540300e = true;
                }
                if (peer.f540301f) {
                    lVar2.f540301f = true;
                }
                for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) peer.f540299d).entrySet()) {
                    y1.o0 o0Var = (y1.o0) entry.getKey();
                    java.lang.Object value = entry.getValue();
                    java.util.Map map = lVar2.f540299d;
                    if (!map.containsKey(o0Var)) {
                        map.put(o0Var, value);
                    } else if (value instanceof y1.a) {
                        java.lang.Object obj = ((java.util.LinkedHashMap) map).get(o0Var);
                        if (obj == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                        }
                        y1.a aVar = (y1.a) obj;
                        java.lang.String str = aVar.f540225a;
                        if (str == null) {
                            str = ((y1.a) value).f540225a;
                        }
                        jz5.b bVar = aVar.f540226b;
                        if (bVar == null) {
                            bVar = ((y1.a) value).f540226b;
                        }
                        map.put(o0Var, new y1.a(str, bVar));
                    } else {
                        continue;
                    }
                }
                return lVar2;
            }
        }
        return ((y1.q) ((y1.o) tVar)).f540320e;
    }

    /* renamed from: toString */
    public java.lang.String m176345x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.toString());
        sb6.append(" id: ");
        z0.t tVar = this.f505188e;
        sb6.append(((y1.q) ((y1.o) tVar)).f540319d);
        sb6.append(" config: ");
        sb6.append(((y1.q) ((y1.o) tVar)).f540320e);
        return sb6.toString();
    }
}
