package la5;

/* loaded from: classes14.dex */
public class z0 extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f399181a;

    public z0() {
        this.f399181a = false;
        this.f399181a = la5.b.f399133a.h();
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(android.view.View view, int i17) {
        java.lang.CharSequence text;
        la5.c cVar = la5.b.f399133a;
        if (cVar.g(true)) {
            boolean z17 = this.f399181a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSecureAccessibilityAndroidRDelegate", "shouldSpeakPassWord: %s, sendAccessibilityEvent eventType:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
            if (i17 == 32768) {
                super.sendAccessibilityEvent(view, i17);
                return;
            }
            if (!z17) {
                if (view != null) {
                    if (i17 == 128 || i17 == 1) {
                        cVar.e(view);
                        return;
                    }
                    return;
                }
                return;
            }
            if (view != null) {
                if (i17 == 128 || i17 == 1) {
                    if (view instanceof android.widget.EditText) {
                        android.widget.EditText editText = (android.widget.EditText) view;
                        text = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(editText.getText()) ? editText.getText() : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(editText.getContentDescription()) ? editText.getContentDescription() : editText.getHint() != null ? editText.getHint() : null;
                    } else {
                        text = view instanceof android.widget.TextView ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(view.getContentDescription()) ? ((android.widget.TextView) view).getText() : view.getContentDescription() : view.getContentDescription();
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(text)) {
                        return;
                    }
                    cVar.i(view, text.toString());
                }
            }
        }
    }
}
