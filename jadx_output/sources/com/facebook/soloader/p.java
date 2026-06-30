package com.facebook.soloader;

/* loaded from: classes13.dex */
public final class p extends com.facebook.soloader.g0 implements java.lang.Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.zip.ZipEntry f44051f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44052g;

    public p(java.lang.String str, java.util.zip.ZipEntry zipEntry, int i17) {
        super(str, java.lang.String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), java.lang.Long.valueOf(zipEntry.getSize()), java.lang.Long.valueOf(zipEntry.getCompressedSize()), java.lang.Long.valueOf(zipEntry.getCrc())));
        this.f44051f = zipEntry;
        this.f44052g = i17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f44030d.compareTo(((com.facebook.soloader.p) obj).f44030d);
    }
}
