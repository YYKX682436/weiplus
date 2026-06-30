package mi1;

/* loaded from: classes7.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f408118a;

    /* renamed from: b, reason: collision with root package name */
    public int f408119b;

    /* renamed from: c, reason: collision with root package name */
    public final int f408120c;

    /* renamed from: d, reason: collision with root package name */
    public final long f408121d;

    /* renamed from: e, reason: collision with root package name */
    public final int f408122e;

    /* renamed from: f, reason: collision with root package name */
    public long f408123f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f408124g;

    /* renamed from: h, reason: collision with root package name */
    public int f408125h;

    /* renamed from: i, reason: collision with root package name */
    public final long f408126i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f408127j;

    public j0(int i17, int i18, int i19, long j17, int i27, long j18, java.lang.Object obj, int i28, long j19, yz5.a aVar, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i37;
        int i38 = (i29 & 1) != 0 ? 0 : i17;
        int i39 = (i29 & 2) != 0 ? Integer.MIN_VALUE : i18;
        int i47 = (i29 & 4) != 0 ? 0 : i19;
        long j27 = (i29 & 8) != 0 ? 0L : j17;
        if ((i29 & 16) != 0) {
            mi1.z0 z0Var = mi1.z0.f408272e;
            i37 = 1;
        } else {
            i37 = i27;
        }
        long j28 = (i29 & 32) != 0 ? 0L : j18;
        java.lang.Object obj2 = (i29 & 64) != 0 ? null : obj;
        int i48 = (i29 & 128) == 0 ? i28 : 0;
        long j29 = (i29 & 256) == 0 ? j19 : 0L;
        yz5.a aVar2 = (i29 & 512) == 0 ? aVar : null;
        this.f408118a = i38;
        this.f408119b = i39;
        this.f408120c = i47;
        this.f408121d = j27;
        this.f408122e = i37;
        this.f408123f = j28;
        this.f408124g = obj2;
        this.f408125h = i48;
        this.f408126i = j29;
        this.f408127j = aVar2;
    }

    /* renamed from: equals */
    public boolean m147355xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi1.j0)) {
            return false;
        }
        mi1.j0 j0Var = (mi1.j0) obj;
        return this.f408118a == j0Var.f408118a && this.f408119b == j0Var.f408119b && this.f408120c == j0Var.f408120c && this.f408121d == j0Var.f408121d && this.f408122e == j0Var.f408122e && this.f408123f == j0Var.f408123f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408124g, j0Var.f408124g) && this.f408125h == j0Var.f408125h && this.f408126i == j0Var.f408126i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408127j, j0Var.f408127j);
    }

    /* renamed from: hashCode */
    public int m147356x8cdac1b() {
        int hashCode = ((((((((((java.lang.Integer.hashCode(this.f408118a) * 31) + java.lang.Integer.hashCode(this.f408119b)) * 31) + java.lang.Integer.hashCode(this.f408120c)) * 31) + java.lang.Long.hashCode(this.f408121d)) * 31) + java.lang.Integer.hashCode(this.f408122e)) * 31) + java.lang.Long.hashCode(this.f408123f)) * 31;
        java.lang.Object obj = this.f408124g;
        int hashCode2 = (((((hashCode + (obj == null ? 0 : obj.hashCode())) * 31) + java.lang.Integer.hashCode(this.f408125h)) * 31) + java.lang.Long.hashCode(this.f408126i)) * 31;
        yz5.a aVar = this.f408127j;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m147357x9616526c() {
        return "CapsuleAnimatorEvent(eventType=" + this.f408118a + ", targetState=" + this.f408119b + ", priority=" + this.f408120c + ", pendingTime=" + this.f408121d + ", type=" + this.f408122e + ", enqueueTime=" + this.f408123f + ", data=" + this.f408124g + ", dispatchState=" + this.f408125h + ", showTime=" + this.f408126i + ", onFirstExecute=" + this.f408127j + ')';
    }
}
