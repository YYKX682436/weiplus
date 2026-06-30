package sm3;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f491375d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f491376e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f491377f;

    /* renamed from: a, reason: collision with root package name */
    public int f491378a = 2;

    /* renamed from: b, reason: collision with root package name */
    public long f491379b = ((java.lang.Number) f491375d.get(2)).longValue();

    /* renamed from: c, reason: collision with root package name */
    public float f491380c = 1.0f;

    static {
        new sm3.c(null);
        f491375d = kz5.c0.i(1000L, 2000L, 3000L, 5000L, java.lang.Long.valueOf(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d), 15000L, 30000L);
        f491376e = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40);
        f491377f = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 80);
    }

    public final void a(long j17) {
        float f17;
        float f18;
        int i17 = j17 < u04.d.f505010c ? 2 : 3;
        this.f491378a = i17;
        this.f491379b = ((java.lang.Number) f491375d.get(i17)).longValue();
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
        if (j17 < u04.d.f505010c) {
            f17 = b17;
            f18 = 2.0f;
        } else if (j17 < 240000) {
            f17 = b17;
            f18 = 1.5f;
        } else {
            f17 = b17;
            f18 = 1.0f;
        }
        this.f491380c = (f17 * f18) / 1000;
    }
}
