package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 f159275d;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var) {
        this.f159275d = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = this.f159275d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = l2Var.f159316d;
        synchronized (a1Var) {
            z17 = a1Var.f159146o;
        }
        if (z17) {
            l2Var.f159328s.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562355dk);
            l2Var.f159321i.setText(l2Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571801q8));
        } else if (l2Var.f159316d.d()) {
            l2Var.f159328s.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562355dk);
            l2Var.f159321i.setText(l2Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.q_));
        } else {
            l2Var.f159328s.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562354dj);
            l2Var.f159321i.setText(l2Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571800q7));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2.b(l2Var);
    }
}
