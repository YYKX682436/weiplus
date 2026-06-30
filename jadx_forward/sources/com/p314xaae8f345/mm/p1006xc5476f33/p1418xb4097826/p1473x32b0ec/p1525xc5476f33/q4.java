package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class q4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 f195490d;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var) {
        this.f195490d = a5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var = this.f195490d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5.u1(a5Var, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fe feVar = a5Var.X;
        java.util.ArrayList arrayList = feVar.f199880e;
        if (arrayList.isEmpty()) {
            uh2.c cVar = uh2.c.f509486a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.List list = uh2.c.f509487b;
            arrayList2.addAll(list);
            if (!arrayList2.isEmpty()) {
                arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fe.f199875i);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.addAll(list);
                arrayList.addAll(arrayList3);
            }
        }
        feVar.c(dk2.ef.f314939u);
        feVar.f199879d.m8146xced61ae5();
        feVar.f199876a.setVisibility(0);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ee(feVar));
    }
}
