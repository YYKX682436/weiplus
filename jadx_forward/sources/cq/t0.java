package cq;

/* loaded from: classes2.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f302818g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f302819h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.q f302820i;

    public t0(java.lang.String str, int i17, yz5.l lVar, p012xc85e97e9.p093xedfae76a.y yVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, yz5.q qVar) {
        this.f302815d = str;
        this.f302816e = i17;
        this.f302817f = lVar;
        this.f302818g = yVar;
        this.f302819h = f0Var;
        this.f302820i = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(this.f302815d);
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(this.f302815d);
        ((ku5.t0) ku5.t0.f394148d).B(new cq.s0(p17, k17, this.f302815d, this.f302816e, this.f302817f, this.f302818g, this.f302819h, this.f302820i));
    }
}
