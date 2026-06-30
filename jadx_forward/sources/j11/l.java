package j11;

/* loaded from: classes11.dex */
public class l implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j11.h f378664e;

    public l(j11.h hVar, java.lang.String str) {
        this.f378664e = hVar;
        this.f378663d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 881) {
            return 0;
        }
        j11.h hVar = this.f378664e;
        hVar.f378645a = false;
        java.lang.String str2 = this.f378663d;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetContactService", "tryStartNetscene onSceneEnd openImUser errType: %s  errCode: %s username %s will retry/del ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
            if (i17 == 4) {
                j11.q.Ai().m0(str2);
            }
            hVar.f378652h.c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            hVar.l(str2, false);
            return 0;
        }
        if (!((java.util.ArrayList) hVar.f378648d).isEmpty() && hVar.f378652h.e()) {
            hVar.f378652h.c(500L, 500L);
        }
        l41.j0.b((r45.ck3) oVar.f152244b.f152233a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetContactService", "getopenimcontact onResult %s %s", java.lang.Boolean.valueOf(j11.q.Ai().m0(str2)), str2);
        hVar.l(str2, true);
        return 0;
    }
}
