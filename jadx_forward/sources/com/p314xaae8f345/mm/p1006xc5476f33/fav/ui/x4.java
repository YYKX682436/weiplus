package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y4 f183130d;

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y4 y4Var) {
        this.f183130d = y4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y4 y4Var = this.f183130d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = y4Var.f183152e.f181991g.f181933n;
        if (cVar != null) {
            cVar.c();
            y4Var.f183152e.f181991g.f181933n.notifyDataSetChanged();
        }
    }
}
