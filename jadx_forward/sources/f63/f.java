package f63;

/* loaded from: classes8.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u53.d0 f341387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, java.lang.String str2, u53.d0 d0Var) {
        super(2);
        this.f341385d = str;
        this.f341386e = str2;
        this.f341387f = d0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String sessionId = (java.lang.String) obj;
        v53.c cVar = (v53.c) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getSessionId] ");
        java.lang.String str = this.f341385d;
        sb6.append(str);
        sb6.append(" to ");
        java.lang.String str2 = this.f341386e;
        sb6.append(str2);
        sb6.append(" => ");
        sb6.append(sessionId);
        sb6.append(", from server.");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.GameLifeSessionInfoService", sb6.toString());
        if (sessionId.length() > 0) {
            ((t53.m0) i95.n0.c(t53.m0.class)).Zi().z0(sessionId, str, str2, cVar);
        }
        this.f341387f.a(sessionId);
        return jz5.f0.f384359a;
    }
}
