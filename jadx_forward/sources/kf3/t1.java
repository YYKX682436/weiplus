package kf3;

/* loaded from: classes5.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f388965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f388966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f388967f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kf3.u1 f388968g;

    public t1(kf3.u1 u1Var, java.lang.String str, java.lang.String str2, int i17) {
        this.f388968g = u1Var;
        this.f388965d = str;
        this.f388966e = str2;
        this.f388967f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f388968g.f388984a;
        java.lang.String str = this.f388966e;
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679.f230072v;
        activityC16488xbf7e6679.getClass();
        boolean m40075x3170ff = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(activityC16488xbf7e6679);
        int m69244xe35aebcb = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69244xe35aebcb(str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q1.f33748x366c91de, 500, m40075x3170ff ? 10485760 : 26214400, m40075x3170ff ? 60000.0d : 300000.0d, 1000000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "check remuxing, ret %d", java.lang.Integer.valueOf(m69244xe35aebcb));
        boolean z17 = false;
        java.lang.String str2 = this.f388965d;
        if (m69244xe35aebcb == 0) {
            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, str2, true);
            gp.d dVar = new gp.d();
            dVar.setDataSource(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "start remux, targetPath: %s", rj6);
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f5 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.f(str, c19767x257d7f, c19767x257d7f2, c19767x257d7f3, c19767x257d7f4, c19767x257d7f5);
            c11120x15dce88d.f152728h = c19767x257d7f.f38864x6ac9171 / 1000;
            c11120x15dce88d.f152724d = c19767x257d7f2.f38864x6ac9171;
            c11120x15dce88d.f152725e = c19767x257d7f3.f38864x6ac9171;
            c11120x15dce88d.f152726f = c19767x257d7f4.f38864x6ac9171;
            c11120x15dce88d.f152727g = c19767x257d7f5.f38864x6ac9171;
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d bj6 = d11.s.fj().bj(c11120x15dce88d, null);
            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243941c;
            if (bj6 == null) {
                int i29 = P;
                int i37 = P2;
                for (int i38 = 0; i38 < 3; i38++) {
                    if (i29 % 2 != 0) {
                        i29--;
                    }
                    if (i37 % 2 != 0) {
                        i37--;
                    }
                    if ((i29 >= i37 && (i29 <= 640 || i37 <= 480)) || (i29 <= i37 && (i29 <= 480 || i37 <= 640))) {
                        P = i29;
                        P2 = i37;
                        break;
                    } else {
                        i29 /= 2;
                        i37 /= 2;
                    }
                }
                i17 = i28;
                i19 = P2;
                i18 = P;
            } else {
                int i39 = bj6.f152724d;
                int i47 = bj6.f152725e;
                i17 = bj6.f152727g;
                i18 = i39;
                i19 = i47;
            }
            try {
                dVar.release();
            } catch (java.io.IOException unused) {
            }
            int m69233xcf34d77e = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69233xcf34d77e(str, rj6, i18, i19, i17, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243940b, 8, 2, 25.0f, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243942d, null, 0, false, 0, 51);
            if (m69233xcf34d77e < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MassSendMsgUI", "remuxing video error");
                z17 = false;
            } else {
                activityC16488xbf7e6679.Y6(true, rj6);
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, str2, false);
                if (!com.p314xaae8f345.mm.vfs.w6.j(tj6)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "thumb not exist create one, thumbPath: %s", tj6);
                    try {
                        android.graphics.Bitmap D = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D(rj6, 1, -1);
                        if (D != null) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(D, 60, android.graphics.Bitmap.CompressFormat.JPEG, tj6, true);
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MassSendMsgUI", e17, "", new java.lang.Object[0]);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MassSendMsgUI", "create thumb error: %s", e17.getMessage());
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MassSendMsgUI", "do remux, targetPath: %s, outputWidth: %s, outputHeight: %s, retDuration: %s", rj6, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(m69233xcf34d77e));
                z17 = true;
            }
        } else if (m69244xe35aebcb == 1 || m69244xe35aebcb == 2 || m69244xe35aebcb == 3 || m69244xe35aebcb == 4 || m69244xe35aebcb == 5) {
            activityC16488xbf7e6679.Y6(true, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, str2, false));
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new kf3.r1(this));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new kf3.s1(this));
        }
    }
}
