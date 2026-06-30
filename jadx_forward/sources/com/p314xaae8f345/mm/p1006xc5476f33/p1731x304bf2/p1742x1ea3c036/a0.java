package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes.dex */
public class a0 implements j45.k {
    public static boolean c() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return (c01.z1.j() & 8388608) == 8388608;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, null, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.z.class);
        if (c10750x9556b48c == null) {
            return false;
        }
        return c10750x9556b48c.f149933d;
    }

    @Override // j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.p314xaae8f345.mm.ui.x7 x7Var) {
        if (!c01.e2.a0() || !str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825.class.getName()) || !c()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameInterceptor", "intercept!");
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.y(this, context, intent);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(context, 8388608L, null, yVar, 3);
        return true;
    }
}
