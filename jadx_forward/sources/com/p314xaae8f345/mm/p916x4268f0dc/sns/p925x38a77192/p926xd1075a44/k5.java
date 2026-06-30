package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public class k5 extends com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.j5 f151558m = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.j5(null);

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.i5 f151559n = new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.i5();

    /* renamed from: o, reason: collision with root package name */
    public static final android.util.ArrayMap f151560o = new android.util.ArrayMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f151561e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f151562f;

    /* renamed from: g, reason: collision with root package name */
    public final long f151563g;

    /* renamed from: h, reason: collision with root package name */
    public final long f151564h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f151565i;

    /* renamed from: j, reason: collision with root package name */
    public final n0.v2 f151566j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f151567k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f151568l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(java.lang.String dataId, java.lang.String name, java.lang.String str, long j17, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, n0.v2 v2Var, java.lang.String str2, java.lang.String str3, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(dataId, null, false, 6, null);
        java.lang.String thumbnailUrl = (i17 & 4) != 0 ? "" : str;
        long j19 = (i17 & 8) != 0 ? 0L : j17;
        long j27 = (i17 & 16) == 0 ? j18 : 0L;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i17 & 32) != 0 ? null : gVar;
        n0.v2 switchingProgress = (i17 & 64) != 0 ? n0.s4.c(java.lang.Float.valueOf(-1.0f), null, 2, null) : v2Var;
        java.lang.String str4 = (i17 & 128) != 0 ? null : str2;
        java.lang.String str5 = (i17 & 256) == 0 ? str3 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataId, "dataId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnailUrl, "thumbnailUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchingProgress, "switchingProgress");
        this.f151561e = name;
        this.f151562f = thumbnailUrl;
        this.f151563g = j19;
        this.f151564h = j27;
        this.f151565i = gVar2;
        this.f151566j = switchingProgress;
        this.f151567k = str4;
        this.f151568l = str5;
    }
}
