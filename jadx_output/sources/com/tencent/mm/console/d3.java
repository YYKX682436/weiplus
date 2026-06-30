package com.tencent.mm.console;

/* loaded from: classes5.dex */
public class d3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        int intExtra = intent.getIntExtra("minute", -1);
        if (intExtra != -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixShellService", "#MATRIX_PROC_RECYCLE_BG, minute=" + intExtra);
            if (new com.tencent.mm.repairer.config.matrix.RepairerConfigProcLife().o().contains(java.lang.String.valueOf(intExtra))) {
                bm5.o1.f22719a.p("RepairerConfig_Matrix_Proc_Recycle_Bg_Int_Int", java.lang.Integer.valueOf(intExtra));
            }
        }
    }
}
