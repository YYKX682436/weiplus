package qb5;

/* loaded from: classes9.dex */
public class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo.l f442859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f442860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442861g;

    public b(qb5.g gVar, java.lang.String str, lo.l lVar, long j17, java.lang.String str2) {
        this.f442858d = str;
        this.f442859e = lVar;
        this.f442860f = j17;
        this.f442861g = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect errType:%d errCode:%d, errMsg:%s type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        if (m1Var.mo808xfb85f7b0() != 221) {
            return;
        }
        bt3.l0 l0Var = (bt3.l0) m1Var;
        java.lang.String L = l0Var.L();
        java.lang.String str2 = this.f442858d;
        if (!str2.equals(L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChooseMsgFileCompat", "media:%s is not equal targetMedia:%s", str2, l0Var.L());
            return;
        }
        c01.d9.e().q(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, this);
        lo.l lVar = this.f442859e;
        if (i17 == 0 && i18 == 0) {
            int i19 = l0Var.f105858t;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect retCode:%d", java.lang.Integer.valueOf(i19));
            if (i19 >= 0 || lVar == null) {
                return;
            }
            lVar.b(i19, "");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d g17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.g(str2, this.f442860f, this.f442861g);
        if (g17 == null || g17.f68112x10a0fed7 != 102) {
            if (lVar != null) {
                lVar.b(-1, str);
            }
        } else if (lVar != null) {
            lVar.b(1, str);
        }
    }
}
