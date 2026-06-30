package rf4;

/* loaded from: classes5.dex */
public final class k1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 f476612d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 c18484xfde93083) {
        this.f476612d = c18484xfde93083;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 && keyEvent.getAction() != 66) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 c18484xfde93083 = this.f476612d;
        if (!c18484xfde93083.f253528s) {
            return true;
        }
        mf4.d.f407693a.a(9);
        android.text.Editable text = c18484xfde93083.f253519g.getText();
        if (text == null) {
            return true;
        }
        c18484xfde93083.c();
        c18484xfde93083.f253519g.setText((java.lang.CharSequence) null);
        yz5.p commentInputCallback = c18484xfde93083.getCommentInputCallback();
        if (commentInputCallback == null) {
            return true;
        }
        commentInputCallback.mo149xb9724478(text.toString(), java.lang.Boolean.TRUE);
        return true;
    }
}
