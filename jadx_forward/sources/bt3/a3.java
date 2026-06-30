package bt3;

/* loaded from: classes12.dex */
public class a3 implements com.p314xaae8f345.mm.p944x882e457a.x0, com.p314xaae8f345.mm.p944x882e457a.y0, com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 {

    /* renamed from: p, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 f105728p;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.c1 f105729d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f105730e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f105731f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f105732g;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 f105734i;

    /* renamed from: n, reason: collision with root package name */
    public int f105736n;

    /* renamed from: h, reason: collision with root package name */
    public boolean f105733h = false;

    /* renamed from: m, reason: collision with root package name */
    public long f105735m = -1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f105737o = new java.util.LinkedList();

    public a3() {
        this.f105731f = true;
        ((com.p314xaae8f345.mm.app.o7) ((com.p314xaae8f345.mm.p944x882e457a.d1) i95.n0.c(com.p314xaae8f345.mm.p944x882e457a.d1.class))).getClass();
        sl.j jVar = new sl.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0);
        this.f105729d = jVar;
        java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(26, java.lang.Boolean.FALSE);
        this.f105732g = bool.booleanValue();
        this.f105731f = true ^ bool.booleanValue();
        jVar.f490576p = this;
        jVar.f490575o = this;
        if (ym1.f.Ri() || ym1.f.Ni()) {
            jVar.f(false);
        } else {
            jVar.f(this.f105731f);
        }
        if (f105728p == null) {
            f105728p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        if (this.f105734i == null) {
            this.f105734i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.s7(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.y0
    public void a() {
        c();
        java.util.Iterator it = this.f105737o.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77 c16974xc8e7af77 = (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77) ((bt3.z2) it.next());
            c16974xc8e7af77.c();
            c16974xc8e7af77.f236869h.c();
        }
    }

    public boolean b(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f105729d;
        if (c1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVoiceHelper", "start play error, path %s, voiceType %d, player is null", str, java.lang.Integer.valueOf(i17));
            return false;
        }
        ((sl.j) c1Var).h(false);
        java.util.Iterator it = this.f105737o.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77 c16974xc8e7af77 = (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77) ((bt3.z2) it.next());
            c16974xc8e7af77.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (!(str == null ? "" : str).equals(c16974xc8e7af77.f236871m)) {
                c16974xc8e7af77.c();
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = f105728p;
        if (c21000x8b2f716 != null && !c21000x8b2f716.f273966h) {
            c21000x8b2f716.b(this);
            if (this.f105734i.a(new bt3.y2(this))) {
                this.f105735m = 0L;
            } else {
                this.f105735m = -1L;
            }
        }
        this.f105730e = str;
        this.f105736n = i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (((sl.j) c1Var).g(str, this.f105731f, true, i17)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.a("keep_app_silent");
                return true;
            }
        }
        return false;
    }

    public void c() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("keep_app_silent");
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f105729d;
        if (c1Var != null) {
            ((sl.j) c1Var).h(false);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = f105728p;
        if (c21000x8b2f716 != null) {
            c21000x8b2f716.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = this.f105734i;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.q7
    public void f1(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f105730e)) {
            return;
        }
        if (this.f105733h) {
            this.f105733h = !z17;
            return;
        }
        if (!z17) {
            long j17 = this.f105735m;
            if (j17 != -1 && android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                this.f105733h = true;
                return;
            }
        }
        this.f105733h = false;
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f105729d;
        if (c1Var != null) {
            c1Var.getClass();
        }
        if (this.f105732g) {
            if (c1Var != null) {
                ((sl.j) c1Var).f(false);
            }
            this.f105731f = false;
        } else {
            if (c1Var != null && !((sl.j) c1Var).c()) {
                ((sl.j) c1Var).f(true);
                this.f105731f = true;
                return;
            }
            if (c1Var != null) {
                ((sl.j) c1Var).f(z17);
            }
            this.f105731f = z17;
            if (z17) {
                return;
            }
            b(this.f105730e, this.f105736n);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.x0
    /* renamed from: onCompletion */
    public void mo11229xa6db431b() {
        c();
        java.util.Iterator it = this.f105737o.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77 c16974xc8e7af77 = (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16974xc8e7af77) ((bt3.z2) it.next());
            c16974xc8e7af77.c();
            c16974xc8e7af77.f236869h.c();
        }
    }
}
