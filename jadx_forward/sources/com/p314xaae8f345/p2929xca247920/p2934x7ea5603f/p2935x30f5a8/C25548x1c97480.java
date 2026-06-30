package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.NotFoundException */
/* loaded from: classes13.dex */
public class C25548x1c97480 extends java.lang.Exception implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25548x1c97480> f46719x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25548x1c97480>() { // from class: com.tencent.shadow.dynamic.host.NotFoundException.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25548x1c97480 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25548x1c97480(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25548x1c97480[] newArray(int i17) {
            return new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25548x1c97480[i17];
        }
    };

    public C25548x1c97480(java.lang.String str) {
        super(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(getMessage());
    }

    public C25548x1c97480(android.os.Parcel parcel) {
        super(parcel.readString());
    }
}
