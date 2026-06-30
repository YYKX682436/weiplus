package qj4;

/* loaded from: classes11.dex */
public final class o implements o04.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f445472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445473c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445474d;

    public o(java.lang.String str, java.lang.Long l17, java.lang.String str2, java.lang.String str3) {
        this.f445471a = str;
        this.f445472b = l17;
        this.f445473c = str2;
        this.f445474d = str3;
    }

    @Override // o04.q
    public void a(int i17, boolean z17, dm.ba baVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        jz5.f0 f0Var;
        pj4.h2 h2Var = (pj4.h2) fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "postReport onActionDone " + i17 + ' ' + z17 + ' ' + this.f445471a);
        if (h2Var != null) {
            ((ku5.t0) ku5.t0.f394148d).g(new qj4.q(h2Var, this.f445472b, this.f445473c, this.f445474d));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.tsReport", "postReport: postData is null, " + this.f445471a + ", " + this.f445472b);
        }
    }
}
