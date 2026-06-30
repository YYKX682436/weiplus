package id2;

/* loaded from: classes3.dex */
public final class h implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f372124a;

    public h(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f372124a = onDismissListener;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public final void mo2069x63a3b28a() {
        id2.m.f372195a.d("154");
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f372124a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
