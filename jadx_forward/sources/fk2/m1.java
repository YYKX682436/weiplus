package fk2;

/* loaded from: classes3.dex */
public final class m1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f344965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f344966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f344967f;

    public m1(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, yz5.a aVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var) {
        this.f344965d = c22624x85d69039;
        this.f344966e = aVar;
        this.f344967f = f0Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLikeNotify$Companion$setTextWithEllipsize$ellipsizeStrWithEndText$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = this.f344967f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f344965d;
        c22624x85d69039.post(new fk2.l1(c22624x85d69039, f0Var));
        yz5.a aVar = this.f344966e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLikeNotify$Companion$setTextWithEllipsize$ellipsizeStrWithEndText$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setUnderlineText(false);
        ds6.setColor(this.f344965d.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560582ak4));
    }
}
