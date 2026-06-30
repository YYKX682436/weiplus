package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class j5 extends com.p314xaae8f345.mm.vfs.i5 {
    public j5(java.lang.String str) {
        super(str, true);
    }

    public int a(int i17) {
        java.io.RandomAccessFile randomAccessFile = this.f294530d;
        long max = java.lang.Math.max(randomAccessFile.length() + i17, 0L);
        randomAccessFile.setLength(max);
        return (int) max;
    }
}
