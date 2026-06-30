package k61;

/* loaded from: classes9.dex */
public class c implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.d f386023a;

    public c(k61.d dVar) {
        this.f386023a = dVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.ANY";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        int i17;
        nm5.b bVar = (nm5.b) obj;
        k61.b bVar2 = this.f386023a.f386024a;
        boolean booleanValue = ((java.lang.Boolean) bVar.a(0)).booleanValue();
        int intValue = ((java.lang.Integer) bVar.a(1)).intValue();
        if (!booleanValue || (i17 = bVar2.f386016o) <= 0) {
            i17 = 20;
        } else {
            bVar2.f386016o = 0;
            bVar2.f386021t = false;
        }
        int i18 = (bVar2.f386022u != intValue || i17 > 20) ? 20 : i17;
        bVar2.f386022u = intValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListInteractor", "getNextAAQueryPage, currentPageOffset: %s, force: %s", java.lang.Integer.valueOf(bVar2.f386016o), java.lang.Boolean.valueOf(booleanValue));
        km5.b b17 = km5.u.b();
        b17.b();
        (bVar2.f386021t ? new i61.c(i18, bVar2.f386016o, intValue, bVar2.f386017p, bVar2.f386018q, bVar2.f386019r, bVar2.f386020s) : new i61.c(i18, bVar2.f386016o, intValue)).l().q(new k61.a(bVar2, b17));
        return null;
    }
}
