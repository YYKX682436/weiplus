package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.e f202225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.c04 f202226e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.e eVar, r45.c04 c04Var) {
        super(0);
        this.f202225d = eVar;
        this.f202226e = c04Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.e eVar = this.f202225d;
        ((az2.f) ((jz5.n) eVar.f202234o).mo141623x754a37bb()).b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0) eVar.f202231i;
        t0Var.getClass();
        r45.c04 wishConfig = this.f202226e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wishConfig, "wishConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", "interactionWishEditComplete: " + wishConfig);
        t0Var.H(wishConfig);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("wish_type", (int) wishConfig.m75942xfb822ef2(0));
        jSONObject.put("wish_cnt", wishConfig.m75942xfb822ef2(1));
        jSONObject.put("reward_text", wishConfig.m75945x2fec8307(4));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.B2, jSONObject.toString(), null, 4, null);
        android.content.Context context = eVar.f199914d;
        db5.t7.h(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575277ow0));
        eVar.a();
        return jz5.f0.f384359a;
    }
}
