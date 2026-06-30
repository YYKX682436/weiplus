package sg0;

/* loaded from: classes8.dex */
public final class c3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg0.h3 f489220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f489221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f489222c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.h2 f489223d;

    public c3(sg0.h3 h3Var, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, su4.h2 h2Var) {
        this.f489220a = h3Var;
        this.f489221b = context;
        this.f489222c = h0Var;
        this.f489223d = h2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "preloadLiteApp fail: " + appId + ", errCode: " + i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "checkLiteApp success: " + info + ", errCode: " + i17);
        this.f489220a.Bi(this.f489221b, (java.lang.String) this.f489222c.f391656d, this.f489223d);
    }
}
