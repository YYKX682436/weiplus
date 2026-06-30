package vc5;

/* loaded from: classes10.dex */
public final class o implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1 f516869d;

    public o(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1 c21818x708ac6f1) {
        this.f516869d = c21818x708ac6f1;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1.e(this.f516869d, z17, false, false, 6, null);
        yz5.l onSearchFocusChangedListener = this.f516869d.getOnSearchFocusChangedListener();
        if (onSearchFocusChangedListener != null) {
            onSearchFocusChangedListener.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        }
    }
}
