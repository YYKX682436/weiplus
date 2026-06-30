package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes15.dex */
public class q0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f240520d;

    /* renamed from: e, reason: collision with root package name */
    public final kd0.a3 f240521e;

    public q0() {
        super(0);
        this.f240520d = new java.util.HashMap();
        this.f240521e = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p0(this);
    }

    public boolean b(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        if (abstractC20979x809547d1 == null) {
            return false;
        }
        if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184) {
            zs5.g0 g0Var = zs5.g0.G;
            synchronized (g0Var.E) {
                g0Var.f556901a = 0L;
                g0Var.f556902b = false;
                g0Var.f556903c = 0;
                g0Var.f556906f = null;
                g0Var.f556907g = "";
                g0Var.f556908h = "";
                g0Var.f556909i = "";
                g0Var.f556910j = 0;
                g0Var.f556911k = 0;
                g0Var.f556912l = "";
                g0Var.f556904d = 0L;
                g0Var.f556920t = false;
                g0Var.f556915o = 0;
                g0Var.f556921u = false;
                g0Var.f556913m = 0;
                g0Var.f556914n = 0;
                g0Var.f556922v = "";
                g0Var.f556923w = 0.0f;
                g0Var.f556924x = 0;
                g0Var.f556925y = 0;
                g0Var.f556926z = 0;
                g0Var.A = 0;
                g0Var.f556916p = 0;
                g0Var.f556917q = 0;
                g0Var.f556919s = 0L;
                g0Var.B = "";
                g0Var.C = "";
                g0Var.D = "";
            }
            g0Var.f556905e = 2;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184) abstractC20979x809547d1;
            ((java.util.HashMap) this.f240520d).put(java.lang.Long.valueOf(c5884x4c2d9184.f136192g.f87707a), c5884x4c2d9184.f136192g.f87708b);
            kd0.b3 b3Var = new kd0.b3();
            am.aq aqVar = c5884x4c2d9184.f136192g;
            b3Var.f388137a = aqVar.f87707a;
            b3Var.f388138b = aqVar.f87708b;
            b3Var.f388139c = aqVar.f87709c;
            b3Var.f388140d = new int[]{0};
            b3Var.f388141e = aqVar.f87711e;
            b3Var.f388142f = aqVar.f87712f;
            b3Var.f388143g = aqVar.f87713g;
            b3Var.f388144h = aqVar.f87714h;
            b3Var.f388145i = aqVar.f87715i;
            int i17 = aqVar.f87716j;
            b3Var.f388146j = i17;
            b3Var.f388147k = (i17 == 1 || i17 == 2) ? false : true;
            zs5.u0.f557018h.b(b3Var, this.f240521e);
        } else if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1) {
            zs5.g0.G.a();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1 c5226x932022f1 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1) abstractC20979x809547d1;
            zs5.u0 u0Var = zs5.u0.f557018h;
            long j17 = c5226x932022f1.f135559g.f89219a;
            synchronized (u0Var.f557023d) {
                if (((java.util.HashMap) u0Var.f557020a).containsKey(java.lang.Long.valueOf(j17))) {
                    java.lang.String str = (java.lang.String) ((java.util.HashMap) u0Var.f557020a).get(java.lang.Long.valueOf(j17));
                    if (((java.util.HashMap) u0Var.f557022c).containsKey(str)) {
                        ((java.util.List) ((java.util.HashMap) u0Var.f557022c).get(str)).remove(java.lang.Long.valueOf(j17));
                        if (((java.util.List) ((java.util.HashMap) u0Var.f557022c).get(str)).isEmpty()) {
                            ((java.util.HashMap) u0Var.f557022c).remove(str);
                        }
                    }
                    ((java.util.HashMap) u0Var.f557020a).remove(java.lang.Long.valueOf(j17));
                    ((java.util.HashMap) u0Var.f557021b).remove(java.lang.Long.valueOf(j17));
                }
            }
            ((java.util.HashMap) this.f240520d).remove(java.lang.Long.valueOf(c5226x932022f1.f135559g.f89219a));
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184) {
            b(abstractC20979x809547d1);
            return false;
        }
        if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1) {
            b(abstractC20979x809547d1);
        }
        return false;
    }
}
