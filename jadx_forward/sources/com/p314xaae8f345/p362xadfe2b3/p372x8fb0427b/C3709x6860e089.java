package com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b;

/* renamed from: com.tencent.liteapp.storage.WxaLiteAppAuthInfo */
/* loaded from: classes15.dex */
public class C3709x6860e089 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3709x6860e089> f14315x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3709x6860e089>() { // from class: com.tencent.liteapp.storage.WxaLiteAppAuthInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3709x6860e089 createFromParcel(android.os.Parcel parcel) {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3709x6860e089 c3709x6860e089 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3709x6860e089();
            c3709x6860e089.f14317x30f5a8 = parcel.readString();
            c3709x6860e089.url = parcel.readString();
            c3709x6860e089.f14316x5559a276 = parcel.readString();
            return c3709x6860e089;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3709x6860e089[] newArray(int i17) {
            return new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3709x6860e089[i17];
        }
    };

    /* renamed from: authInfo */
    public java.lang.String f14316x5559a276;

    /* renamed from: host */
    public java.lang.String f14317x30f5a8;
    public java.lang.String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m28990x9616526c() {
        return "WxaLiteAppAuthInfo{host='" + this.f14317x30f5a8 + "', url='" + this.url + "', authInfo='" + this.f14316x5559a276 + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f14317x30f5a8);
        parcel.writeString(this.url);
        parcel.writeString(this.f14316x5559a276);
    }
}
