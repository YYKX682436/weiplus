package b32;

/* loaded from: classes8.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13398x3b5ffc2f f99184d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13398x3b5ffc2f c13398x3b5ffc2f) {
        this.f99184d = c13398x3b5ffc2f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13398x3b5ffc2f c13398x3b5ffc2f = this.f99184d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) c13398x3b5ffc2f.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c13398x3b5ffc2f.f180248q, 0);
        }
    }
}
