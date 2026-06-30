package com.tencent.mars.smc;

/* loaded from: classes7.dex */
public class IDKey implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mars.smc.IDKey> CREATOR = new android.os.Parcelable.Creator<com.tencent.mars.smc.IDKey>() { // from class: com.tencent.mars.smc.IDKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.mars.smc.IDKey createFromParcel(android.os.Parcel parcel) {
            return new com.tencent.mars.smc.IDKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.mars.smc.IDKey[] newArray(int i17) {
            return new com.tencent.mars.smc.IDKey[i17];
        }
    };

    /* renamed from: id, reason: collision with root package name */
    protected long f52538id;
    protected long key;
    protected long value;

    public IDKey(int i17, int i18) {
        this(i17, i18, 1);
    }

    public long GetID() {
        return this.f52538id;
    }

    public long GetKey() {
        return this.key;
    }

    public long GetValue() {
        return this.value;
    }

    public void SetID(int i17) {
        this.f52538id = i17;
    }

    public void SetKey(int i17) {
        this.key = i17;
    }

    public void SetValue(long j17) {
        this.value = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f52538id);
        parcel.writeLong(this.key);
        parcel.writeLong(this.value);
    }

    public IDKey(int i17, int i18, int i19) {
        this.f52538id = i17;
        this.key = i18;
        this.value = i19;
    }

    public IDKey(long j17, long j18, long j19) {
        this.f52538id = j17;
        this.key = j18;
        this.value = j19;
    }

    public IDKey() {
        this.f52538id = 0L;
        this.key = 0L;
        this.value = 0L;
    }

    public IDKey(android.os.Parcel parcel) {
        this.f52538id = parcel.readLong();
        this.key = parcel.readLong();
        this.value = parcel.readLong();
    }
}
