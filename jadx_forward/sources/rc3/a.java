package rc3;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rc3.w0 w0Var) {
        super(0);
        this.f475477d = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475477d;
        java.lang.String str = w0Var.f475638z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do check server exist: ");
        sb6.append(w0Var.A != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (w0Var.A == null) {
            je3.o oVar = w0Var.f475636x;
            if (oVar != null && oVar.f380840c == 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                oVar.f380840c = android.os.SystemClock.elapsedRealtime();
            }
            if (w0Var.B == null) {
                w0Var.f475622g.mo146xb9724478(w0Var.f475620e);
            }
        }
        return jz5.f0.f384359a;
    }
}
