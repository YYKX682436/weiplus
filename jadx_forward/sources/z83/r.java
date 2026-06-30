package z83;

/* loaded from: classes5.dex */
public final class r implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321 f552284d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321 activityC16161xd3ca9321) {
        this.f552284d = activityC16161xd3ca9321;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16161xd3ca9321.f224686s;
        this.f552284d.T6().f525541d.setEnabled(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s17.toString()));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
    }
}
