package p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596;

/* renamed from: oicq.wlogin_sdk.sharemem.WloginSimpleInfo */
/* loaded from: classes13.dex */
public class C29274xba9fa492 implements java.io.Serializable, android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29274xba9fa492> f73107x681a0c0c = new i36.c();

    /* renamed from: serialVersionUID */
    private static final long f73108x3a3ed56c = 1;

    /* renamed from: _age */
    public byte[] f73109x2ca840;

    /* renamed from: _face */
    public byte[] f73110x56a8f3c;

    /* renamed from: _gender */
    public byte[] f73111x56f5efe0;

    /* renamed from: _nick */
    public byte[] f73112x56e5042;

    /* renamed from: _uin */
    public long f73113x2cf39b;

    public C29274xba9fa492() {
        this.f73113x2cf39b = 0L;
        this.f73110x56a8f3c = new byte[0];
        this.f73109x2ca840 = new byte[0];
        this.f73111x56f5efe0 = new byte[0];
        this.f73112x56e5042 = new byte[0];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: get_clone */
    public p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29274xba9fa492 m151449x43747734() {
        p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29274xba9fa492 c29274xba9fa492 = new p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29274xba9fa492();
        c29274xba9fa492.f73113x2cf39b = this.f73113x2cf39b;
        c29274xba9fa492.f73110x56a8f3c = (byte[]) this.f73110x56a8f3c.clone();
        c29274xba9fa492.f73109x2ca840 = (byte[]) this.f73109x2ca840.clone();
        c29274xba9fa492.f73111x56f5efe0 = (byte[]) this.f73111x56f5efe0.clone();
        c29274xba9fa492.f73112x56e5042 = (byte[]) this.f73112x56e5042.clone();
        return c29274xba9fa492;
    }

    /* renamed from: readFromParcel */
    public void m151451xb362ce89(android.os.Parcel parcel) {
        this.f73113x2cf39b = parcel.readLong();
        this.f73110x56a8f3c = parcel.createByteArray();
        this.f73109x2ca840 = parcel.createByteArray();
        this.f73111x56f5efe0 = parcel.createByteArray();
        this.f73112x56e5042 = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f73113x2cf39b);
        parcel.writeByteArray(this.f73110x56a8f3c);
        parcel.writeByteArray(this.f73109x2ca840);
        parcel.writeByteArray(this.f73111x56f5efe0);
        parcel.writeByteArray(this.f73112x56e5042);
    }

    public C29274xba9fa492(long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f73113x2cf39b = j17;
        this.f73110x56a8f3c = (byte[]) bArr.clone();
        this.f73109x2ca840 = (byte[]) bArr2.clone();
        this.f73111x56f5efe0 = (byte[]) bArr3.clone();
        this.f73112x56e5042 = (byte[]) bArr4.clone();
    }

    /* renamed from: get_clone */
    public void m151450x43747734(p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29274xba9fa492 c29274xba9fa492) {
        this.f73113x2cf39b = c29274xba9fa492.f73113x2cf39b;
        this.f73110x56a8f3c = (byte[]) c29274xba9fa492.f73110x56a8f3c.clone();
        this.f73109x2ca840 = (byte[]) c29274xba9fa492.f73109x2ca840.clone();
        this.f73111x56f5efe0 = (byte[]) c29274xba9fa492.f73111x56f5efe0.clone();
        this.f73112x56e5042 = (byte[]) c29274xba9fa492.f73112x56e5042.clone();
    }

    private C29274xba9fa492(android.os.Parcel parcel) {
        m151451xb362ce89(parcel);
    }

    public /* synthetic */ C29274xba9fa492(android.os.Parcel parcel, i36.c cVar) {
        this(parcel);
    }
}
