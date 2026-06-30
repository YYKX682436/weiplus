package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1 f171620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 f171621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171622f;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1 o1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c0Var) {
        this.f171622f = c12723x5ab2de90;
        this.f171620d = o1Var;
        this.f171621e = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = this.f171622f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = c12723x5ab2de90.f171546w;
        if (c12808x5de4409f == null || !c12808x5de4409f.f93440x) {
            return;
        }
        if (c12808x5de4409f.E0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.r0 r0Var = c12723x5ab2de90.B;
            r0Var.sendMessage(r0Var.obtainMessage(2, this));
            return;
        }
        c12723x5ab2de90.f171550z.clear();
        c12723x5ab2de90.f171550z.addAll(this.f171620d);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.m(-8);
        this.f171621e.a(c12723x5ab2de90.S);
    }
}
