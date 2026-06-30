package s02;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f483483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f483484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f483485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s02.g f483486g;

    public f(s02.g gVar, boolean z17, android.app.ProgressDialog progressDialog, android.content.Context context) {
        this.f483486g = gVar;
        this.f483483d = z17;
        this.f483484e = progressDialog;
        this.f483485f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f483486g.getClass();
        int n17 = c01.z1.n();
        boolean z17 = this.f483483d;
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(z17 ? n17 & (-134217729) : n17 | 134217728));
        r45.u85 u85Var = new r45.u85();
        u85Var.f468669d = 134217728;
        u85Var.f468670e = !z17 ? 1 : 0;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var));
        if (!z17) {
            c01.w9.k("downloaderapp");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k("downloaderapp");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new s02.e(this), 1000L);
    }
}
