package vr3;

/* loaded from: classes11.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mm f521186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr3.z f521187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f521188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f521189g;

    public x(r45.mm mmVar, vr3.z zVar, int i17, int i18) {
        this.f521186d = mmVar;
        this.f521187e = zVar;
        this.f521188f = i17;
        this.f521189g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.mm mmVar = this.f521186d;
        int i17 = mmVar.f462169e;
        int i18 = this.f521188f;
        vr3.z zVar = this.f521187e;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = zVar.f521202o;
            if (m0Var != null) {
                m0Var.e(new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f521189g)));
            }
            tr3.d.b(zVar.f521196f, java.lang.String.valueOf(mmVar.f462168d), mmVar.f462171g, "menu_click", 0, 0, 126, mmVar.f462170f, tr3.d.a(i18, -1), "");
            return;
        }
        if (i17 == 2) {
            sr3.h.b(mmVar, zVar.f521194d, zVar.f521196f, 59);
            tr3.d.b(zVar.f521196f, java.lang.String.valueOf(mmVar.f462168d), mmVar.f462171g, "menu_click", 0, 0, 126, mmVar.f462170f, tr3.d.a(i18, -1), mmVar.f462175n);
            return;
        }
        if (i17 == 5) {
            sr3.h.c(mmVar, zVar.f521194d, zVar.f521196f);
            tr3.d.b(zVar.f521196f, java.lang.String.valueOf(mmVar.f462168d), mmVar.f462171g, "menu_click", 0, 0, 126, mmVar.f462170f, tr3.d.a(i18, -1), mmVar.f462172h);
            return;
        }
        if (i17 == 6) {
            sr3.h.a(mmVar, zVar.f521194d, zVar.f521196f);
            tr3.d.b(zVar.f521196f, java.lang.String.valueOf(mmVar.f462168d), mmVar.f462171g, "menu_click", 0, 0, 126, mmVar.f462170f, tr3.d.a(i18, -1), mmVar.f462172h);
            return;
        }
        int i19 = 0;
        if (i17 != 7) {
            if (i17 != 9) {
                return;
            }
            cs3.f fVar = zVar.f521201n;
            if (fVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e h17 = fVar.h();
                if (h17.q()) {
                    h17.n(true);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var2 = zVar.f521202o;
            if (m0Var2 != null) {
                m0Var2.l(false);
            }
            tr3.d.b(zVar.f521196f, java.lang.String.valueOf(mmVar.f462168d), mmVar.f462171g, "menu_click", 0, 0, 126, mmVar.f462170f, tr3.d.a(i18, -1), mmVar.f462172h);
            return;
        }
        android.content.Context context = zVar.f521194d;
        java.lang.String str = zVar.f521196f;
        bw5.nf0 nf0Var = mmVar.f462177p;
        if (nf0Var == null || nf0Var.b() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewBizInfoUtil", "jumpToEcs param null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewBizInfoUtil", "jumpToEcs");
            bw5.x7 b17 = mmVar.f462177p.b();
            if (b17.f() != null) {
                if (b17.f().f115290g == 0) {
                    b17.f().g(1102);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f().c())) {
                    java.lang.String str2 = mmVar.f462171g;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        i19 = str2.length() - str2.replace("_", "").length();
                    }
                    b17.f().i(java.lang.String.format("%s:%s:%s:%s", str, java.lang.Integer.valueOf(i19), mmVar.f462170f, b17.f().m13092xfb83cc9b()));
                }
            }
            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(new pq.a(context), mmVar.f462177p.b(), null);
        }
        tr3.d.b(zVar.f521196f, java.lang.String.valueOf(mmVar.f462168d), mmVar.f462171g, "menu_click", 0, 0, 126, mmVar.f462170f, tr3.d.a(i18, -1), "");
    }
}
