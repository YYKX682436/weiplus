package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.UnguessableToken */
/* loaded from: classes13.dex */
public class C29375x11443c1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<org.p3343x72743996.p3344x2e06d1.C29375x11443c1> f73479x681a0c0c = new android.os.Parcelable.Creator<org.p3343x72743996.p3344x2e06d1.C29375x11443c1>() { // from class: org.chromium.base.UnguessableToken.1
        @Override // android.os.Parcelable.Creator
        public org.p3343x72743996.p3344x2e06d1.C29375x11443c1 createFromParcel(android.os.Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (readLong == 0 || readLong2 == 0) {
                return null;
            }
            return new org.p3343x72743996.p3344x2e06d1.C29375x11443c1(readLong, readLong2);
        }

        @Override // android.os.Parcelable.Creator
        public org.p3343x72743996.p3344x2e06d1.C29375x11443c1[] newArray(int i17) {
            return new org.p3343x72743996.p3344x2e06d1.C29375x11443c1[i17];
        }
    };

    /* renamed from: mHigh */
    private final long f73480x62253af;

    /* renamed from: mLow */
    private final long f73481x32b7a7;

    /* renamed from: create */
    private static org.p3343x72743996.p3344x2e06d1.C29375x11443c1 m152747xaf65a0fc(long j17, long j18) {
        return new org.p3343x72743996.p3344x2e06d1.C29375x11443c1(j17, j18);
    }

    /* renamed from: parcelAndUnparcelForTesting */
    private org.p3343x72743996.p3344x2e06d1.C29375x11443c1 m152748xeab0c837() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        org.p3343x72743996.p3344x2e06d1.C29375x11443c1 createFromParcel = f73479x681a0c0c.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m152749xb2c87fbf(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        org.p3343x72743996.p3344x2e06d1.C29375x11443c1 c29375x11443c1 = (org.p3343x72743996.p3344x2e06d1.C29375x11443c1) obj;
        return c29375x11443c1.f73480x62253af == this.f73480x62253af && c29375x11443c1.f73481x32b7a7 == this.f73481x32b7a7;
    }

    /* renamed from: getHighForSerialization */
    public long m152750x9d8ab7df() {
        return this.f73480x62253af;
    }

    /* renamed from: getLowForSerialization */
    public long m152751x75b1f9e5() {
        return this.f73481x32b7a7;
    }

    /* renamed from: hashCode */
    public int m152752x8cdac1b() {
        long j17 = this.f73481x32b7a7;
        long j18 = this.f73480x62253af;
        return (((int) (j17 ^ (j17 >>> 32))) * 31) + ((int) ((j18 >>> 32) ^ j18));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f73480x62253af);
        parcel.writeLong(this.f73481x32b7a7);
    }

    private C29375x11443c1(long j17, long j18) {
        this.f73480x62253af = j17;
        this.f73481x32b7a7 = j18;
    }
}
