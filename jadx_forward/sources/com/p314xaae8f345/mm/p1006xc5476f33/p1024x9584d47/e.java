package com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47;

/* loaded from: classes12.dex */
public class e implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df f156225b;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df activityC11503x9e50b8df, int i17) {
        this.f156225b = activityC11503x9e50b8df;
        this.f156224a = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df activityC11503x9e50b8df = this.f156225b;
        if (activityC11503x9e50b8df.f156211x0) {
            activityC11503x9e50b8df.X = db5.e1.Q(activityC11503x9e50b8df.mo55332x76847179(), activityC11503x9e50b8df.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11503x9e50b8df.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i67), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.d(this));
            activityC11503x9e50b8df.f178033g.d(activityC11503x9e50b8df);
            java.lang.String o17 = nx1.d.q().o();
            kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.f178170a;
            java.lang.String k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.k(java.util.regex.Pattern.compile("<object[^>]*>", 2).matcher(o17).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#"));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17) && k17.length() != 0) {
                k17 = java.util.regex.Pattern.compile("\\s*|\t|\r|\n").matcher(k17).replaceAll("");
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17)) {
                activityC11503x9e50b8df.b7("", "", true);
            } else {
                activityC11503x9e50b8df.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f1(activityC11503x9e50b8df);
                if (activityC11503x9e50b8df.A.size() <= 0) {
                    activityC11503x9e50b8df.E.run();
                    activityC11503x9e50b8df.E = null;
                }
            }
            vg3.h4 h4Var = (vg3.h4) i95.n0.c(vg3.h4.class);
            java.lang.String str2 = activityC11503x9e50b8df.K;
            int i17 = this.f156224a;
            ((hn.h0) h4Var).getClass();
            gm0.j1.i();
            long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true).M1;
            if (j17 != 0) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str2, j17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Li.X1())) {
                    kn.k0.b(str2, 1, i17, 2, Li.X1(), "roomannouncement@app.origin");
                }
            }
            activityC11503x9e50b8df.r7(this.f156224a != 6 ? 8 : 6);
        }
    }
}
