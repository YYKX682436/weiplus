package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class n7 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f274408a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f274409b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f274410c;

    /* renamed from: d, reason: collision with root package name */
    public long f274411d;

    /* renamed from: e, reason: collision with root package name */
    public long f274412e;

    /* renamed from: f, reason: collision with root package name */
    public long f274413f;

    /* renamed from: g, reason: collision with root package name */
    public long f274414g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f274415h;

    /* renamed from: equals */
    public boolean m77792xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n7 n7Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) obj;
        if (this.f274414g != n7Var.f274414g) {
            return false;
        }
        long j17 = this.f274411d - n7Var.f274411d;
        long j18 = this.f274412e - n7Var.f274412e;
        long j19 = this.f274413f - n7Var.f274413f;
        return java.lang.Math.abs(j17 - j18) <= 4 && java.lang.Math.abs(j17 - j19) <= 4 && java.lang.Math.abs(j18 - j19) <= 4;
    }

    /* renamed from: toString */
    public java.lang.String m77793x9616526c() {
        return "{DevName=" + this.f274408a + ", MountDir=" + this.f274409b + ", FileSystem=" + this.f274410c + ", TotalBlocks=" + this.f274411d + ", FreeBlocks=" + this.f274412e + ", AvailableBlocks=" + this.f274413f + ", BlockSize=" + this.f274414g + ", Shared=false}";
    }
}
