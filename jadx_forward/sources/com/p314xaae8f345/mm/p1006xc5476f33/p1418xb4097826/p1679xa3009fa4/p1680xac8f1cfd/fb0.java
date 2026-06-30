package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class fb0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f215922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(in5.s0 s0Var) {
        super(1);
        this.f215922d = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        android.view.View p17;
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f84680h;
        if ((p0Var != null && p0Var.f534789r == 17) && (((i17 = observer.f84683n) == 18 || i17 == 21) && (p17 = this.f215922d.p(com.p314xaae8f345.mm.R.id.ef7)) != null)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$hideMusicJumperView$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$hideMusicJumperView$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
