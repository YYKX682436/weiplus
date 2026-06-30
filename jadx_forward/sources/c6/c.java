package c6;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: m, reason: collision with root package name */
    public static final c6.c f120305m;

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f120306a;

    /* renamed from: b, reason: collision with root package name */
    public final g6.e f120307b;

    /* renamed from: c, reason: collision with root package name */
    public final d6.d f120308c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap.Config f120309d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f120310e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f120311f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f120312g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f120313h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f120314i;

    /* renamed from: j, reason: collision with root package name */
    public final c6.b f120315j;

    /* renamed from: k, reason: collision with root package name */
    public final c6.b f120316k;

    /* renamed from: l, reason: collision with root package name */
    public final c6.b f120317l;

    static {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
        int i17 = g6.e.f350565a;
        g6.d dVar = g6.d.f350564b;
        d6.d dVar2 = d6.d.AUTOMATIC;
        android.graphics.Bitmap.Config config = android.os.Build.VERSION.SDK_INT >= 26 ? android.graphics.Bitmap.Config.HARDWARE : android.graphics.Bitmap.Config.ARGB_8888;
        c6.b bVar = c6.b.ENABLED;
        f120305m = new c6.c(p0Var, dVar, dVar2, config, true, false, null, null, null, bVar, bVar, bVar);
    }

    public c(p3325xe03a0797.p3326xc267989b.p0 dispatcher, g6.e transition, d6.d precision, android.graphics.Bitmap.Config bitmapConfig, boolean z17, boolean z18, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, c6.b memoryCachePolicy, c6.b diskCachePolicy, c6.b networkCachePolicy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(precision, "precision");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmapConfig, "bitmapConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memoryCachePolicy, "memoryCachePolicy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(diskCachePolicy, "diskCachePolicy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(networkCachePolicy, "networkCachePolicy");
        this.f120306a = dispatcher;
        this.f120307b = transition;
        this.f120308c = precision;
        this.f120309d = bitmapConfig;
        this.f120310e = z17;
        this.f120311f = z18;
        this.f120312g = drawable;
        this.f120313h = drawable2;
        this.f120314i = drawable3;
        this.f120315j = memoryCachePolicy;
        this.f120316k = diskCachePolicy;
        this.f120317l = networkCachePolicy;
    }

    public static c6.c a(c6.c cVar, p3325xe03a0797.p3326xc267989b.p0 p0Var, g6.e eVar, d6.d dVar, android.graphics.Bitmap.Config config, boolean z17, boolean z18, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, c6.b bVar, c6.b bVar2, c6.b bVar3, int i17, java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p0 dispatcher = (i17 & 1) != 0 ? cVar.f120306a : p0Var;
        g6.e transition = (i17 & 2) != 0 ? cVar.f120307b : eVar;
        d6.d precision = (i17 & 4) != 0 ? cVar.f120308c : dVar;
        android.graphics.Bitmap.Config bitmapConfig = (i17 & 8) != 0 ? cVar.f120309d : config;
        boolean z19 = (i17 & 16) != 0 ? cVar.f120310e : z17;
        boolean z27 = (i17 & 32) != 0 ? cVar.f120311f : z18;
        android.graphics.drawable.Drawable drawable4 = (i17 & 64) != 0 ? cVar.f120312g : drawable;
        android.graphics.drawable.Drawable drawable5 = (i17 & 128) != 0 ? cVar.f120313h : drawable2;
        android.graphics.drawable.Drawable drawable6 = (i17 & 256) != 0 ? cVar.f120314i : drawable3;
        c6.b memoryCachePolicy = (i17 & 512) != 0 ? cVar.f120315j : bVar;
        c6.b diskCachePolicy = (i17 & 1024) != 0 ? cVar.f120316k : bVar2;
        c6.b networkCachePolicy = (i17 & 2048) != 0 ? cVar.f120317l : bVar3;
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transition, "transition");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(precision, "precision");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmapConfig, "bitmapConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memoryCachePolicy, "memoryCachePolicy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(diskCachePolicy, "diskCachePolicy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(networkCachePolicy, "networkCachePolicy");
        return new c6.c(dispatcher, transition, precision, bitmapConfig, z19, z27, drawable4, drawable5, drawable6, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
    }

    /* renamed from: equals */
    public boolean m14196xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c6.c) {
            c6.c cVar = (c6.c) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120306a, cVar.f120306a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120307b, cVar.f120307b) && this.f120308c == cVar.f120308c && this.f120309d == cVar.f120309d && this.f120310e == cVar.f120310e && this.f120311f == cVar.f120311f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120312g, cVar.f120312g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120313h, cVar.f120313h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120314i, cVar.f120314i) && this.f120315j == cVar.f120315j && this.f120316k == cVar.f120316k && this.f120317l == cVar.f120317l) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m14197x8cdac1b() {
        int hashCode = ((((((((((this.f120306a.hashCode() * 31) + this.f120307b.hashCode()) * 31) + this.f120308c.hashCode()) * 31) + this.f120309d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f120310e)) * 31) + java.lang.Boolean.hashCode(this.f120311f)) * 31;
        android.graphics.drawable.Drawable drawable = this.f120312g;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        android.graphics.drawable.Drawable drawable2 = this.f120313h;
        int hashCode3 = (hashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        android.graphics.drawable.Drawable drawable3 = this.f120314i;
        return ((((((hashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f120315j.hashCode()) * 31) + this.f120316k.hashCode()) * 31) + this.f120317l.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m14198x9616526c() {
        return "DefaultRequestOptions(dispatcher=" + this.f120306a + ", transition=" + this.f120307b + ", precision=" + this.f120308c + ", bitmapConfig=" + this.f120309d + ", allowHardware=" + this.f120310e + ", allowRgb565=" + this.f120311f + ", placeholder=" + this.f120312g + ", error=" + this.f120313h + ", fallback=" + this.f120314i + ", memoryCachePolicy=" + this.f120315j + ", diskCachePolicy=" + this.f120316k + ", networkCachePolicy=" + this.f120317l + ')';
    }
}
