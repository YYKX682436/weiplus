package com.p314xaae8f345.p2841xd11c237d.smc;

/* renamed from: com.tencent.paymars.smc.IDKey */
/* loaded from: classes12.dex */
public class C23031x424c344 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2841xd11c237d.smc.C23031x424c344> f40234x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p2841xd11c237d.smc.C23031x424c344>() { // from class: com.tencent.paymars.smc.IDKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2841xd11c237d.smc.C23031x424c344 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p2841xd11c237d.smc.C23031x424c344(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2841xd11c237d.smc.C23031x424c344[] newArray(int i17) {
            return new com.p314xaae8f345.p2841xd11c237d.smc.C23031x424c344[i17];
        }
    };

    /* renamed from: id, reason: collision with root package name */
    protected long f296751id;
    protected long key;

    /* renamed from: value */
    protected long f40235x6ac9171;

    public C23031x424c344(int i17, int i18) {
        this(i17, i18, 1);
    }

    /* renamed from: GetID */
    public long m84469x4182ad1() {
        return this.f296751id;
    }

    /* renamed from: GetKey */
    public long m84470x7eed3b49() {
        return this.key;
    }

    /* renamed from: GetValue */
    public long m84471x79249bdb() {
        return this.f40235x6ac9171;
    }

    /* renamed from: SetID */
    public void m84472x4c144dd(int i17) {
        this.f296751id = i17;
    }

    /* renamed from: SetKey */
    public void m84473x936762bd(int i17) {
        this.key = i17;
    }

    /* renamed from: SetValue */
    public void m84474x57b2b64f(long j17) {
        this.f40235x6ac9171 = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f296751id);
        parcel.writeLong(this.key);
        parcel.writeLong(this.f40235x6ac9171);
    }

    public C23031x424c344(int i17, int i18, int i19) {
        this.f296751id = i17;
        this.key = i18;
        this.f40235x6ac9171 = i19;
    }

    public C23031x424c344(long j17, long j18, long j19) {
        this.f296751id = j17;
        this.key = j18;
        this.f40235x6ac9171 = j19;
    }

    public C23031x424c344() {
        this.f296751id = 0L;
        this.key = 0L;
        this.f40235x6ac9171 = 0L;
    }

    public C23031x424c344(android.os.Parcel parcel) {
        this.f296751id = parcel.readLong();
        this.key = parcel.readLong();
        this.f40235x6ac9171 = parcel.readLong();
    }
}
