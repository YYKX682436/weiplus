package lr;

/* loaded from: classes12.dex */
public class u0 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final int f402126f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.view.View itemView, int i17) {
        super(itemView, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f402126f = i17;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.i(item);
        android.view.View view = this.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        java.util.Iterator it = e06.p.m(0, ((android.view.ViewGroup) view).getChildCount()).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            android.view.View view2 = this.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.View childAt = ((android.view.ViewGroup) view2).getChildAt(b17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/emoji/panel/adapter/SimilarEmojiFullPageViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(childAt, "com/tencent/mm/emoji/panel/adapter/SimilarEmojiFullPageViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById = this.f3639x46306858.findViewById(this.f402126f);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/emoji/panel/adapter/SimilarEmojiFullPageViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/emoji/panel/adapter/SimilarEmojiFullPageViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
