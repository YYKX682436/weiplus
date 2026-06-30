package com.p314xaae8f345.p542x3306d5.smc;

/* renamed from: com.tencent.mars.smc.IDKey */
/* loaded from: classes7.dex */
public class C4582x424c344 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p542x3306d5.smc.C4582x424c344> f19530x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p542x3306d5.smc.C4582x424c344>() { // from class: com.tencent.mars.smc.IDKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[] newArray(int i17) {
            return new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[i17];
        }
    };

    /* renamed from: id, reason: collision with root package name */
    protected long f134071id;
    protected long key;

    /* renamed from: value */
    protected long f19531x6ac9171;

    public C4582x424c344(int i17, int i18) {
        this(i17, i18, 1);
    }

    /* renamed from: GetID */
    public long m40327x4182ad1() {
        return this.f134071id;
    }

    /* renamed from: GetKey */
    public long m40328x7eed3b49() {
        return this.key;
    }

    /* renamed from: GetValue */
    public long m40329x79249bdb() {
        return this.f19531x6ac9171;
    }

    /* renamed from: SetID */
    public void m40330x4c144dd(int i17) {
        this.f134071id = i17;
    }

    /* renamed from: SetKey */
    public void m40331x936762bd(int i17) {
        this.key = i17;
    }

    /* renamed from: SetValue */
    public void m40332x57b2b64f(long j17) {
        this.f19531x6ac9171 = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f134071id);
        parcel.writeLong(this.key);
        parcel.writeLong(this.f19531x6ac9171);
    }

    public C4582x424c344(int i17, int i18, int i19) {
        this.f134071id = i17;
        this.key = i18;
        this.f19531x6ac9171 = i19;
    }

    public C4582x424c344(long j17, long j18, long j19) {
        this.f134071id = j17;
        this.key = j18;
        this.f19531x6ac9171 = j19;
    }

    public C4582x424c344() {
        this.f134071id = 0L;
        this.key = 0L;
        this.f19531x6ac9171 = 0L;
    }

    public C4582x424c344(android.os.Parcel parcel) {
        this.f134071id = parcel.readLong();
        this.key = parcel.readLong();
        this.f19531x6ac9171 = parcel.readLong();
    }
}
