package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.BulkCursorDescriptor */
/* loaded from: classes12.dex */
public final class C26866x1d4c74b7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p3121x37984a.C26866x1d4c74b7> f57718x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p3121x37984a.C26866x1d4c74b7>() { // from class: com.tencent.wcdb.BulkCursorDescriptor.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p3121x37984a.C26866x1d4c74b7 createFromParcel(android.os.Parcel parcel) {
            com.p314xaae8f345.p3121x37984a.C26866x1d4c74b7 c26866x1d4c74b7 = new com.p314xaae8f345.p3121x37984a.C26866x1d4c74b7();
            c26866x1d4c74b7.m106141xb362ce89(parcel);
            return c26866x1d4c74b7;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p3121x37984a.C26866x1d4c74b7[] newArray(int i17) {
            return new com.p314xaae8f345.p3121x37984a.C26866x1d4c74b7[i17];
        }
    };

    /* renamed from: columnNames */
    public java.lang.String[] f57719xcd46b992;

    /* renamed from: count */
    public int f57720x5a7510f;

    /* renamed from: cursor */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031 f57721xaf961356;

    /* renamed from: wantsAllOnMoveCalls */
    public boolean f57722x2959c047;

    /* renamed from: window */
    public com.p314xaae8f345.p3121x37984a.C26876xa70fd706 f57723xd10bdbf0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: readFromParcel */
    public void m106141xb362ce89(android.os.Parcel parcel) {
        this.f57721xaf961356 = com.p314xaae8f345.p3121x37984a.AbstractBinderC26867xca7dd55f.m106143xbd0d1927(parcel.readStrongBinder());
        this.f57719xcd46b992 = m106142x88fc1952(parcel);
        this.f57722x2959c047 = parcel.readInt() != 0;
        this.f57720x5a7510f = parcel.readInt();
        if (parcel.readInt() != 0) {
            this.f57723xd10bdbf0 = com.p314xaae8f345.p3121x37984a.C26876xa70fd706.f57754x681a0c0c.createFromParcel(parcel);
        }
    }

    /* renamed from: readStringArray */
    public final java.lang.String[] m106142x88fc1952(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        java.lang.String[] strArr = new java.lang.String[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            strArr[i17] = parcel.readString();
        }
        return strArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeStrongBinder(this.f57721xaf961356.asBinder());
        parcel.writeStringArray(this.f57719xcd46b992);
        parcel.writeInt(this.f57722x2959c047 ? 1 : 0);
        parcel.writeInt(this.f57720x5a7510f);
        if (this.f57723xd10bdbf0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            this.f57723xd10bdbf0.writeToParcel(parcel, i17);
        }
    }
}
