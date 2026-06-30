package db5;

/* loaded from: classes9.dex */
public class i1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f309925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21481x9480f35a f309926e;

    public i1(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21481x9480f35a c21481x9480f35a, java.lang.String str) {
        this.f309926e = c21481x9480f35a;
        this.f309925d = str;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().endsWith(this.f309925d)) {
            this.f309926e.showDropDown();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
