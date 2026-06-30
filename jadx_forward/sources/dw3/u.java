package dw3;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f325812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f325813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f325814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f325815g;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242, boolean z17, boolean z18) {
        this.f325812d = c16993xacc19624;
        this.f325813e = c16993xacc196242;
        this.f325814f = z17;
        this.f325815g = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f325812d;
        if (!c16993xacc19624.f237220y) {
            dw3.c0.f325715a.j(c16993xacc19624.D);
        }
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "imageState : " + o17 + ' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = this.f325813e;
        if (!o17) {
            ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Ai(c16993xacc196242.E);
            return;
        }
        boolean z17 = this.f325814f;
        if ((z17 && o17) || (!z17 && c16993xacc196242.f237221z && this.f325815g)) {
            java.lang.String g17 = ai3.d.g("jpg");
            if (!z17) {
                g17 = q75.c.a("jpg");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "auto save pic src " + c16993xacc196242.E + " dest " + g17 + ' ');
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str = c16993xacc196242.E;
            ((yb0.g) b0Var).getClass();
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.b(context, str, g17);
            q75.c.f(g17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            qk.e0.b(g17, qk.e0.a(c16993xacc196242.E));
            ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Bi(c16993xacc196242.E);
        }
    }
}
