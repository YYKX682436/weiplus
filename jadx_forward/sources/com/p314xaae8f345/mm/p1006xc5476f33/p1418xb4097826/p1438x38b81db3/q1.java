package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter f185837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 f185838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f185839f;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665, so2.y0 y0Var) {
        this.f185837d = nPresenter;
        this.f185838e = c15276x168ec665;
        this.f185839f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCommentConvert$setCommentEmoji$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 emojiView = this.f185838e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emojiView, "$emojiView");
        this.f185837d.n(emojiView, this.f185839f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$setCommentEmoji$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
