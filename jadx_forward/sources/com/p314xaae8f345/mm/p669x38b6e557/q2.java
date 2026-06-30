package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class q2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        x51.o1.f533597q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(intent.getStringExtra("key"), 0);
        x51.o1.f533598r = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(intent.getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa), 0);
        x51.o1.f533599s = intent.getStringExtra("str");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Shell", "dkshell set [%d %d] [%s]", java.lang.Integer.valueOf(x51.o1.f533597q), java.lang.Integer.valueOf(x51.o1.f533598r), x51.o1.f533599s);
        int i17 = x51.o1.f533597q;
        if (10009 == i17) {
            boolean z17 = x51.o1.f533575a;
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p669x38b6e557.p0.f146365b;
        } else if (10014 == i17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            w11.w1.wi().c(7L, 1, "", com.p314xaae8f345.mm.p642xad8b531f.x1.e());
        } else if (10015 == x51.o1.f533597q) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p();
        }
    }
}
