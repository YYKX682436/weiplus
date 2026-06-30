package tl5;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f501863a;

    /* renamed from: b, reason: collision with root package name */
    public final int f501864b;

    /* renamed from: c, reason: collision with root package name */
    public final long f501865c;

    public a(int i17, int i18, long j17) {
        this.f501863a = i17;
        this.f501864b = i18;
        this.f501865c = j17;
    }

    /* renamed from: equals */
    public boolean m166755xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl5.a)) {
            return false;
        }
        tl5.a aVar = (tl5.a) obj;
        return this.f501863a == aVar.f501863a && this.f501864b == aVar.f501864b && this.f501865c == aVar.f501865c;
    }

    /* renamed from: hashCode */
    public int m166756x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f501863a) * 31) + java.lang.Integer.hashCode(this.f501864b)) * 31) + java.lang.Long.hashCode(this.f501865c);
    }

    /* renamed from: toString */
    public java.lang.String m166757x9616526c() {
        return "AnchorInfo(adapterPosition=" + this.f501863a + ", offset=" + this.f501864b + ", stableId=" + this.f501865c + ')';
    }
}
