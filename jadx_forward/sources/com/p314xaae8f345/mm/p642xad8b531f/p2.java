package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes8.dex */
public class p2 {

    /* renamed from: a, reason: collision with root package name */
    public int f145080a;

    /* renamed from: b, reason: collision with root package name */
    public int f145081b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f145082c;

    /* renamed from: d, reason: collision with root package name */
    public int f145083d;

    /* renamed from: e, reason: collision with root package name */
    public int f145084e;

    public boolean a(java.lang.String str) {
        java.lang.String[] split = str.split(",");
        if (split == null || split.length != 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessReport", "error format");
            return false;
        }
        try {
            this.f145080a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[0], 0);
            this.f145081b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0);
            this.f145082c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[2], 0);
            this.f145083d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[3], 0);
            this.f145084e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[4], 0);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProcessReport", "ParseFrom parse failed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ProcessReport", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: toString */
    public java.lang.String m43428x9616526c() {
        return java.lang.String.format("%d,%d,%d,%d,%d", java.lang.Integer.valueOf(this.f145080a), java.lang.Integer.valueOf(this.f145081b), java.lang.Integer.valueOf(this.f145082c), java.lang.Integer.valueOf(this.f145083d), java.lang.Integer.valueOf(this.f145084e));
    }
}
