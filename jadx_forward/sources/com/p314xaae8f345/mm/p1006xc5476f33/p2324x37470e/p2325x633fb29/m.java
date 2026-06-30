package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f257200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n f257201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f257202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f257203g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2) {
        super(1);
        this.f257200d = h0Var;
        this.f257201e = nVar;
        this.f257202f = f0Var;
        this.f257203g = f0Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b = (com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b) this.f257200d.f391656d;
        if (c25659xe2dfb08b != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f257202f;
            int i17 = f0Var.f391649d;
            int m96495x959526a8 = c25659xe2dfb08b.m96495x959526a8();
            if (i17 < m96495x959526a8) {
                i17 = m96495x959526a8;
            }
            f0Var.f391649d = i17;
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = this.f257203g;
            int i18 = f0Var2.f391649d;
            int m96283xac0c617a = com.p314xaae8f345.tav.p2946x5a71016.C25653x39170d61.INSTANCE.m96283xac0c617a();
            if (i18 < m96283xac0c617a) {
                i18 = m96283xac0c617a;
            }
            f0Var2.f391649d = i18;
        }
        yz5.l lVar = this.f257201e.f257226l;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Float.valueOf(floatValue));
        }
        return jz5.f0.f384359a;
    }
}
