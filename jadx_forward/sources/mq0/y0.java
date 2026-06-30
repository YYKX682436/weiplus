package mq0;

/* loaded from: classes7.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq0.a1 f412165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq0.x f412166e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(mq0.a1 a1Var, fq0.x xVar) {
        super(0);
        this.f412165d = a1Var;
        this.f412166e = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.util.List k17 = kz5.c0.k(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        java.util.HashMap hashMap = this.f412165d.f412068a;
        fq0.x xVar = this.f412166e;
        hashMap.put(xVar.f347011b, k17);
        je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
        java.lang.String str = xVar.f347011b;
        java.lang.String str2 = xVar.f347013d;
        java.lang.String str3 = xVar.f347010a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c enumC16454xc40f4d3c = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c.f37603x4c7d442;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appStatus", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d() ? 1 : 2);
        hq0.e0 e0Var = xVar.f347012c;
        jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, e0Var != null ? e0Var.f364515c : null);
        iVar.qa(str, str2, str3, enumC16454xc40f4d3c, 0L, null, jSONObject);
        java.util.Objects.toString(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c.f37598xf943aa9b);
        return jz5.f0.f384359a;
    }
}
