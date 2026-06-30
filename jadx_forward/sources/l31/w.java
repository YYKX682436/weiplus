package l31;

/* loaded from: classes9.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.y f396929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f396931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396932g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f396933h;

    public w(l31.y yVar, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        this.f396929d = yVar;
        this.f396930e = i17;
        this.f396931f = i18;
        this.f396932g = str;
        this.f396933h = c11158xe7d16ed5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5;
        l31.v vVar = this.f396929d.f396937g;
        if (vVar != null) {
            java.lang.String errMsg = this.f396932g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
            g31.c0 c0Var = ((g31.b0) vVar).f349599a;
            c0Var.f349604c = null;
            int i17 = this.f396930e;
            int i18 = this.f396931f;
            if (i17 != 0 || i18 != 0 || (c11158xe7d16ed5 = this.f396933h) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SubscribeSwitchInfoSyncer", "[handleSetNotifySwitchResult] failed, errType=%d, errCode=%d, errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
                return;
            }
            boolean z17 = c11158xe7d16ed5.A;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubscribeSwitchInfoSyncer", "[handleSetNotifySwitchResult] success, globalNotifySwitchStatus=%b", java.lang.Boolean.valueOf(z17));
            c0Var.a(z17);
        }
    }
}
