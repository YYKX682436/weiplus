package df5;

/* loaded from: classes11.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.b0 f313779d;

    public w(df5.b0 b0Var) {
        this.f313779d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/NativeMarkdownCodeBlockView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[2];
        df5.b0 b0Var = this.f313779d;
        objArr[0] = b0Var.f313584n;
        objArr[1] = java.lang.Boolean.valueOf(b0Var.m124309x984bae05() != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownPreviewDebug", "copyButton clicked, language=%s, hasCallback=%b", objArr);
        yz5.a m124309x984bae05 = b0Var.m124309x984bae05();
        if (m124309x984bae05 != null) {
            m124309x984bae05.mo152xb9724478();
        }
        android.view.ViewParent parent = b0Var.getParent();
        while (true) {
            if (parent == null) {
                break;
            }
            if (parent instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 c22095x76baed77 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77) parent;
                jf5.r0 selectionMenuHost = c22095x76baed77.getSelectionMenuHost();
                if (selectionMenuHost != null) {
                    ((jf5.h) selectionMenuHost).b(c22095x76baed77, 1, b0Var.f313583m);
                }
            } else {
                parent = parent.getParent();
                if (parent == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NativeMarkdownCodeBlockView", "copyCodeToClipboard: parent is null");
                    break;
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/NativeMarkdownCodeBlockView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
