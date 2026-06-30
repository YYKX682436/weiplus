package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class nb {

    /* renamed from: a, reason: collision with root package name */
    public final long f282760a;

    /* renamed from: b, reason: collision with root package name */
    public final long f282761b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f282762c;

    public nb(long j17, long j18, boolean z17) {
        this.f282760a = j17;
        this.f282761b = j18;
        this.f282762c = z17;
    }

    /* renamed from: equals */
    public boolean m79617xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.nb)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.nb nbVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.nb) obj;
        return this.f282760a == nbVar.f282760a && this.f282761b == nbVar.f282761b && this.f282762c == nbVar.f282762c;
    }

    /* renamed from: hashCode */
    public int m79618x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f282760a) * 31) + java.lang.Long.hashCode(this.f282761b)) * 31) + java.lang.Boolean.hashCode(this.f282762c);
    }

    /* renamed from: toString */
    public java.lang.String m79619x9616526c() {
        return "DownloadInfo(downloadedBytes=" + this.f282760a + ", totalBytes=" + this.f282761b + ", isConfirmedComplete=" + this.f282762c + ')';
    }
}
