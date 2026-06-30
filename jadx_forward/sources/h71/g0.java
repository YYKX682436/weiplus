package h71;

/* loaded from: classes.dex */
public class g0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a f360923d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a activityC11395xb9d37a9a) {
        this.f360923d = activityC11395xb9d37a9a;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f360923d.m78501x43e00957((editable == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(editable.toString())) ? false : true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
