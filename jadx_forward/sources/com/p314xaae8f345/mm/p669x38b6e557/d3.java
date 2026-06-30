package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes5.dex */
public class d3 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        int intExtra = intent.getIntExtra("minute", -1);
        if (intExtra != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixShellService", "#MATRIX_PROC_RECYCLE_BG, minute=" + intExtra);
            if (new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2543xbf8d97c1.C20364xac25688e().o().contains(java.lang.String.valueOf(intExtra))) {
                bm5.o1.f104252a.p("RepairerConfig_Matrix_Proc_Recycle_Bg_Int_Int", java.lang.Integer.valueOf(intExtra));
            }
        }
    }
}
