package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes2.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ch f239863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f239864e;

    public z0(r45.ch chVar, java.util.Map.Entry entry) {
        this.f239863d = chVar;
        this.f239864e = entry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = this.f239863d.f453081d;
        if (linkedList != null) {
            linkedList.addAll((java.util.Collection) this.f239864e.getValue());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f239681a.g();
    }
}
