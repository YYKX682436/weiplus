package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class l implements zy2.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 f183867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f183869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f183871f;

    public l(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, yz5.a aVar, java.lang.String str2, int i17) {
        this.f183866a = str;
        this.f183867b = i0Var;
        this.f183868c = context;
        this.f183869d = aVar;
        this.f183870e = str2;
        this.f183871f = i17;
    }

    @Override // zy2.ya
    public void a(java.lang.String sessionId, boolean z17, int i17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "[enterChattingUIFromLive] toUsername=" + this.f183866a + " sessionId=" + sessionId);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k(this.f183867b, this.f183868c, i17, i18, str, sessionId, this.f183869d, this.f183870e, this.f183871f, z17));
    }
}
