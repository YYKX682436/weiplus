package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.database.Cursor f223186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f223187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.y f223188f;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.y yVar, android.database.Cursor cursor, int i17) {
        this.f223188f = yVar;
        this.f223186d = cursor;
        this.f223187e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.y yVar = this.f223188f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a = yVar.f223193e;
        c16016x82ee182a.f223028h2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.f0(c16016x82ee182a, yVar.f223192d, this.f223186d, this.f223187e);
        yVar.f223193e.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(yVar.f223192d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a2 = yVar.f223193e;
        c16016x82ee182a2.mo7960x6cab2c8d(c16016x82ee182a2.f223028h2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a3 = yVar.f223193e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.f0 f0Var = c16016x82ee182a3.f223028h2;
        java.lang.String str = c16016x82ee182a3.f223032l2;
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = (java.util.LinkedList) f0Var.f223082e;
            if (i17 >= linkedList.size()) {
                i17 = 0;
                break;
            } else if (str.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1) linkedList.get(i17)).f68458xd54c6aa5)) {
                break;
            } else {
                i17++;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c16016x82ee182a3, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$5$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c16016x82ee182a3.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c16016x82ee182a3, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$5$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        yVar.f223193e.f223028h2.m8146xced61ae5();
    }
}
