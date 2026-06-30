package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class oa implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267946d;

    public oa(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f267946d = rVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPublishTextState", "LuggageActivityHelper callback:" + i18);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("KEY_RESULT_CODE", i18);
        bundle.putParcelable("KEY_RESULT_DATA", intent.getExtras());
        this.f267946d.a(bundle);
    }
}
