package uz4;

/* loaded from: classes12.dex */
public class d implements com.p314xaae8f345.mm.p944x882e457a.x0, com.p314xaae8f345.mm.p944x882e457a.y0, com.p314xaae8f345.mm.p944x882e457a.z0, com.p314xaae8f345.mm.p944x882e457a.b1, com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f513699d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f513701f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 f513703h;

    /* renamed from: m, reason: collision with root package name */
    public int f513705m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 f513706n;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.c1 f513708p;

    /* renamed from: e, reason: collision with root package name */
    public boolean f513700e = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f513702g = false;

    /* renamed from: i, reason: collision with root package name */
    public long f513704i = -1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f513707o = new java.util.LinkedList();

    public d() {
        if (this.f513706n == null) {
            this.f513706n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        if (this.f513703h == null) {
            this.f513703h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.s7(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.y0
    public void a() {
        h();
    }

    public void b(uz4.c cVar) {
        if (cVar == null) {
            return;
        }
        java.util.List list = this.f513707o;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (cVar == ((uz4.c) it.next())) {
                return;
            }
        }
        ((java.util.LinkedList) list).add(cVar);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.z0
    public void c(boolean z17) {
    }

    public void d() {
        h();
        this.f513706n = null;
        this.f513703h = null;
        ((java.util.LinkedList) this.f513707o).clear();
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f513708p;
        if (c1Var != null) {
            ((sl.j) c1Var).f490576p = null;
            ((sl.j) c1Var).f490575o = null;
            ((sl.j) c1Var).i();
            this.f513708p = null;
        }
    }

    public final com.p314xaae8f345.mm.p944x882e457a.c1 e() {
        if (this.f513708p == null) {
            ((com.p314xaae8f345.mm.app.o7) ((com.p314xaae8f345.mm.p944x882e457a.d1) i95.n0.c(com.p314xaae8f345.mm.p944x882e457a.d1.class))).getClass();
            this.f513708p = new sl.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0);
            java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(26, java.lang.Boolean.FALSE);
            this.f513701f = bool.booleanValue();
            boolean z17 = !bool.booleanValue();
            this.f513700e = z17;
            com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f513708p;
            if (c1Var != null) {
                sl.j jVar = (sl.j) c1Var;
                jVar.f490576p = this;
                jVar.f490575o = this;
                jVar.f490565e = this;
                jVar.f490566f = this;
                jVar.f(z17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NoteEditorVoiceHelper", "get voice player fail, it is null");
            }
        }
        return this.f513708p;
    }

    public boolean f() {
        return this.f513708p != null && ((sl.j) e()).c();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.q7
    public void f1(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f513699d)) {
            return;
        }
        if (this.f513702g) {
            this.f513702g = !z17;
            return;
        }
        if (!z17) {
            long j17 = this.f513704i;
            if (j17 != -1 && android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                this.f513702g = true;
                return;
            }
        }
        this.f513702g = false;
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f513708p;
        if (c1Var != null) {
            c1Var.getClass();
        }
        e().getClass();
        if (this.f513701f) {
            ((sl.j) e()).f(false);
            this.f513700e = false;
        } else {
            if (!((sl.j) e()).c()) {
                ((sl.j) e()).f(true);
                this.f513700e = true;
                return;
            }
            ((sl.j) e()).f(z17);
            this.f513700e = z17;
            if (z17) {
                return;
            }
            g(this.f513699d, this.f513705m);
        }
    }

    public boolean g(java.lang.String str, int i17) {
        ((sl.j) e()).h(false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = this.f513706n;
        if (c21000x8b2f716 != null && !c21000x8b2f716.f273966h) {
            c21000x8b2f716.b(this);
            if (this.f513703h.a(new uz4.b(this))) {
                this.f513704i = 0L;
            } else {
                this.f513704i = -1L;
            }
        }
        this.f513699d = str;
        this.f513705m = i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (((sl.j) e()).g(str, this.f513700e, true, i17)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.a("keep_app_silent");
                for (uz4.c cVar : this.f513707o) {
                    if (cVar != null) {
                        cVar.d(str);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteEditorVoiceHelper", "stop play");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("keep_app_silent");
        if (this.f513708p != null) {
            ((sl.j) e()).h(false);
        }
        for (uz4.c cVar : this.f513707o) {
            if (cVar != null) {
                cVar.c();
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = this.f513706n;
        if (c21000x8b2f716 != null) {
            c21000x8b2f716.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = this.f513703h;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.x0
    /* renamed from: onCompletion */
    public void mo11229xa6db431b() {
        if (this.f513708p != null) {
            h();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.b1
    /* renamed from: onStop */
    public void mo47945xc39f8281() {
        for (uz4.c cVar : this.f513707o) {
            if (cVar != null) {
                cVar.c();
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = this.f513706n;
        if (c21000x8b2f716 != null) {
            c21000x8b2f716.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = this.f513703h;
        if (s7Var != null) {
            s7Var.b();
        }
    }
}
