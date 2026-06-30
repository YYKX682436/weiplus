package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c0 f158557a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f158558b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseArray f158559c = new android.util.SparseArray();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(n7Var, "<this>");
        if (n7Var.mo32091x9a3f0ba2() == null || n7Var.mo32091x9a3f0ba2().L0() || n7Var.mo32091x9a3f0ba2().q2()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = n7Var.mo32091x9a3f0ba2();
        oe1.b2.a(mo32091x9a3f0ba2 != null ? mo32091x9a3f0ba2.f156336n : null);
        if (!n7Var.j2() || n7Var.mo32091x9a3f0ba2().u0().r() == k91.z3.TRANSPARENT || (n7Var.mo32091x9a3f0ba2().f156344t instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc)) {
            return;
        }
        if (n7Var.mo32091x9a3f0ba2().e3()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = n7Var.mo32091x9a3f0ba2().f156344t;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6 f6Var = vcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6) vcVar : null;
            if (f6Var != null) {
                boolean N = f6Var.N();
                java.lang.String str = n7Var.mo32091x9a3f0ba2().f156336n;
                nf.y yVar = nf.x.f418149b;
                if (N != (yVar != null ? yVar.i(str) : false)) {
                    return;
                }
            }
        } else {
            if ((!n7Var.r1().f87279w || (n7Var.w1() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1)) == false) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(n7Var.mo48798x74292566(), true);
                if ((b17 != null ? b17.E : null) != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadOnProcessCreated) {
                    return;
                }
            }
        }
        android.util.SparseArray sparseArray = f158559c;
        if (((java.lang.Runnable) sparseArray.get(n7Var.hashCode())) != null) {
            return;
        }
        java.lang.Boolean[] boolArr = {java.lang.Boolean.FALSE};
        android.view.View[] viewArr = new android.view.View[1];
        java.lang.Long[] lArr = {0L};
        sparseArray.put(n7Var.hashCode(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z(boolArr, lArr, n7Var, viewArr));
        n7Var.P(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a0(n7Var));
        android.view.View mo51310xc2a54588 = n7Var.mo51310xc2a54588();
        if (mo51310xc2a54588 != null) {
            mo51310xc2a54588.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b0(boolArr, n7Var, viewArr, lArr));
        }
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(n7Var, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEntryPageFastLoadHelper", "tryHideEntryPage " + n7Var);
        android.util.SparseArray sparseArray = f158559c;
        java.lang.Runnable runnable = (java.lang.Runnable) sparseArray.get(n7Var.hashCode());
        if (runnable != null) {
            runnable.run();
        }
        sparseArray.put(n7Var.hashCode(), null);
    }

    public final android.widget.ProgressBar a() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(new com.p314xaae8f345.mm.ui.xb(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576320w9));
        progressBar.setIndeterminateDrawable(b3.l.m9707x4a96be14(progressBar.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.avi));
        return progressBar;
    }
}
