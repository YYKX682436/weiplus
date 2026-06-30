package k02;

/* loaded from: classes8.dex */
public final class q implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vz.w1 f384628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f384629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384630c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f384631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f384632e;

    public q(vz.w1 w1Var, android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        this.f384628a = w1Var;
        this.f384629b = context;
        this.f384630c = str;
        this.f384631d = str2;
        this.f384632e = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.downloader.game.dl.protobuf.GetCloudGameDownloadInfoResponse");
        c02.m mVar = (c02.m) fVar;
        vz.w1 w1Var = this.f384628a;
        if (i17 != 0 || i18 != 0) {
            if (w1Var != null) {
                w1Var.a("cgiGetGameDownloadDetainConfig CGI return, errType = " + i17 + ", errCode = " + str);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameDetainManager", "response .open_type  = " + mVar.f119139d);
        int i19 = mVar.f119139d;
        if (i19 == 1) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f119140e) && mVar.f119141f != null) {
                ik1.h0.b(new k02.o(this.f384629b, this.f384628a, mVar, this.f384630c, this.f384631d, this.f384632e));
                return;
            } else {
                if (w1Var != null) {
                    w1Var.a("gamelog response .open_type  = 1  h5_url is null");
                    return;
                }
                return;
            }
        }
        if (i19 != 2) {
            if (w1Var != null) {
                w1Var.a("open_type illegal open_type  = " + mVar.f119139d);
                return;
            }
            return;
        }
        if (mVar.f119141f != null) {
            ik1.h0.b(new k02.p(this.f384629b, this.f384628a, mVar, this.f384630c, this.f384631d, this.f384632e));
        } else if (w1Var != null) {
            w1Var.a("gamelog response .open_type  = 2  app_info is null");
        }
    }
}
