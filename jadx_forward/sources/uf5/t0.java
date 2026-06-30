package uf5;

/* loaded from: classes10.dex */
public class t0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f508832d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new uf5.s0(this), false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d f508833e;

    public t0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d abstractActivityC22347xd7e8b37d) {
        this.f508833e = abstractActivityC22347xd7e8b37d;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f508832d;
        b4Var.d();
        b4Var.c(500L, 500L);
    }
}
