package k93;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 f387422d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 c16179x5fcf4d58) {
        this.f387422d = c16179x5fcf4d58;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 c16179x5fcf4d58 = this.f387422d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c16179x5fcf4d58.S;
        if (c22621x7603e017 != null) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) c22621x7603e017.getContext().getSystemService("input_method");
            c16179x5fcf4d58.S.requestFocus();
            inputMethodManager.showSoftInput(c16179x5fcf4d58.S, 0);
            c16179x5fcf4d58.S.setCursorVisible(false);
            c16179x5fcf4d58.S.setCursorVisible(true);
        }
    }
}
