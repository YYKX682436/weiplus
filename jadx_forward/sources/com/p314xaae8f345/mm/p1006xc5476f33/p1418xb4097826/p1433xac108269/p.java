package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class p implements zy2.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 f183968c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f183969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183970e;

    public p(java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Intent intent, int i17) {
        this.f183966a = str;
        this.f183967b = context;
        this.f183968c = i0Var;
        this.f183969d = intent;
        this.f183970e = i17;
    }

    @Override // zy2.ya
    public void a(java.lang.String sessionId, boolean z17, int i17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "[enterChattingUI] ]username=" + this.f183966a + " sessionId=" + sessionId);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o(this.f183967b, this.f183968c, i17, i18, str, sessionId, this.f183969d, this.f183966a, z17, this.f183970e));
    }
}
