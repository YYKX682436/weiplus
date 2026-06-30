package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class ta implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15291x1a6f20cb f214629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f214630e;

    public ta(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15291x1a6f20cb c15291x1a6f20cb, java.util.LinkedList linkedList) {
        this.f214629d = c15291x1a6f20cb;
        this.f214630e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15291x1a6f20cb c15291x1a6f20cb = this.f214629d;
        e33.j2 j2Var = c15291x1a6f20cb.f212643m;
        if (j2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("albumAdapter");
            throw null;
        }
        ((e33.b0) j2Var).f328663f.clear();
        e33.j2 j2Var2 = c15291x1a6f20cb.f212643m;
        if (j2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("albumAdapter");
            throw null;
        }
        e33.b0 b0Var = (e33.b0) j2Var2;
        java.util.ArrayList arrayList = b0Var.f328663f;
        arrayList.clear();
        arrayList.addAll(this.f214630e);
        b0Var.m8146xced61ae5();
        java.lang.Object obj = c15291x1a6f20cb.f212643m;
        if (obj != null) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.f2) obj).m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("albumAdapter");
            throw null;
        }
    }
}
