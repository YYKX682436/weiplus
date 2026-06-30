package k91;

/* loaded from: classes4.dex */
public class m1 implements k91.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k91.q1 f387208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387209b;

    public m1(k91.q1 q1Var, java.lang.String str) {
        this.f387208a = q1Var;
        this.f387209b = str;
    }

    @Override // k91.p1
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        k91.q1 q1Var = this.f387208a;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (q1Var != null) {
                q1Var.a("");
                return;
            }
            return;
        }
        r45.u93 u93Var = (r45.u93) oVar.f152244b.f152233a;
        java.util.LinkedList linkedList = u93Var.f468686d;
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, AppConfigList is empty");
            if (q1Var != null) {
                q1Var.a("");
                return;
            }
            return;
        }
        r45.s8 s8Var = (r45.s8) u93Var.f468686d.get(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonConfigManager", "getConfig syncConfigFromServer, the config is %s, the configVersion is %d", s8Var.f467076g, java.lang.Integer.valueOf(s8Var.f467075f));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s8Var.f467076g)) {
            if (q1Var != null) {
                q1Var.a("");
                return;
            }
            return;
        }
        int i19 = s8Var.f467074e;
        int i27 = s8Var.f467075f;
        java.lang.String str2 = this.f387209b;
        k91.o1.c(str2, i19, i27);
        k91.o1.d(str2, s8Var.f467074e, s8Var.f467075f);
        int i28 = s8Var.f467074e;
        java.lang.String str3 = s8Var.f467076g;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ui().P2(java.lang.String.format("%s_%s_config", str2, java.lang.Integer.valueOf(i28)), str3);
        }
        if (q1Var != null) {
            q1Var.a(s8Var.f467076g);
        }
    }
}
