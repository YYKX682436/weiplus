package com.tencent.mm.feature.finder.live;

/* loaded from: classes2.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f67051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f67052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.feature.finder.live.v4 v4Var, int i17) {
        super(0);
        this.f67051d = v4Var;
        this.f67052e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map map = this.f67051d.H;
        int i17 = this.f67052e;
        java.util.Set<kotlinx.coroutines.y0> set = (java.util.Set) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#cancelCirculationFillingActivityIconOfSourceType source=");
        sb6.append(i17);
        sb6.append(" set.size=");
        sb6.append(set != null ? java.lang.Integer.valueOf(set.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        if (set != null) {
            for (kotlinx.coroutines.y0 y0Var : set) {
                if (!kotlinx.coroutines.z0.h(y0Var)) {
                    y0Var = null;
                }
                if (y0Var != null) {
                    kotlinx.coroutines.z0.c(y0Var, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
