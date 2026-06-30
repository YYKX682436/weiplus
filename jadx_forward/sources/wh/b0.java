package wh;

/* loaded from: classes12.dex */
public final class b0 extends wh.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f527271a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f527272b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f527273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String methodName, java.lang.String str, java.lang.Integer num) {
        super(methodName, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodName, "methodName");
        this.f527271a = methodName;
        this.f527272b = str;
        this.f527273c = num;
    }

    @Override // wh.d0
    public java.lang.String a() {
        return this.f527272b;
    }

    @Override // wh.d0
    public java.lang.String b() {
        return this.f527271a;
    }

    @Override // wh.d0
    /* renamed from: equals */
    public boolean mo173761xb2c87fbf(java.lang.Object obj) {
        if (super.mo173761xb2c87fbf(obj)) {
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.batterycanary.utils.CallStackSampler.StackAnalyzer.StackElement.JavaElement");
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527273c, ((wh.b0) obj).f527273c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m173762x8cdac1b() {
        return java.util.Objects.hash(this.f527271a, this.f527272b, this.f527273c);
    }

    /* renamed from: toString */
    public java.lang.String m173763x9616526c() {
        return this.f527271a + '(' + this.f527272b + ':' + this.f527273c + ')';
    }
}
