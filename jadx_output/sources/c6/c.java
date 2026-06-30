package c6;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: m, reason: collision with root package name */
    public static final c6.c f38772m;

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f38773a;

    /* renamed from: b, reason: collision with root package name */
    public final g6.e f38774b;

    /* renamed from: c, reason: collision with root package name */
    public final d6.d f38775c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap.Config f38776d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38777e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38778f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f38779g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f38780h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f38781i;

    /* renamed from: j, reason: collision with root package name */
    public final c6.b f38782j;

    /* renamed from: k, reason: collision with root package name */
    public final c6.b f38783k;

    /* renamed from: l, reason: collision with root package name */
    public final c6.b f38784l;

    static {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        int i17 = g6.e.f269032a;
        g6.d dVar = g6.d.f269031b;
        d6.d dVar2 = d6.d.AUTOMATIC;
        android.graphics.Bitmap.Config config = android.os.Build.VERSION.SDK_INT >= 26 ? android.graphics.Bitmap.Config.HARDWARE : android.graphics.Bitmap.Config.ARGB_8888;
        c6.b bVar = c6.b.ENABLED;
        f38772m = new c6.c(p0Var, dVar, dVar2, config, true, false, null, null, null, bVar, bVar, bVar);
    }

    public c(kotlinx.coroutines.p0 dispatcher, g6.e transition, d6.d precision, android.graphics.Bitmap.Config bitmapConfig, boolean z17, boolean z18, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, c6.b memoryCachePolicy, c6.b diskCachePolicy, c6.b networkCachePolicy) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(transition, "transition");
        kotlin.jvm.internal.o.g(precision, "precision");
        kotlin.jvm.internal.o.g(bitmapConfig, "bitmapConfig");
        kotlin.jvm.internal.o.g(memoryCachePolicy, "memoryCachePolicy");
        kotlin.jvm.internal.o.g(diskCachePolicy, "diskCachePolicy");
        kotlin.jvm.internal.o.g(networkCachePolicy, "networkCachePolicy");
        this.f38773a = dispatcher;
        this.f38774b = transition;
        this.f38775c = precision;
        this.f38776d = bitmapConfig;
        this.f38777e = z17;
        this.f38778f = z18;
        this.f38779g = drawable;
        this.f38780h = drawable2;
        this.f38781i = drawable3;
        this.f38782j = memoryCachePolicy;
        this.f38783k = diskCachePolicy;
        this.f38784l = networkCachePolicy;
    }

    public static c6.c a(c6.c cVar, kotlinx.coroutines.p0 p0Var, g6.e eVar, d6.d dVar, android.graphics.Bitmap.Config config, boolean z17, boolean z18, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, c6.b bVar, c6.b bVar2, c6.b bVar3, int i17, java.lang.Object obj) {
        kotlinx.coroutines.p0 dispatcher = (i17 & 1) != 0 ? cVar.f38773a : p0Var;
        g6.e transition = (i17 & 2) != 0 ? cVar.f38774b : eVar;
        d6.d precision = (i17 & 4) != 0 ? cVar.f38775c : dVar;
        android.graphics.Bitmap.Config bitmapConfig = (i17 & 8) != 0 ? cVar.f38776d : config;
        boolean z19 = (i17 & 16) != 0 ? cVar.f38777e : z17;
        boolean z27 = (i17 & 32) != 0 ? cVar.f38778f : z18;
        android.graphics.drawable.Drawable drawable4 = (i17 & 64) != 0 ? cVar.f38779g : drawable;
        android.graphics.drawable.Drawable drawable5 = (i17 & 128) != 0 ? cVar.f38780h : drawable2;
        android.graphics.drawable.Drawable drawable6 = (i17 & 256) != 0 ? cVar.f38781i : drawable3;
        c6.b memoryCachePolicy = (i17 & 512) != 0 ? cVar.f38782j : bVar;
        c6.b diskCachePolicy = (i17 & 1024) != 0 ? cVar.f38783k : bVar2;
        c6.b networkCachePolicy = (i17 & 2048) != 0 ? cVar.f38784l : bVar3;
        cVar.getClass();
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(transition, "transition");
        kotlin.jvm.internal.o.g(precision, "precision");
        kotlin.jvm.internal.o.g(bitmapConfig, "bitmapConfig");
        kotlin.jvm.internal.o.g(memoryCachePolicy, "memoryCachePolicy");
        kotlin.jvm.internal.o.g(diskCachePolicy, "diskCachePolicy");
        kotlin.jvm.internal.o.g(networkCachePolicy, "networkCachePolicy");
        return new c6.c(dispatcher, transition, precision, bitmapConfig, z19, z27, drawable4, drawable5, drawable6, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c6.c) {
            c6.c cVar = (c6.c) obj;
            if (kotlin.jvm.internal.o.b(this.f38773a, cVar.f38773a) && kotlin.jvm.internal.o.b(this.f38774b, cVar.f38774b) && this.f38775c == cVar.f38775c && this.f38776d == cVar.f38776d && this.f38777e == cVar.f38777e && this.f38778f == cVar.f38778f && kotlin.jvm.internal.o.b(this.f38779g, cVar.f38779g) && kotlin.jvm.internal.o.b(this.f38780h, cVar.f38780h) && kotlin.jvm.internal.o.b(this.f38781i, cVar.f38781i) && this.f38782j == cVar.f38782j && this.f38783k == cVar.f38783k && this.f38784l == cVar.f38784l) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f38773a.hashCode() * 31) + this.f38774b.hashCode()) * 31) + this.f38775c.hashCode()) * 31) + this.f38776d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f38777e)) * 31) + java.lang.Boolean.hashCode(this.f38778f)) * 31;
        android.graphics.drawable.Drawable drawable = this.f38779g;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        android.graphics.drawable.Drawable drawable2 = this.f38780h;
        int hashCode3 = (hashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        android.graphics.drawable.Drawable drawable3 = this.f38781i;
        return ((((((hashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f38782j.hashCode()) * 31) + this.f38783k.hashCode()) * 31) + this.f38784l.hashCode();
    }

    public java.lang.String toString() {
        return "DefaultRequestOptions(dispatcher=" + this.f38773a + ", transition=" + this.f38774b + ", precision=" + this.f38775c + ", bitmapConfig=" + this.f38776d + ", allowHardware=" + this.f38777e + ", allowRgb565=" + this.f38778f + ", placeholder=" + this.f38779g + ", error=" + this.f38780h + ", fallback=" + this.f38781i + ", memoryCachePolicy=" + this.f38782j + ", diskCachePolicy=" + this.f38783k + ", networkCachePolicy=" + this.f38784l + ')';
    }
}
