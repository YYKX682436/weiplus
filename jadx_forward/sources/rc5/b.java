package rc5;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f475681d;

    public b(rc5.x xVar, android.view.View.OnClickListener onClickListener) {
        this.f475681d = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/half/ExpandableHalfScreenChattingUIC$ChatBotLeftBackBtnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        android.view.View.OnClickListener onClickListener = this.f475681d;
        if (onClickListener != null) {
            onClickListener.onClick(v17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/half/ExpandableHalfScreenChattingUIC$ChatBotLeftBackBtnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
