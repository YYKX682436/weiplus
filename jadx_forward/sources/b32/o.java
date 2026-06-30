package b32;

/* loaded from: classes8.dex */
public final class o implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13398x3b5ffc2f f99178d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13398x3b5ffc2f c13398x3b5ffc2f) {
        this.f99178d = c13398x3b5ffc2f;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13398x3b5ffc2f c13398x3b5ffc2f = this.f99178d;
        if (editable != null) {
            if (editable.length() > 0) {
                c13398x3b5ffc2f.f180249r.setVisibility(0);
                return;
            }
        }
        c13398x3b5ffc2f.f180249r.setVisibility(8);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f99178d.m54942x6a36b305(true);
    }
}
