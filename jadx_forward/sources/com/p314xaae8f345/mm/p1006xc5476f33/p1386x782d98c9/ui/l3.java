package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n3 f181087d;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n3 n3Var) {
        this.f181087d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n3 n3Var = this.f181087d;
        ((java.util.LinkedList) n3Var.f181114d).remove(n3Var.f181120m);
        this.f181087d.notifyDataSetChanged();
        this.f181087d.f181120m = -1;
    }
}
