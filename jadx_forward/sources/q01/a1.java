package q01;

/* loaded from: classes12.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final q01.a1 f440792a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f440793b;

    /* renamed from: c, reason: collision with root package name */
    public static final q01.a1 f440794c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f440795d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f440796e;

    static {
        q01.a1 a1Var = new q01.a1();
        f440792a = a1Var;
        jz5.i iVar = jz5.i.f384362d;
        f440793b = jz5.h.a(iVar, q01.z0.f440893d);
        f440794c = a1Var;
        f440795d = jz5.h.a(iVar, q01.y0.f440887d);
        f440796e = jz5.h.a(iVar, q01.x0.f440885d);
    }

    public final java.lang.String a(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m1Var, "<this>");
        if (m1Var.mo808xfb85f7b0() != 0) {
            return m1Var.mo808xfb85f7b0() + '-' + e(m1Var);
        }
        if (m1Var instanceof c01.ra) {
            return "0-local";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(m1Var.mo808xfb85f7b0());
        sb6.append('-');
        java.lang.String e17 = e(m1Var);
        if (e17 == null) {
            e17 = m1Var.getClass().getName();
        }
        sb6.append(e17);
        return sb6.toString();
    }

    public final boolean b() {
        return ((java.lang.Boolean) f440793b.mo141623x754a37bb()).booleanValue();
    }

    public final q01.s0 c(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        synchronized (f440794c) {
            int hashCode = m1Var.hashCode();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
            jz5.g gVar = f440795d;
            if (((java.util.Map) gVar.mo141623x754a37bb()).containsKey(valueOf)) {
                java.lang.Object obj = ((java.util.Map) gVar.mo141623x754a37bb()).get(java.lang.Integer.valueOf(hashCode));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                return (q01.s0) obj;
            }
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(hashCode);
            jz5.g gVar2 = f440796e;
            if (!((java.util.Map) gVar2.mo141623x754a37bb()).containsKey(valueOf2)) {
                return new q01.s0(m1Var);
            }
            java.lang.Object obj2 = ((java.util.Map) gVar2.mo141623x754a37bb()).get(java.lang.Integer.valueOf(hashCode));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            return (q01.s0) obj2;
        }
    }

    public final void d(com.p314xaae8f345.mm.p944x882e457a.m1 netScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(netScene, "netScene");
        if (b()) {
            netScene.m48022x4479fa06().g(300);
            synchronized (f440794c) {
                int hashCode = netScene.hashCode();
                q01.s0 s0Var = (q01.s0) ((java.util.Map) f440796e.mo141623x754a37bb()).remove(java.lang.Integer.valueOf(hashCode));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTracker", "#onRemoveNetScene: " + s0Var + '@' + hashCode);
                if (s0Var != null) {
                    hr0.k0 k0Var = (hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class));
                    k0Var.getClass();
                    ((ku5.t0) ku5.t0.f394148d).h(new hr0.h0(k0Var, s0Var, android.os.SystemClock.uptimeMillis() - s0Var.f440864c), "MicroMsg.NetSceneTrackFeatureService");
                }
            }
        }
    }

    public final java.lang.String e(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String mo13823xb5887636;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m1Var, "<this>");
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = m1Var.mo47948x7f0c4558();
        if (mo47948x7f0c4558 == null || (mo13823xb5887636 = mo47948x7f0c4558.mo13823xb5887636()) == null) {
            return null;
        }
        if (!r26.n0.B(mo13823xb5887636, "/", false)) {
            return mo13823xb5887636;
        }
        java.lang.String substring = mo13823xb5887636.substring(r26.n0.P(mo13823xb5887636, "/", 0, false, 6, null) + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }
}
