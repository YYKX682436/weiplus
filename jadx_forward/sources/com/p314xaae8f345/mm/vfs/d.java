package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f294421a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294422b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f294423c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Throwable f294424d;

    public d(int i17, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str) {
        if (i17 < 0 || i17 >= com.p314xaae8f345.mm.vfs.C22735xee348ee4.f294214i) {
            throw new java.lang.IllegalArgumentException("Illegal access token: " + i17);
        }
        this.f294421a = i17;
        this.f294422b = q2Var;
        this.f294423c = str;
        this.f294424d = new java.lang.Throwable();
    }
}
