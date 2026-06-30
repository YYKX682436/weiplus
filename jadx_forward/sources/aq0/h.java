package aq0;

/* loaded from: classes5.dex */
public final class h extends wp0.a {

    /* renamed from: i, reason: collision with root package name */
    public static final aq0.h f94549i = new aq0.h("", 0, new android.graphics.RectF(), aq0.e.f94545d, "", "", true, 0);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94550a;

    /* renamed from: b, reason: collision with root package name */
    public final long f94551b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f94552c;

    /* renamed from: d, reason: collision with root package name */
    public final aq0.e f94553d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f94554e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f94555f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f94556g;

    /* renamed from: h, reason: collision with root package name */
    public final int f94557h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String id6, long j17, android.graphics.RectF frame, aq0.e fireworkType, java.lang.String fireworkText, java.lang.String fireworkEmojiKey, boolean z17, int i17) {
        super(id6, frame, j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frame, "frame");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fireworkType, "fireworkType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fireworkText, "fireworkText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fireworkEmojiKey, "fireworkEmojiKey");
        this.f94550a = id6;
        this.f94551b = j17;
        this.f94552c = frame;
        this.f94553d = fireworkType;
        this.f94554e = fireworkText;
        this.f94555f = fireworkEmojiKey;
        this.f94556g = z17;
        this.f94557h = i17;
    }

    public final java.util.HashMap a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.f66865x76d1ec5a, this.f94550a);
        hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f94551b));
        hashMap.put("fireworkType", java.lang.Integer.valueOf(this.f94553d.ordinal()));
        hashMap.put("fireworkText", this.f94554e);
        hashMap.put("fireworkEmojiKey", this.f94555f);
        hashMap.put("hasFireworkTail", java.lang.Boolean.valueOf(this.f94556g));
        hashMap.put("randomSeed", java.lang.Integer.valueOf(this.f94557h));
        hashMap.put("frame", cq0.a.f302858a.b(this.f94552c));
        return hashMap;
    }

    /* renamed from: equals */
    public boolean m8821xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq0.h)) {
            return false;
        }
        aq0.h hVar = (aq0.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94550a, hVar.f94550a) && this.f94551b == hVar.f94551b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94552c, hVar.f94552c) && this.f94553d == hVar.f94553d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94554e, hVar.f94554e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94555f, hVar.f94555f) && this.f94556g == hVar.f94556g && this.f94557h == hVar.f94557h;
    }

    /* renamed from: hashCode */
    public int m8822x8cdac1b() {
        return (((((((((((((this.f94550a.hashCode() * 31) + java.lang.Long.hashCode(this.f94551b)) * 31) + this.f94552c.hashCode()) * 31) + this.f94553d.hashCode()) * 31) + this.f94554e.hashCode()) * 31) + this.f94555f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f94556g)) * 31) + java.lang.Integer.hashCode(this.f94557h);
    }

    /* renamed from: toString */
    public java.lang.String m8823x9616526c() {
        return "MagicFireworkInfo(id=" + this.f94550a + ", timestamp=" + this.f94551b + ", frame=" + this.f94552c + ", fireworkType=" + this.f94553d + ", fireworkText=" + this.f94554e + ", fireworkEmojiKey=" + this.f94555f + ", hasFireworkTrail=" + this.f94556g + ", randomSeed=" + this.f94557h + ')';
    }
}
