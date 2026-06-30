package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class f0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.l0 f218399d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.l0 l0Var) {
        this.f218399d = l0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.l0 l0Var = this.f218399d;
        l0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "onDismiss");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.l0.f218413n = false;
        android.content.DialogInterface.OnDismissListener onDismissListener = l0Var.f218423j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(l0Var.f218415b);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = l0Var.f218424k.f431472d;
        if (c22633x83752a59 != null) {
            c22633x83752a59.mo120189xb61559a7(null);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = l0Var.f218421h;
        if (abstractActivityC21394xb3d2c0cf != null && (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) != null) {
            mo273xed6858b4.c(l0Var.f218426m);
        }
        l0Var.f218419f = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.p0 p0Var = l0Var.f218425l;
        if (p0Var != null) {
            p0Var.mo63379x41012807();
        }
    }
}
