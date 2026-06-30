package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes5.dex */
public class GeographicInfo {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48526a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48527b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48528c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f48529d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f48530e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f48531f;

    public GeographicInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f48526a = str;
        this.f48527b = str2;
        this.f48528c = str3;
        this.f48529d = str4;
        this.f48530e = str5;
        this.f48531f = str6;
    }

    public java.lang.String getAddress() {
        java.lang.String str = this.f48531f;
        return str == null ? "" : str;
    }

    public java.lang.String getCity() {
        java.lang.String str = this.f48528c;
        return str == null ? "" : str;
    }

    public java.lang.String getCountry() {
        java.lang.String str = this.f48527b;
        return str == null ? "" : str;
    }

    public java.lang.String getName() {
        java.lang.String str = this.f48530e;
        return str == null ? "" : str;
    }

    public java.lang.String getProvince() {
        java.lang.String str = this.f48526a;
        return str == null ? "" : str;
    }

    public java.lang.String getRegion() {
        java.lang.String str = this.f48529d;
        return str == null ? "" : str;
    }
}
