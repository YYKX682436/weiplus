package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f223075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.f0 f223076e;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.f0 f0Var, java.util.List list) {
        this.f223076e = f0Var;
        this.f223075d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.f0 f0Var = this.f223076e;
        ((java.util.LinkedList) f0Var.f223082e).clear();
        ((java.util.LinkedList) f0Var.f223082e).addAll(this.f223075d);
        f0Var.m8146xced61ae5();
    }
}
