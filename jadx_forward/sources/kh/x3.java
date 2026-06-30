package kh;

/* loaded from: classes10.dex */
public final class x3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f389477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f389478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kh.y3 f389479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(java.lang.Object[] objArr, java.lang.reflect.Method method, kh.y3 y3Var) {
        super(0);
        this.f389477d = objArr;
        this.f389478e = method;
        this.f389479f = y3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final java.lang.Object mo152xb9724478() {
        kh.y3 y3Var = this.f389479f;
        java.lang.reflect.Method method = this.f389478e;
        java.lang.Object[] objArr = this.f389477d;
        return objArr == null ? method.invoke(y3Var.f389489b, new java.lang.Object[0]) : method.invoke(y3Var.f389489b, java.util.Arrays.copyOf(objArr, objArr.length));
    }
}
