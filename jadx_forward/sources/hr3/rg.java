package hr3;

/* loaded from: classes11.dex */
public class rg implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 f365489d;

    public rg(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9) {
        this.f365489d = activityC16871x34c232c9;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = this.f365489d;
        boolean[] zArr = activityC16871x34c232c9.A1;
        boolean z17 = zArr[0];
        fo3.s sVar = fo3.s.INSTANCE;
        if (z17) {
            zArr[0] = false;
            sVar.Ab("ie_ver_usr");
        }
        sVar.a6("ie_ver_usr");
        if (!charSequence.equals(activityC16871x34c232c9.f235347e) && !activityC16871x34c232c9.F) {
            activityC16871x34c232c9.f235347e = charSequence.toString();
            activityC16871x34c232c9.f235348f.setVisibility(0);
            activityC16871x34c232c9.f235349g.setVisibility(8);
        }
        if (activityC16871x34c232c9.F) {
            activityC16871x34c232c9.F = false;
        }
    }
}
