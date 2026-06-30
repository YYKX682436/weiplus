package pc3;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f434915a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f434916b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f434917c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4 f434918d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f434919e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f434920f;

    /* renamed from: g, reason: collision with root package name */
    public final pc3.l f434921g;

    public m(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f434915a = context;
        this.f434916b = new java.util.HashMap();
        this.f434920f = jz5.h.b(pc3.f.f434909d);
        this.f434921g = new pc3.l(this);
    }

    public static final void a(pc3.m mVar, boolean z17) {
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", "onServerMgrLost " + z17);
        if (z17 || mVar.f434918d != null) {
            mVar.f434918d = null;
            mVar.f434919e = null;
            mVar.f434917c = 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229371c = false;
            try {
                mVar.f434915a.unbindService(mVar.f434921g);
            } catch (java.lang.IllegalArgumentException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushClientMgr", "unbind error: " + e17);
            }
        }
    }

    public final synchronized void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start bind service?");
        sb6.append(this.f434917c == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f434917c;
        if (this.f434917c == 0 || currentTimeMillis < 0 || currentTimeMillis > 300000) {
            this.f434917c = java.lang.System.currentTimeMillis();
            jz5.l lVar = !bf3.w0.f101205a.a(bf3.v0.f101203d) ? new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.ServiceC16423xa9fcb7b8.class, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274592g) : new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.ServiceC16424x96474baf.class, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a);
            java.lang.Class cls = (java.lang.Class) lVar.f384366d;
            java.lang.String str = (java.lang.String) lVar.f384367e;
            this.f434915a.bindService(new android.content.Intent(this.f434915a, (java.lang.Class<?>) cls), this.f434921g, 65);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5 a5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229376h = str;
        }
    }
}
