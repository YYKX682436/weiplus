package er5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final er5.c f337762d = new er5.c(-1299675000, android.content.res.Resources.getSystem().getDisplayMetrics().density * 3.0f, android.content.res.Resources.getSystem().getDisplayMetrics().density * 6.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f337763a;

    /* renamed from: b, reason: collision with root package name */
    public final float f337764b;

    /* renamed from: c, reason: collision with root package name */
    public final float f337765c;

    public c(int i17, float f17, float f18) {
        this.f337763a = i17;
        this.f337764b = f17;
        this.f337765c = f18;
    }

    /* renamed from: equals */
    public boolean m128064xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er5.c)) {
            return false;
        }
        er5.c cVar = (er5.c) obj;
        return this.f337763a == cVar.f337763a && java.lang.Float.compare(this.f337764b, cVar.f337764b) == 0 && java.lang.Float.compare(this.f337765c, cVar.f337765c) == 0;
    }

    /* renamed from: hashCode */
    public int m128065x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f337763a) * 31) + java.lang.Float.hashCode(this.f337764b)) * 31) + java.lang.Float.hashCode(this.f337765c);
    }

    /* renamed from: toString */
    public java.lang.String m128066x9616526c() {
        return "ScrollBarSpec(color=" + this.f337763a + ", size=" + this.f337764b + ", margin=" + this.f337765c + ')';
    }
}
