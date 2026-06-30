package ef;

/* loaded from: classes7.dex */
public final class h implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef.m f333651a;

    public h(ef.m mVar) {
        this.f333651a = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3
    public void a(int i17) {
        ef.m mVar = this.f333651a;
        ef.e eVar = mVar.f333659c;
        if (eVar == null) {
            return;
        }
        int c17 = eVar.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebViewExtendInputClient", "OnHeightChangedListener, totalHeight: %d, lateSavedKeyboardPanelHeight: %d, currentKeyboardPanelHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mVar.f333661e), java.lang.Integer.valueOf(c17));
        if (mVar.f333661e != c17) {
            mVar.f333661e = c17;
            mVar.e(null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3
    public android.widget.EditText b() {
        android.widget.EditText editText = this.f333651a.f333660d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(editText);
        return editText;
    }
}
