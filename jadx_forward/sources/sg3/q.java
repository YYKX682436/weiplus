package sg3;

/* loaded from: classes4.dex */
public class q implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489518c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f489520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sg3.r f489521f;

    public q(sg3.r rVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.Context context) {
        this.f489521f = rVar;
        this.f489516a = str;
        this.f489517b = str2;
        this.f489518c = str3;
        this.f489519d = str4;
        this.f489520e = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            java.lang.String str2 = this.f489516a;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str2)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d c6803x6d9acd6d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d();
                c6803x6d9acd6d.p(this.f489517b);
                c6803x6d9acd6d.f141330f = 1L;
                java.lang.String str3 = this.f489518c;
                c6803x6d9acd6d.q(str3);
                c6803x6d9acd6d.f141331g = 1L;
                c6803x6d9acd6d.f141333i = 2L;
                c6803x6d9acd6d.k();
                ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).getClass();
                l41.h0 h0Var = new l41.h0(str2, this.f489519d, 0);
                sg3.r rVar = this.f489521f;
                rVar.f489523n = h0Var;
                ((l41.h0) rVar.f489523n).f397358h = str3;
                gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) rVar.f489523n);
                android.content.Context context = this.f489520e;
                rVar.f489522m = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f489520e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfj), true, true, new sg3.p(this));
            }
        }
    }
}
