package com.tencent.mm.console;

@j95.b
/* loaded from: classes12.dex */
public class i5 extends i95.w {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.console.Shell$Receiver] */
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        if (com.tencent.mm.sdk.platformtools.x2.j() ? z65.c.a() : true) {
            com.tencent.mm.console.p0 p0Var = new com.tencent.mm.console.p0();
            if (p0Var.f64834a == null) {
                p0Var.f64834a = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.console.Shell$Receiver
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context2, android.content.Intent intent) {
                        java.lang.String action = intent.getAction();
                        com.tencent.mm.console.g5 g5Var = (com.tencent.mm.console.g5) com.tencent.mm.console.p0.f64832b.get(action);
                        if (g5Var == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "no action found for %s", action);
                        } else if (!com.tencent.mm.sdk.platformtools.x2.n() && !(g5Var instanceof com.tencent.mm.console.h5)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "action[%s] can only run in mm process", action);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "shell action %s received on process: %s", action, bm5.f1.a());
                            g5Var.a(intent);
                        }
                    }
                };
                boolean a17 = fp.h.a(33);
                android.content.IntentFilter intentFilter = com.tencent.mm.console.p0.f64833c;
                if (a17) {
                    context.registerReceiver(p0Var.f64834a, intentFilter, z65.c.a() ? null : "com.tencent.mm.permission.MOVE_XLOG", null);
                } else {
                    context.registerReceiver(p0Var.f64834a, intentFilter, z65.c.a() ? null : "com.tencent.mm.permission.MOVE_XLOG", null, 2);
                }
            }
        }
    }
}
