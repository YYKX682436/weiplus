package cg3;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 f122680a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f122681b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f122682c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f122683d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Matrix f122684e;

    /* renamed from: f, reason: collision with root package name */
    public mf3.k f122685f;

    public d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 rawEvent, java.util.List rawDataList, java.util.List resultDataList, java.util.List resultPointList, android.graphics.Matrix contentMatrix, mf3.k kVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i18 = i17 & 2;
        kz5.p0 p0Var = kz5.p0.f395529d;
        rawDataList = i18 != 0 ? p0Var : rawDataList;
        resultDataList = (i17 & 4) != 0 ? p0Var : resultDataList;
        resultPointList = (i17 & 8) != 0 ? p0Var : resultPointList;
        kVar = (i17 & 32) != 0 ? null : kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawEvent, "rawEvent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawDataList, "rawDataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultDataList, "resultDataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultPointList, "resultPointList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentMatrix, "contentMatrix");
        this.f122680a = rawEvent;
        this.f122681b = rawDataList;
        this.f122682c = resultDataList;
        this.f122683d = resultPointList;
        this.f122684e = contentMatrix;
        this.f122685f = kVar;
    }

    /* renamed from: equals */
    public boolean m14795xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg3.d)) {
            return false;
        }
        cg3.d dVar = (cg3.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122680a, dVar.f122680a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122681b, dVar.f122681b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122682c, dVar.f122682c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122683d, dVar.f122683d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122684e, dVar.f122684e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122685f, dVar.f122685f);
    }

    /* renamed from: hashCode */
    public int m14796x8cdac1b() {
        int hashCode = ((((((((this.f122680a.hashCode() * 31) + this.f122681b.hashCode()) * 31) + this.f122682c.hashCode()) * 31) + this.f122683d.hashCode()) * 31) + this.f122684e.hashCode()) * 31;
        mf3.k kVar = this.f122685f;
        return hashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m14797x9616526c() {
        return "MediaScanResult(rawEvent=" + this.f122680a + ", rawDataList=" + this.f122681b + ", resultDataList=" + this.f122682c + ", resultPointList=" + this.f122683d + ", contentMatrix=" + this.f122684e + ", mediaInfo=" + this.f122685f + ')';
    }
}
