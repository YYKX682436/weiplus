package wo1;

/* loaded from: classes5.dex */
public final class y0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ po1.d f529589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f529591c;

    public y0(po1.d dVar, wo1.a1 a1Var, long j17) {
        this.f529589a = dVar;
        this.f529590b = a1Var;
        this.f529591c = j17;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        android.net.Uri data = intent != null ? intent.getData() : null;
        if (intent == null || data == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "result of data is null or uri is null, deviceId=" + this.f529589a.f438828a);
            return;
        }
        jz5.l e17 = to1.g.f502444a.e(data);
        if (e17 == null) {
            wo1.a1 a1Var = this.f529590b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseTaskStatusView", "Fail to parse uri=" + data);
            android.content.Context context = a1Var.getContext();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.mzd);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c();
            return;
        }
        java.lang.String str = (java.lang.String) e17.f384366d;
        java.lang.String str2 = (java.lang.String) e17.f384367e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f529589a.f438833f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "uuid not match, uuid=" + str + ", deviceUUID=" + this.f529589a.f438833f);
            android.content.Context context2 = this.f529590b.getContext();
            int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
            e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.mzd);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var2.c();
            return;
        }
        if (r26.i0.A(this.f529589a.f438832e, str2, false, 2, null)) {
            java.lang.String string = this.f529590b.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            ((ku5.t0) ku5.t0.f394148d).g(new wo1.x0(data, this.f529589a, str2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this.f529590b.getContext(), string, false, 3, null), this.f529590b, this.f529591c));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "path error, path=" + str2 + ", devicePath=" + this.f529589a.f438832e);
        android.content.Context context3 = this.f529590b.getContext();
        int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context3);
        e4Var3.d(com.p314xaae8f345.mm.R.C30867xcad56011.mze);
        e4Var3.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var3.c();
    }
}
