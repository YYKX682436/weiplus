package e33;

/* loaded from: classes10.dex */
public class p5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd f328969d;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd activityC15659x3c9ebdbd) {
        this.f328969d = activityC15659x3c9ebdbd;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd activityC15659x3c9ebdbd = this.f328969d;
        activityC15659x3c9ebdbd.f220160i.f328825g = obj;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd.T6(activityC15659x3c9ebdbd, obj, false);
            return;
        }
        activityC15659x3c9ebdbd.f220165q = false;
        activityC15659x3c9ebdbd.f220155d.mo7960x6cab2c8d(activityC15659x3c9ebdbd.f220157f);
        activityC15659x3c9ebdbd.f220155d.N(activityC15659x3c9ebdbd.f220167s);
        activityC15659x3c9ebdbd.f220157f.m8146xced61ae5();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
