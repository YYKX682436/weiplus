package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f171665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.p0 f171666e;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.p0 p0Var, java.util.ArrayList arrayList) {
        this.f171666e = p0Var;
        this.f171665d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.p0 p0Var = this.f171666e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = p0Var.f171670d.f171546w;
        if (c12808x5de4409f == null || !c12808x5de4409f.f93440x) {
            return;
        }
        if (!c12808x5de4409f.E0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90.r0(p0Var.f171670d, this.f171665d);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.r0 r0Var = p0Var.f171670d.B;
            r0Var.sendMessage(r0Var.obtainMessage(2, this));
        }
    }
}
