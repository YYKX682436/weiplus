package ck0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f42296a;

    /* renamed from: b, reason: collision with root package name */
    public final float f42297b;

    public a(java.lang.String labelName, float f17) {
        kotlin.jvm.internal.o.g(labelName, "labelName");
        this.f42296a = labelName;
        this.f42297b = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck0.a)) {
            return false;
        }
        ck0.a aVar = (ck0.a) obj;
        return kotlin.jvm.internal.o.b(this.f42296a, aVar.f42296a) && java.lang.Float.compare(this.f42297b, aVar.f42297b) == 0;
    }

    public int hashCode() {
        return (this.f42296a.hashCode() * 31) + java.lang.Float.hashCode(this.f42297b);
    }

    public java.lang.String toString() {
        return "ClsResult(labelName=" + this.f42296a + ", labelScore=" + this.f42297b + ')';
    }
}
