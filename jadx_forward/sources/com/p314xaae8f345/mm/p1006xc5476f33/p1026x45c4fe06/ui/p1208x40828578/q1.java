package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes15.dex */
public class q1 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 f171673a;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 a2Var) {
        this.f171673a = a2Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.k2
    public void a() {
        synchronized (this.f171673a.f171564w) {
            java.util.Iterator it = new java.util.HashSet(this.f171673a.f171564w).iterator();
            while (it.hasNext()) {
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k2) it.next()).a();
            }
        }
        this.f171673a.L = false;
    }
}
