package rf4;

/* loaded from: classes5.dex */
public final class e0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 f476576d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5) {
        this.f476576d = c18481x2b6a00e5;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (4 == i17 || keyEvent.getAction() == 66) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5 = this.f476576d;
            if (c18481x2b6a00e5.f253483w) {
                mf4.d.f407693a.a(9);
                android.text.Editable text = c18481x2b6a00e5.f253470g.getText();
                if (text != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5.a(c18481x2b6a00e5);
                    c18481x2b6a00e5.f253470g.setText((java.lang.CharSequence) null);
                    android.view.View view = c18481x2b6a00e5.f253478r;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$6", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$6", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yz5.p commentInputCallback = c18481x2b6a00e5.getCommentInputCallback();
                    if (commentInputCallback != null) {
                        commentInputCallback.mo149xb9724478(text.toString(), java.lang.Boolean.TRUE);
                    }
                }
            }
        }
        return false;
    }
}
