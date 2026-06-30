package yk4;

/* loaded from: classes3.dex */
public final class p implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c f544382d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c) {
        this.f544382d = c18713x3be2dc6c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = this.f544382d;
        c18713x3be2dc6c.m72066xdb574fcd().postDelayed(new yk4.o(c18713x3be2dc6c), 160L);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = this.f544382d;
        if (c18713x3be2dc6c.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() == 2 && i19 == 1) {
            if ((charSequence != null ? charSequence.charAt(i17) : ' ') == '@' && c18713x3be2dc6c.j()) {
                c18713x3be2dc6c.m72073xc515e008().performClick();
            }
        }
    }
}
