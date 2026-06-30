package kh;

/* loaded from: classes4.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f389472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f389473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        super(0);
        this.f389472d = method;
        this.f389473e = objArr;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#");
        sb6.append(this.f389472d.getName());
        sb6.append(": ");
        java.lang.String arrays = java.util.Arrays.toString(this.f389473e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        return sb6.toString();
    }
}
