package bt3;

@j95.b
/* loaded from: classes9.dex */
public class u1 extends i95.w implements mc0.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f24428d = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public void Ai(long j17) {
        java.util.Map map = this.f24428d;
        if (map.keySet().contains(java.lang.Long.valueOf(j17))) {
            wi((java.lang.String) map.get(java.lang.Long.valueOf(j17)), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.afk));
            map.remove(java.lang.Long.valueOf(j17));
        }
    }

    public void Bi(long j17, java.lang.String str) {
        java.util.Map map = this.f24428d;
        if (map.keySet().contains(java.lang.Long.valueOf(j17))) {
            wi(str, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.afk));
            map.remove(java.lang.Long.valueOf(j17));
        }
    }

    public final void wi(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.e1(c01.w9.o(str));
        f9Var.u1(str);
        f9Var.d1(str2);
        f9Var.setType(10000);
        f9Var.r1(6);
        f9Var.j1(0);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
    }
}
