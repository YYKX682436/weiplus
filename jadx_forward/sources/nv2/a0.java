package nv2;

/* loaded from: classes10.dex */
public final class a0 extends nv2.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f421965d;

    /* renamed from: e, reason: collision with root package name */
    public final int f421966e;

    /* renamed from: f, reason: collision with root package name */
    public final long f421967f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f421968g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f421969h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f421970i;

    /* renamed from: j, reason: collision with root package name */
    public final int f421971j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f421972k;

    /* renamed from: l, reason: collision with root package name */
    public final r45.o72 f421973l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Integer f421974m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f421975n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f421976o;

    /* renamed from: p, reason: collision with root package name */
    public final int f421977p;

    /* renamed from: q, reason: collision with root package name */
    public final long f421978q;

    /* renamed from: r, reason: collision with root package name */
    public final int f421979r;

    /* renamed from: s, reason: collision with root package name */
    public final r45.p31 f421980s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f421981t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f421982u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String finderUser, int i17, long j17, java.lang.String str, r45.qt2 qt2Var, boolean z17, int i18, java.lang.String str2, r45.o72 o72Var, java.lang.Integer num, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, int i19, long j18, int i27, r45.p31 p31Var, java.lang.String str3, java.lang.String str4, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        java.lang.String participantFinderUsername = (i28 & 128) != 0 ? "" : str2;
        r45.o72 o72Var2 = (i28 & 256) != 0 ? null : o72Var;
        java.lang.Integer num2 = (i28 & 512) != 0 ? 0 : num;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (i28 & 1024) != 0 ? null : gVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = (i28 & 2048) != 0 ? null : gVar2;
        int i29 = (i28 & 4096) != 0 ? -1 : i19;
        long j19 = (i28 & 8192) != 0 ? 0L : j18;
        int i37 = (i28 & 16384) == 0 ? i27 : 0;
        r45.p31 newLifeReportInfo = (32768 & i28) != 0 ? new r45.p31() : p31Var;
        java.lang.String nonceId = (65536 & i28) != 0 ? "" : str3;
        java.lang.String micId = (i28 & 131072) == 0 ? str4 : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUser, "finderUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(participantFinderUsername, "participantFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newLifeReportInfo, "newLifeReportInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micId, "micId");
        this.f421965d = finderUser;
        this.f421966e = i17;
        this.f421967f = j17;
        this.f421968g = str;
        this.f421969h = qt2Var;
        this.f421970i = z17;
        this.f421971j = i18;
        this.f421972k = participantFinderUsername;
        this.f421973l = o72Var2;
        this.f421974m = num2;
        this.f421975n = gVar3;
        this.f421976o = gVar4;
        this.f421977p = i29;
        this.f421978q = j19;
        this.f421979r = i37;
        this.f421980s = newLifeReportInfo;
        this.f421981t = nonceId;
        this.f421982u = micId;
    }

    @Override // nv2.r
    public void a(nv2.o1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.a(callback);
        new db2.m0(this, false).l().K(new nv2.z(this, callback));
    }

    @Override // nv2.r
    public java.lang.String c() {
        return "id_" + this.f421965d + '_' + this.f421966e;
    }

    /* renamed from: toString */
    public java.lang.String m150127x9616526c() {
        return "action_" + this.f421965d + '_' + this.f421966e + '_' + this.f422108c + '_' + this.f421972k;
    }
}
