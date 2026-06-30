package cw1;

/* loaded from: classes12.dex */
public class e5 implements bw1.k, c01.fa, c01.da {

    /* renamed from: f, reason: collision with root package name */
    public final long f304441f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f304442g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f304443h;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f304445m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f304446n;

    /* renamed from: o, reason: collision with root package name */
    public volatile int f304447o;

    /* renamed from: p, reason: collision with root package name */
    public final int f304448p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f304449q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac f304450r;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f304439d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f304440e = -1;

    /* renamed from: i, reason: collision with root package name */
    public final long f304444i = java.lang.System.currentTimeMillis();

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac, long j17, boolean z17, boolean z18, int i17, boolean z19) {
        this.f304450r = activityC13118x73d350ac;
        this.f304441f = j17;
        this.f304442g = z17;
        this.f304443h = z18;
        this.f304448p = i17;
        this.f304445m = z19;
    }

    @Override // bw1.k
    public void K2(int i17, int i18) {
        this.f304446n = i17;
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.RunnableC28107x5a7e972(this));
    }

    @Override // bw1.k
    public void Y4() {
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.fa
    public void b(int i17, int i18) {
        this.f304447o = i17;
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.RunnableC28107x5a7e972(this));
    }

    @Override // c01.da
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingUI", "Triggered async delete messages");
        this.f304439d = -1;
        if (this.f304440e >= 0) {
            e();
        }
    }

    @Override // c01.fa
    public void d(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingUI", "Done delete messages, cancelled: " + z17 + ", count: " + i17);
        if (!z17) {
            aw1.l1.f96121d.a();
        }
        this.f304449q = z17 | this.f304449q;
        this.f304439d = i17;
        if (this.f304440e >= 0) {
            e();
        }
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = this.f304450r;
        activityC13118x73d350ac.f177291z += this.f304441f;
        yv1.f1 f1Var = yv1.g1.f547573p;
        ((cw1.RunnableC28100x56f8b7e) activityC13118x73d350ac.A).run();
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: cw1.e5$$a
            @Override // java.lang.Runnable
            public final void run() {
                cw1.e5 e5Var = cw1.e5.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac2 = e5Var.f304450r;
                android.app.ProgressDialog progressDialog = activityC13118x73d350ac2.f177281p;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                db5.t7.h(activityC13118x73d350ac2, e5Var.f304449q ? activityC13118x73d350ac2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_3) : activityC13118x73d350ac2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8q, fp.n0.a(e5Var.f304441f)));
                activityC13118x73d350ac2.setResult(-1, new android.content.Intent().putExtra("tds", activityC13118x73d350ac2.f177291z));
            }
        });
        long j17 = this.f304450r.f177289x ? this.f304450r.f177285t == -2 ? 0L : this.f304450r.f177285t == -1 ? -2L : this.f304450r.f177285t / 86400000 : -1L;
        if (this.f304449q) {
            mt1.b0.s(13, java.lang.System.currentTimeMillis() - this.f304444i, java.lang.Long.valueOf(this.f304439d));
        } else {
            int i17 = this.f304442g ? 6 : 7;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f304444i;
            java.lang.Long[] lArr = new java.lang.Long[6];
            lArr[0] = java.lang.Long.valueOf(this.f304441f);
            lArr[1] = java.lang.Long.valueOf(this.f304443h ? 1L : 0L);
            lArr[2] = java.lang.Long.valueOf(this.f304450r.f177288w ? this.f304450r.f177284s : -1);
            lArr[3] = java.lang.Long.valueOf(j17);
            lArr[4] = java.lang.Long.valueOf(this.f304450r.f177290y ? this.f304450r.f177287v : -1);
            lArr[5] = java.lang.Long.valueOf(this.f304439d);
            mt1.b0.s(i17, currentTimeMillis, lArr);
        }
        mt1.b0.f412734k = true;
    }

    @Override // bw1.k
    public void j6(boolean z17, long j17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = z17 ? "cancelled" : ya.b.f77504xbb80cbe3;
        objArr[1] = java.lang.Long.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingUI", "onDeleteEnd [%s, %d] ", objArr);
        if (!z17 && this.f304445m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingUI", "Delete all messages, clear C2C directories.");
            com.p314xaae8f345.mm.vfs.w6.f("wcf://image2/");
            com.p314xaae8f345.mm.vfs.w6.f("wcf://video/");
            com.p314xaae8f345.mm.vfs.w6.f("wcf://voice2/");
            com.p314xaae8f345.mm.vfs.w6.f("wcf://attachment/");
            com.p314xaae8f345.mm.vfs.w6.f("wcf://record/");
        }
        this.f304449q = z17 | this.f304449q;
        this.f304440e = j17;
        if (this.f304439d >= -1) {
            e();
        }
    }
}
