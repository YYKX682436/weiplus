package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f288309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.j2 f288310e;

    public i2(com.p314xaae8f345.mm.ui.p2690x38b72420.j2 j2Var, java.util.LinkedList linkedList) {
        this.f288310e = j2Var;
        this.f288309d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.j2 j2Var = this.f288310e;
        java.util.ArrayList arrayList = j2Var.f288488a.E;
        if (arrayList != null && arrayList.size() != 0) {
            java.util.Iterator it = this.f288309d.iterator();
            while (it.hasNext()) {
                j2Var.f288488a.f287925y.add((r45.fu) it.next());
            }
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc682948 = j2Var.f288488a;
        c01.d9.e().g(new i21.a(activityC22295xcc682948.f287918t, activityC22295xcc682948.f287925y));
    }
}
