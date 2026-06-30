package rc3;

/* loaded from: classes7.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b f475607e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(rc3.w0 w0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b) {
        super(0);
        this.f475606d = w0Var;
        this.f475607e = c16416x87606a7b;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475606d;
        boolean a17 = bf3.h0.a(w0Var.f475632t, 1);
        java.lang.String str = w0Var.f475638z;
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "setup in wrong status " + w0Var.f475632t + " , discard event");
        } else {
            je3.o oVar = w0Var.f475636x;
            if (oVar != null) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                oVar.f380841d = elapsedRealtime;
                je3.i.M2(je3.k.f380831e, oVar.f380839b, oVar.f380838a, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16456x617fbd72.f37614x6f308893, elapsedRealtime - oVar.f380840c, null, 0.0f, 48, null);
            }
            je3.o oVar2 = w0Var.f475636x;
            if (oVar2 != null) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                oVar2.f380842e = android.os.SystemClock.elapsedRealtime();
            }
            w0Var.f475634v = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setup, has service?");
            sb6.append(w0Var.A != null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, sb6.toString(), new java.lang.Object[0]);
            qc3.f fVar = w0Var.A;
            if (fVar != null) {
                fVar.w3(this.f475607e);
            }
        }
        return jz5.f0.f384359a;
    }
}
