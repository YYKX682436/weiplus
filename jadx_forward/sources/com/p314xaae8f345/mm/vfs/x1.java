package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f294764a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f294765b;

    /* renamed from: c, reason: collision with root package name */
    public final long f294766c;

    /* renamed from: d, reason: collision with root package name */
    public final long f294767d;

    /* renamed from: e, reason: collision with root package name */
    public final long f294768e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f294769f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294770g;

    public x1(com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str, java.lang.String str2, long j17, long j18, long j19, boolean z17) {
        this.f294770g = q2Var;
        this.f294764a = str;
        this.f294765b = str2;
        this.f294766c = j17;
        this.f294767d = j18;
        this.f294768e = j19;
        this.f294769f = z17;
    }

    public boolean a() {
        return b(true);
    }

    public boolean b(boolean z17) {
        boolean z18 = this.f294769f;
        java.lang.String str = this.f294764a;
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294770g;
        return z18 ? q2Var.e(str, z17) : q2Var.d(str);
    }

    public boolean c() {
        return this instanceof com.p314xaae8f345.mm.vfs.k5;
    }

    public java.lang.Iterable d() {
        if (this.f294769f) {
            return this.f294770g.mo82286x32b09e(this.f294764a);
        }
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m82488x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        if (this.f294769f) {
            sb6.append("[DIR] ");
        }
        sb6.append(this.f294764a);
        sb6.append(" -> ");
        sb6.append(this.f294770g);
        return sb6.toString();
    }
}
