package i22;

/* loaded from: classes15.dex */
public final class d0 extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f369487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.view.View itemView) {
        super(itemView, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.ilj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f369487f = (android.widget.TextView) findViewById;
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        super.i(item, payloads);
        boolean z17 = !payloads.isEmpty();
        android.widget.TextView textView = this.f369487f;
        if (!z17) {
            i22.x0 x0Var = item instanceof i22.x0 ? (i22.x0) item : null;
            textView.setVisibility(0);
            textView.setText(x0Var != null ? x0Var.f369598a : null);
            return;
        }
        android.view.View view = this.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$EmojiStoreV3SingleProductBottomLoadingViewHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$EmojiStoreV3SingleProductBottomLoadingViewHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(8);
    }
}
