package p05;

/* loaded from: classes10.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f432249a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f432250b;

    /* renamed from: c, reason: collision with root package name */
    public final long f432251c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Float[] f432252d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Float[] f432253e;

    public w0(java.lang.String animationId, java.lang.String path, long j17, java.lang.Float[] startPos, java.lang.Float[] detectRegion, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        startPos = (i17 & 8) != 0 ? new java.lang.Float[]{java.lang.Float.valueOf(0.1f), java.lang.Float.valueOf(0.1f)} : startPos;
        detectRegion = (i17 & 16) != 0 ? new java.lang.Float[]{java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(1.0f)} : detectRegion;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationId, "animationId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startPos, "startPos");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectRegion, "detectRegion");
        this.f432249a = animationId;
        this.f432250b = path;
        this.f432251c = j17;
        this.f432252d = startPos;
        this.f432253e = detectRegion;
    }

    /* renamed from: equals */
    public boolean m157624xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p05.w0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.xlabeffect.IPkGiftEffect.EffectCommandData");
        p05.w0 w0Var = (p05.w0) obj;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432249a, w0Var.f432249a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432250b, w0Var.f432250b) && java.util.Arrays.equals(this.f432252d, w0Var.f432252d)) {
            return java.util.Arrays.equals(this.f432253e, w0Var.f432253e);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m157625x8cdac1b() {
        return (((((this.f432249a.hashCode() * 31) + this.f432250b.hashCode()) * 31) + java.util.Arrays.hashCode(this.f432252d)) * 31) + java.util.Arrays.hashCode(this.f432253e);
    }

    /* renamed from: toString */
    public java.lang.String m157626x9616526c() {
        return "EffectCommandData(animationId=" + this.f432249a + ", path=" + this.f432250b + ", giftCount=" + this.f432251c + ", startPos=" + java.util.Arrays.toString(this.f432252d) + ", detectRegion=" + java.util.Arrays.toString(this.f432253e) + ')';
    }
}
