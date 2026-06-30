package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl */
/* loaded from: classes16.dex */
public class C26356xafad9a19 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19> f52693x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19>() { // from class: com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19[] newArray(int i17) {
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19[i17];
        }
    };

    /* renamed from: dlType */
    private int f52694xb0be8be2;

    /* renamed from: extInfoMap */
    private java.util.Map<java.lang.String, java.lang.Object> f52695xca42f86d;

    /* renamed from: urlList */
    private java.util.ArrayList<java.lang.String> f52696xf5d79aad;

    public C26356xafad9a19(java.util.ArrayList<java.lang.String> arrayList, int i17, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.f52696xf5d79aad = arrayList;
        this.f52694xb0be8be2 = i17;
        this.f52695xca42f86d = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: getDlType */
    public int m102214x15d5aed8() {
        return this.f52694xb0be8be2;
    }

    /* renamed from: getExtInfoMap */
    public java.util.Map<java.lang.String, java.lang.Object> m102215xb883b063() {
        return this.f52695xca42f86d;
    }

    /* renamed from: getUrlList */
    public java.util.ArrayList<java.lang.String> m102216x33a4d677() {
        return this.f52696xf5d79aad;
    }

    /* renamed from: setDlType */
    public void m102217x90ae2e4(int i17) {
        this.f52694xb0be8be2 = i17;
    }

    /* renamed from: setExtInfoMap */
    public void m102218xe6a7fe6f(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.f52695xca42f86d = map;
    }

    /* renamed from: setUrlList */
    public void m102219xa71623eb(java.util.ArrayList<java.lang.String> arrayList) {
        this.f52696xf5d79aad = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStringList(this.f52696xf5d79aad);
        parcel.writeInt(this.f52694xb0be8be2);
        parcel.writeMap(this.f52695xca42f86d);
    }

    public C26356xafad9a19(android.os.Parcel parcel) {
        try {
            this.f52696xf5d79aad = parcel.createStringArrayList();
            this.f52694xb0be8be2 = parcel.readInt();
            this.f52695xca42f86d = parcel.readHashMap(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.C26356xafad9a19.class.getClassLoader());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e("TPDownloadParamAidl", 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, th6.toString());
            this.f52696xf5d79aad = new java.util.ArrayList<>();
            this.f52694xb0be8be2 = 0;
            this.f52695xca42f86d = new java.util.HashMap();
        }
    }
}
