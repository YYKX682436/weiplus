package com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad;

/* loaded from: classes3.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f295197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d f295198e;

    public k(com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar, int i17) {
        this.f295198e = dVar;
        this.f295197d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f295198e.f295172o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f295197d));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager$4", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/view/manager/SmileyPanelManager$4", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
