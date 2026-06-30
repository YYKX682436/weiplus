package sj5;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f490443a;

    /* renamed from: b, reason: collision with root package name */
    public final float f490444b;

    /* renamed from: c, reason: collision with root package name */
    public final long f490445c;

    /* renamed from: d, reason: collision with root package name */
    public float f490446d;

    /* renamed from: e, reason: collision with root package name */
    public final float f490447e;

    public a(float f17, float f18, long j17, float f19, float f27) {
        this.f490443a = f17;
        this.f490444b = f18;
        this.f490445c = j17;
        this.f490446d = f19;
        this.f490447e = f27;
    }

    /* renamed from: equals */
    public boolean m164738xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj5.a)) {
            return false;
        }
        sj5.a aVar = (sj5.a) obj;
        return java.lang.Float.compare(this.f490443a, aVar.f490443a) == 0 && java.lang.Float.compare(this.f490444b, aVar.f490444b) == 0 && this.f490445c == aVar.f490445c && java.lang.Float.compare(this.f490446d, aVar.f490446d) == 0 && java.lang.Float.compare(this.f490447e, aVar.f490447e) == 0;
    }

    /* renamed from: hashCode */
    public int m164739x8cdac1b() {
        return (((((((java.lang.Float.hashCode(this.f490443a) * 31) + java.lang.Float.hashCode(this.f490444b)) * 31) + java.lang.Long.hashCode(this.f490445c)) * 31) + java.lang.Float.hashCode(this.f490446d)) * 31) + java.lang.Float.hashCode(this.f490447e);
    }

    /* renamed from: toString */
    public java.lang.String m164740x9616526c() {
        return "TouchSession(downRawY=" + this.f490443a + ", downPosition=" + this.f490444b + ", downUptimeMs=" + this.f490445c + ", maxMoveDistance=" + this.f490446d + ", grabOffsetY=" + this.f490447e + ')';
    }

    public /* synthetic */ a(float f17, float f18, long j17, float f19, float f27, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? 0.0f : f17, (i17 & 2) != 0 ? 0.0f : f18, (i17 & 4) != 0 ? 0L : j17, (i17 & 8) != 0 ? 0.0f : f19, (i17 & 16) != 0 ? 0.0f : f27);
    }
}
