package df5;

/* loaded from: classes11.dex */
public final class f0 extends df5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f313626a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        i17 = (i18 & 1) != 0 ? 0 : i17;
        this.f313626a = i17;
    }

    @Override // df5.j0
    public int a() {
        return this.f313626a;
    }

    /* renamed from: equals */
    public boolean m124320xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df5.f0) && this.f313626a == ((df5.f0) obj).f313626a;
    }

    /* renamed from: hashCode */
    public int m124321x8cdac1b() {
        return java.lang.Integer.hashCode(this.f313626a);
    }

    /* renamed from: toString */
    public java.lang.String m124322x9616526c() {
        return "HorizontalRule(contentHash=" + this.f313626a + ')';
    }
}
