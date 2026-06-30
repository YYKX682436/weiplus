package bt3;

@j95.b
/* loaded from: classes9.dex */
public class u1 extends i95.w implements mc0.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f105961d = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public void Ai(long j17) {
        java.util.Map map = this.f105961d;
        if (map.keySet().contains(java.lang.Long.valueOf(j17))) {
            wi((java.lang.String) map.get(java.lang.Long.valueOf(j17)), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.afk));
            map.remove(java.lang.Long.valueOf(j17));
        }
    }

    public void Bi(long j17, java.lang.String str) {
        java.util.Map map = this.f105961d;
        if (map.keySet().contains(java.lang.Long.valueOf(j17))) {
            wi(str, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.afk));
            map.remove(java.lang.Long.valueOf(j17));
        }
    }

    public final void wi(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.e1(c01.w9.o(str));
        f9Var.u1(str);
        f9Var.d1(str2);
        f9Var.m124850x7650bebc(10000);
        f9Var.r1(6);
        f9Var.j1(0);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
    }
}
