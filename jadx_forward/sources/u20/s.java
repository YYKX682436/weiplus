package u20;

/* loaded from: classes9.dex */
public final class s implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u20.y f505469d;

    public s(u20.y yVar) {
        this.f505469d = yVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        u20.y yVar = this.f505469d;
        if (i17 != 101 || i18 != -1 || intent == null) {
            yVar.b("Failed to get username after selection,requestCode fail");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        if (P1 == null || P1.isEmpty()) {
            yVar.b("Failed to get username after selection");
            return;
        }
        java.util.List list = yVar.f505488f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(P1);
        ((java.util.ArrayList) list).addAll(P1);
        p3325xe03a0797.p3326xc267989b.l.d(yVar.f505392c, null, null, new u20.u(yVar, stringExtra2, null), 3, null);
    }
}
