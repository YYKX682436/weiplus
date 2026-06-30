package rc3;

/* loaded from: classes7.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(rc3.w0 w0Var, yz5.l lVar, java.lang.String str) {
        super(0);
        this.f475527d = w0Var;
        this.f475528e = lVar;
        this.f475529f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rc3.w0 w0Var = this.f475527d;
        if ((w0Var.f475632t & 1) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(w0Var.f475638z, "evaluate in wrong status " + w0Var.f475632t + " , discard event");
        } else {
            java.lang.String str = this.f475529f;
            yz5.l lVar = this.f475528e;
            if (lVar != null) {
                java.util.HashMap hashMap = w0Var.f475630r;
                int i17 = w0Var.f475631s + 1;
                w0Var.f475631s = i17;
                hashMap.put(java.lang.Integer.valueOf(i17), lVar);
                qc3.f fVar = w0Var.A;
                if (fVar != null) {
                    fVar.w9(str, w0Var.f475631s);
                }
            } else {
                qc3.f fVar2 = w0Var.A;
                if (fVar2 != null) {
                    fVar2.w9(str, 0);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
