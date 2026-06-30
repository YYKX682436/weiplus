package j00;

/* loaded from: classes9.dex */
public final class a1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f378235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f378236f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378237g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378238h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f378239i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.q f378240m;

    public a1(java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, yz5.a aVar, j00.k1 k1Var, java.lang.String str2, java.util.Map map, yz5.q qVar) {
        this.f378234d = str;
        this.f378235e = u3Var;
        this.f378236f = aVar;
        this.f378237g = k1Var;
        this.f378238h = str2;
        this.f378239i = map;
        this.f378240m = qVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "requestPresentOrderInfoWithLoading, cgi response, orderId: " + this.f378234d + ", errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        ((ku5.t0) ku5.t0.f394148d).B(new j00.z0(this.f378235e, i17, i18, this.f378236f, this.f378237g, this.f378238h, oVar, this.f378239i, this.f378240m, this.f378234d));
        return 0;
    }
}
