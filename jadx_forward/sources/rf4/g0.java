package rf4;

/* loaded from: classes5.dex */
public final class g0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 f476585a;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5) {
        this.f476585a = c18481x2b6a00e5;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        this.f476585a.f253470g.n(str);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5 = this.f476585a;
        android.view.inputmethod.InputConnection mo81352x6a67d012 = c18481x2b6a00e5.f253470g.mo81352x6a67d012();
        if (mo81352x6a67d012 != null) {
            mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        android.view.inputmethod.InputConnection mo81352x6a67d0122 = c18481x2b6a00e5.f253470g.mo81352x6a67d012();
        if (mo81352x6a67d0122 != null) {
            mo81352x6a67d0122.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5 = this.f476585a;
        if (c18481x2b6a00e5.f253483w) {
            mf4.d.f407693a.a(9);
            android.text.Editable text = c18481x2b6a00e5.f253470g.getText();
            if (text != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5.a(c18481x2b6a00e5);
                c18481x2b6a00e5.f253470g.setText((java.lang.CharSequence) null);
                c18481x2b6a00e5.f253469f.setVisibility(8);
                android.view.View view = c18481x2b6a00e5.f253478r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$initSmileyPanel$1", "performSend", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$initSmileyPanel$1", "performSend", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yz5.p commentInputCallback = c18481x2b6a00e5.getCommentInputCallback();
                if (commentInputCallback != null) {
                    commentInputCallback.mo149xb9724478(text.toString(), java.lang.Boolean.TRUE);
                }
            }
        }
    }
}
