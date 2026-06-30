package ur;

/* loaded from: classes14.dex */
public class b implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p685x8ad1196e.ui.C10452xae330a2a f511803d;

    public b(com.p314xaae8f345.mm.p685x8ad1196e.ui.C10452xae330a2a c10452xae330a2a) {
        this.f511803d = c10452xae330a2a;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p685x8ad1196e.ui.C10452xae330a2a c10452xae330a2a = this.f511803d;
        java.lang.String m43738xc3706fda = c10452xae330a2a.m43738xc3706fda();
        java.lang.String str = c10452xae330a2a.f146487i;
        if (m43738xc3706fda == str || m43738xc3706fda.equals(str)) {
            return;
        }
        c10452xae330a2a.f146487i = m43738xc3706fda;
        if (m43738xc3706fda.length() > 0) {
            c10452xae330a2a.f146483e.setVisibility(0);
        } else {
            c10452xae330a2a.f146483e.setVisibility(8);
        }
        if (c10452xae330a2a.m43734x134c2d56().length() == 0) {
            c10452xae330a2a.f146484f.setHint(c10452xae330a2a.f146485g);
        }
    }
}
