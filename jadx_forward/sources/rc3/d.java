package rc3;

/* loaded from: classes7.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rc3.w0 w0Var) {
        super(0);
        this.f475497d = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475497d;
        boolean z17 = (w0Var.f475632t & 1) != 0;
        java.lang.String str = w0Var.f475638z;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "destroy when service is not setup");
            rc3.w0.e(w0Var);
        } else {
            je3.o oVar = w0Var.f475636x;
            if (oVar != null) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                oVar.f380846i = android.os.SystemClock.elapsedRealtime();
            }
            w0Var.f475634v = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy, has service?");
            sb6.append(w0Var.A != null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, sb6.toString(), new java.lang.Object[0]);
            qc3.f fVar = w0Var.A;
            if (fVar != null) {
                fVar.Oc(1);
            }
        }
        return jz5.f0.f384359a;
    }
}
