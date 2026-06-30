package rf4;

/* loaded from: classes5.dex */
public final class l1 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 f476615a;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 c18484xfde93083) {
        this.f476615a = c18484xfde93083;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        this.f476615a.f253519g.n(str);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 c18484xfde93083 = this.f476615a;
        android.view.inputmethod.InputConnection mo81352x6a67d012 = c18484xfde93083.f253519g.mo81352x6a67d012();
        if (mo81352x6a67d012 != null) {
            mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        android.view.inputmethod.InputConnection mo81352x6a67d0122 = c18484xfde93083.f253519g.mo81352x6a67d012();
        if (mo81352x6a67d0122 != null) {
            mo81352x6a67d0122.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 c18484xfde93083 = this.f476615a;
        if (c18484xfde93083.f253528s) {
            mf4.d.f407693a.a(9);
            android.text.Editable text = c18484xfde93083.f253519g.getText();
            if (text != null) {
                c18484xfde93083.c();
                c18484xfde93083.f253519g.setText((java.lang.CharSequence) null);
                c18484xfde93083.f253518f.setVisibility(8);
                yz5.p commentInputCallback = c18484xfde93083.getCommentInputCallback();
                if (commentInputCallback != null) {
                    commentInputCallback.mo149xb9724478(text.toString(), java.lang.Boolean.TRUE);
                }
            }
        }
    }
}
