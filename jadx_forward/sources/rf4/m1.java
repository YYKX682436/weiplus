package rf4;

/* loaded from: classes5.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 f476618d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 c18484xfde93083) {
        this.f476618d = c18484xfde93083;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18484xfde93083 c18484xfde93083 = this.f476618d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) c18484xfde93083.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c18484xfde93083.f253519g, 0);
        }
    }
}
