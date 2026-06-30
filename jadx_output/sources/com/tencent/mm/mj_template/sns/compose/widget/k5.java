package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public class k5 extends com.tencent.mm.mj_template.sns.compose.widget.m5 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.mj_template.sns.compose.widget.j5 f70025m = new com.tencent.mm.mj_template.sns.compose.widget.j5(null);

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.mj_template.sns.compose.widget.i5 f70026n = new com.tencent.mm.mj_template.sns.compose.widget.i5();

    /* renamed from: o, reason: collision with root package name */
    public static final android.util.ArrayMap f70027o = new android.util.ArrayMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f70028e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f70029f;

    /* renamed from: g, reason: collision with root package name */
    public final long f70030g;

    /* renamed from: h, reason: collision with root package name */
    public final long f70031h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f70032i;

    /* renamed from: j, reason: collision with root package name */
    public final n0.v2 f70033j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f70034k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f70035l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(java.lang.String dataId, java.lang.String name, java.lang.String str, long j17, long j18, com.tencent.mm.protobuf.g gVar, n0.v2 v2Var, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        super(dataId, null, false, 6, null);
        java.lang.String thumbnailUrl = (i17 & 4) != 0 ? "" : str;
        long j19 = (i17 & 8) != 0 ? 0L : j17;
        long j27 = (i17 & 16) == 0 ? j18 : 0L;
        com.tencent.mm.protobuf.g gVar2 = (i17 & 32) != 0 ? null : gVar;
        n0.v2 switchingProgress = (i17 & 64) != 0 ? n0.s4.c(java.lang.Float.valueOf(-1.0f), null, 2, null) : v2Var;
        java.lang.String str4 = (i17 & 128) != 0 ? null : str2;
        java.lang.String str5 = (i17 & 256) == 0 ? str3 : null;
        kotlin.jvm.internal.o.g(dataId, "dataId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(thumbnailUrl, "thumbnailUrl");
        kotlin.jvm.internal.o.g(switchingProgress, "switchingProgress");
        this.f70028e = name;
        this.f70029f = thumbnailUrl;
        this.f70030g = j19;
        this.f70031h = j27;
        this.f70032i = gVar2;
        this.f70033j = switchingProgress;
        this.f70034k = str4;
        this.f70035l = str5;
    }
}
