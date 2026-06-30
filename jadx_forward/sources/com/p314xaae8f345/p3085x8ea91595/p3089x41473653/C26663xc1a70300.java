package com.p314xaae8f345.p3085x8ea91595.p3089x41473653;

/* renamed from: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo */
/* loaded from: classes13.dex */
public class C26663xc1a70300 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300> f56058x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300>() { // from class: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300[] newArray(int i17) {
            return new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300[i17];
        }
    };

    /* renamed from: mContentType */
    public java.lang.String f56059x92db64a6;

    /* renamed from: mReceiveDataLen */
    public long f56060xabd4db75;

    /* renamed from: mSavePath */
    public java.lang.String f56061xa9723acf;

    /* renamed from: mState */
    public int f56062xbec81024;

    /* renamed from: mTotalDataLen */
    public long f56063xeaf8334;

    /* renamed from: mUrl */
    public java.lang.String f56064x32d9c2;

    public C26663xc1a70300(java.lang.String str, java.lang.String str2, int i17, long j17, long j18, java.lang.String str3) {
        this.f56064x32d9c2 = str;
        this.f56061xa9723acf = str2;
        this.f56062xbec81024 = i17;
        this.f56060xabd4db75 = j17;
        this.f56063xeaf8334 = j18;
        this.f56059x92db64a6 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str = this.f56064x32d9c2;
        if (str != null) {
            parcel.writeString(str);
        } else {
            parcel.writeString("");
        }
        java.lang.String str2 = this.f56061xa9723acf;
        if (str2 != null) {
            parcel.writeString(str2);
        } else {
            parcel.writeString("");
        }
        parcel.writeInt(this.f56062xbec81024);
        parcel.writeLong(this.f56060xabd4db75);
        parcel.writeLong(this.f56063xeaf8334);
        parcel.writeString(this.f56059x92db64a6);
    }
}
