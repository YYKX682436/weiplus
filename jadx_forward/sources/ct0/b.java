package ct0;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f303737a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f303738b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f303739c;

    /* renamed from: d, reason: collision with root package name */
    public int f303740d;

    /* renamed from: e, reason: collision with root package name */
    public int f303741e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f303742f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f303743g;

    /* renamed from: h, reason: collision with root package name */
    public int f303744h;

    /* renamed from: i, reason: collision with root package name */
    public int f303745i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f303746j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.ArrayList f303747k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f303748l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f303749m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Bundle f303750n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Rect f303751o;

    /* renamed from: p, reason: collision with root package name */
    public int f303752p;

    public b(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18, java.lang.String str3, java.lang.String str4, int i19, int i27, java.lang.String str5, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, boolean z18, android.os.Bundle bundle, android.graphics.Rect rect, int i28, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String sourceVideoPath = (i29 & 1) != 0 ? "" : str;
        java.lang.String sourceThumb = (i29 & 2) != 0 ? "" : str2;
        boolean z19 = (i29 & 4) != 0 ? false : z17;
        int i37 = (i29 & 8) != 0 ? 0 : i17;
        int i38 = (i29 & 16) != 0 ? 0 : i18;
        java.lang.String daemonVideoPath = (i29 & 32) != 0 ? "" : str3;
        java.lang.String daemonSourceThumb = (i29 & 64) != 0 ? "" : str4;
        int i39 = (i29 & 128) != 0 ? 0 : i19;
        int i47 = (i29 & 256) != 0 ? 0 : i27;
        java.lang.String photoPath = (i29 & 512) == 0 ? str5 : "";
        java.util.ArrayList photoList = (i29 & 1024) != 0 ? new java.util.ArrayList() : arrayList;
        java.util.ArrayList videoList = (i29 & 2048) != 0 ? new java.util.ArrayList() : arrayList2;
        boolean z27 = (i29 & 4096) != 0 ? false : z18;
        android.os.Bundle bundle2 = (i29 & 8192) != 0 ? null : bundle;
        android.graphics.Rect rect2 = (i29 & 16384) != 0 ? new android.graphics.Rect() : rect;
        int i48 = (i29 & 32768) != 0 ? 0 : i28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceVideoPath, "sourceVideoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceThumb, "sourceThumb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(daemonVideoPath, "daemonVideoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(daemonSourceThumb, "daemonSourceThumb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(photoPath, "photoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(photoList, "photoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoList, "videoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect2, "rect");
        this.f303737a = sourceVideoPath;
        this.f303738b = sourceThumb;
        this.f303739c = z19;
        this.f303740d = i37;
        this.f303741e = i38;
        this.f303742f = daemonVideoPath;
        this.f303743g = daemonSourceThumb;
        this.f303744h = i39;
        this.f303745i = i47;
        this.f303746j = photoPath;
        this.f303747k = photoList;
        this.f303748l = videoList;
        this.f303749m = z27;
        this.f303750n = bundle2;
        this.f303751o = rect2;
        this.f303752p = i48;
    }

    public final boolean a() {
        return !android.text.TextUtils.isEmpty(this.f303737a) && com.p314xaae8f345.mm.vfs.w6.j(this.f303737a);
    }

    public final boolean b() {
        return !android.text.TextUtils.isEmpty(this.f303742f) && com.p314xaae8f345.mm.vfs.w6.j(this.f303742f);
    }

    public final java.util.ArrayList c() {
        return this.f303747k;
    }

    public final java.lang.String d() {
        return a() ? this.f303737a : this.f303742f;
    }

    public final void e() {
        if (this.f303747k.size() == 0 && this.f303748l.size() == 1) {
            java.lang.String str = (java.lang.String) kz5.n0.X(this.f303748l);
            this.f303737a = str;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
            if (d17 != null) {
                this.f303741e = d17.f243915a;
            }
        }
    }

    /* renamed from: equals */
    public boolean m122690xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct0.b)) {
            return false;
        }
        ct0.b bVar = (ct0.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303737a, bVar.f303737a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303738b, bVar.f303738b) && this.f303739c == bVar.f303739c && this.f303740d == bVar.f303740d && this.f303741e == bVar.f303741e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303742f, bVar.f303742f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303743g, bVar.f303743g) && this.f303744h == bVar.f303744h && this.f303745i == bVar.f303745i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303746j, bVar.f303746j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303747k, bVar.f303747k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303748l, bVar.f303748l) && this.f303749m == bVar.f303749m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303750n, bVar.f303750n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303751o, bVar.f303751o) && this.f303752p == bVar.f303752p;
    }

    /* renamed from: hashCode */
    public int m122691x8cdac1b() {
        int hashCode = ((((((((((((((((((((((((this.f303737a.hashCode() * 31) + this.f303738b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f303739c)) * 31) + java.lang.Integer.hashCode(this.f303740d)) * 31) + java.lang.Integer.hashCode(this.f303741e)) * 31) + this.f303742f.hashCode()) * 31) + this.f303743g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f303744h)) * 31) + java.lang.Integer.hashCode(this.f303745i)) * 31) + this.f303746j.hashCode()) * 31) + this.f303747k.hashCode()) * 31) + this.f303748l.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f303749m)) * 31;
        android.os.Bundle bundle = this.f303750n;
        return ((((hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31) + this.f303751o.hashCode()) * 31) + java.lang.Integer.hashCode(this.f303752p);
    }

    /* renamed from: toString */
    public java.lang.String m122692x9616526c() {
        return "MediaCaptureInfo(sourceVideoPath=" + this.f303737a + ", sourceThumb=" + this.f303738b + ", isCaptureVideo=" + this.f303739c + ", startTime=" + this.f303740d + ", endTime=" + this.f303741e + ", daemonVideoPath=" + this.f303742f + ", daemonSourceThumb=" + this.f303743g + ", daemonStartTime=" + this.f303744h + ", daemonEndTime=" + this.f303745i + ", photoPath=" + this.f303746j + ", photoList=" + this.f303747k + ", videoList=" + this.f303748l + ", isLandscape=" + this.f303749m + ", extInfo=" + this.f303750n + ", rect=" + this.f303751o + ", backgroundColor=" + this.f303752p + ')';
    }
}
