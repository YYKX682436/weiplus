package wu3;

/* loaded from: classes5.dex */
public final class p implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 f531322d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 c17039xf3cc6396) {
        this.f531322d = c17039xf3cc6396;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (3 != i17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 c17039xf3cc6396 = this.f531322d;
        java.lang.String str = c17039xf3cc6396.f237501y;
        if (str != null) {
            java.lang.CharSequence text = textView.getText();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, text != null ? text.toString() : null)) {
                c17039xf3cc6396.f();
                wt3.u uVar = wt3.v.f531037h;
                wt3.v.f531039j.f143085e = 2L;
                uVar.a();
                wt3.v.f531039j.f143089i = c17039xf3cc6396.getMRelatedRecId();
            }
        }
        java.lang.CharSequence text2 = textView.getText();
        c17039xf3cc6396.f237501y = text2 != null ? text2.toString() : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17039xf3cc6396.f237501y)) {
            return false;
        }
        c17039xf3cc6396.e();
        return false;
    }
}
