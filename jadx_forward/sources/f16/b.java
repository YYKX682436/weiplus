package f16;

/* loaded from: classes15.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f16.e1 f340234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f16.k[] f340235e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f16.e1 e1Var, f16.k[] kVarArr) {
        super(1);
        this.f340234d = e1Var;
        this.f340235e = kVarArr;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map map;
        f16.k kVar;
        int intValue = ((java.lang.Number) obj).intValue();
        f16.e1 e1Var = this.f340234d;
        if (e1Var != null && (map = e1Var.f340253a) != null && (kVar = (f16.k) map.get(java.lang.Integer.valueOf(intValue))) != null) {
            return kVar;
        }
        if (intValue >= 0) {
            f16.k[] kVarArr = this.f340235e;
            if (intValue <= kz5.z.P(kVarArr)) {
                return kVarArr[intValue];
            }
        }
        return f16.k.f340274e;
    }
}
