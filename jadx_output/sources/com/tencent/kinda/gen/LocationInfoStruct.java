package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class LocationInfoStruct {
    public java.lang.String mAdCode;
    public java.lang.String mCity;
    public java.lang.String mCountry;
    public java.lang.String mCountryCode;
    public java.lang.String mDistrict;
    public long mPositionTs;
    public java.lang.String mProvince;

    public LocationInfoStruct() {
    }

    public LocationInfoStruct(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, java.lang.String str6) {
        this.mProvince = str;
        this.mCity = str2;
        this.mDistrict = str3;
        this.mCountryCode = str4;
        this.mCountry = str5;
        this.mPositionTs = j17;
        this.mAdCode = str6;
    }

    public java.lang.String getAdCode() {
        return this.mAdCode;
    }

    public java.lang.String getCity() {
        return this.mCity;
    }

    public java.lang.String getCountry() {
        return this.mCountry;
    }

    public java.lang.String getCountryCode() {
        return this.mCountryCode;
    }

    public java.lang.String getDistrict() {
        return this.mDistrict;
    }

    public long getPositionTs() {
        return this.mPositionTs;
    }

    public java.lang.String getProvince() {
        return this.mProvince;
    }

    public java.lang.String toString() {
        return "LocationInfoStruct{mProvince=" + this.mProvince + ",mCity=" + this.mCity + ",mDistrict=" + this.mDistrict + ",mCountryCode=" + this.mCountryCode + ",mCountry=" + this.mCountry + ",mPositionTs=" + this.mPositionTs + ",mAdCode=" + this.mAdCode + "}";
    }
}
