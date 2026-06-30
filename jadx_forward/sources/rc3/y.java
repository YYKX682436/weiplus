package rc3;

/* loaded from: classes7.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(rc3.w0 w0Var, int i17, java.lang.String str) {
        super(0);
        this.f475643d = w0Var;
        this.f475644e = i17;
        this.f475645f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.l lVar = (yz5.l) this.f475643d.f475630r.remove(java.lang.Integer.valueOf(this.f475644e));
        if (lVar != null) {
            lVar.mo146xb9724478(this.f475645f);
        }
        return jz5.f0.f384359a;
    }
}
