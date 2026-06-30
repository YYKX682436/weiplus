package of1;

/* loaded from: classes8.dex */
public final class m extends of1.a implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f426497h;

    /* renamed from: i, reason: collision with root package name */
    public long f426498i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f426499m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f426500n;

    /* renamed from: o, reason: collision with root package name */
    public int f426501o;

    /* renamed from: p, reason: collision with root package name */
    public int f426502p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f426503q;

    /* renamed from: r, reason: collision with root package name */
    public hy4.s f426504r;

    /* renamed from: s, reason: collision with root package name */
    public final kd0.p2 f426505s;

    /* renamed from: t, reason: collision with root package name */
    public final hy4.r f426506t;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar) {
        super(oVar);
        this.f426503q = null;
        this.f426506t = new of1.l(this);
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.content.Context a17 = a();
        of1.b bVar = new of1.b(this);
        p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f = ((of1.w1) oVar).m151232xaf156f4a().mo50358x95c7fa5f();
        ((jd0.q2) x2Var).getClass();
        this.f426505s = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636(a17, bVar, mo50358x95c7fa5f);
        try {
            com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(a());
            this.f426497h = s6Var;
            s6Var.c(((of1.w1) oVar).mo51534x86b9ebe3(), this, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.HTMLViewScanHelper", e17, "<init> initMenu() get exception", new java.lang.Object[0]);
            this.f426497h = null;
        }
    }

    public final java.lang.String b() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) ((of1.x1) ((of1.w1) this.f426413d).m151222x143f1b92())).Z();
    }

    public final boolean c(android.view.ContextMenu contextMenu, java.lang.String str) {
        boolean z17;
        boolean z18;
        try {
            z17 = this.f426415f.mo74369xe8158c5e();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "onCreateContextMenu fail, ex = " + e17.getMessage());
            z17 = false;
        }
        if (!z17 || this.f426416g == null) {
            return true;
        }
        contextMenu.setHeaderTitle(com.p314xaae8f345.mm.R.C30867xcad56011.lax);
        try {
            z18 = this.f426415f.lb();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "get has setuin failed : %s", e18.getMessage());
            z18 = false;
        }
        boolean z19 = (this.f426416g.b().f273710d & 16384) > 0;
        boolean z27 = (this.f426416g.b().f273710d & 32768) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLViewScanHelper", "hasSetAcc = %b, canShareImage = %b, canFavImage = %b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27));
        if (z18 && z19) {
            contextMenu.add(0, 0, 0, a().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hr_)).setOnMenuItemClickListener(new of1.g(this));
        }
        contextMenu.add(0, 0, 0, a().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8c)).setOnMenuItemClickListener(new of1.h(this));
        if (z18 && z27) {
            contextMenu.add(0, 0, 0, a().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg)).setOnMenuItemClickListener(new of1.j(this));
        }
        this.f426497h.f292254e.o(null);
        java.lang.String str2 = this.f426499m;
        if (str2 == null) {
            return false;
        }
        this.f426497h.f292254e.o(((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) this.f426505s).b(new of1.k(this, str2, str), this.f426501o, str2, 10));
        ((et.s) ((ft.f4) i95.n0.c(ft.f4.class))).wi(((of1.w1) this.f426413d).m151232xaf156f4a(), true, this.f426501o, this.f426499m, true, false, b());
        return true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.p3210x3857dc.d1 mo120147x1d5dd38c;
        boolean z17 = view instanceof android.webkit.WebView;
        hy4.r rVar = this.f426506t;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f426414e;
        if (z17) {
            com.p314xaae8f345.p3210x3857dc.d1 mo120147x1d5dd38c2 = c22633x83752a59.mo120147x1d5dd38c();
            if (mo120147x1d5dd38c2 == null) {
                return;
            }
            int i17 = mo120147x1d5dd38c2.f301772a;
            if (i17 == 5 || i17 == 8) {
                boolean c17 = c(contextMenu, mo120147x1d5dd38c2.f301773b);
                this.f426500n = mo120147x1d5dd38c2.f301773b;
                if (c17 || !this.f426416g.b().a()) {
                    return;
                }
                hy4.s sVar = new hy4.s();
                this.f426504r = sVar;
                sVar.a(c22633x83752a59, rVar);
                return;
            }
            return;
        }
        if (!(view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) || (mo120147x1d5dd38c = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view).mo120147x1d5dd38c()) == null) {
            return;
        }
        int i18 = mo120147x1d5dd38c.f301772a;
        if (i18 == 5 || i18 == 8) {
            boolean c18 = c(contextMenu, mo120147x1d5dd38c.f301773b);
            this.f426500n = mo120147x1d5dd38c.f301773b;
            if (c18 || !this.f426416g.b().a()) {
                return;
            }
            hy4.s sVar2 = new hy4.s();
            this.f426504r = sVar2;
            sVar2.a(c22633x83752a59, rVar);
        }
    }
}
