package lx;

/* loaded from: classes11.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f403453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx.v2 f403454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr1.e f403455f;

    public q2(l75.w0 w0Var, lx.v2 v2Var, hr1.e eVar) {
        this.f403453d = w0Var;
        this.f403454e = v2Var;
        this.f403455f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l75.w0 w0Var = this.f403453d;
        int i17 = w0Var.f398507b;
        lx.v2 v2Var = this.f403454e;
        if (i17 == 1 || i17 == 2 || i17 == 5 || i17 == 7) {
            lx.v2.b(v2Var, this.f403455f);
            return;
        }
        if (i17 != 8) {
            lx.v2.a(v2Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "[onConversationStorageChange] unhandled eventId=" + w0Var.f398507b);
            return;
        }
        com.p314xaae8f345.p2845xc516c4b6.biz.C23191x818c91f8 c23191x818c91f8 = v2Var.f403515h;
        if (c23191x818c91f8 == null) {
            return;
        }
        try {
            c23191x818c91f8.m85247xb5ae70e3(new lx.s2(v2Var));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "notifyReloadData error: " + e17.getMessage());
        }
    }
}
