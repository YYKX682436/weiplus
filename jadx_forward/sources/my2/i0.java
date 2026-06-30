package my2;

/* loaded from: classes3.dex */
public final class i0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f414270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.me2 f414271e;

    public i0(my2.k0 k0Var, r45.me2 me2Var) {
        this.f414270d = k0Var;
        this.f414271e = me2Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setStopVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        my2.k0 k0Var = this.f414270d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(k0Var.f446856d.getContext());
        u1Var.g(k0Var.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejy));
        u1Var.a(true);
        u1Var.n(k0Var.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejz));
        u1Var.b(new my2.h0(k0Var, this.f414271e));
        u1Var.r(true);
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setStopVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f414270d.f446856d.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aki));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
