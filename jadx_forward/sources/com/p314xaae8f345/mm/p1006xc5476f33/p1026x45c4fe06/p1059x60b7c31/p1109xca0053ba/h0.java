package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes13.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.k0 f164543d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.k0 k0Var) {
        this.f164543d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean isEmpty;
        synchronized (this.f164543d.f164556a) {
            if (this.f164543d.f164556a.isEmpty()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5) ((java.util.LinkedList) this.f164543d.f164556a).remove(0);
            ((java.util.LinkedList) this.f164543d.f164556a).size();
            n5Var.m();
            n5Var.k();
            synchronized (this.f164543d.f164556a) {
                isEmpty = this.f164543d.f164556a.isEmpty();
            }
            if (isEmpty) {
                return;
            }
            ik1.h0.a().b(this, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.k0.f164555d);
        }
    }
}
