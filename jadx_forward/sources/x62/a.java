package x62;

/* loaded from: classes5.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.ext.ui.ActivityC13506x556951fc f533761d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.ext.ui.ActivityC13506x556951fc activityC13506x556951fc) {
        this.f533761d = activityC13506x556951fc;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        com.p314xaae8f345.mm.p1006xc5476f33.ext.ui.ActivityC13506x556951fc activityC13506x556951fc = this.f533761d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activityC13506x556951fc.getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = activityC13506x556951fc.getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return;
        }
        try {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedirectToChattingByPhoneStubUI", "hide VKB exception %s", e17);
        }
    }
}
