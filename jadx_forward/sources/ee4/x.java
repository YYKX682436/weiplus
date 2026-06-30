package ee4;

/* loaded from: classes4.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2 {

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 f333297c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f333298d;

    /* renamed from: e, reason: collision with root package name */
    public final ee4.c0 f333299e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f333300f;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 packHelper, java.util.List paths, ee4.c0 commitPc, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packHelper, "packHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paths, "paths");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commitPc, "commitPc");
        this.f333297c = packHelper;
        this.f333298d = paths;
        this.f333299e = commitPc;
        this.f333300f = z17;
        if (z17) {
            commitPc.j().q();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2
    public java.lang.Object a(java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        java.lang.String[] params = (java.lang.String[]) objArr;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$commitImp", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        this.f333299e.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commitImp", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        this.f333297c.V(this.f333298d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commitImp", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$commitImp", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAsyncTask", "commit imp time " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        return bool;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2
    public java.util.concurrent.ExecutorService b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExecutor", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        java.util.concurrent.ExecutorService Sj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Sj();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Sj, "getTaskExecutor(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExecutor", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        return Sj;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f2
    public void c(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        super.c(java.lang.Boolean.valueOf(booleanValue));
        boolean z17 = this.f333300f;
        ee4.c0 c0Var = this.f333299e;
        if (z17) {
            c0Var.j().p();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$commitDone", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        c0Var.p(this.f333297c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$commitDone", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
    }
}
