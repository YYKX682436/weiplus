package al5;

/* loaded from: classes14.dex */
public class l1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f87477d;

    public l1(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        this.f87477d = c22621x7603e017;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int i27 = b85.e.f99880e0;
        b85.e eVar = (b85.e) i95.n0.c(b85.e.class);
        if (eVar != null ? eVar.mo9971x8baf334f() : false) {
            this.f87477d.post(new java.lang.Runnable() { // from class: al5.l1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    al5.l1 l1Var = al5.l1.this;
                    l1Var.getClass();
                    ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70.class)).mo42743xfd403bb0();
                    l1Var.f87477d.setText("");
                }
            });
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
