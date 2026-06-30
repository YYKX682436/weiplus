package rc3;

/* loaded from: classes7.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475614d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(rc3.w0 w0Var) {
        super(0);
        this.f475614d = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475614d;
        boolean a17 = bf3.h0.a(w0Var.f475632t, 2);
        java.lang.String str = w0Var.f475638z;
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "start in wrong status " + w0Var.f475632t + " , discard event");
        } else {
            w0Var.f475634v = true;
            je3.o oVar = w0Var.f475636x;
            if (oVar != null) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                oVar.f380844g = android.os.SystemClock.elapsedRealtime();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start, has service?");
            sb6.append(w0Var.A != null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, sb6.toString(), new java.lang.Object[0]);
            qc3.f fVar = w0Var.A;
            if (fVar != null) {
                fVar.D1();
            }
        }
        return jz5.f0.f384359a;
    }
}
