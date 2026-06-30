package p3335x340bc8.p3336x27ae93cd.p3339x696c9db;

/* renamed from: oicq.wlogin_sdk.tools.ErrMsg */
/* loaded from: classes13.dex */
public class C29275x7c39dbfc implements java.lang.Cloneable, android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29275x7c39dbfc> f73114x681a0c0c = new k36.b();

    /* renamed from: d, reason: collision with root package name */
    public int f427192d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f427193e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f427194f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f427195g;

    public C29275x7c39dbfc() {
        this.f427192d = 0;
        this.f427193e = "";
        this.f427194f = "";
        this.f427195g = "";
    }

    /* renamed from: clone */
    public java.lang.Object m151453x5a5dd5d() {
        return super.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f427192d);
        parcel.writeString(this.f427193e);
        parcel.writeString(this.f427194f);
        parcel.writeString(this.f427195g);
    }

    public C29275x7c39dbfc(android.os.Parcel parcel, k36.b bVar) {
        this.f427192d = parcel.readInt();
        this.f427193e = parcel.readString();
        this.f427194f = parcel.readString();
        this.f427195g = parcel.readString();
    }
}
