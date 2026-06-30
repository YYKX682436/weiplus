package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class uq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f217692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f217693g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f217694h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(android.view.View view, android.view.View view2, android.widget.TextView textView, r45.zk2 zk2Var, java.lang.String str) {
        super(0);
        this.f217690d = view;
        this.f217691e = view2;
        this.f217692f = textView;
        this.f217693g = zk2Var;
        this.f217694h = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f217690d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f217691e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$animateToNextQuestion$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String m75945x2fec8307 = this.f217693g.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = this.f217694h;
        }
        this.f217692f.setText(m75945x2fec8307);
        return jz5.f0.f384359a;
    }
}
