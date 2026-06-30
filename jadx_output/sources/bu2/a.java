package bu2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f24491a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f24492b;

    /* renamed from: c, reason: collision with root package name */
    public r45.i31 f24493c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24494d;

    public a(int i17, java.lang.String name, r45.i31 page, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 8) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(page, "page");
        this.f24491a = i17;
        this.f24492b = name;
        this.f24493c = page;
        this.f24494d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2.a)) {
            return false;
        }
        bu2.a aVar = (bu2.a) obj;
        return this.f24491a == aVar.f24491a && kotlin.jvm.internal.o.b(this.f24492b, aVar.f24492b) && kotlin.jvm.internal.o.b(this.f24493c, aVar.f24493c) && this.f24494d == aVar.f24494d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f24491a) * 31) + this.f24492b.hashCode()) * 31) + this.f24493c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f24494d);
    }

    public java.lang.String toString() {
        return "CachePage(type=" + this.f24491a + ", name=" + this.f24492b + ", page=" + this.f24493c + ", read=" + this.f24494d + ')';
    }
}
