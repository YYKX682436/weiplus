package com.p314xaae8f345.mm.vfs;

/* loaded from: classes10.dex */
public final class i3 implements com.p314xaae8f345.mm.vfs.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f294525a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f294526b;

    /* renamed from: c, reason: collision with root package name */
    public final long f294527c;

    /* renamed from: d, reason: collision with root package name */
    public long f294528d = 7 * 86400000;

    public i3(long j17, boolean z17) {
        this.f294525a = j17;
        this.f294526b = z17;
        this.f294527c = j17 * 2;
    }

    public final com.p314xaae8f345.mm.vfs.u b() {
        return this.f294526b ? new com.p314xaae8f345.mm.vfs.o3(this.f294525a, this.f294527c, this.f294528d) : new com.p314xaae8f345.mm.vfs.n3(this.f294525a, this.f294527c, this.f294528d);
    }
}
