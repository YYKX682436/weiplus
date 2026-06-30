package com.p314xaae8f345.p457x3304c6.p477x633fb29;

/* renamed from: com.tencent.maas.model.MJTemplateMetadata */
/* loaded from: classes5.dex */
public class C4122x30130586 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129858a;

    /* renamed from: b, reason: collision with root package name */
    public final long f129859b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f129860c;

    /* renamed from: d, reason: collision with root package name */
    public final long f129861d;

    /* renamed from: e, reason: collision with root package name */
    public final long f129862e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f129863f;

    public C4122x30130586(java.lang.String str, long j17, java.lang.String str2, long j18, long j19) {
        this(str, j17, str2, j18, j19, "");
    }

    /* renamed from: equals */
    public boolean m33915xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f129858a.equals(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4122x30130586) obj).f129858a);
    }

    /* renamed from: getAIModelType */
    public java.lang.String m33916xed09a5a5() {
        return this.f129863f;
    }

    /* renamed from: getDescDownloadURL */
    public java.lang.String m33917x545fba40() {
        return this.f129860c;
    }

    /* renamed from: getDescVersion */
    public long m33918xa325a7d1() {
        return this.f129859b;
    }

    /* renamed from: getMinimumAndroidSDKVersion */
    public long m33919x8392da15() {
        return this.f129862e;
    }

    /* renamed from: getMinimumiOSSDKVersion */
    public long m33920x739bde53() {
        return this.f129861d;
    }

    /* renamed from: getTemplateID */
    public java.lang.String m33921x3bfa570b() {
        return this.f129858a;
    }

    /* renamed from: hashCode */
    public int m33922x8cdac1b() {
        return this.f129858a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m33923x9616526c() {
        return "MJTemplateMetadata{templateID='" + this.f129858a + "', descVersion=" + this.f129859b + '}';
    }

    public C4122x30130586(java.lang.String str, long j17, java.lang.String str2, long j18, long j19, java.lang.String str3) {
        this.f129858a = str;
        this.f129859b = j17;
        this.f129860c = str2;
        this.f129861d = j18;
        this.f129862e = j19;
        this.f129863f = str3;
    }
}
