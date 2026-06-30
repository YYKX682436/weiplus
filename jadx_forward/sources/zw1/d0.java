package zw1;

/* loaded from: classes9.dex */
public class d0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 f558134d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 activityC13142x725f2ac0) {
        this.f558134d = activityC13142x725f2ac0;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(editable.toString(), 0.0d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0 activityC13142x725f2ac0 = this.f558134d;
        if (!activityC13142x725f2ac0.f177910d.n() || F < 0.01d) {
            activityC13142x725f2ac0.f177914h.e(false);
        } else {
            activityC13142x725f2ac0.f177914h.e(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
