package wh;

/* loaded from: classes12.dex */
public final class c0 extends wh.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f527279a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f527280b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f527281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.String methodName, java.lang.String str, java.lang.String str2) {
        super(methodName, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodName, "methodName");
        this.f527279a = methodName;
        this.f527280b = str;
        this.f527281c = str2;
    }

    @Override // wh.d0
    public java.lang.String a() {
        return this.f527280b;
    }

    @Override // wh.d0
    public java.lang.String b() {
        return this.f527279a;
    }

    @Override // wh.d0
    /* renamed from: equals */
    public boolean mo173761xb2c87fbf(java.lang.Object obj) {
        if (super.mo173761xb2c87fbf(obj)) {
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.batterycanary.utils.CallStackSampler.StackAnalyzer.StackElement.NativeElement");
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527281c, ((wh.c0) obj).f527281c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m173764x8cdac1b() {
        return java.util.Objects.hash(this.f527279a, this.f527280b, this.f527281c);
    }

    /* renamed from: toString */
    public java.lang.String m173765x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pc ");
        sb6.append(this.f527279a);
        sb6.append(' ');
        sb6.append(this.f527280b);
        java.lang.String str2 = this.f527281c;
        if (str2 != null) {
            if (str2.length() > 0) {
                str = " (" + str2 + ')';
                sb6.append(str);
                return sb6.toString();
            }
        }
        str = "";
        sb6.append(str);
        return sb6.toString();
    }
}
