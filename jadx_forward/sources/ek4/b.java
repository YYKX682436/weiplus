package ek4;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f335157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f335159c;

    /* renamed from: d, reason: collision with root package name */
    public final int f335160d;

    /* renamed from: e, reason: collision with root package name */
    public final long f335161e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f335162f;

    /* renamed from: g, reason: collision with root package name */
    public final int f335163g;

    public b(int i17, int i18, int i19, int i27, long j17, java.lang.String desc, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f335157a = i17;
        this.f335158b = i18;
        this.f335159c = i19;
        this.f335160d = i27;
        this.f335161e = j17;
        this.f335162f = desc;
        this.f335163g = i28;
    }

    public static ek4.b a(ek4.b bVar, int i17, int i18, int i19, int i27, long j17, java.lang.String str, int i28, int i29, java.lang.Object obj) {
        int i37 = (i29 & 1) != 0 ? bVar.f335157a : i17;
        int i38 = (i29 & 2) != 0 ? bVar.f335158b : i18;
        int i39 = (i29 & 4) != 0 ? bVar.f335159c : i19;
        int i47 = (i29 & 8) != 0 ? bVar.f335160d : i27;
        long j18 = (i29 & 16) != 0 ? bVar.f335161e : j17;
        java.lang.String desc = (i29 & 32) != 0 ? bVar.f335162f : str;
        int i48 = (i29 & 64) != 0 ? bVar.f335163g : i28;
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        return new ek4.b(i37, i38, i39, i47, j18, desc, i48);
    }

    /* renamed from: equals */
    public boolean m127799xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek4.b)) {
            return false;
        }
        ek4.b bVar = (ek4.b) obj;
        return this.f335157a == bVar.f335157a && this.f335158b == bVar.f335158b && this.f335159c == bVar.f335159c && this.f335160d == bVar.f335160d && this.f335161e == bVar.f335161e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f335162f, bVar.f335162f) && this.f335163g == bVar.f335163g;
    }

    /* renamed from: hashCode */
    public int m127800x8cdac1b() {
        return (((((((((((java.lang.Integer.hashCode(this.f335157a) * 31) + java.lang.Integer.hashCode(this.f335158b)) * 31) + java.lang.Integer.hashCode(this.f335159c)) * 31) + java.lang.Integer.hashCode(this.f335160d)) * 31) + java.lang.Long.hashCode(this.f335161e)) * 31) + this.f335162f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f335163g);
    }

    /* renamed from: toString */
    public java.lang.String m127801x9616526c() {
        return "CdnTaskContext(actionType=" + this.f335157a + ", downloadType=" + this.f335158b + ", commentScene=" + this.f335159c + ", downloadStrategy=" + this.f335160d + ", durationMs=" + this.f335161e + ", desc=" + this.f335162f + ", preloadStage=" + this.f335163g + ')';
    }

    public /* synthetic */ b(int i17, int i18, int i19, int i27, long j17, java.lang.String str, int i28, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, i19, i27, (i29 & 16) != 0 ? 0L : j17, (i29 & 32) != 0 ? "" : str, (i29 & 64) != 0 ? 0 : i28);
    }

    public b() {
        this(-1, -1, -1, -1, -1L, "", 0, 64, null);
    }
}
