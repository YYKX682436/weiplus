package wj1;

/* loaded from: classes14.dex */
public class u0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45 f528170d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45 c12703xefb74f45) {
        this.f528170d = c12703xefb74f45;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45 c12703xefb74f45 = this.f528170d;
        if (c12703xefb74f45.f171094q.m78956xfb85ada3().toString().length() > 0) {
            c12703xefb74f45.f171093p.setEnabled(true);
        } else {
            c12703xefb74f45.f171093p.setEnabled(false);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
