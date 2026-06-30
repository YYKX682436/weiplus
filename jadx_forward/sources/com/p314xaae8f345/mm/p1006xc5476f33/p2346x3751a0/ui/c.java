package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes5.dex */
public final class c implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.d f258473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f258474e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.d dVar, int i17) {
        this.f258473d = dVar;
        this.f258474e = i17;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 5 && i17 != 6) {
            return false;
        }
        this.f258473d.f258478e.mo149xb9724478(java.lang.Integer.valueOf(this.f258474e), java.lang.Integer.valueOf(uk.n.a(textView.getText().toString(), 0)));
        return true;
    }
}
