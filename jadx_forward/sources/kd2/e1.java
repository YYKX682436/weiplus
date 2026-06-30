package kd2;

/* loaded from: classes10.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f388269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f388270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f388271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f388272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f388273h;

    public e1(kd2.p1 p1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, long j17, boolean z17) {
        this.f388269d = p1Var;
        this.f388270e = c14994x9b99c079;
        this.f388271f = c14989xf862ae88;
        this.f388272g = j17;
        this.f388273h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pm0.v.X(new kd2.d1(this.f388269d, this.f388270e, this.f388271f, this.f388272g, this.f388273h));
    }
}
