package ce5;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f40793a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f40794b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40795c;

    /* renamed from: d, reason: collision with root package name */
    public final long f40796d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f40797e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f40798f;

    public a(java.lang.String query, boolean z17, long j17, long j18, java.util.ArrayList picDataList, java.util.ArrayList ocrDataList) {
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(picDataList, "picDataList");
        kotlin.jvm.internal.o.g(ocrDataList, "ocrDataList");
        this.f40793a = query;
        this.f40794b = z17;
        this.f40795c = j17;
        this.f40796d = j18;
        this.f40797e = picDataList;
        this.f40798f = ocrDataList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce5.a)) {
            return false;
        }
        ce5.a aVar = (ce5.a) obj;
        return kotlin.jvm.internal.o.b(this.f40793a, aVar.f40793a) && this.f40794b == aVar.f40794b && this.f40795c == aVar.f40795c && this.f40796d == aVar.f40796d && kotlin.jvm.internal.o.b(this.f40797e, aVar.f40797e) && kotlin.jvm.internal.o.b(this.f40798f, aVar.f40798f);
    }

    public int hashCode() {
        return (((((((((this.f40793a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f40794b)) * 31) + java.lang.Long.hashCode(this.f40795c)) * 31) + java.lang.Long.hashCode(this.f40796d)) * 31) + this.f40797e.hashCode()) * 31) + this.f40798f.hashCode();
    }

    public java.lang.String toString() {
        return "LoadMoreDataBean(query=" + this.f40793a + ", isLastData=" + this.f40794b + ", firstTimeStamp=" + this.f40795c + ", lastTimeStamp=" + this.f40796d + ", picDataList=" + this.f40797e + ", ocrDataList=" + this.f40798f + ')';
    }
}
