package wj2;

/* loaded from: classes3.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.j0 f528219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xh2.a f528220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(wj2.j0 j0Var, xh2.a aVar) {
        super(0);
        this.f528219d = j0Var;
        this.f528220e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qf2.t3 a76;
        qf2.q3 q3Var = (qf2.q3) this.f528219d.f528223b.o(qf2.q3.class);
        if (q3Var != null && (a76 = q3Var.a7()) != null) {
            java.lang.String b17 = this.f528220e.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a76.f444124b, "keepPayMic sdkId: ".concat(b17));
            qf2.s3 s3Var = (qf2.s3) a76.f444125c.get(b17);
            if (s3Var != null) {
                s3Var.f444112e = true;
            }
        }
        return jz5.f0.f384359a;
    }
}
