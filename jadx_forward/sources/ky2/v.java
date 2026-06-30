package ky2;

/* loaded from: classes.dex */
public final class v implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395116d;

    public v(ky2.w wVar) {
        this.f395116d = wVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.util.List list = this.f395116d.f395118e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getDataList$p(...)");
        ky2.r rVar = (ky2.r) kz5.n0.Z(list);
        ky2.s sVar = rVar != null ? rVar.f395109b : null;
        if (sVar == null) {
            return;
        }
        sVar.f395113c = r26.n0.u0(java.lang.String.valueOf(editable)).toString();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
