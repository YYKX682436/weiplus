package aq2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f13102a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13103b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f13104c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f13105d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f13106e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13107f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13108g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.o72 f13109h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.dd2 f13110i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13111j;

    /* renamed from: k, reason: collision with root package name */
    public final float f13112k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13113l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f13114m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f13115n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f13116o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13117p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.rk0 f13118q;

    public a(int i17, int i18, com.tencent.mm.protobuf.g gVar, java.lang.String fromCommentScene, java.util.List containerContextList, int i19, long j17, r45.o72 o72Var, r45.dd2 dd2Var, int i27, float f17, boolean z17, java.lang.String str, com.tencent.mm.protobuf.g gVar2, com.tencent.mm.protobuf.g gVar3, boolean z18, r45.rk0 rk0Var, int i28, kotlin.jvm.internal.i iVar) {
        int i29 = (i28 & 32) != 0 ? 135 : i19;
        long j18 = (i28 & 64) != 0 ? 0L : j17;
        r45.o72 o72Var2 = (i28 & 128) != 0 ? null : o72Var;
        r45.dd2 dd2Var2 = (i28 & 256) != 0 ? null : dd2Var;
        int i37 = (i28 & 512) != 0 ? 0 : i27;
        float f18 = (i28 & 1024) != 0 ? 0.0f : f17;
        boolean z19 = (i28 & 2048) != 0 ? false : z17;
        java.lang.String cacheBusinessKey = (i28 & 4096) != 0 ? "default" : str;
        com.tencent.mm.protobuf.g gVar4 = (i28 & 8192) != 0 ? null : gVar2;
        com.tencent.mm.protobuf.g gVar5 = (i28 & 16384) != 0 ? null : gVar3;
        boolean z27 = (i28 & 32768) == 0 ? z18 : false;
        r45.rk0 rk0Var2 = (i28 & 65536) != 0 ? null : rk0Var;
        kotlin.jvm.internal.o.g(fromCommentScene, "fromCommentScene");
        kotlin.jvm.internal.o.g(containerContextList, "containerContextList");
        kotlin.jvm.internal.o.g(cacheBusinessKey, "cacheBusinessKey");
        this.f13102a = i17;
        this.f13103b = i18;
        this.f13104c = gVar;
        this.f13105d = fromCommentScene;
        this.f13106e = containerContextList;
        this.f13107f = i29;
        this.f13108g = j18;
        this.f13109h = o72Var2;
        this.f13110i = dd2Var2;
        this.f13111j = i37;
        this.f13112k = f18;
        this.f13113l = z19;
        this.f13114m = cacheBusinessKey;
        this.f13115n = gVar4;
        this.f13116o = gVar5;
        this.f13117p = z27;
        this.f13118q = rk0Var2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveEntranceRequest(pullType=");
        sb6.append(this.f13102a);
        sb6.append(", preloadType=");
        sb6.append(this.f13111j);
        sb6.append(", predictScore=");
        sb6.append(this.f13112k);
        sb6.append(", containerId=");
        sb6.append(this.f13103b);
        sb6.append(", lastBuffer=");
        sb6.append(this.f13104c);
        sb6.append(", fromCommentScene=");
        sb6.append(this.f13105d);
        sb6.append(", containerContextList.size=");
        sb6.append(this.f13106e.size());
        sb6.append(", tabId: ");
        r45.dd2 dd2Var = this.f13110i;
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.getInteger(0)) : null);
        sb6.append(",  cacheBusinessKey: ");
        sb6.append(this.f13114m);
        return sb6.toString();
    }
}
