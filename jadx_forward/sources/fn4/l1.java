package fn4;

/* loaded from: classes15.dex */
public class l1 {

    /* renamed from: b, reason: collision with root package name */
    public fn4.c1 f346106b;

    /* renamed from: c, reason: collision with root package name */
    public fn4.g f346107c;

    /* renamed from: d, reason: collision with root package name */
    public r45.xn6 f346108d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f346109e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f346110f;

    /* renamed from: g, reason: collision with root package name */
    public f25.m0 f346111g;

    /* renamed from: j, reason: collision with root package name */
    public fn4.b f346114j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f346115k;

    /* renamed from: a, reason: collision with root package name */
    public int f346105a = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f346112h = false;

    /* renamed from: i, reason: collision with root package name */
    public final f25.f f346113i = new fn4.d1(this);

    public static dn.o a(fn4.l1 l1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, fn4.i1 i1Var) {
        l1Var.getClass();
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_TopStoryVideoViewMgr";
        oVar.f69601xaca5bdda = str;
        oVar.M1 = str2;
        oVar.H1 = 1;
        oVar.Z = 3;
        oVar.f323342y0 = 4;
        oVar.f69595x6d25b0d9 = str3;
        oVar.f323348c2 = i1Var;
        return oVar;
    }

    public void b(fn4.g gVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        if (gVar == this.f346107c || this.f346114j == null) {
            return;
        }
        if (this.f346106b == null) {
            fn4.c1 c1Var = new fn4.c1(this.f346114j.B(), this.f346114j);
            c1Var.mo48224x6c9eb6a9(this.f346114j.z4());
            c1Var.m48235xbc2f47ad(new fn4.j1(this, null));
            c1Var.m75326x5d1e8363(new fn4.k1(this, null));
            this.f346106b = c1Var;
        }
        if (this.f346106b.getParent() != null) {
            ((android.view.ViewGroup) this.f346106b.getParent()).removeView(this.f346106b);
        }
        gVar.m129849xb8948454().addView(this.f346106b);
        this.f346106b.mo64632xb9405cf9(gVar.mo129842x143e7d6c());
        this.f346106b.mo48237xebd28962(e1Var);
        this.f346106b.mo61532x526554de(gVar.mo129848x9535596f());
        j();
        this.f346107c = gVar;
    }

    public int c() {
        fn4.c1 c1Var = this.f346106b;
        if (c1Var != null) {
            return c1Var.mo64621x25784152();
        }
        return 0;
    }

    public boolean d() {
        fn4.c1 c1Var = this.f346106b;
        if (c1Var != null) {
            return c1Var.mo61531xc00617a4();
        }
        return false;
    }

    public void e(int i17, int i18) {
        if (i17 == 0) {
            if (this.f346109e && this.f346115k) {
                this.f346115k = false;
                k();
                return;
            }
            return;
        }
        if (i18 == 0 && this.f346109e && d()) {
            this.f346115k = true;
            h();
        }
    }

    public void f() {
        int i17 = this.f346105a - 1;
        this.f346105a = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onUIDestroy %d", java.lang.Integer.valueOf(i17));
        if (this.f346105a <= 0) {
            if (this.f346106b != null) {
                m();
                this.f346106b.d();
            }
            this.f346114j = null;
        }
    }

    public void g(java.lang.String str) {
        rm4.d dVar = this.f346114j.o4().f346012f;
        if (dVar != null) {
            dVar.f478989e = 1L;
        }
        fn4.c1 c1Var = this.f346106b;
        if (c1Var != null && c1Var.mo66135x23a7af9b().equals(str)) {
            if (this.f346108d != null) {
                ((wm4.p) i95.n0.c(wm4.p.class)).f528832f.remove(this.f346108d.f471792h);
            }
            m();
        }
        uu4.a.a(26);
    }

    public void h() {
        if (this.f346106b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "abandonAudioFocus: ");
            if (this.f346111g != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f346111g);
            }
            this.f346111g = null;
            this.f346106b.setKeepScreenOn(false);
            this.f346106b.mo48231x65825f6();
            this.f346110f = true;
        }
    }

    public void i(fn4.b bVar, r45.xn6 xn6Var, java.lang.String str, int i17) {
        r45.pn6 pn6Var = xn6Var.Y;
        if (pn6Var != null) {
            pn6Var.f464777o = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "replay video %s %s %s", xn6Var.f471792h, xn6Var.f471788d, str);
        bVar.o4().g(bVar.r0());
        bVar.o4().c();
        bVar.o4().f(xn6Var, i17, str);
        this.f346106b.setKeepScreenOn(true);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.C18756x7b629d71) this.f346106b.f271281q).setAlpha(1.0f);
        fn4.c1 c1Var = this.f346106b;
        c1Var.P1 = str;
        c1Var.mo48238x68ac462();
        this.f346108d = xn6Var;
        this.f346109e = true;
        this.f346110f = false;
        ((wm4.p) i95.n0.c(wm4.p.class)).f528832f.put(xn6Var.f471792h, 0);
    }

    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "requestAudioFocus: ");
        if (this.f346111g != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f346111g);
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.g0.f340628c, this.f346113i);
        this.f346111g = m96;
        if (((g25.e) m96).f349513c) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "requestAudioFocus: not gain focus");
        l(false);
    }

    public void k() {
        if (this.f346106b != null) {
            j();
            this.f346106b.setKeepScreenOn(true);
            this.f346106b.mo48232x348b34();
            this.f346110f = false;
        }
    }

    public void l(boolean z17) {
        fn4.c1 c1Var = this.f346106b;
        if (c1Var != null) {
            c1Var.mo61536x764d819b(z17);
        }
    }

    public void m() {
        if (this.f346106b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "stop play");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "abandonAudioFocus: ");
            if (this.f346111g != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f346111g);
            }
            this.f346111g = null;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.C18756x7b629d71) this.f346106b.f271281q).setAlpha(0.0f);
            this.f346106b.setKeepScreenOn(false);
            this.f346106b.mo48239x360802();
            this.f346108d = null;
            this.f346109e = false;
            this.f346110f = false;
            fn4.b bVar = this.f346114j;
            if (bVar != null) {
                bVar.o4().g(this.f346114j.r0());
                this.f346114j.o4().c();
            }
            fn4.g gVar = this.f346107c;
            if (gVar != null) {
                gVar.o();
            }
        }
    }
}
