package hr3;

/* loaded from: classes11.dex */
public class zh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a f365779d;

    public zh(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a) {
        this.f365779d = activityC16872x6384268a;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = this.f365779d;
        boolean[] zArr = activityC16872x6384268a.F1;
        boolean z17 = zArr[0];
        fo3.s sVar = fo3.s.INSTANCE;
        if (z17) {
            zArr[0] = false;
            sVar.Ab("ie_ver_usr");
        }
        sVar.a6("ie_ver_usr");
        if (!charSequence.equals(activityC16872x6384268a.f235376e) && !activityC16872x6384268a.f235374J) {
            activityC16872x6384268a.f235376e = charSequence.toString();
            activityC16872x6384268a.f235377f.setVisibility(0);
            activityC16872x6384268a.f235378g.setVisibility(8);
        }
        if (activityC16872x6384268a.f235374J) {
            activityC16872x6384268a.f235374J = false;
        }
    }
}
