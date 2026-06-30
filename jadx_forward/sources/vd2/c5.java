package vd2;

/* loaded from: classes3.dex */
public final class c5 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.d5 f517217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517219c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f517220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f517221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f517222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517223g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517224h;

    public c5(vd2.d5 d5Var, java.lang.String str, java.lang.String str2, android.content.Intent intent, android.content.Context context, long j17, java.lang.String str3, java.lang.String str4) {
        this.f517217a = d5Var;
        this.f517218b = str;
        this.f517219c = str2;
        this.f517220d = intent;
        this.f517221e = context;
        this.f517222f = j17;
        this.f517223g = str3;
        this.f517224h = str4;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        r45.l71 l71Var = obj instanceof r45.l71 ? (r45.l71) obj : null;
        r45.nw1 nw1Var = l71Var != null ? (r45.nw1) l71Var.m75936x14adae67(1) : null;
        java.lang.String str = this.f517218b;
        vd2.d5 d5Var = this.f517217a;
        if (!d5Var.bj(str, nw1Var)) {
            if (!(nw1Var != null && nw1Var.m75939xb282bd08(2) == 2) || !d5Var.Bi(3, nw1Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(d5Var.f517238d, "enterFinderLiveReplayUI liveInfo:" + cm2.a.f124861a.y(nw1Var));
                return;
            }
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(this.f517219c);
        this.f517217a.Ai(nw1Var, this.f517220d, this.f517221e, this.f517222f, j17, this.f517218b, this.f517223g, this.f517224h);
    }
}
