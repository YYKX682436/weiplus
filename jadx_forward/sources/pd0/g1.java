package pd0;

/* loaded from: classes11.dex */
public class g1 implements en1.l {
    @Override // en1.l
    /* renamed from: onAuthResponse */
    public void mo43817x48bdb988(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PSIR", "[+] type 1 report triggered, autoauth: %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            ((ku5.t0) ku5.t0.f394148d).h(new od0.p(), "SIRWorker");
        } else {
            od0.r.Ai(540999680, null);
        }
        fo3.s sVar = fo3.s.INSTANCE;
        java.lang.String Sf = sVar.Sf("ce_login_id");
        if (android.text.TextUtils.isEmpty(Sf) || z17) {
            return;
        }
        sVar.c2(Sf, 2);
    }

    @Override // en1.l
    /* renamed from: onRegResponse */
    public void mo43818x6279e596(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PSIR", "[+] type 2 report triggered.");
        od0.r.Ai(540999681, null);
        fo3.s sVar = fo3.s.INSTANCE;
        java.lang.String Sf = sVar.Sf("ce_reg");
        if (android.text.TextUtils.isEmpty(Sf)) {
            return;
        }
        sVar.c2(Sf, 1);
    }
}
