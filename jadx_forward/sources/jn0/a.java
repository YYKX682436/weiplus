package jn0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f382008a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f382009b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f382010c;

    /* renamed from: d, reason: collision with root package name */
    public final int f382011d;

    /* renamed from: e, reason: collision with root package name */
    public final int f382012e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f382013f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f382014g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c f382015h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f382016i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Bitmap f382017j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f382018k;

    public a(android.content.Context context, boolean z17, boolean z18, int i17, int i18, android.graphics.Bitmap bitmap, boolean z19, com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c, boolean z27, android.graphics.Bitmap bitmap2, boolean z28, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        boolean z29 = (i19 & 2) != 0 ? true : z17;
        boolean z37 = (i19 & 4) != 0 ? true : z18;
        int i27 = (i19 & 8) != 0 ? 2 : i17;
        int i28 = (i19 & 16) != 0 ? 12 : i18;
        android.graphics.Bitmap bitmap3 = (i19 & 32) != 0 ? null : bitmap;
        boolean z38 = (i19 & 64) != 0 ? false : z19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c2 = (i19 & 128) != 0 ? null : c16524xfd73a13c;
        boolean z39 = (i19 & 256) == 0 ? z27 : false;
        android.graphics.Bitmap bitmap4 = (i19 & 512) == 0 ? bitmap2 : null;
        boolean z47 = (i19 & 1024) == 0 ? z28 : true;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f382008a = context;
        this.f382009b = z29;
        this.f382010c = z37;
        this.f382011d = i27;
        this.f382012e = i28;
        this.f382013f = bitmap3;
        this.f382014g = z38;
        this.f382015h = c16524xfd73a13c2;
        this.f382016i = z39;
        this.f382017j = bitmap4;
        this.f382018k = z47;
    }

    /* renamed from: equals */
    public boolean m141152xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn0.a)) {
            return false;
        }
        jn0.a aVar = (jn0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382008a, aVar.f382008a) && this.f382009b == aVar.f382009b && this.f382010c == aVar.f382010c && this.f382011d == aVar.f382011d && this.f382012e == aVar.f382012e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382013f, aVar.f382013f) && this.f382014g == aVar.f382014g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382015h, aVar.f382015h) && this.f382016i == aVar.f382016i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382017j, aVar.f382017j) && this.f382018k == aVar.f382018k;
    }

    /* renamed from: hashCode */
    public int m141153x8cdac1b() {
        int hashCode = ((((((((this.f382008a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f382009b)) * 31) + java.lang.Boolean.hashCode(this.f382010c)) * 31) + java.lang.Integer.hashCode(this.f382011d)) * 31) + java.lang.Integer.hashCode(this.f382012e)) * 31;
        android.graphics.Bitmap bitmap = this.f382013f;
        int hashCode2 = (((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f382014g)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c c16524xfd73a13c = this.f382015h;
        int hashCode3 = (((hashCode2 + (c16524xfd73a13c == null ? 0 : c16524xfd73a13c.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f382016i)) * 31;
        android.graphics.Bitmap bitmap2 = this.f382017j;
        return ((hashCode3 + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f382018k);
    }

    /* renamed from: toString */
    public java.lang.String m141154x9616526c() {
        return "FloatModeDataParams(context=" + this.f382008a + ", forceMoveTask=" + this.f382009b + ", dontFinish=" + this.f382010c + ", generateType=" + this.f382011d + ", opType=" + this.f382012e + ", muteVideoImage=" + this.f382013f + ", isFluentFloatShow=" + this.f382014g + ", adVideoView=" + this.f382015h + ", isAnchorLandscapeMode=" + this.f382016i + ", floatAnimBitmap=" + this.f382017j + ", updateDrawSize=" + this.f382018k + ')';
    }
}
