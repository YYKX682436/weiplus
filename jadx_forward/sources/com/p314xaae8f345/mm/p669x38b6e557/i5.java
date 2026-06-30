package com.p314xaae8f345.mm.p669x38b6e557;

@j95.b
/* loaded from: classes12.dex */
public class i5 extends i95.w {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.console.Shell$Receiver] */
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() ? z65.c.a() : true) {
            com.p314xaae8f345.mm.p669x38b6e557.p0 p0Var = new com.p314xaae8f345.mm.p669x38b6e557.p0();
            if (p0Var.f146367a == null) {
                p0Var.f146367a = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.console.Shell$Receiver
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context2, android.content.Intent intent) {
                        java.lang.String action = intent.getAction();
                        com.p314xaae8f345.mm.p669x38b6e557.g5 g5Var = (com.p314xaae8f345.mm.p669x38b6e557.g5) com.p314xaae8f345.mm.p669x38b6e557.p0.f146365b.get(action);
                        if (g5Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "no action found for %s", action);
                        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && !(g5Var instanceof com.p314xaae8f345.mm.p669x38b6e557.h5)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "action[%s] can only run in mm process", action);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "shell action %s received on process: %s", action, bm5.f1.a());
                            g5Var.a(intent);
                        }
                    }
                };
                boolean a17 = fp.h.a(33);
                android.content.IntentFilter intentFilter = com.p314xaae8f345.mm.p669x38b6e557.p0.f146366c;
                if (a17) {
                    context.registerReceiver(p0Var.f146367a, intentFilter, z65.c.a() ? null : "com.tencent.mm.permission.MOVE_XLOG", null);
                } else {
                    context.registerReceiver(p0Var.f146367a, intentFilter, z65.c.a() ? null : "com.tencent.mm.permission.MOVE_XLOG", null, 2);
                }
            }
        }
    }
}
