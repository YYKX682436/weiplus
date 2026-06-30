package dt;

/* loaded from: classes11.dex */
public class d4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public d4() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        ?? r76;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        am.bi biVar = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5659x95fc43fd) abstractC20979x809547d1).f135985g;
        java.lang.String str = biVar.f87788a;
        java.lang.String str2 = biVar.f87789b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "summertoken KickOffline callback wording[%s], url[%s]", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(322L, 21L, 1L, true);
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 4021;
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = java.lang.Boolean.valueOf(m78443x9cf0d20b == null || m78443x9cf0d20b.isFinishing());
        objArr[1] = java.lang.String.format("%s|%s|%b", objArr2);
        g0Var.d(11098, objArr);
        if (m78443x9cf0d20b == null || m78443x9cf0d20b.isFinishing()) {
            g0Var.mo68477x336bdfd8(322L, 22L, 1L, true);
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            objArr3[0] = 4022;
            java.lang.Object[] objArr4 = new java.lang.Object[3];
            objArr4[0] = str;
            r76 = 1;
            objArr4[1] = str2;
            objArr4[2] = java.lang.Boolean.valueOf(m78443x9cf0d20b == null);
            objArr3[1] = java.lang.String.format("%s|%s|%b", objArr4);
            g0Var.d(11098, objArr3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WorkerProfile", "summertoken KickOffline error LauncherUI is null launcherisFirst[%b], launcheruiOnTop[%b] return", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.app.w7.f135430g), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.app.w7.f135431h));
        } else {
            r76 = 1;
        }
        android.content.Intent addFlags = new android.content.Intent().setClass(m78443x9cf0d20b, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class).putExtra("Intro_Switch", (boolean) r76).putExtra("animation_pop_in", (boolean) r76).addFlags(67108864);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb10 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10();
        am.hj hjVar = c5691xc916fb10.f136017g;
        hjVar.getClass();
        hjVar.f88369a = r76;
        c5691xc916fb10.e();
        db5.e1.M(m78443x9cf0d20b, str, m78443x9cf0d20b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.ui.dc(str2, m78443x9cf0d20b, addFlags), new com.p314xaae8f345.mm.ui.ec(str2, m78443x9cf0d20b, addFlags));
        return false;
    }
}
