package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes2.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 f148584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f148585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, int i17) {
        super(0);
        this.f148584d = v4Var;
        this.f148585e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map map = this.f148584d.H;
        int i17 = this.f148585e;
        java.util.Set<p3325xe03a0797.p3326xc267989b.y0> set = (java.util.Set) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#cancelCirculationFillingActivityIconOfSourceType source=");
        sb6.append(i17);
        sb6.append(" set.size=");
        sb6.append(set != null ? java.lang.Integer.valueOf(set.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (set != null) {
            for (p3325xe03a0797.p3326xc267989b.y0 y0Var : set) {
                if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                    y0Var = null;
                }
                if (y0Var != null) {
                    p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
