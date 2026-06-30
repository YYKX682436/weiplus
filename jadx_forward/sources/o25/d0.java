package o25;

/* loaded from: classes9.dex */
public class d0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.h f424027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f424028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o25.k0 f424029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f424031h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f424032i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f424033m;

    public d0(de0.h hVar, boolean z17, o25.k0 k0Var, java.lang.String str, android.os.Bundle bundle, android.content.Context context, int i17) {
        this.f424027d = hVar;
        this.f424028e = z17;
        this.f424029f = k0Var;
        this.f424030g = str;
        this.f424031h = bundle;
        this.f424032i = context;
        this.f424033m = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (this.f424027d != m1Var) {
            return;
        }
        gm0.j1.d().q(1200, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink: errType = %s; errCode = %s; errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof de0.h) {
            if (!this.f424028e) {
                ((ku5.t0) ku5.t0.f394148d).a(new o25.c0(this, m1Var, i17, i18, str));
            } else {
                o25.k0 k0Var = this.f424029f;
                if (k0Var != null) {
                    k0Var.b(i17, i18, str, m1Var, true);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DeepLinkHelper", "doTicketsDeepLink justGetTranslateLinkResult, return");
            }
        }
    }
}
