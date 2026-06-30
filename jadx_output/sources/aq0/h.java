package aq0;

/* loaded from: classes5.dex */
public final class h extends wp0.a {

    /* renamed from: i, reason: collision with root package name */
    public static final aq0.h f13016i = new aq0.h("", 0, new android.graphics.RectF(), aq0.e.f13012d, "", "", true, 0);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f13017a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13018b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f13019c;

    /* renamed from: d, reason: collision with root package name */
    public final aq0.e f13020d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f13021e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f13022f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13023g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13024h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String id6, long j17, android.graphics.RectF frame, aq0.e fireworkType, java.lang.String fireworkText, java.lang.String fireworkEmojiKey, boolean z17, int i17) {
        super(id6, frame, j17);
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(frame, "frame");
        kotlin.jvm.internal.o.g(fireworkType, "fireworkType");
        kotlin.jvm.internal.o.g(fireworkText, "fireworkText");
        kotlin.jvm.internal.o.g(fireworkEmojiKey, "fireworkEmojiKey");
        this.f13017a = id6;
        this.f13018b = j17;
        this.f13019c = frame;
        this.f13020d = fireworkType;
        this.f13021e = fireworkText;
        this.f13022f = fireworkEmojiKey;
        this.f13023g = z17;
        this.f13024h = i17;
    }

    public final java.util.HashMap a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_ID, this.f13017a);
        hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.f13018b));
        hashMap.put("fireworkType", java.lang.Integer.valueOf(this.f13020d.ordinal()));
        hashMap.put("fireworkText", this.f13021e);
        hashMap.put("fireworkEmojiKey", this.f13022f);
        hashMap.put("hasFireworkTail", java.lang.Boolean.valueOf(this.f13023g));
        hashMap.put("randomSeed", java.lang.Integer.valueOf(this.f13024h));
        hashMap.put("frame", cq0.a.f221325a.b(this.f13019c));
        return hashMap;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq0.h)) {
            return false;
        }
        aq0.h hVar = (aq0.h) obj;
        return kotlin.jvm.internal.o.b(this.f13017a, hVar.f13017a) && this.f13018b == hVar.f13018b && kotlin.jvm.internal.o.b(this.f13019c, hVar.f13019c) && this.f13020d == hVar.f13020d && kotlin.jvm.internal.o.b(this.f13021e, hVar.f13021e) && kotlin.jvm.internal.o.b(this.f13022f, hVar.f13022f) && this.f13023g == hVar.f13023g && this.f13024h == hVar.f13024h;
    }

    public int hashCode() {
        return (((((((((((((this.f13017a.hashCode() * 31) + java.lang.Long.hashCode(this.f13018b)) * 31) + this.f13019c.hashCode()) * 31) + this.f13020d.hashCode()) * 31) + this.f13021e.hashCode()) * 31) + this.f13022f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f13023g)) * 31) + java.lang.Integer.hashCode(this.f13024h);
    }

    public java.lang.String toString() {
        return "MagicFireworkInfo(id=" + this.f13017a + ", timestamp=" + this.f13018b + ", frame=" + this.f13019c + ", fireworkType=" + this.f13020d + ", fireworkText=" + this.f13021e + ", fireworkEmojiKey=" + this.f13022f + ", hasFireworkTrail=" + this.f13023g + ", randomSeed=" + this.f13024h + ')';
    }
}
