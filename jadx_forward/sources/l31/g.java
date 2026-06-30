package l31;

/* loaded from: classes9.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.i f396885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f396887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396888g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f396889h;

    public g(l31.i iVar, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        this.f396885d = iVar;
        this.f396886e = i17;
        this.f396887f = i18;
        this.f396888g = str;
        this.f396889h = c11158xe7d16ed5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5;
        l31.f fVar = this.f396885d.f396894f;
        if (fVar != null) {
            java.lang.String errMsg = this.f396888g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
            g31.c0 c0Var = ((g31.a0) fVar).f349593a;
            c0Var.f349603b = null;
            int i17 = this.f396886e;
            int i18 = this.f396887f;
            if (i17 != 0 || i18 != 0 || (c11158xe7d16ed5 = this.f396889h) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SubscribeSwitchInfoSyncer", "[handleGetNotifySwitchResult] failed, errType=%d, errCode=%d, errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
                return;
            }
            boolean z17 = c11158xe7d16ed5.A;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubscribeSwitchInfoSyncer", "[handleGetNotifySwitchResult] success, globalNotifySwitchStatus=%b", java.lang.Boolean.valueOf(z17));
            c0Var.a(z17);
        }
    }
}
