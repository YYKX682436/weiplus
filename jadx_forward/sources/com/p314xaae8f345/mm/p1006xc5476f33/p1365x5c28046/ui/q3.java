package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362 f179703d;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362 c13320x2d86e362) {
        this.f179703d = c13320x2d86e362;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362 c13320x2d86e362 = this.f179703d;
        i12.c0 c0Var = c13320x2d86e362.f179382i;
        if (c0Var == null || (linkedList = c13320x2d86e362.f179380g) == null) {
            return;
        }
        java.util.LinkedList linkedList2 = c0Var.f368728e;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        c0Var.mo8343xced61ae5();
    }
}
