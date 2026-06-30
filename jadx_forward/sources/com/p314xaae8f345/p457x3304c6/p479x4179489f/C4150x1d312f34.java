package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.MJExportResultDetails */
/* loaded from: classes5.dex */
public class C4150x1d312f34 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129925a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129926b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f129927c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f129928d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f129929e;

    public C4150x1d312f34(java.lang.String str, boolean z17, java.lang.String str2, java.lang.String[] strArr, java.lang.String str3) {
        this.f129925a = str;
        this.f129926b = z17;
        this.f129927c = str2;
        this.f129928d = strArr;
        this.f129929e = str3;
    }

    /* renamed from: getChecksum */
    public java.lang.String m34073xd77599b9() {
        return this.f129925a;
    }

    /* renamed from: getCoverImageFilePath */
    public java.lang.String m34074x683471bb() {
        return this.f129927c;
    }

    /* renamed from: getInputMD5Strings */
    public java.lang.String[] m34075x72c37c38() {
        return this.f129928d;
    }

    /* renamed from: getOutputMD5String */
    public java.lang.String m34076xfc102918() {
        return this.f129929e;
    }

    /* renamed from: isSoftwareEncoding */
    public boolean m34077xb6191964() {
        return this.f129926b;
    }

    /* renamed from: toString */
    public java.lang.String m34078x9616526c() {
        return "MJExportResultDetails{checksum='" + this.f129925a + "', isSoftwareEncoding=" + this.f129926b + ", coverImageFilePath='" + this.f129927c + "', inputMD5Strings=" + java.util.Arrays.toString(this.f129928d) + ", outputMD5String='" + this.f129929e + "'}";
    }
}
