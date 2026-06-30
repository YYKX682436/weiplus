package sm1;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 f490858d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7) {
        this.f490858d = c12827x691a1aa7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(((android.widget.ImageView) view).getTag(), "null cannot be cast to non-null type kotlin.Boolean");
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7.d(this.f490858d, !((java.lang.Boolean) r7).booleanValue());
        yj0.a.h(this, "com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
