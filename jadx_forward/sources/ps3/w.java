package ps3;

/* loaded from: classes15.dex */
public final class w implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final ps3.q f439664d;

    /* renamed from: e, reason: collision with root package name */
    public i11.e f439665e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f439666f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5 f439667g;

    /* renamed from: h, reason: collision with root package name */
    public ps3.a f439668h;

    /* renamed from: i, reason: collision with root package name */
    public ps3.s f439669i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f439670m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f439671n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f439672o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f439673p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f439674q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f439675r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f439676s;

    /* renamed from: t, reason: collision with root package name */
    public final ps3.t f439677t;

    /* renamed from: u, reason: collision with root package name */
    public final i11.c f439678u;

    public w(ps3.q delegate, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f439664d = delegate;
        this.f439669i = ps3.s.f439657d;
        this.f439670m = new java.util.LinkedList();
        this.f439671n = new java.util.LinkedHashMap();
        this.f439672o = new java.util.LinkedHashMap();
        this.f439673p = new java.util.LinkedHashMap();
        this.f439674q = new java.util.LinkedHashMap();
        this.f439675r = new java.util.LinkedHashMap();
        this.f439676s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new ps3.u(this), false);
        this.f439677t = new ps3.t();
        this.f439678u = new ps3.v(this);
    }

    public final ps3.e a(r45.oi5 member, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(member, "member");
        java.lang.String UserName = member.f463816d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UserName, "UserName");
        ps3.e b17 = b(UserName, z17);
        if (b17 != null) {
            return b17;
        }
        java.lang.String EncodeUserName = member.f463820h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EncodeUserName, "EncodeUserName");
        return b(EncodeUserName, z17);
    }

    public final ps3.e b(java.lang.String str, boolean z17) {
        return z17 ? (ps3.e) ((java.util.LinkedHashMap) this.f439673p).get(str) : (ps3.e) ((java.util.LinkedHashMap) this.f439672o).get(str);
    }

    public final void c(java.lang.String username, ps3.e state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (r26.n0.N(username)) {
            return;
        }
        d(username, state);
        this.f439672o.put(username, state);
    }

    public final void d(java.lang.String str, ps3.e eVar) {
        ps3.e eVar2 = (ps3.e) ((java.util.LinkedHashMap) this.f439672o).get(str);
        if (eVar2 == null || eVar2 == eVar) {
            return;
        }
        this.f439673p.put(str, eVar2);
    }

    public final void e(r45.oi5 oi5Var) {
        if (oi5Var != null) {
            java.lang.String str = oi5Var.f463816d;
            if (str == null && (str = oi5Var.f463820h) == null) {
                str = "";
            }
            java.util.Map map = this.f439675r;
            if (map.containsKey(str)) {
                map.remove(str);
            } else {
                map.put(str, ps3.o.f439648d);
            }
        }
    }

    public final void f() {
        h();
        this.f439666f = false;
        this.f439667g = null;
        this.f439669i = ps3.s.f439657d;
        this.f439676s.d();
        if (this.f439665e == null) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            this.f439665e = i11.h.e();
        }
        this.f439669i = ps3.s.f439658e;
        i11.e eVar = this.f439665e;
        if (eVar != null) {
            ((i11.h) eVar).k(this.f439678u, true);
        }
    }

    public final void g() {
        this.f439666f = true;
        this.f439669i = ps3.s.f439657d;
        this.f439676s.d();
    }

    public final void h() {
        int ordinal = this.f439669i.ordinal();
        if (ordinal == 1) {
            g();
            return;
        }
        ps3.t tVar = this.f439677t;
        if (ordinal != 2) {
            if (ordinal != 3) {
                return;
            }
            g();
            tVar.mo50307xb9e94560(1, 5000);
            return;
        }
        if (this.f439668h != null) {
            g();
            gm0.j1.d().d(this.f439668h);
            tVar.mo50307xb9e94560(1, 5000);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        int mo808xfb85f7b0 = scene.mo808xfb85f7b0();
        ps3.q qVar = this.f439664d;
        if (mo808xfb85f7b0 != 425) {
            if (mo808xfb85f7b0 != 602) {
                return;
            }
            if (i17 == 0 && i18 == 0) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(scene);
                throw null;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7) qVar).k(i17, i18, null, 0);
            return;
        }
        if (this.f439668h == scene) {
            ps3.a aVar = (ps3.a) scene;
            if (aVar.f439595d != 1) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7) qVar).j(i17, i18, null, 0);
                return;
            }
            this.f439669i = ps3.s.f439660g;
            if (i17 != 0 || i18 != 0) {
                g();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7) qVar).j(i17, i18, null, 0);
                return;
            }
            com.p314xaae8f345.mm.p944x882e457a.o oVar = aVar.f439603o;
            long j17 = 3000;
            this.f439676s.c(j17, j17);
            com.p314xaae8f345.mm.p944x882e457a.o oVar2 = aVar.f439603o;
            r45.qi5 qi5Var = (r45.qi5) (oVar2 != null ? oVar2.f152244b.f152233a : null);
            java.util.LinkedList linkedList = qi5Var != null ? qi5Var.f465561g : null;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.oi5 oi5Var = (r45.oi5) it.next();
                    ((us.a) ((vs.e) i95.n0.c(vs.e.class))).Bi(oi5Var.f463816d, 48, oi5Var.f463821i);
                }
            }
            java.util.LinkedList linkedList2 = this.f439670m;
            if (linkedList != null) {
                linkedList2.clear();
                linkedList2.addAll(linkedList);
            }
            com.p314xaae8f345.mm.p944x882e457a.o oVar3 = aVar.f439603o;
            r45.qi5 qi5Var2 = (r45.qi5) (oVar3 != null ? oVar3.f152244b.f152233a : null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7) qVar).j(i17, i18, linkedList2, qi5Var2 != null ? qi5Var2.f465560f : 0);
        }
    }
}
