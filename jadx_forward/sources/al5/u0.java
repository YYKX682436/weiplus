package al5;

/* loaded from: classes5.dex */
public final class u0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 f87585d;

    public u0(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a04) {
        this.f87585d = c22618x59d05a04;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a04 = this.f87585d;
        android.view.View.OnFocusChangeListener onFocusChangeListener = c22618x59d05a04.I;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
        c22618x59d05a04.u();
    }
}
