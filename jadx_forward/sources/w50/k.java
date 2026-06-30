package w50;

@j95.b
/* loaded from: classes12.dex */
public class k extends i95.w implements x50.j, x50.i {

    /* renamed from: d, reason: collision with root package name */
    public boolean f524488d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f524489e = false;

    public void Ai() {
        o13.z zVar = (o13.z) i95.n0.c(o13.z.class);
        i95.n0.c(qu4.e.class);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) zVar;
        d0Var.oj(new pu4.t());
        d0Var.oj(new pu4.r());
        d0Var.oj(new pu4.m());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FtsExtensionService", "AIHistory UILogic registered");
    }

    public void Bi() {
        ea1.h hVar = new ea1.h();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).pj(hVar);
        hVar.mo150428xaf65a0fc();
        ea1.g gVar = new ea1.g();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).qj(7, gVar);
        gVar.f();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).oj(new ea1.n());
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).oj(new ea1.l());
    }

    public void Di() {
        b05.i iVar = new b05.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).pj(iVar);
        iVar.mo150428xaf65a0fc();
        b05.c cVar = new b05.c();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).qj(15, cVar);
        cVar.f();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).oj(new b05.j());
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).oj(new b05.g());
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        this.f524488d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_local_search_weshop_enabled, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FtsExtensionService", "WeShopEnabled: " + this.f524488d);
        this.f524489e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_local_search_setting_enabled, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FtsExtensionService", "SettingSearchEnabled: " + this.f524489e);
    }

    public java.lang.String wi(u13.g gVar) {
        if (gVar == null || !(gVar instanceof b05.f)) {
            return "";
        }
        tq.d dVar = ((b05.f) gVar).f98515r;
        java.lang.String str = dVar != null ? dVar.f502730b : null;
        return "{\"shopAppId\":\"" + (str != null ? str : "") + "\";\"shopLabelId\":" + (dVar != null ? dVar.f502736h : 0) + '}';
    }
}
