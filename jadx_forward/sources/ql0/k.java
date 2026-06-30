package ql0;

/* loaded from: classes13.dex */
public final class k implements at.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ at.e f446022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f446023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f446024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql0.l f446025d;

    public k(at.e eVar, boolean z17, java.lang.Float f17, ql0.l lVar) {
        this.f446022a = eVar;
        this.f446023b = z17;
        this.f446024c = f17;
        this.f446025d = lVar;
    }

    @Override // at.e
    public void a(java.lang.String reddotId, int i17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reddotId, "reddotId");
        boolean z17 = this.f446023b;
        ql0.l lVar = this.f446025d;
        at.e eVar = this.f446022a;
        if (!z17) {
            eVar.a(reddotId, 2, f17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f446026d, "cell START_DOWNGRADE_PRELOAD");
            return;
        }
        java.lang.Float f18 = this.f446024c;
        float floatValue = f18 != null ? f18.floatValue() : 0.0f;
        if (floatValue < 0.001d) {
            eVar.a(reddotId, i17, f17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f446026d, "cell threshold invalid " + floatValue);
            return;
        }
        eVar.a(reddotId, f17 > floatValue ? 1 : 0, f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f446026d, "cell threshold:" + floatValue + " score:" + f17);
    }

    @Override // at.e
    /* renamed from: start */
    public void mo8975x68ac462(java.lang.String reddotId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reddotId, "reddotId");
        this.f446022a.mo8975x68ac462(reddotId);
    }
}
