package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class b8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621 f158304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11538xca764388 f158305e;

    public b8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11538xca764388 c11538xca764388, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621 c11657x23616621) {
        this.f158305e = c11538xca764388;
        this.f158304d = c11657x23616621;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f158305e.f156400d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.UpdateResult updateResult = this.f158304d.f156906g;
        updateResult.getClass();
        boolean z17 = updateResult instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.UpdateResult.Succeed;
        android.app.Activity r07 = o6Var.r0();
        if (r07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForCommLibUpdated(rt:%s, isUpdateSucceed:%b), get NULL activity", o6Var, java.lang.Boolean.valueOf(z17));
            return;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(r07);
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.a0c);
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.a0a);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
            aVar.A = false;
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.af(o6Var);
            i0Var.h();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(r07);
        i0Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.a0b);
        i0Var2.f(com.p314xaae8f345.mm.R.C30867xcad56011.a0a);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = i0Var2.f293354b;
        aVar2.A = false;
        aVar2.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bf(o6Var);
        i0Var2.h();
    }
}
