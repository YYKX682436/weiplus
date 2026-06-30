package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class c1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.d1 f70429d;

    public c1(com.tencent.mm.modelavatar.d1 d1Var) {
        this.f70429d = d1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        if (!gm0.j1.b().m() || com.tencent.mm.modelavatar.d1.Ai() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreAvatar", "upAssetsHandler onTimerExpired acc:%b astg:%s ", java.lang.Boolean.valueOf(gm0.j1.b().m()), com.tencent.mm.modelavatar.d1.Ai());
            return false;
        }
        if (((java.lang.Boolean) gm0.j1.u().c().l(90113, java.lang.Boolean.FALSE)).booleanValue()) {
            com.tencent.mm.modelavatar.d1 d1Var = this.f70429d;
            d1Var.getClass();
            try {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                for (java.lang.String str : ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.modelavatar.z.f70576c).keySet()) {
                    java.util.Map map = com.tencent.mm.modelavatar.z.f70576c;
                    int intValue = ((java.util.concurrent.ConcurrentHashMap) map).containsKey(str) ? ((java.lang.Integer) ((com.tencent.mm.modelavatar.y) map).get(str)).intValue() : 0;
                    if (intValue != 0) {
                        com.tencent.mm.modelavatar.d1.Ai().t(str, bp.b.decodeResource(context.getResources(), intValue, null));
                    }
                }
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreAvatar", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
            d1Var.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.m1((java.lang.Boolean) gm0.j1.u().c().l(59, null), false)) {
                java.lang.String r17 = c01.z1.r();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(r17) && !com.tencent.mm.modelavatar.d1.Ai().o(r17, false)) {
                    android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.x.a(g83.a.a() + "user_" + kk.k.g(r17.getBytes()) + ".png", r17);
                    if (a17 != null && !a17.isRecycled()) {
                        com.tencent.mm.modelavatar.d1.Ai().t(r17, a17);
                    }
                }
            }
            gm0.j1.u().c().w(90113, java.lang.Boolean.FALSE);
        }
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|upAssetsHandler";
    }
}
