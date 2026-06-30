package ts3;

/* loaded from: classes9.dex */
public class f extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f503196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f503197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.z9 f503198c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts3.h f503199d;

    public f(ts3.h hVar, boolean z17, android.content.Context context, com.p314xaae8f345.mm.ui.z9 z9Var) {
        this.f503199d = hVar;
        this.f503196a = z17;
        this.f503197b = context;
        this.f503198c = z9Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f503196a;
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(z17 ? n17 & (-524289) : n17 | 524288));
        r45.u85 u85Var = new r45.u85();
        u85Var.f468669d = 524288;
        u85Var.f468670e = !z17 ? 1 : 0;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var));
        if (z17) {
            ts3.h.a(true);
            c01.e2.z0(this.f503199d.f503204f, true);
        } else {
            android.content.Context context = this.f503197b;
            ss3.d0.wi(new ts3.e(this, db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hrc), false, false, null)));
            ts3.h.a(false);
        }
        com.p314xaae8f345.mm.ui.z9 z9Var = this.f503198c;
        if (z9Var != null) {
            z9Var.mo735xb0dfc7d8(null, null);
        }
    }
}
