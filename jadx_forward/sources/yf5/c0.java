package yf5;

/* loaded from: classes11.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f543388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.l4 f543389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f543390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f543391g;

    public c0(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f543388d = f0Var;
        this.f543389e = l4Var;
        this.f543390f = weakReference;
        this.f543391g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((zh4.k) i95.n0.c(zh4.k.class)).wi(new yf5.b0(this.f543390f, this.f543391g));
        int i17 = this.f543388d.f391649d;
        if (i17 > 0) {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.m0.f291231a.a(this.f543389e, i17);
        }
    }
}
