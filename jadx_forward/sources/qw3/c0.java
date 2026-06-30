package qw3;

/* loaded from: classes9.dex */
public class c0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448679d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569) {
        this.f448679d = activityC17101x8420a569;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f448679d.N = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new qw3.b0(this), 200L);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
