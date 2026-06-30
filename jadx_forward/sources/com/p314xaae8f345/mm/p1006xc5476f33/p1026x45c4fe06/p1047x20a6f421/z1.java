package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 f159388e;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var, java.lang.String str) {
        this.f159388e = l2Var;
        this.f159387d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = this.f159388e;
        android.content.Context context = l2Var.getContext();
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = "";
        aVar.f293262s = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571802q9, this.f159387d);
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.apu);
        aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a2(l2Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.setCancelable(true);
        j0Var.show();
    }
}
