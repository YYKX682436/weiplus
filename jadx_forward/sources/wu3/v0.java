package wu3;

/* loaded from: classes10.dex */
public final class v0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 f531342d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282) {
        this.f531342d = c17042xf8121282;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (this.f531342d.getPanelActionCallback() != null) {
            nu3.i.c(nu3.i.f421751a, "KEY_CLICK_NEW_LINE_COUNT", 0, 2, null);
        }
        return false;
    }
}
