package sf3;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f488926a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.BitmapFactory.Options f488927b;

    /* renamed from: c, reason: collision with root package name */
    public final sf3.g f488928c;

    public i(android.graphics.Bitmap bitmap, android.graphics.BitmapFactory.Options options, sf3.g gVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        options = (i17 & 2) != 0 ? null : options;
        gVar = (i17 & 4) != 0 ? null : gVar;
        this.f488926a = bitmap;
        this.f488927b = options;
        this.f488928c = gVar;
    }

    /* renamed from: equals */
    public boolean m164398xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf3.i)) {
            return false;
        }
        sf3.i iVar = (sf3.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488926a, iVar.f488926a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488927b, iVar.f488927b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488928c, iVar.f488928c);
    }

    /* renamed from: hashCode */
    public int m164399x8cdac1b() {
        android.graphics.Bitmap bitmap = this.f488926a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        android.graphics.BitmapFactory.Options options = this.f488927b;
        int hashCode2 = (hashCode + (options == null ? 0 : options.hashCode())) * 31;
        sf3.g gVar = this.f488928c;
        return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m164400x9616526c() {
        return "ImageParserResult(bitmap=" + this.f488926a + ", options=" + this.f488927b + ", param=" + this.f488928c + ')';
    }
}
