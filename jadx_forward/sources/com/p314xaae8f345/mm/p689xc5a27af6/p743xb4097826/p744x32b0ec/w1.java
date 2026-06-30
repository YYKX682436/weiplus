package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class w1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 f148546c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f148548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148549f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f148550g;

    public w1(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str3, zy2.i5 i5Var) {
        this.f148544a = str;
        this.f148545b = str2;
        this.f148546c = v4Var;
        this.f148547d = context;
        this.f148548e = jSONObject;
        this.f148549f = str3;
        this.f148550g = i5Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.z61) ((com.p314xaae8f345.mm.p944x882e457a.f) obj).f152151d).m75936x14adae67(1);
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f85004f).mo141623x754a37bb()).r()).intValue();
        if (intValue == 1) {
            h0Var.f391656d = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "autoOpenFinderLive mock 1");
        } else if (intValue == 2) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h0Var.f391656d;
            r45.nw1 m76794xd0557130 = c19792x256d2725 != null ? c19792x256d2725.m76794xd0557130() : null;
            if (m76794xd0557130 != null) {
                m76794xd0557130.set(2, 2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "autoOpenFinderLive mock 2");
        }
        pm0.v.X(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v1(this.f148544a, this.f148545b, this.f148546c, h0Var, this.f148547d, this.f148548e, this.f148549f, this.f148550g));
        return jz5.f0.f384359a;
    }
}
