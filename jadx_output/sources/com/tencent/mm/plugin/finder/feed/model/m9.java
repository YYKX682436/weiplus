package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f108186a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f108187b;

    /* renamed from: c, reason: collision with root package name */
    public final long f108188c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f108189d;

    /* renamed from: e, reason: collision with root package name */
    public final int f108190e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.ze2 f108191f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f108192g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f108193h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.xu2 f108194i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f108195j;

    /* renamed from: k, reason: collision with root package name */
    public final int f108196k;

    /* renamed from: l, reason: collision with root package name */
    public final r45.xn5 f108197l;

    /* renamed from: m, reason: collision with root package name */
    public final int f108198m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.qt2 f108199n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f108200o;

    /* renamed from: p, reason: collision with root package name */
    public final long f108201p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f108202q;

    /* renamed from: r, reason: collision with root package name */
    public final int f108203r;

    /* renamed from: s, reason: collision with root package name */
    public final r45.a34 f108204s;

    public m9(int i17, java.lang.String topic, java.lang.String str, long j17, java.lang.String str2, int i18, r45.ze2 ze2Var, java.lang.Long l17, com.tencent.mm.protobuf.g gVar, r45.xu2 xu2Var, java.lang.String str3, int i19, r45.xn5 xn5Var, int i27, r45.qt2 qt2Var, java.lang.String str4, long j18, com.tencent.mm.protobuf.g gVar2, int i28, r45.a34 a34Var, int i29, kotlin.jvm.internal.i iVar) {
        java.lang.String finderUserName = (i29 & 1024) != 0 ? "" : str3;
        int i37 = (i29 & 2048) != 0 ? -1 : i19;
        r45.xn5 xn5Var2 = (i29 & 4096) != 0 ? null : xn5Var;
        int i38 = (i29 & 8192) != 0 ? 0 : i27;
        java.lang.String str5 = (32768 & i29) != 0 ? null : str4;
        long j19 = (65536 & i29) != 0 ? 0L : j18;
        com.tencent.mm.protobuf.g gVar3 = (131072 & i29) != 0 ? null : gVar2;
        int i39 = (262144 & i29) == 0 ? i28 : 0;
        r45.a34 a34Var2 = (i29 & 524288) == 0 ? a34Var : null;
        kotlin.jvm.internal.o.g(topic, "topic");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        this.f108186a = i17;
        this.f108187b = topic;
        this.f108188c = j17;
        this.f108189d = str2;
        this.f108190e = i18;
        this.f108191f = ze2Var;
        this.f108192g = l17;
        this.f108193h = gVar;
        this.f108194i = xu2Var;
        this.f108195j = finderUserName;
        this.f108196k = i37;
        this.f108197l = xn5Var2;
        this.f108198m = i38;
        this.f108199n = qt2Var;
        this.f108200o = str5;
        this.f108201p = j19;
        this.f108202q = gVar3;
        this.f108203r = i39;
        this.f108204s = a34Var2;
    }

    public final az2.u a() {
        az2.u t5Var;
        int i17 = this.f108186a;
        if (i17 != 1) {
            t5Var = null;
            if (i17 == 2) {
                r45.ze2 ze2Var = this.f108191f;
                if (ze2Var != null) {
                    java.lang.String string = ze2Var.getString(5);
                    if (string == null) {
                        string = "";
                    }
                    t5Var = new db2.t5(string, ze2Var.getFloat(0), ze2Var.getFloat(1), this.f108192g, this.f108193h, this.f108196k, this.f108197l, this.f108194i, this.f108199n, this.f108200o, this.f108204s);
                }
            } else if (i17 == 3) {
                t5Var = new db2.p5(this.f108193h, this.f108195j);
            } else if (i17 == 4) {
                t5Var = new db2.t5(i17, this.f108201p, this.f108192g, this.f108189d, this.f108190e, this.f108193h, this.f108199n, this.f108200o, this.f108204s);
            } else if (i17 == 5) {
                t5Var = new db2.t5(this.f108187b, this.f108201p, this.f108202q, this.f108192g, this.f108193h, this.f108194i, this.f108199n, (java.lang.String) null, this.f108204s, 128, (kotlin.jvm.internal.i) null);
            } else if (i17 == 7 || i17 == 12 || i17 == 18 || i17 == 15) {
                int i18 = (i17 != 7 || this.f108190e <= 2) ? i17 : 12;
                long j17 = this.f108201p;
                t5Var = new db2.t5(i18, j17 == 0 ? this.f108188c : j17, this.f108192g, this.f108189d, this.f108190e, this.f108193h, this.f108199n, this.f108200o, this.f108204s);
            } else if (i17 == 16) {
                t5Var = new db2.t5(this.f108187b, this.f108201p, this.f108192g, i17, this.f108193h, this.f108199n, this.f108200o, this.f108195j, null, this.f108202q, this.f108204s, 256, null);
            }
        } else {
            t5Var = new db2.t5(this.f108187b, this.f108192g, this.f108193h, this.f108194i, this.f108199n, this.f108190e, this.f108200o, this.f108203r, this.f108204s);
        }
        if (t5Var instanceof db2.t5) {
            ((db2.t5) t5Var).f228181m = this.f108198m;
        }
        return t5Var;
    }
}
