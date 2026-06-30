package ln4;

/* loaded from: classes4.dex */
public class e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f401437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn4.p1 f401438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ln4.f f401439f;

    public e(ln4.f fVar, int i17, pn4.p1 p1Var) {
        this.f401439f = fVar;
        this.f401437d = i17;
        this.f401438e = p1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        pn4.p1 p1Var = this.f401438e;
        java.lang.String str = p1Var.f438707d;
        if (this.f401437d != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreTranslate", "translate error");
            return true;
        }
        int i17 = p1Var.f438714k;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreTranslate", "translate ret not ok : %s", java.lang.Integer.valueOf(i17));
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p1Var.f438706c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreTranslate", "translate return null");
            return true;
        }
        int i18 = p1Var.f438712i;
        if (i18 == 0 || i18 == 1) {
            this.f401439f.f401440a.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(p1Var.f438708e, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(p1Var.f438707d));
            Li.D1(p1Var.f438706c);
            java.lang.String str2 = p1Var.f438709f;
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
            Li.C1(str2);
            Li.T = p1Var.f438710g;
            Li.f317711r = true;
            if (p1Var.f438711h == 1) {
                if (Li.i2()) {
                    Li.l1(Li.F | 1024);
                }
            } else if (Li.i2()) {
                Li.l1(Li.F & (-1025));
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.m124847x74d37ac6(), Li, true);
            gm.m mVar = new gm.m();
            mVar.y0(java.lang.Long.toString(Li.I0()));
            mVar.A0(Li.Q0());
            mVar.z0(Li.T0());
            mVar.D0(p1Var.f438705b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreTranslate", "Save code: " + mVar.w0() + ", receiver: " + mVar.u0() + ", srvId:" + Li.I0() + ", talker:" + Li.Q0());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).getClass();
            ((pn4.l1) ((mn4.f) i95.n0.c(mn4.f.class))).getClass();
            java.lang.String t07 = mVar.t0();
            java.lang.String v07 = mVar.v0();
            boolean z17 = false;
            if (t07 == null || t07.trim().isEmpty() || v07 == null || v07.trim().isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TranslateService", "saveTranslateContext failed, params invalid, contentId: " + t07 + ", senderId: " + v07);
            } else {
                ((gm.b) ((gm.l) i95.n0.c(gm.l.class))).getClass();
                l75.k0 Q4 = gm.a.R6().Q4();
                if (Q4 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TranslateService", "saveTranslateContext failed, basisDB is null");
                } else {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("receiverId", mVar.u0());
                    contentValues.put("targetLangCode", mVar.w0());
                    p75.m c17 = dm.lb.f319862m.j(t07).c(dm.lb.f319863n.j(v07));
                    p75.h1 j17 = dm.lb.f319861i.j(contentValues);
                    j17.f434184c = c17;
                    int f17 = j17.a().f(Q4);
                    if (f17 < 0) {
                        long m125208x39969692 = mVar.m125208x39969692(Q4, false);
                        if (m125208x39969692 == -1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TranslateService", "saveTranslateContext failed, basisDB error: " + m125208x39969692);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TranslateService", "saveTranslateContext successfully, translateContext: " + mVar + ", result: " + m125208x39969692);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TranslateService", "saveTranslateContext successfully, translateContext: " + mVar + ", rowsAffected: " + f17);
                    }
                    z17 = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreTranslate", "Save translateContext result: " + z17);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        pn4.p1 p1Var = this.f401438e;
        int i17 = this.f401437d;
        if (i17 == 0) {
            i17 = p1Var.f438714k;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 c6178x705b8fc4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4();
        am.kz kzVar = c6178x705b8fc4.f136438g;
        kzVar.f88726a = i17;
        kzVar.f88727b = p1Var.f438704a;
        kzVar.f88729d = p1Var.f438707d;
        kzVar.f88728c = p1Var.f438706c;
        kzVar.f88730e = p1Var.f438712i;
        kzVar.f88731f = p1Var.f438708e;
        kzVar.f88732g = p1Var.f438709f;
        kzVar.f88733h = p1Var.f438710g;
        kzVar.f88734i = p1Var.f438711h;
        c6178x705b8fc4.e();
        return false;
    }
}
