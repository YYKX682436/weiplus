package rc3;

/* loaded from: classes7.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(rc3.w0 w0Var, int i17) {
        super(0);
        this.f475548d = w0Var;
        this.f475549e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475548d;
        java.lang.String str = w0Var.f475638z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("surface ");
        int i17 = this.f475549e;
        sb6.append(i17);
        sb6.append(" post destroy, has service?");
        sb6.append(w0Var.A != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        qc3.f fVar = w0Var.A;
        if (fVar != null) {
            fVar.yd(i17);
        }
        w0Var.S(new rc3.j0(w0Var, i17));
        return jz5.f0.f384359a;
    }
}
