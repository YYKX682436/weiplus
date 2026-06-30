package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f69043a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f69044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69046d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f69047e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f69048f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f69049g;

    /* renamed from: h, reason: collision with root package name */
    public final int f69050h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f69051i;

    public f(java.lang.String mAppId, java.lang.String mModuleName, int i17, int i18, java.lang.String mMd5, boolean z17, java.lang.String str, int i19, java.lang.String str2) {
        kotlin.jvm.internal.o.g(mAppId, "mAppId");
        kotlin.jvm.internal.o.g(mModuleName, "mModuleName");
        kotlin.jvm.internal.o.g(mMd5, "mMd5");
        this.f69043a = mAppId;
        this.f69044b = mModuleName;
        this.f69045c = i17;
        this.f69046d = i18;
        this.f69047e = mMd5;
        this.f69048f = z17;
        this.f69049g = str;
        this.f69050h = i19;
        this.f69051i = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.minigame.download.mmdownloader.f)) {
            return false;
        }
        com.tencent.mm.minigame.download.mmdownloader.f fVar = (com.tencent.mm.minigame.download.mmdownloader.f) obj;
        return kotlin.jvm.internal.o.b(this.f69043a, fVar.f69043a) && kotlin.jvm.internal.o.b(this.f69044b, fVar.f69044b) && this.f69045c == fVar.f69045c && this.f69046d == fVar.f69046d && kotlin.jvm.internal.o.b(this.f69047e, fVar.f69047e) && this.f69048f == fVar.f69048f && kotlin.jvm.internal.o.b(this.f69049g, fVar.f69049g) && this.f69050h == fVar.f69050h && kotlin.jvm.internal.o.b(this.f69051i, fVar.f69051i);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f69043a.hashCode() * 31) + this.f69044b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f69045c)) * 31) + java.lang.Integer.hashCode(this.f69046d)) * 31) + this.f69047e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f69048f)) * 31;
        java.lang.String str = this.f69049g;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f69050h)) * 31;
        java.lang.String str2 = this.f69051i;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "WVATaskInfo(mAppId=" + this.f69043a + ", mModuleName=" + this.f69044b + ", mAppVersion=" + this.f69045c + ", mVersionType=" + this.f69046d + ", mMd5=" + this.f69047e + ", mIsPatch=" + this.f69048f + ", mOldPkgPath=" + this.f69049g + ", mOldVersion=" + this.f69050h + ", mFinalDestPath=" + this.f69051i + ')';
    }
}
