package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f189719a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f189720b;

    /* renamed from: c, reason: collision with root package name */
    public final long f189721c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f189722d;

    /* renamed from: e, reason: collision with root package name */
    public final int f189723e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.ze2 f189724f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f189725g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f189726h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.xu2 f189727i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f189728j;

    /* renamed from: k, reason: collision with root package name */
    public final int f189729k;

    /* renamed from: l, reason: collision with root package name */
    public final r45.xn5 f189730l;

    /* renamed from: m, reason: collision with root package name */
    public final int f189731m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.qt2 f189732n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f189733o;

    /* renamed from: p, reason: collision with root package name */
    public final long f189734p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f189735q;

    /* renamed from: r, reason: collision with root package name */
    public final int f189736r;

    /* renamed from: s, reason: collision with root package name */
    public final r45.a34 f189737s;

    public m9(int i17, java.lang.String topic, java.lang.String str, long j17, java.lang.String str2, int i18, r45.ze2 ze2Var, java.lang.Long l17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.xu2 xu2Var, java.lang.String str3, int i19, r45.xn5 xn5Var, int i27, r45.qt2 qt2Var, java.lang.String str4, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, int i28, r45.a34 a34Var, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String finderUserName = (i29 & 1024) != 0 ? "" : str3;
        int i37 = (i29 & 2048) != 0 ? -1 : i19;
        r45.xn5 xn5Var2 = (i29 & 4096) != 0 ? null : xn5Var;
        int i38 = (i29 & 8192) != 0 ? 0 : i27;
        java.lang.String str5 = (32768 & i29) != 0 ? null : str4;
        long j19 = (65536 & i29) != 0 ? 0L : j18;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (131072 & i29) != 0 ? null : gVar2;
        int i39 = (262144 & i29) == 0 ? i28 : 0;
        r45.a34 a34Var2 = (i29 & 524288) == 0 ? a34Var : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        this.f189719a = i17;
        this.f189720b = topic;
        this.f189721c = j17;
        this.f189722d = str2;
        this.f189723e = i18;
        this.f189724f = ze2Var;
        this.f189725g = l17;
        this.f189726h = gVar;
        this.f189727i = xu2Var;
        this.f189728j = finderUserName;
        this.f189729k = i37;
        this.f189730l = xn5Var2;
        this.f189731m = i38;
        this.f189732n = qt2Var;
        this.f189733o = str5;
        this.f189734p = j19;
        this.f189735q = gVar3;
        this.f189736r = i39;
        this.f189737s = a34Var2;
    }

    public final az2.u a() {
        az2.u t5Var;
        int i17 = this.f189719a;
        if (i17 != 1) {
            t5Var = null;
            if (i17 == 2) {
                r45.ze2 ze2Var = this.f189724f;
                if (ze2Var != null) {
                    java.lang.String m75945x2fec8307 = ze2Var.m75945x2fec8307(5);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    t5Var = new db2.t5(m75945x2fec8307, ze2Var.m75938x746dc8a6(0), ze2Var.m75938x746dc8a6(1), this.f189725g, this.f189726h, this.f189729k, this.f189730l, this.f189727i, this.f189732n, this.f189733o, this.f189737s);
                }
            } else if (i17 == 3) {
                t5Var = new db2.p5(this.f189726h, this.f189728j);
            } else if (i17 == 4) {
                t5Var = new db2.t5(i17, this.f189734p, this.f189725g, this.f189722d, this.f189723e, this.f189726h, this.f189732n, this.f189733o, this.f189737s);
            } else if (i17 == 5) {
                t5Var = new db2.t5(this.f189720b, this.f189734p, this.f189735q, this.f189725g, this.f189726h, this.f189727i, this.f189732n, (java.lang.String) null, this.f189737s, 128, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null);
            } else if (i17 == 7 || i17 == 12 || i17 == 18 || i17 == 15) {
                int i18 = (i17 != 7 || this.f189723e <= 2) ? i17 : 12;
                long j17 = this.f189734p;
                t5Var = new db2.t5(i18, j17 == 0 ? this.f189721c : j17, this.f189725g, this.f189722d, this.f189723e, this.f189726h, this.f189732n, this.f189733o, this.f189737s);
            } else if (i17 == 16) {
                t5Var = new db2.t5(this.f189720b, this.f189734p, this.f189725g, i17, this.f189726h, this.f189732n, this.f189733o, this.f189728j, null, this.f189735q, this.f189737s, 256, null);
            }
        } else {
            t5Var = new db2.t5(this.f189720b, this.f189725g, this.f189726h, this.f189727i, this.f189732n, this.f189723e, this.f189733o, this.f189736r, this.f189737s);
        }
        if (t5Var instanceof db2.t5) {
            ((db2.t5) t5Var).f309714m = this.f189731m;
        }
        return t5Var;
    }
}
