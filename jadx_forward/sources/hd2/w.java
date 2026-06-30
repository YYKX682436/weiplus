package hd2;

/* loaded from: classes2.dex */
public final class w implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca f362075a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca c14134xc5fab6ca) {
        this.f362075a = c14134xc5fab6ca;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0
    /* renamed from: call */
    public void mo981x2e7a5e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca c14134xc5fab6ca = this.f362075a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ko koVar = c14134xc5fab6ca.f191577v;
        if (koVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.view.View t17 = koVar.t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderPostPlayFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderPostPlayFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ko koVar2 = c14134xc5fab6ca.f191577v;
            if (koVar2 != null) {
                koVar2.m56022x4905e9fa().setVisibility(0);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
        }
    }
}
