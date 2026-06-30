package os3;

/* loaded from: classes8.dex */
public class n implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f429687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 f429688e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86, android.widget.ImageView imageView) {
        this.f429688e = activityC16931x24037f86;
        this.f429687d = imageView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = this.f429688e;
        boolean z17 = activityC16931x24037f86.G;
        android.widget.ImageView imageView = this.f429687d;
        if (z17) {
            imageView.setVisibility(activityC16931x24037f86.f236377q.getText().length() > 0 ? 0 : 4);
        } else {
            imageView.setVisibility(4);
        }
    }
}
