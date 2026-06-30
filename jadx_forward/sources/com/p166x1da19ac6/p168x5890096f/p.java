package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public final class p extends com.p166x1da19ac6.p168x5890096f.g0 implements java.lang.Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.zip.ZipEntry f125584f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125585g;

    public p(java.lang.String str, java.util.zip.ZipEntry zipEntry, int i17) {
        super(str, java.lang.String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), java.lang.Long.valueOf(zipEntry.getSize()), java.lang.Long.valueOf(zipEntry.getCompressedSize()), java.lang.Long.valueOf(zipEntry.getCrc())));
        this.f125584f = zipEntry;
        this.f125585g = i17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f125563d.compareTo(((com.p166x1da19ac6.p168x5890096f.p) obj).f125563d);
    }
}
