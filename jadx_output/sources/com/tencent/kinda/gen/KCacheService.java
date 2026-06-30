package com.tencent.kinda.gen;

/* loaded from: classes8.dex */
public interface KCacheService {
    byte[] get(java.lang.String str);

    boolean getBool(java.lang.String str);

    long getInt64(java.lang.String str, long j17);

    boolean remove(java.lang.String str);

    void set(java.lang.String str, byte[] bArr, long j17);

    void setBool(java.lang.String str, boolean z17, long j17);

    void setInt64(java.lang.String str, long j17, long j18);
}
