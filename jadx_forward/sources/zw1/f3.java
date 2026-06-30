package zw1;

/* loaded from: classes8.dex */
public class f3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 f558156d;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 activityC13148x64d0f1c5) {
        this.f558156d = activityC13148x64d0f1c5;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(editable.toString(), 0.0d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 activityC13148x64d0f1c5 = this.f558156d;
        if (!activityC13148x64d0f1c5.f177960d.n() || F < 0.01d) {
            activityC13148x64d0f1c5.f177964h.e(false);
        } else {
            activityC13148x64d0f1c5.f177964h.e(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
