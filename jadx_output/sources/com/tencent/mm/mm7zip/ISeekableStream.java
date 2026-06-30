package com.tencent.mm.mm7zip;

/* loaded from: classes7.dex */
public interface ISeekableStream {
    public static final int SEEK_CUR = 1;
    public static final int SEEK_END = 2;
    public static final int SEEK_SET = 0;

    long seek(long j17, int i17);
}
