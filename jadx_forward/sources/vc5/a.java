package vc5;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final vc5.a f516845d = new vc5.a();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryActionBarView$createContentView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        android.app.Activity q17 = pm0.v.q(view);
        if (q17 != null) {
            q17.finish();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryActionBarView$createContentView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
