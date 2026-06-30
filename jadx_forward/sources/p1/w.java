package p1;

/* loaded from: classes14.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f432442a;

    /* renamed from: b, reason: collision with root package name */
    public final long f432443b;

    /* renamed from: c, reason: collision with root package name */
    public final long f432444c;

    /* renamed from: d, reason: collision with root package name */
    public final long f432445d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f432446e;

    /* renamed from: f, reason: collision with root package name */
    public final int f432447f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f432448g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f432449h;

    /* renamed from: i, reason: collision with root package name */
    public final long f432450i;

    public w(long j17, long j18, long j19, long j27, boolean z17, int i17, boolean z18, java.util.List list, long j28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f432442a = j17;
        this.f432443b = j18;
        this.f432444c = j19;
        this.f432445d = j27;
        this.f432446e = z17;
        this.f432447f = i17;
        this.f432448g = z18;
        this.f432449h = list;
        this.f432450i = j28;
    }

    /* renamed from: equals */
    public boolean m157660xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1.w)) {
            return false;
        }
        p1.w wVar = (p1.w) obj;
        if (p1.r.a(this.f432442a, wVar.f432442a) && this.f432443b == wVar.f432443b && d1.e.a(this.f432444c, wVar.f432444c) && d1.e.a(this.f432445d, wVar.f432445d) && this.f432446e == wVar.f432446e) {
            return (this.f432447f == wVar.f432447f) && this.f432448g == wVar.f432448g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432449h, wVar.f432449h) && d1.e.a(this.f432450i, wVar.f432450i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m157661x8cdac1b() {
        int hashCode = ((java.lang.Long.hashCode(this.f432442a) * 31) + java.lang.Long.hashCode(this.f432443b)) * 31;
        int i17 = d1.e.f307159e;
        int hashCode2 = (((hashCode + java.lang.Long.hashCode(this.f432444c)) * 31) + java.lang.Long.hashCode(this.f432445d)) * 31;
        boolean z17 = this.f432446e;
        int i18 = z17;
        if (z17 != 0) {
            i18 = 1;
        }
        int hashCode3 = (((hashCode2 + i18) * 31) + java.lang.Integer.hashCode(this.f432447f)) * 31;
        boolean z18 = this.f432448g;
        return ((((hashCode3 + (z18 ? 1 : z18 ? 1 : 0)) * 31) + this.f432449h.hashCode()) * 31) + java.lang.Long.hashCode(this.f432450i);
    }

    /* renamed from: toString */
    public java.lang.String m157662x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PointerInputEventData(id=");
        sb6.append((java.lang.Object) p1.r.b(this.f432442a));
        sb6.append(", uptime=");
        sb6.append(this.f432443b);
        sb6.append(", positionOnScreen=");
        sb6.append((java.lang.Object) d1.e.h(this.f432444c));
        sb6.append(", position=");
        sb6.append((java.lang.Object) d1.e.h(this.f432445d));
        sb6.append(", down=");
        sb6.append(this.f432446e);
        sb6.append(", type=");
        int i17 = this.f432447f;
        sb6.append((java.lang.Object) (i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb6.append(", issuesEnterExit=");
        sb6.append(this.f432448g);
        sb6.append(", historical=");
        sb6.append(this.f432449h);
        sb6.append(", scrollDelta=");
        sb6.append((java.lang.Object) d1.e.h(this.f432450i));
        sb6.append(')');
        return sb6.toString();
    }
}
