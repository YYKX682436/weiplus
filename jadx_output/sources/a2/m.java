package a2;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final a2.l f773a;

    /* renamed from: b, reason: collision with root package name */
    public final int f774b;

    /* renamed from: c, reason: collision with root package name */
    public final int f775c;

    /* renamed from: d, reason: collision with root package name */
    public final int f776d;

    /* renamed from: e, reason: collision with root package name */
    public final int f777e;

    /* renamed from: f, reason: collision with root package name */
    public final float f778f;

    /* renamed from: g, reason: collision with root package name */
    public final float f779g;

    public m(a2.l paragraph, int i17, int i18, int i19, int i27, float f17, float f18) {
        kotlin.jvm.internal.o.g(paragraph, "paragraph");
        this.f773a = paragraph;
        this.f774b = i17;
        this.f775c = i18;
        this.f776d = i19;
        this.f777e = i27;
        this.f778f = f17;
        this.f779g = f18;
    }

    public final d1.g a(d1.g gVar) {
        kotlin.jvm.internal.o.g(gVar, "<this>");
        return gVar.d(d1.f.a(0.0f, this.f778f));
    }

    public final int b(int i17) {
        int i18 = this.f775c;
        int i19 = this.f774b;
        return e06.p.f(i17, i19, i18) - i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.m)) {
            return false;
        }
        a2.m mVar = (a2.m) obj;
        return kotlin.jvm.internal.o.b(this.f773a, mVar.f773a) && this.f774b == mVar.f774b && this.f775c == mVar.f775c && this.f776d == mVar.f776d && this.f777e == mVar.f777e && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f778f), java.lang.Float.valueOf(mVar.f778f)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f779g), java.lang.Float.valueOf(mVar.f779g));
    }

    public int hashCode() {
        return (((((((((((this.f773a.hashCode() * 31) + java.lang.Integer.hashCode(this.f774b)) * 31) + java.lang.Integer.hashCode(this.f775c)) * 31) + java.lang.Integer.hashCode(this.f776d)) * 31) + java.lang.Integer.hashCode(this.f777e)) * 31) + java.lang.Float.hashCode(this.f778f)) * 31) + java.lang.Float.hashCode(this.f779g);
    }

    public java.lang.String toString() {
        return "ParagraphInfo(paragraph=" + this.f773a + ", startIndex=" + this.f774b + ", endIndex=" + this.f775c + ", startLineIndex=" + this.f776d + ", endLineIndex=" + this.f777e + ", top=" + this.f778f + ", bottom=" + this.f779g + ')';
    }
}
