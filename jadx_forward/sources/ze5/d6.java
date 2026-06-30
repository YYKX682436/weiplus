package ze5;

/* loaded from: classes9.dex */
public final class d6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.g6 f553413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(ze5.g6 g6Var, yb5.d dVar) {
        super(1);
        this.f553413d = g6Var;
        this.f553414e = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.m6 it = (ze5.m6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.View b17 = it.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiFrom$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiFrom$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View b18 = it.b();
        ze5.g6 g6Var = this.f553413d;
        if (g6Var.f286809u == null) {
            g6Var.f286809u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rk(g6Var.f286807s);
        }
        b18.setOnClickListener(g6Var.f286809u);
        yb5.d dVar = this.f553414e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) dVar.f542241c.a(sb5.e.class))).f281644m, "getChatBgAttr(...)");
        android.view.ViewGroup.LayoutParams layoutParams = it.b().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        android.view.View view = it.f553627e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("captureTipsBg");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
        view.setBackgroundResource(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) cVar.a(sb5.e.class))).n0());
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) cVar.a(sb5.e.class))).o0(0);
        }
        it.b().setLayoutParams(marginLayoutParams);
        return jz5.f0.f384359a;
    }
}
