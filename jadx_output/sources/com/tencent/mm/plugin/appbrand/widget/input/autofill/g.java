package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class g implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public boolean f91332d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.k f91333e;

    public g(com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar) {
        this.f91333e = kVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean z17 = this.f91332d;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar = this.f91333e;
        if (!z17 || kVar.f91338b.b()) {
            if (!kVar.f91338b.b()) {
                kVar.d();
            }
            kVar.b(editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f91332d = this.f91333e.f91338b.b();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
