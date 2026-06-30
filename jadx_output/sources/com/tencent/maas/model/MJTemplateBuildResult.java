package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJTemplateBuildResult {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48293a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48294b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48295c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.model.MJMusicInfo f48296d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.maas.model.MJMusicInfo[] f48297e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.maas.model.MJMusicInfo[] f48298f;

    public MJTemplateBuildResult(java.lang.String str, boolean z17, java.lang.String str2, com.tencent.maas.model.MJMusicInfo mJMusicInfo, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        this.f48293a = str;
        this.f48294b = z17;
        this.f48295c = str2;
        this.f48296d = mJMusicInfo;
        this.f48297e = (com.tencent.maas.model.MJMusicInfo[]) java.util.Arrays.copyOf(objArr, objArr.length, com.tencent.maas.model.MJMusicInfo[].class);
        this.f48298f = (com.tencent.maas.model.MJMusicInfo[]) java.util.Arrays.copyOf(objArr2, objArr2.length, com.tencent.maas.model.MJMusicInfo[].class);
    }

    public com.tencent.maas.model.MJMusicInfo[] getRecommendedMusicInfos() {
        return this.f48298f;
    }

    public java.lang.String getResultId() {
        return this.f48293a;
    }

    public com.tencent.maas.model.MJMusicInfo getSelectedMusicInfo() {
        return this.f48296d;
    }

    public java.lang.String getTemplateId() {
        return this.f48295c;
    }

    public com.tencent.maas.model.MJMusicInfo[] getTemplateMusicInfos() {
        return this.f48297e;
    }

    public boolean isBlank() {
        return this.f48294b;
    }
}
