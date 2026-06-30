package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x1 f183039d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x1 x1Var) {
        this.f183039d = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x1 x1Var = this.f183039d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = x1Var.f183126e.f181985g.f181868o;
        if (cVar != null) {
            cVar.c();
            x1Var.f183126e.f181985g.f181868o.notifyDataSetChanged();
        }
    }
}
