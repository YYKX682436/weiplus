package rc3;

/* loaded from: classes7.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rc3.w0 w0Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f475514d = w0Var;
        this.f475515e = str;
        this.f475516f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475514d;
        if ((w0Var.f475632t & 1) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(w0Var.f475638z, "dispatch in wrong status " + w0Var.f475632t + " , discard event");
        } else {
            qc3.f fVar = w0Var.A;
            if (fVar != null) {
                fVar.s2(this.f475515e, this.f475516f);
            }
        }
        return jz5.f0.f384359a;
    }
}
