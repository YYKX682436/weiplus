package f93;

/* loaded from: classes11.dex */
public final class h0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f341879d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea) {
        this.f341879d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new f93.g0(activityC16165x57283aea), false);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f341879d;
        b4Var.d();
        b4Var.c(500L, 500L);
    }
}
