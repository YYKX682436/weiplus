package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.s f167163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f167164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f167165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f167166g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.s sVar, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        super(1);
        this.f167163d = sVar;
        this.f167164e = jSONObject;
        this.f167165f = lVar;
        this.f167166g = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f167165f;
        int i17 = this.f167166g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.s sVar = this.f167163d;
        activity.m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.q(lVar, i17, sVar, activity));
        android.content.Intent C = sVar.C(this.f167164e);
        if (C == null) {
            if (lVar != null) {
                lVar.a(i17, sVar.o("fail:invalid data"));
            }
            activity.finish();
        } else {
            j45.l.n(activity, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", C, cf.b.a(sVar));
        }
        return jz5.f0.f384359a;
    }
}
