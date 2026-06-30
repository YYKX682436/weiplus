package c6;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.o f38785a;

    /* renamed from: b, reason: collision with root package name */
    public final d6.h f38786b;

    /* renamed from: c, reason: collision with root package name */
    public final d6.g f38787c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f38788d;

    /* renamed from: e, reason: collision with root package name */
    public final g6.e f38789e;

    /* renamed from: f, reason: collision with root package name */
    public final d6.d f38790f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Bitmap.Config f38791g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f38792h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Boolean f38793i;

    /* renamed from: j, reason: collision with root package name */
    public final c6.b f38794j;

    /* renamed from: k, reason: collision with root package name */
    public final c6.b f38795k;

    /* renamed from: l, reason: collision with root package name */
    public final c6.b f38796l;

    public d(androidx.lifecycle.o oVar, d6.h hVar, d6.g gVar, kotlinx.coroutines.p0 p0Var, g6.e eVar, d6.d dVar, android.graphics.Bitmap.Config config, java.lang.Boolean bool, java.lang.Boolean bool2, c6.b bVar, c6.b bVar2, c6.b bVar3) {
        this.f38785a = oVar;
        this.f38786b = hVar;
        this.f38787c = gVar;
        this.f38788d = p0Var;
        this.f38789e = eVar;
        this.f38790f = dVar;
        this.f38791g = config;
        this.f38792h = bool;
        this.f38793i = bool2;
        this.f38794j = bVar;
        this.f38795k = bVar2;
        this.f38796l = bVar3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c6.d) {
            c6.d dVar = (c6.d) obj;
            if (kotlin.jvm.internal.o.b(this.f38785a, dVar.f38785a) && kotlin.jvm.internal.o.b(this.f38786b, dVar.f38786b) && this.f38787c == dVar.f38787c && kotlin.jvm.internal.o.b(this.f38788d, dVar.f38788d) && kotlin.jvm.internal.o.b(this.f38789e, dVar.f38789e) && this.f38790f == dVar.f38790f && this.f38791g == dVar.f38791g && kotlin.jvm.internal.o.b(this.f38792h, dVar.f38792h) && kotlin.jvm.internal.o.b(this.f38793i, dVar.f38793i) && this.f38794j == dVar.f38794j && this.f38795k == dVar.f38795k && this.f38796l == dVar.f38796l) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        androidx.lifecycle.o oVar = this.f38785a;
        int hashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        d6.h hVar = this.f38786b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        d6.g gVar = this.f38787c;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        kotlinx.coroutines.p0 p0Var = this.f38788d;
        int hashCode4 = (hashCode3 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        g6.e eVar = this.f38789e;
        int hashCode5 = (hashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d6.d dVar = this.f38790f;
        int hashCode6 = (hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        android.graphics.Bitmap.Config config = this.f38791g;
        int hashCode7 = (hashCode6 + (config == null ? 0 : config.hashCode())) * 31;
        java.lang.Boolean bool = this.f38792h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.f38793i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        c6.b bVar = this.f38794j;
        int hashCode10 = (hashCode9 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c6.b bVar2 = this.f38795k;
        int hashCode11 = (hashCode10 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        c6.b bVar3 = this.f38796l;
        return hashCode11 + (bVar3 != null ? bVar3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DefinedRequestOptions(lifecycle=" + this.f38785a + ", sizeResolver=" + this.f38786b + ", scale=" + this.f38787c + ", dispatcher=" + this.f38788d + ", transition=" + this.f38789e + ", precision=" + this.f38790f + ", bitmapConfig=" + this.f38791g + ", allowHardware=" + this.f38792h + ", allowRgb565=" + this.f38793i + ", memoryCachePolicy=" + this.f38794j + ", diskCachePolicy=" + this.f38795k + ", networkCachePolicy=" + this.f38796l + ')';
    }
}
