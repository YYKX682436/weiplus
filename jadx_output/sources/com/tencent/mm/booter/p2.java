package com.tencent.mm.booter;

/* loaded from: classes8.dex */
public class p2 {

    /* renamed from: a, reason: collision with root package name */
    public int f63547a;

    /* renamed from: b, reason: collision with root package name */
    public int f63548b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f63549c;

    /* renamed from: d, reason: collision with root package name */
    public int f63550d;

    /* renamed from: e, reason: collision with root package name */
    public int f63551e;

    public boolean a(java.lang.String str) {
        java.lang.String[] split = str.split(",");
        if (split == null || split.length != 5) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessReport", "error format");
            return false;
        }
        try {
            this.f63547a = com.tencent.mm.sdk.platformtools.t8.P(split[0], 0);
            this.f63548b = com.tencent.mm.sdk.platformtools.t8.P(split[1], 0);
            this.f63549c = com.tencent.mm.sdk.platformtools.t8.P(split[2], 0);
            this.f63550d = com.tencent.mm.sdk.platformtools.t8.P(split[3], 0);
            this.f63551e = com.tencent.mm.sdk.platformtools.t8.P(split[4], 0);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProcessReport", "ParseFrom parse failed");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProcessReport", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public java.lang.String toString() {
        return java.lang.String.format("%d,%d,%d,%d,%d", java.lang.Integer.valueOf(this.f63547a), java.lang.Integer.valueOf(this.f63548b), java.lang.Integer.valueOf(this.f63549c), java.lang.Integer.valueOf(this.f63550d), java.lang.Integer.valueOf(this.f63551e));
    }
}
