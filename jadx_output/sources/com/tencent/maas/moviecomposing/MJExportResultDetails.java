package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class MJExportResultDetails {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48392a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48393b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48394c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f48395d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f48396e;

    public MJExportResultDetails(java.lang.String str, boolean z17, java.lang.String str2, java.lang.String[] strArr, java.lang.String str3) {
        this.f48392a = str;
        this.f48393b = z17;
        this.f48394c = str2;
        this.f48395d = strArr;
        this.f48396e = str3;
    }

    public java.lang.String getChecksum() {
        return this.f48392a;
    }

    public java.lang.String getCoverImageFilePath() {
        return this.f48394c;
    }

    public java.lang.String[] getInputMD5Strings() {
        return this.f48395d;
    }

    public java.lang.String getOutputMD5String() {
        return this.f48396e;
    }

    public boolean isSoftwareEncoding() {
        return this.f48393b;
    }

    public java.lang.String toString() {
        return "MJExportResultDetails{checksum='" + this.f48392a + "', isSoftwareEncoding=" + this.f48393b + ", coverImageFilePath='" + this.f48394c + "', inputMD5Strings=" + java.util.Arrays.toString(this.f48395d) + ", outputMD5String='" + this.f48396e + "'}";
    }
}
