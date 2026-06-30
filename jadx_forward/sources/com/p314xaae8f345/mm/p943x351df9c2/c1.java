package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class c1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.d1 f151962d;

    public c1(com.p314xaae8f345.mm.p943x351df9c2.d1 d1Var) {
        this.f151962d = d1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        if (!gm0.j1.b().m() || com.p314xaae8f345.mm.p943x351df9c2.d1.Ai() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreAvatar", "upAssetsHandler onTimerExpired acc:%b astg:%s ", java.lang.Boolean.valueOf(gm0.j1.b().m()), com.p314xaae8f345.mm.p943x351df9c2.d1.Ai());
            return false;
        }
        if (((java.lang.Boolean) gm0.j1.u().c().l(90113, java.lang.Boolean.FALSE)).booleanValue()) {
            com.p314xaae8f345.mm.p943x351df9c2.d1 d1Var = this.f151962d;
            d1Var.getClass();
            try {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                for (java.lang.String str : ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p943x351df9c2.z.f152109c).keySet()) {
                    java.util.Map map = com.p314xaae8f345.mm.p943x351df9c2.z.f152109c;
                    int intValue = ((java.util.concurrent.ConcurrentHashMap) map).containsKey(str) ? ((java.lang.Integer) ((com.p314xaae8f345.mm.p943x351df9c2.y) map).get(str)).intValue() : 0;
                    if (intValue != 0) {
                        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().t(str, bp.b.m10969xb866ec1c(context.getResources(), intValue, null));
                    }
                }
            } catch (java.lang.Exception e17) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreAvatar", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
            d1Var.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1((java.lang.Boolean) gm0.j1.u().c().l(59, null), false)) {
                java.lang.String r17 = c01.z1.r();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r17) && !com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().o(r17, false)) {
                    android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.x.a(g83.a.a() + "user_" + kk.k.g(r17.getBytes()) + ".png", r17);
                    if (a17 != null && !a17.isRecycled()) {
                        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().t(r17, a17);
                    }
                }
            }
            gm0.j1.u().c().w(90113, java.lang.Boolean.FALSE);
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m47920x9616526c() {
        return super.toString() + "|upAssetsHandler";
    }
}
