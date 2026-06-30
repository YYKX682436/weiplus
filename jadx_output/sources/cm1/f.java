package cm1;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f43282a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f43283b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f43284c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f43285d;

    /* renamed from: e, reason: collision with root package name */
    public final int f43286e;

    /* renamed from: f, reason: collision with root package name */
    public final long f43287f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f43288g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f43289h;

    /* renamed from: i, reason: collision with root package name */
    public final int f43290i;

    /* renamed from: j, reason: collision with root package name */
    public final long f43291j;

    /* renamed from: k, reason: collision with root package name */
    public final int f43292k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f43293l;

    /* renamed from: m, reason: collision with root package name */
    public final int f43294m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f43295n;

    public f(java.lang.String AppId, java.lang.String roomId, java.lang.String enterPath, java.lang.String enterPathAutoAccept, int i17, long j17, java.lang.String name, java.lang.String roomType, int i18, long j18, int i19, java.lang.String str, int i27, java.lang.String str2) {
        kotlin.jvm.internal.o.g(AppId, "AppId");
        kotlin.jvm.internal.o.g(roomId, "roomId");
        kotlin.jvm.internal.o.g(enterPath, "enterPath");
        kotlin.jvm.internal.o.g(enterPathAutoAccept, "enterPathAutoAccept");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(roomType, "roomType");
        this.f43282a = AppId;
        this.f43283b = roomId;
        this.f43284c = enterPath;
        this.f43285d = enterPathAutoAccept;
        this.f43286e = i17;
        this.f43287f = j17;
        this.f43288g = name;
        this.f43289h = roomType;
        this.f43290i = i18;
        this.f43291j = j18;
        this.f43292k = i19;
        this.f43293l = str;
        this.f43294m = i27;
        this.f43295n = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm1.f)) {
            return false;
        }
        cm1.f fVar = (cm1.f) obj;
        return kotlin.jvm.internal.o.b(this.f43282a, fVar.f43282a) && kotlin.jvm.internal.o.b(this.f43283b, fVar.f43283b) && kotlin.jvm.internal.o.b(this.f43284c, fVar.f43284c) && kotlin.jvm.internal.o.b(this.f43285d, fVar.f43285d) && this.f43286e == fVar.f43286e && this.f43287f == fVar.f43287f && kotlin.jvm.internal.o.b(this.f43288g, fVar.f43288g) && kotlin.jvm.internal.o.b(this.f43289h, fVar.f43289h) && this.f43290i == fVar.f43290i && this.f43291j == fVar.f43291j && this.f43292k == fVar.f43292k && kotlin.jvm.internal.o.b(this.f43293l, fVar.f43293l) && this.f43294m == fVar.f43294m && kotlin.jvm.internal.o.b(this.f43295n, fVar.f43295n);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.f43282a.hashCode() * 31) + this.f43283b.hashCode()) * 31) + this.f43284c.hashCode()) * 31) + this.f43285d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f43286e)) * 31) + java.lang.Long.hashCode(this.f43287f)) * 31) + this.f43288g.hashCode()) * 31) + this.f43289h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f43290i)) * 31) + java.lang.Long.hashCode(this.f43291j)) * 31) + java.lang.Integer.hashCode(this.f43292k)) * 31;
        java.lang.String str = this.f43293l;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f43294m)) * 31;
        java.lang.String str2 = this.f43295n;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "EnterWxaVoipCallingTask(AppId=" + this.f43282a + ", roomId=" + this.f43283b + ", enterPath=" + this.f43284c + ", enterPathAutoAccept=" + this.f43285d + ", versionType=" + this.f43286e + ", callingInstanceId=" + this.f43287f + ", name=" + this.f43288g + ", roomType=" + this.f43289h + ", expireTime=" + this.f43290i + ", msgId=" + this.f43291j + ", createTime=" + this.f43292k + ", iconUrl=" + this.f43293l + ", voipType=" + this.f43294m + ", subName=" + this.f43295n + ')';
    }
}
