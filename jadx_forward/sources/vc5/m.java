package vc5;

/* loaded from: classes10.dex */
public final class m implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.d2 f516866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1 f516867e;

    public m(em.d2 d2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1 c21818x708ac6f1) {
        this.f516866d = d2Var;
        this.f516867e = c21818x708ac6f1;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 3) {
            return false;
        }
        this.f516866d.d().clearFocus();
        int i18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1.f283264n;
        this.f516867e.b();
        return true;
    }
}
