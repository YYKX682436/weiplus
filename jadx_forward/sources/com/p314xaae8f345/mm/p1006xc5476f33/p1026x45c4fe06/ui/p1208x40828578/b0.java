package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171568d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90) {
        this.f171568d = c12723x5ab2de90;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f171568d.f171550z.size();
        if (size > 0) {
            this.f171568d.f171550z.clear();
            this.f171568d.f171549y.m8154xdb81fc7f(0, size);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90.s0(this.f171568d);
        synchronized (this.f171568d.R) {
            this.f171568d.R.notifyAll();
        }
    }
}
