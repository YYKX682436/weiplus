package wf;

/* loaded from: classes7.dex */
public class y extends tf.r0 {

    /* renamed from: e, reason: collision with root package name */
    public pd1.l f527021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf1.o f527022f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wf.z zVar, tf.q qVar, yf1.o oVar) {
        super(qVar);
        this.f527022f = oVar;
        this.f527021e = null;
    }

    @Override // pd1.l
    public pd1.f a() {
        return !this.f527022f.a() ? g().a() : tf.r0.f500375c;
    }

    @Override // pd1.l
    public void b(android.view.View view) {
        if (this.f527022f.a()) {
            return;
        }
        if (view instanceof com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) {
            g().b((com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) view);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f500377a, "recycleVideoContainerView, view is not instanceof TextureImageViewLikeImpl");
        }
    }

    @Override // tf.r0, pd1.l
    public void c(android.view.View view, java.lang.Runnable runnable) {
        if (this.f527022f.a()) {
            super.c(view, runnable);
            return;
        }
        if (view instanceof com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) {
            g().c((com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) view, runnable);
            return;
        }
        java.lang.String str = this.f500377a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "transferTo, view is not instanceof TextureImageViewLikeImpl");
        if (runnable != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferTo, run afterTransferToTask when view is not instanceof TextureImageViewLikeImpl");
            runnable.run();
        }
    }

    @Override // tf.r0, pd1.l
    public void d(android.view.View view, java.lang.Runnable runnable) {
        if (this.f527022f.a()) {
            super.d(view, runnable);
            return;
        }
        if (view instanceof com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) {
            g().d((com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) view, runnable);
            return;
        }
        java.lang.String str = this.f500377a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "transferFrom, view is not instanceof TextureImageViewLikeImpl");
        if (runnable != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferFrom, run afterTransferFromTask when view is not instanceof TextureImageViewLikeImpl");
            runnable.run();
        }
    }

    @Override // pd1.l
    public android.view.View e(android.content.Context context) {
        return !this.f527022f.a() ? g().e(context) : new tf.p0(this, context);
    }

    @Override // pd1.l
    public void f(android.view.View view) {
        boolean a17 = this.f527022f.a();
        java.lang.String str = this.f500377a;
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayEndWorkaround, view: " + view);
        } else if (view instanceof com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) {
            g().f((com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) view);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "onPlayEndWorkaround, view is not instanceof TextureImageViewLikeImpl");
        }
    }

    public final pd1.l g() {
        if (this.f527021e == null) {
            this.f527021e = ((wf.v) wf.x.f527018c).a(this.f527022f);
        }
        return this.f527021e;
    }
}
