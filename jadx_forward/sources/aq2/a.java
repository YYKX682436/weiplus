package aq2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f94635a;

    /* renamed from: b, reason: collision with root package name */
    public final int f94636b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f94637c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f94638d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f94639e;

    /* renamed from: f, reason: collision with root package name */
    public final int f94640f;

    /* renamed from: g, reason: collision with root package name */
    public final long f94641g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.o72 f94642h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.dd2 f94643i;

    /* renamed from: j, reason: collision with root package name */
    public final int f94644j;

    /* renamed from: k, reason: collision with root package name */
    public final float f94645k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f94646l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f94647m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f94648n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f94649o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f94650p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.rk0 f94651q;

    public a(int i17, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String fromCommentScene, java.util.List containerContextList, int i19, long j17, r45.o72 o72Var, r45.dd2 dd2Var, int i27, float f17, boolean z17, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3, boolean z18, r45.rk0 rk0Var, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i29 = (i28 & 32) != 0 ? 135 : i19;
        long j18 = (i28 & 64) != 0 ? 0L : j17;
        r45.o72 o72Var2 = (i28 & 128) != 0 ? null : o72Var;
        r45.dd2 dd2Var2 = (i28 & 256) != 0 ? null : dd2Var;
        int i37 = (i28 & 512) != 0 ? 0 : i27;
        float f18 = (i28 & 1024) != 0 ? 0.0f : f17;
        boolean z19 = (i28 & 2048) != 0 ? false : z17;
        java.lang.String cacheBusinessKey = (i28 & 4096) != 0 ? "default" : str;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = (i28 & 8192) != 0 ? null : gVar2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = (i28 & 16384) != 0 ? null : gVar3;
        boolean z27 = (i28 & 32768) == 0 ? z18 : false;
        r45.rk0 rk0Var2 = (i28 & 65536) != 0 ? null : rk0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromCommentScene, "fromCommentScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerContextList, "containerContextList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheBusinessKey, "cacheBusinessKey");
        this.f94635a = i17;
        this.f94636b = i18;
        this.f94637c = gVar;
        this.f94638d = fromCommentScene;
        this.f94639e = containerContextList;
        this.f94640f = i29;
        this.f94641g = j18;
        this.f94642h = o72Var2;
        this.f94643i = dd2Var2;
        this.f94644j = i37;
        this.f94645k = f18;
        this.f94646l = z19;
        this.f94647m = cacheBusinessKey;
        this.f94648n = gVar4;
        this.f94649o = gVar5;
        this.f94650p = z27;
        this.f94651q = rk0Var2;
    }

    /* renamed from: toString */
    public java.lang.String m8870x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveEntranceRequest(pullType=");
        sb6.append(this.f94635a);
        sb6.append(", preloadType=");
        sb6.append(this.f94644j);
        sb6.append(", predictScore=");
        sb6.append(this.f94645k);
        sb6.append(", containerId=");
        sb6.append(this.f94636b);
        sb6.append(", lastBuffer=");
        sb6.append(this.f94637c);
        sb6.append(", fromCommentScene=");
        sb6.append(this.f94638d);
        sb6.append(", containerContextList.size=");
        sb6.append(this.f94639e.size());
        sb6.append(", tabId: ");
        r45.dd2 dd2Var = this.f94643i;
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)) : null);
        sb6.append(",  cacheBusinessKey: ");
        sb6.append(this.f94647m);
        return sb6.toString();
    }
}
