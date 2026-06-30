package p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596;

/* renamed from: oicq.wlogin_sdk.sharemem.WloginLoginInfo */
/* loaded from: classes9.dex */
public class C29272x70ba7e65 implements java.io.Serializable, android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29272x70ba7e65> f73072x681a0c0c = new i36.a();

    /* renamed from: TYPE_LOACL */
    public static int f73073x12bff6c2 = 1;

    /* renamed from: TYPE_REMOTE */
    public static int f73074x4ef4aceb = 2;

    /* renamed from: serialVersionUID */
    private static final long f73075x3a3ed56c = 5551948389726789420L;

    /* renamed from: mAccount */
    public java.lang.String f73076x57ec3d00;

    /* renamed from: mAppid */
    public long f73077xbdc8ce8f;

    /* renamed from: mCreateTime */
    public long f73078x2dce8236;

    /* renamed from: mType */
    public int f73079x6280547;

    /* renamed from: mUin */
    public long f73080x32d8ad;

    private C29272x70ba7e65(android.os.Parcel parcel) {
        m151444xb362ce89(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: readFromParcel */
    public void m151444xb362ce89(android.os.Parcel parcel) {
        this.f73076x57ec3d00 = parcel.readString();
        this.f73080x32d8ad = parcel.readLong();
        this.f73077xbdc8ce8f = parcel.readLong();
        this.f73078x2dce8236 = parcel.readLong();
        this.f73079x6280547 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f73076x57ec3d00);
        parcel.writeLong(this.f73080x32d8ad);
        parcel.writeLong(this.f73077xbdc8ce8f);
        parcel.writeLong(this.f73078x2dce8236);
        parcel.writeInt(this.f73079x6280547);
    }

    public /* synthetic */ C29272x70ba7e65(android.os.Parcel parcel, i36.a aVar) {
        this(parcel);
    }

    public C29272x70ba7e65(java.lang.String str, long j17, long j18, long j19, int i17) {
        this.f73076x57ec3d00 = str;
        this.f73080x32d8ad = j17;
        this.f73077xbdc8ce8f = j18;
        this.f73078x2dce8236 = j19;
        this.f73079x6280547 = i17;
    }
}
