package nv2;

/* loaded from: classes2.dex */
public final class w1 extends nv2.r {

    /* renamed from: d, reason: collision with root package name */
    public final long f422145d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f422146e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f422147f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 f422148g;

    /* renamed from: h, reason: collision with root package name */
    public final nv2.x1 f422149h;

    /* renamed from: i, reason: collision with root package name */
    public final int f422150i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.qt2 f422151j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f422152k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f422153l;

    /* renamed from: m, reason: collision with root package name */
    public final int f422154m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f422155n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(long j17, java.lang.String str, java.lang.String objectNonceId, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 comment, nv2.x1 likeType, int i17, nv2.i1 i1Var, r45.qt2 contextObj, boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, java.lang.String str2) {
        super(i1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeType, "likeType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f422145d = j17;
        this.f422146e = str;
        this.f422147f = objectNonceId;
        this.f422148g = comment;
        this.f422149h = likeType;
        this.f422150i = i17;
        this.f422151j = contextObj;
        this.f422152k = z17;
        this.f422153l = gVar;
        this.f422154m = i18;
        this.f422155n = str2;
    }

    @Override // nv2.r
    public void a(nv2.o1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.a(callback);
        new db2.w1(this, this.f422151j).l().K(new nv2.v1(this, callback));
    }

    @Override // nv2.r
    public java.lang.String c() {
        return "id_" + this.f422145d + '_' + this.f422148g.t0() + '_' + this.f422149h + '_' + this.f422150i + '_' + this.f422108c;
    }

    /* renamed from: toString */
    public java.lang.String m150153x9616526c() {
        return "action_" + this.f422145d + '_' + this.f422148g.t0() + '_' + this.f422149h + '_' + this.f422150i;
    }
}
