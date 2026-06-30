package xc1;

/* loaded from: classes7.dex */
public final class j implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f534577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f534578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f534579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h f534580g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f534581h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xc1.l f534582i;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, org.json.JSONObject jSONObject, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar, java.lang.Object obj, xc1.l lVar) {
        this.f534577d = yVar;
        this.f534578e = i17;
        this.f534579f = jSONObject;
        this.f534580g = hVar;
        this.f534581h = obj;
        this.f534582i = lVar;
    }

    @Override // u81.f
    public void D(java.lang.String appId, u81.b state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (u81.b.BACKGROUND == state) {
            this.f534577d.t3().N.c(this);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new xc1.i(this.f534577d, this.f534578e, this.f534579f, this.f534580g, this.f534581h, this.f534582i));
        }
    }
}
