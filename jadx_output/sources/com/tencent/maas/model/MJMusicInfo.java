package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJMusicInfo {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48274a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48275b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48276c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f48277d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48278e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48279f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.maas.model.MJLyricInfo[] f48280g;

    /* renamed from: h, reason: collision with root package name */
    public final java.nio.ByteBuffer f48281h;

    public MJMusicInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f48274a = str;
        this.f48275b = str2;
        this.f48276c = str3;
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        this.f48279f = mJTime;
        this.f48278e = mJTime;
        this.f48280g = null;
        this.f48281h = null;
    }

    public final com.tencent.maas.model.MJLyricInfo[] a(java.lang.Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        com.tencent.maas.model.MJLyricInfo[] mJLyricInfoArr = new com.tencent.maas.model.MJLyricInfo[objArr.length];
        for (int i17 = 0; i17 < objArr.length; i17++) {
            mJLyricInfoArr[i17] = (com.tencent.maas.model.MJLyricInfo) objArr[i17];
        }
        return mJLyricInfoArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f48274a.equals(((com.tencent.maas.model.MJMusicInfo) obj).f48274a);
    }

    public java.nio.ByteBuffer getClientBuffer() {
        return this.f48281h;
    }

    public java.lang.String getCoverImageURL() {
        return this.f48277d;
    }

    public com.tencent.maas.model.time.MJTime getDuration() {
        return this.f48278e;
    }

    public com.tencent.maas.model.MJLyricInfo[] getLyricObjs() {
        return this.f48280g;
    }

    public java.lang.String getMusicID() {
        return this.f48274a;
    }

    public java.lang.String getSingerNames() {
        return this.f48276c;
    }

    public java.lang.String getSongName() {
        return this.f48275b;
    }

    public com.tencent.maas.model.time.MJTime getStartTime() {
        return this.f48279f;
    }

    public int hashCode() {
        return this.f48274a.hashCode();
    }

    public java.lang.String toString() {
        return "MJMusicInfo{musicID='" + this.f48274a + "', songName='" + this.f48275b + "'}";
    }

    public MJMusicInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        this.f48274a = str;
        this.f48275b = str2;
        this.f48276c = str3;
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        this.f48279f = mJTime;
        this.f48278e = mJTime;
        this.f48280g = a(objArr);
        this.f48281h = null;
    }

    public MJMusicInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.maas.model.time.MJTime mJTime, java.lang.Object[] objArr) {
        this.f48274a = str;
        this.f48275b = str2;
        this.f48276c = str3;
        this.f48279f = com.tencent.maas.model.time.MJTime.ZeroTime;
        this.f48278e = mJTime;
        this.f48280g = a(objArr);
        this.f48281h = null;
    }

    public MJMusicInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, java.lang.Object[] objArr) {
        this.f48274a = str;
        this.f48275b = str2;
        this.f48276c = str3;
        this.f48277d = str4;
        this.f48278e = mJTime;
        this.f48279f = mJTime2;
        this.f48280g = a(objArr);
        this.f48281h = null;
    }

    public MJMusicInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, java.lang.Object[] objArr, java.nio.ByteBuffer byteBuffer) {
        this.f48274a = str;
        this.f48275b = str2;
        this.f48276c = str3;
        this.f48277d = str4;
        this.f48278e = mJTime;
        this.f48279f = mJTime2;
        this.f48280g = a(objArr);
        this.f48281h = byteBuffer;
    }
}
