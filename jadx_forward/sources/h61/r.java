package h61;

/* loaded from: classes4.dex */
public class r implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h61.s f360699a;

    public r(h61.s sVar) {
        this.f360699a = sVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        h61.p pVar = this.f360699a.f360700a;
        java.lang.String str = (java.lang.String) cVar.a(0);
        int intValue = ((java.lang.Integer) cVar.a(1)).intValue();
        java.lang.String str2 = (java.lang.String) cVar.a(2);
        pVar.getClass();
        pVar.f360695d = km5.u.b();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            pVar.f360695d.a(java.lang.Boolean.FALSE);
            return null;
        }
        i61.e eVar = new i61.e(str, intValue, str2);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(eVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CloseAALogic", "closeAA, billNo: %s, scene: %s", str, java.lang.Integer.valueOf(intValue));
        pVar.f360695d = km5.u.c();
        return null;
    }
}
