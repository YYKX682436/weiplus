package f93;

/* loaded from: classes.dex */
public class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 f341899d;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
        this.f341899d = activityC16172xa598f868;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f341899d;
        activityC16172xa598f868.f224830e.M.performClick();
        activityC16172xa598f868.f224830e.M.requestFocus();
        android.widget.EditText editText = activityC16172xa598f868.f224830e.M;
        editText.setSelection(editText.getText().length());
        ((android.view.inputmethod.InputMethodManager) activityC16172xa598f868.mo55332x76847179().getSystemService("input_method")).showSoftInput(activityC16172xa598f868.f224830e.M, 0);
    }
}
