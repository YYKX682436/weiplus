package ab2;

/* loaded from: classes2.dex */
public final class i implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c f84310a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c c13680xb1b3046c) {
        this.f84310a = c13680xb1b3046c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.q0
    /* renamed from: call */
    public void mo981x2e7a5e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.biz.C13680xb1b3046c c13680xb1b3046c = this.f84310a;
        ab2.g gVar = c13680xb1b3046c.A;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.view.View t17 = gVar.t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ab2.g gVar2 = c13680xb1b3046c.A;
            if (gVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa = gVar2.m56022x4905e9fa();
            if (m56022x4905e9fa == null) {
                return;
            }
            m56022x4905e9fa.setVisibility(0);
        }
    }
}
