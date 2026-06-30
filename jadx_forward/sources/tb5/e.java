package tb5;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f498577a;

    /* renamed from: b, reason: collision with root package name */
    public final long f498578b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f498579c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f498580d;

    /* renamed from: e, reason: collision with root package name */
    public final int f498581e;

    public e(int i17, long j17, java.lang.String itemClass, boolean z17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemClass, "itemClass");
        this.f498577a = i17;
        this.f498578b = j17;
        this.f498579c = itemClass;
        this.f498580d = z17;
        this.f498581e = i18;
    }

    /* renamed from: equals */
    public boolean m166117xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb5.e)) {
            return false;
        }
        tb5.e eVar = (tb5.e) obj;
        return this.f498577a == eVar.f498577a && this.f498578b == eVar.f498578b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f498579c, eVar.f498579c) && this.f498580d == eVar.f498580d && this.f498581e == eVar.f498581e;
    }

    /* renamed from: hashCode */
    public int m166118x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f498577a) * 31) + java.lang.Long.hashCode(this.f498578b)) * 31) + this.f498579c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f498580d)) * 31) + java.lang.Integer.hashCode(this.f498581e);
    }

    /* renamed from: toString */
    public java.lang.String m166119x9616526c() {
        return "ItemCostInfo(msgType=" + this.f498577a + ", cost=" + this.f498578b + ", itemClass=" + this.f498579c + ", isInChat=" + this.f498580d + ", count=" + this.f498581e + ')';
    }

    public /* synthetic */ e(int i17, long j17, java.lang.String str, boolean z17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, j17, str, z17, (i19 & 16) != 0 ? 0 : i18);
    }
}
