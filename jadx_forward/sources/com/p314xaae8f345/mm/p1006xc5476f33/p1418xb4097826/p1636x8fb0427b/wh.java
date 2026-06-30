package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class wh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wh f209787d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wh();

    public wh() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject jSONObject = new org.json.JSONObject(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_local_backup_config_andr, "{\"topLoading\":0.3,\"top\":0,\"bottom\":0, \"minCount\":3, \"disableUnread\":false}", true));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d00 d00Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d00();
        d00Var.f208146a = jSONObject.optDouble("topLoading", 0.3d);
        d00Var.f208147b = jSONObject.optInt("top");
        d00Var.f208148c = jSONObject.optInt("bottom");
        d00Var.f208149d = jSONObject.optInt("minCount");
        d00Var.f208150e = jSONObject.optBoolean("disableUnread");
        return d00Var;
    }
}
