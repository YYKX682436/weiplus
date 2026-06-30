package v20;

/* loaded from: classes9.dex */
public final class h implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.g9 f514298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514300f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f514301g;

    public h(bw5.g9 g9Var, java.lang.String str, java.lang.String str2, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f514298d = g9Var;
        this.f514299e = str;
        this.f514300f = str2;
        this.f514301g = qVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f514301g;
        bw5.g9 g9Var = this.f514298d;
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareShopWindow", "share showWindow " + g9Var.m11973x93d5ac12() + " cancel");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.FALSE, "")));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareShopWindow", "share showWindow " + g9Var.m11973x93d5ac12() + " to " + stringArrayListExtra);
        java.lang.String str = this.f514299e;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = this.f514300f;
            if (!(str2 == null || str2.length() == 0)) {
                ((dk5.s5) tg3.t1.a()).Ui(str, str2);
            }
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String str3 = (java.lang.String) kz5.n0.Z(stringArrayListExtra);
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(bool, str3 != null ? str3 : "")));
    }
}
