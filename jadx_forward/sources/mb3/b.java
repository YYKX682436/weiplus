package mb3;

/* loaded from: classes9.dex */
public class b implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.C16323xdfbab327 f406888d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.C16323xdfbab327 c16323xdfbab327) {
        this.f406888d = c16323xdfbab327;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.C16323xdfbab327 c16323xdfbab327 = this.f406888d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik ikVar = c16323xdfbab327.f226542h;
        if (ikVar != null) {
            ikVar.D4(false, c16323xdfbab327.m66034xcc1739d4());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
