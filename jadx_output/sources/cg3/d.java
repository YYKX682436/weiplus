package cg3;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent f41147a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f41148b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f41149c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f41150d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Matrix f41151e;

    /* renamed from: f, reason: collision with root package name */
    public mf3.k f41152f;

    public d(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent rawEvent, java.util.List rawDataList, java.util.List resultDataList, java.util.List resultPointList, android.graphics.Matrix contentMatrix, mf3.k kVar, int i17, kotlin.jvm.internal.i iVar) {
        int i18 = i17 & 2;
        kz5.p0 p0Var = kz5.p0.f313996d;
        rawDataList = i18 != 0 ? p0Var : rawDataList;
        resultDataList = (i17 & 4) != 0 ? p0Var : resultDataList;
        resultPointList = (i17 & 8) != 0 ? p0Var : resultPointList;
        kVar = (i17 & 32) != 0 ? null : kVar;
        kotlin.jvm.internal.o.g(rawEvent, "rawEvent");
        kotlin.jvm.internal.o.g(rawDataList, "rawDataList");
        kotlin.jvm.internal.o.g(resultDataList, "resultDataList");
        kotlin.jvm.internal.o.g(resultPointList, "resultPointList");
        kotlin.jvm.internal.o.g(contentMatrix, "contentMatrix");
        this.f41147a = rawEvent;
        this.f41148b = rawDataList;
        this.f41149c = resultDataList;
        this.f41150d = resultPointList;
        this.f41151e = contentMatrix;
        this.f41152f = kVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg3.d)) {
            return false;
        }
        cg3.d dVar = (cg3.d) obj;
        return kotlin.jvm.internal.o.b(this.f41147a, dVar.f41147a) && kotlin.jvm.internal.o.b(this.f41148b, dVar.f41148b) && kotlin.jvm.internal.o.b(this.f41149c, dVar.f41149c) && kotlin.jvm.internal.o.b(this.f41150d, dVar.f41150d) && kotlin.jvm.internal.o.b(this.f41151e, dVar.f41151e) && kotlin.jvm.internal.o.b(this.f41152f, dVar.f41152f);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f41147a.hashCode() * 31) + this.f41148b.hashCode()) * 31) + this.f41149c.hashCode()) * 31) + this.f41150d.hashCode()) * 31) + this.f41151e.hashCode()) * 31;
        mf3.k kVar = this.f41152f;
        return hashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public java.lang.String toString() {
        return "MediaScanResult(rawEvent=" + this.f41147a + ", rawDataList=" + this.f41148b + ", resultDataList=" + this.f41149c + ", resultPointList=" + this.f41150d + ", contentMatrix=" + this.f41151e + ", mediaInfo=" + this.f41152f + ')';
    }
}
