package os3;

/* loaded from: classes8.dex */
public class p0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 f429701d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86) {
        this.f429701d = activityC16931x24037f86;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            android.widget.EditText editText = this.f429701d.f236377q;
            editText.setSelection(editText.getText().length());
        }
    }
}
