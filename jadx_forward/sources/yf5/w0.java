package yf5;

/* loaded from: classes11.dex */
public final class w0 extends android.widget.BaseAdapter implements l75.z0, yf5.j0 {
    public boolean A;
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d B;
    public boolean C;
    public yf5.h0 D;
    public boolean E;
    public int F;
    public java.lang.String G;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f543508d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f543509e;

    /* renamed from: f, reason: collision with root package name */
    public final yf5.i0 f543510f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f543511g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f543512h;

    /* renamed from: i, reason: collision with root package name */
    public final yf5.g0 f543513i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f543514m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f543515n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f543516o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f543517p;

    /* renamed from: q, reason: collision with root package name */
    public final yf5.a f543518q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f543519r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 f543520s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 f543521t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f543522u;

    /* renamed from: v, reason: collision with root package name */
    public long f543523v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f543524w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f543525x;

    /* renamed from: y, reason: collision with root package name */
    public yf5.d f543526y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f543527z;

    public w0(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activity, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 folderHelper, yf5.i0 i0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(folderHelper, "folderHelper");
        this.f543508d = activity;
        this.f543509e = folderHelper;
        this.f543510f = i0Var;
        this.f543511g = "MicroMsg.ConversationAdapter.MvvmConversationAdapter";
        this.f543513i = new yf5.g0(activity);
        this.f543514m = jz5.h.b(new yf5.n0(this));
        this.f543515n = jz5.h.b(new yf5.m0(this));
        this.f543516o = jz5.h.b(new yf5.v0(this));
        this.f543518q = new yf5.a();
        this.f543519r = jz5.h.b(new yf5.t0(this));
        this.f543521t = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3();
        this.f543522u = gg5.b.f353322b;
        this.f543525x = jz5.h.b(new yf5.r0(this));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        this.F = calendar.get(6);
        this.G = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
    }

    public void a() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f543511g, "[frozenNotify] from:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.A = true;
    }

    public final yf5.m c() {
        return (yf5.m) ((jz5.n) this.f543515n).mo141623x754a37bb();
    }

    public final yf5.w d() {
        return (yf5.w) ((jz5.n) this.f543514m).mo141623x754a37bb();
    }

    @Override // android.widget.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p2621x8fb0427b.l4 getItem(int i17) {
        yf5.a aVar = this.f543518q;
        return (com.p314xaae8f345.mm.p2621x8fb0427b.l4) aVar.f543379c.get(aVar.f543378b.get(i17));
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) this.f543516o).mo141623x754a37bb(), null, new yf5.u0(obj, this, i17, a1Var, null), 1, null);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f543518q.f543377a;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x060e A[Catch: Exception -> 0x061f, TRY_LEAVE, TryCatch #0 {Exception -> 0x061f, blocks: (B:161:0x05e9, B:165:0x0603, B:169:0x060e, B:171:0x05f0, B:175:0x05fa), top: B:160:0x05e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x037a  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r28, android.view.View r29, android.view.ViewGroup r30) {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf5.w0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.l4 h(java.lang.String str) {
        java.util.HashMap hashMap = this.f543518q.f543379c;
        if (str == null) {
            str = "";
        }
        return (com.p314xaae8f345.mm.p2621x8fb0427b.l4) hashMap.get(str);
    }

    public void j(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var;
        if (i17 < 0 || i17 >= this.f543518q.f543377a) {
            return;
        }
        try {
            l4Var = getItem(i17);
        } catch (java.lang.NullPointerException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f543511g, "preLoad position:%s is null!", java.lang.Integer.valueOf(i17));
            l4Var = null;
        }
        if (l4Var == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c().mo560xd586ddb5(l4Var.h1());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (!this.A) {
            yf5.i0 i0Var = this.f543510f;
            if (i0Var != null) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d7 d7Var = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d7) i0Var;
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = d7Var.f289167a.f288905o;
                if (viewOnTouchListenerC22366xcd5c2226 != null) {
                    viewOnTouchListenerC22366xcd5c2226.post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.c7(d7Var));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f543517p;
            if (c16718x7059cefe == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mvvmList");
                throw null;
            }
            this.f543518q.a(c16718x7059cefe.f233598o);
            super.notifyDataSetChanged();
            this.f543522u.clear();
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f543509e;
            if (o5Var.f289476z) {
                o5Var.f289476z = false;
                o5Var.A = false;
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22262 = o5Var.f289459f;
                if (viewOnTouchListenerC22366xcd5c22262 != null) {
                    viewOnTouchListenerC22366xcd5c22262.postDelayed(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m5(o5Var), o5Var.f289473w > 50 ? 100L : 0L);
                }
            }
            if (i0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.a(12);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f543511g, "clear usernamePositionMap %s", java.lang.Boolean.valueOf(this.A));
    }
}
