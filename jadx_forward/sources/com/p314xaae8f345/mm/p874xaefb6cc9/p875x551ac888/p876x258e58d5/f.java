package com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f150576a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f150577b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150578c;

    /* renamed from: d, reason: collision with root package name */
    public final int f150579d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f150580e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f150581f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f150582g;

    /* renamed from: h, reason: collision with root package name */
    public final int f150583h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f150584i;

    public f(java.lang.String mAppId, java.lang.String mModuleName, int i17, int i18, java.lang.String mMd5, boolean z17, java.lang.String str, int i19, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mAppId, "mAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mModuleName, "mModuleName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mMd5, "mMd5");
        this.f150576a = mAppId;
        this.f150577b = mModuleName;
        this.f150578c = i17;
        this.f150579d = i18;
        this.f150580e = mMd5;
        this.f150581f = z17;
        this.f150582g = str;
        this.f150583h = i19;
        this.f150584i = str2;
    }

    /* renamed from: equals */
    public boolean m46911xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f)) {
            return false;
        }
        com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f fVar = (com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150576a, fVar.f150576a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150577b, fVar.f150577b) && this.f150578c == fVar.f150578c && this.f150579d == fVar.f150579d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150580e, fVar.f150580e) && this.f150581f == fVar.f150581f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150582g, fVar.f150582g) && this.f150583h == fVar.f150583h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150584i, fVar.f150584i);
    }

    /* renamed from: hashCode */
    public int m46912x8cdac1b() {
        int hashCode = ((((((((((this.f150576a.hashCode() * 31) + this.f150577b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f150578c)) * 31) + java.lang.Integer.hashCode(this.f150579d)) * 31) + this.f150580e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f150581f)) * 31;
        java.lang.String str = this.f150582g;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f150583h)) * 31;
        java.lang.String str2 = this.f150584i;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m46913x9616526c() {
        return "WVATaskInfo(mAppId=" + this.f150576a + ", mModuleName=" + this.f150577b + ", mAppVersion=" + this.f150578c + ", mVersionType=" + this.f150579d + ", mMd5=" + this.f150580e + ", mIsPatch=" + this.f150581f + ", mOldPkgPath=" + this.f150582g + ", mOldVersion=" + this.f150583h + ", mFinalDestPath=" + this.f150584i + ')';
    }
}
