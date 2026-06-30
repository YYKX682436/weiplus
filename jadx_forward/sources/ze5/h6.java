package ze5;

/* loaded from: classes9.dex */
public final class h6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.k6 f553500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f553502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553503g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(ze5.k6 k6Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, yb5.d dVar) {
        super(1);
        this.f553500d = k6Var;
        this.f553501e = f9Var;
        this.f553502f = c21053xdbf1e5f4;
        this.f553503g = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.m6 it = (ze5.m6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.ImageView imageView = it.f553625c;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tickImageView");
            throw null;
        }
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tickImageView");
            throw null;
        }
        imageView.setVisibility(8);
        boolean z17 = this.f553501e.P0() < 2;
        ze5.k6 k6Var = this.f553500d;
        k6Var.Z(it, z17, true);
        if (n22.m.r(this.f553502f)) {
            android.view.View b17 = it.b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiTo$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiTo$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View b18 = it.b();
            if (k6Var.f286911u == null) {
                k6Var.f286911u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rk(k6Var.f286909s);
            }
            b18.setOnClickListener(k6Var.f286911u);
            android.view.View view = it.f553627e;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("captureTipsBg");
                throw null;
            }
            yb5.d dVar = this.f553503g;
            view.setBackgroundResource(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) dVar.f542241c.a(sb5.e.class))).n0());
            android.view.ViewGroup.LayoutParams layoutParams = it.b().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) dVar.f542241c.a(sb5.e.class))).o0(0);
            }
            it.b().setLayoutParams(marginLayoutParams);
        } else {
            android.view.View b19 = it.b();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b19, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiTo$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b19, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$ChattingItemEmojiTo$filling$2", "invoke", "(Lcom/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemEmojiMvvm$EmojiItemHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
