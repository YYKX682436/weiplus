package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class c5 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f294403a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.channels.FileLock f294404b;

    /* renamed from: c, reason: collision with root package name */
    public int f294405c;

    public c5(java.io.RandomAccessFile randomAccessFile, boolean z17) {
        this.f294405c = z17 ? -1 : 1;
        this.f294404b = randomAccessFile.getChannel().lock(0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, !z17);
    }
}
