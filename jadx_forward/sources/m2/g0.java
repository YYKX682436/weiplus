package m2;

/* loaded from: classes13.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f404450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        super(2);
        this.f404448d = str;
        this.f404449e = str2;
        this.f404450f = objArr;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        m2.a aVar = m2.a.f404434a;
        java.lang.Object[] objArr = this.f404450f;
        aVar.d(this.f404448d, this.f404449e, oVar, java.util.Arrays.copyOf(objArr, objArr.length));
        return jz5.f0.f384359a;
    }
}
