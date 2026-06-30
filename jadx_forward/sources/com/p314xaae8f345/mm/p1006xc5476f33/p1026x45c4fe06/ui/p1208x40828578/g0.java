package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1 f171615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171616e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.o1 o1Var) {
        this.f171616e = c12723x5ab2de90;
        this.f171615d = o1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f171616e.f171550z)) {
            int size = this.f171616e.f171550z.size();
            this.f171616e.f171550z.clear();
            this.f171616e.f171549y.m8154xdb81fc7f(0, size);
        }
        this.f171616e.f171550z.addAll(this.f171615d);
        this.f171616e.f171549y.m8153xd399a4d9(0, this.f171615d.size());
        synchronized (this.f171616e.R) {
            this.f171616e.R.notifyAll();
        }
    }
}
