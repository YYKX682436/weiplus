package p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d;

/* renamed from: androidx.activity.result.ActivityResult */
/* loaded from: classes10.dex */
public final class C0059x32c0ac2c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c> f89x681a0c0c = new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f90575d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f90576e;

    public C0059x32c0ac2c(int i17, android.content.Intent intent) {
        this.f90575d = i17;
        this.f90576e = intent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m2529x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ActivityResult{resultCode=");
        int i17 = this.f90575d;
        sb6.append(i17 != -1 ? i17 != 0 ? java.lang.String.valueOf(i17) : "RESULT_CANCELED" : "RESULT_OK");
        sb6.append(", data=");
        sb6.append(this.f90576e);
        sb6.append('}');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f90575d);
        android.content.Intent intent = this.f90576e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i17);
        }
    }

    public C0059x32c0ac2c(android.os.Parcel parcel) {
        this.f90575d = parcel.readInt();
        this.f90576e = parcel.readInt() == 0 ? null : (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel);
    }
}
