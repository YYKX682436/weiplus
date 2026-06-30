package dk2;

/* loaded from: classes14.dex */
public final class e5 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f314887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.i5 f314888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f314889f;

    public e5(v65.n nVar, dk2.i5 i5Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f314887d = nVar;
        this.f314888e = i5Var;
        this.f314889f = h0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 != 18193) {
            return;
        }
        v65.n nVar = this.f314887d;
        if (i18 != -1 || intent == null) {
            nVar.a(null);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("resultCode");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("resultDesc");
        nVar.a(new dk2.d5(stringExtra, stringExtra2 != null ? stringExtra2 : "", intent.getStringExtra("idCardAuthData"), intent.getStringExtra("certPwdData")));
        this.f314888e.f315142a.m78768x58bd8a37((com.p314xaae8f345.mm.ui.xc) this.f314889f.f391656d);
    }
}
