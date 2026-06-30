package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCamMusicDesc {

    /* renamed from: a, reason: collision with root package name */
    public boolean f47883a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f47884b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f47885c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f47886d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f47887e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f47888f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f47889g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f47890h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f47891i;

    /* renamed from: j, reason: collision with root package name */
    public final int f47892j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.maas.model.MJLyricInfo[] f47893k;

    public MJCamMusicDesc() {
        this.f47883a = false;
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        this.f47889g = mJTime;
        this.f47890h = mJTime;
        this.f47891i = mJTime;
        this.f47892j = 0;
        this.f47893k = null;
    }

    public com.tencent.maas.model.time.MJTime getDurationOfMusic() {
        return this.f47890h;
    }

    public int getLoopCount() {
        return this.f47892j;
    }

    public com.tencent.maas.model.MJLyricInfo[] getLyricObjs() {
        return this.f47893k;
    }

    public java.lang.String getMusicFilePath() {
        return this.f47885c;
    }

    public java.lang.String getMusicID() {
        return this.f47884b;
    }

    public java.lang.String getMusicKey() {
        return this.f47886d;
    }

    public java.lang.String getSingerNames() {
        return this.f47888f;
    }

    public java.lang.String getSongName() {
        return this.f47887e;
    }

    public com.tencent.maas.model.time.MJTime getStartTimeOfCamScene() {
        return this.f47891i;
    }

    public com.tencent.maas.model.time.MJTime getStartTimeOfMusic() {
        return this.f47889g;
    }

    public boolean isMusicEnabled() {
        return this.f47883a;
    }

    public MJCamMusicDesc(boolean z17, java.lang.String str, java.lang.String str2) {
        this.f47883a = z17;
        this.f47884b = str;
        this.f47885c = str2;
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        this.f47889g = mJTime;
        this.f47890h = mJTime;
        this.f47891i = mJTime;
        this.f47892j = 0;
        this.f47893k = null;
    }

    public MJCamMusicDesc(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, int i17) {
        this.f47883a = true;
        this.f47886d = str;
        this.f47885c = str2;
        this.f47887e = str3;
        this.f47889g = mJTime;
        this.f47890h = com.tencent.maas.model.time.MJTime.InvalidTime;
        this.f47891i = mJTime2;
        this.f47892j = i17;
        this.f47893k = null;
    }

    public MJCamMusicDesc(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, com.tencent.maas.model.time.MJTime mJTime3, int i17) {
        this.f47883a = z17;
        this.f47884b = str;
        this.f47886d = str2;
        this.f47885c = str3;
        this.f47887e = str4;
        this.f47889g = mJTime;
        this.f47890h = mJTime2;
        this.f47891i = mJTime3;
        this.f47892j = i17;
        this.f47893k = null;
    }

    public MJCamMusicDesc(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, com.tencent.maas.model.time.MJTime mJTime3, int i17, java.lang.Object[] objArr) {
        com.tencent.maas.model.MJLyricInfo[] mJLyricInfoArr;
        this.f47883a = z17;
        this.f47884b = str;
        this.f47886d = str2;
        this.f47885c = str3;
        this.f47887e = str4;
        this.f47888f = str5;
        this.f47889g = mJTime;
        this.f47890h = mJTime2;
        this.f47891i = mJTime3;
        this.f47892j = i17;
        if (objArr == null) {
            mJLyricInfoArr = null;
        } else {
            mJLyricInfoArr = new com.tencent.maas.model.MJLyricInfo[objArr.length];
            for (int i18 = 0; i18 < objArr.length; i18++) {
                mJLyricInfoArr[i18] = (com.tencent.maas.model.MJLyricInfo) objArr[i18];
            }
        }
        this.f47893k = mJLyricInfoArr;
    }
}
