package od5;

/* loaded from: classes.dex */
public abstract class i {
    public static final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 tag, yb5.d ui6, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd8601 = tag.f39488x6a87d846;
        jz5.f0 f0Var = null;
        android.view.ViewParent parent = c21894x47dd8601 != null ? c21894x47dd8601.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ecm);
            if (findViewById != null) {
                int i17 = z17 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/mvvm/MvvmChattingItemKt", "showDebugView", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/mvvm/MvvmChattingItemKt", "showDebugView", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null && z17) {
                android.view.View view = new android.view.View(ui6.g());
                view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(30, 30));
                view.setBackgroundColor(android.graphics.Color.parseColor("#E6FF0000"));
                viewGroup.addView(view);
            }
        }
    }
}
