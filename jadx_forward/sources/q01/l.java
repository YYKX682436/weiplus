package q01;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f440831a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f440832b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f440833c;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f440834d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f440835e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f440836f;

    /* renamed from: g, reason: collision with root package name */
    public volatile long f440837g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f440838h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.String f440839i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f440840j;

    /* renamed from: k, reason: collision with root package name */
    public volatile java.lang.Integer f440841k;

    /* renamed from: l, reason: collision with root package name */
    public volatile java.lang.Integer f440842l;

    public l(int i17, java.lang.String sceneType, java.lang.String sceneDesc, long j17, long j18, int i18, long j19, long j27, java.lang.String str, boolean z17, java.lang.Integer num, java.lang.Integer num2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j28 = (i19 & 8) != 0 ? 0L : j17;
        long j29 = (i19 & 16) != 0 ? 0L : j18;
        int i27 = (i19 & 32) != 0 ? 0 : i18;
        long j37 = (i19 & 64) != 0 ? 0L : j19;
        long j38 = (i19 & 128) == 0 ? j27 : 0L;
        java.lang.String experimentGroup = (i19 & 256) != 0 ? "" : str;
        boolean z18 = (i19 & 512) == 0 ? z17 : false;
        java.lang.Integer num3 = (i19 & 1024) != 0 ? null : num;
        java.lang.Integer num4 = (i19 & 2048) != 0 ? null : num2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneType, "sceneType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneDesc, "sceneDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(experimentGroup, "experimentGroup");
        this.f440831a = i17;
        this.f440832b = sceneType;
        this.f440833c = sceneDesc;
        this.f440834d = j28;
        this.f440835e = j29;
        this.f440836f = i27;
        this.f440837g = j37;
        this.f440838h = j38;
        this.f440839i = experimentGroup;
        this.f440840j = z18;
        this.f440841k = num3;
        this.f440842l = num4;
    }

    /* renamed from: equals */
    public boolean m159205xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q01.l)) {
            return false;
        }
        q01.l lVar = (q01.l) obj;
        return this.f440831a == lVar.f440831a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440832b, lVar.f440832b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440833c, lVar.f440833c) && this.f440834d == lVar.f440834d && this.f440835e == lVar.f440835e && this.f440836f == lVar.f440836f && this.f440837g == lVar.f440837g && this.f440838h == lVar.f440838h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440839i, lVar.f440839i) && this.f440840j == lVar.f440840j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440841k, lVar.f440841k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440842l, lVar.f440842l);
    }

    /* renamed from: hashCode */
    public int m159206x8cdac1b() {
        return (((((((((((((((((((((java.lang.Integer.hashCode(this.f440831a) * 31) + this.f440832b.hashCode()) * 31) + this.f440833c.hashCode()) * 31) + java.lang.Long.hashCode(this.f440834d)) * 31) + java.lang.Long.hashCode(this.f440835e)) * 31) + java.lang.Integer.hashCode(this.f440836f)) * 31) + java.lang.Long.hashCode(this.f440837g)) * 31) + java.lang.Long.hashCode(this.f440838h)) * 31) + this.f440839i.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f440840j)) * 31) + (this.f440841k == null ? 0 : this.f440841k.hashCode())) * 31) + (this.f440842l != null ? this.f440842l.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m159207x9616526c() {
        return "MonitorData(sceneHash=" + this.f440831a + ", sceneType=" + this.f440832b + ", sceneDesc=" + this.f440833c + ", doSceneStartMs=" + this.f440834d + ", enterRunningQueueMs=" + this.f440835e + ", waitingQueueLength=" + this.f440836f + ", threadSubmitMs=" + this.f440837g + ", threadStartMs=" + this.f440838h + ", experimentGroup=" + this.f440839i + ", isCoreCgi=" + this.f440840j + ", errCode=" + this.f440841k + ", errType=" + this.f440842l + ')';
    }
}
