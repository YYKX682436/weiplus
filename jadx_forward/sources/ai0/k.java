package ai0;

/* loaded from: classes14.dex */
public final class k implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai0.m f86606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 f86607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f86608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f86609d;

    public k(ai0.m mVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 q3Var, p3325xe03a0797.p3326xc267989b.q qVar, java.lang.Object obj) {
        this.f86606a = mVar;
        this.f86607b = q3Var;
        this.f86608c = qVar;
        this.f86609d = obj;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public final void mo2069x63a3b28a() {
        if (this.f86606a.f86612b) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 q3Var = this.f86607b;
        if (q3Var != null) {
            q3Var.mo2069x63a3b28a();
        }
        try {
            p3325xe03a0797.p3326xc267989b.q qVar = this.f86608c;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(this.f86609d));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatBotHalfScreenDialog", th6, "[-] fail to resume cont.", new java.lang.Object[0]);
        }
    }
}
