package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class fn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d f184934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184935f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d c15195x130b2a6d, in5.s0 s0Var) {
        super(0);
        this.f184933d = view;
        this.f184934e = c15195x130b2a6d;
        this.f184935f = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f184933d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d c15195x130b2a6d = this.f184934e;
        cw2.ba baVar = c15195x130b2a6d.f212236y0;
        if (baVar != null) {
            cw2.ba.a(baVar, c15195x130b2a6d.f244013p / c15195x130b2a6d.f244012o, false, 2, null);
        }
        c15195x130b2a6d.f212235x1 = false;
        in5.s0 s0Var = this.f184935f;
        if (s0Var.p(com.p314xaae8f345.mm.R.id.frs).getVisibility() == 0) {
            android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.g99);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
