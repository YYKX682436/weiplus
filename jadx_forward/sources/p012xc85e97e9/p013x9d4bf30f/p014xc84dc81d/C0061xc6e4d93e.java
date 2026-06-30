package p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d;

/* renamed from: androidx.activity.result.IntentSenderRequest */
/* loaded from: classes13.dex */
public final class C0061xc6e4d93e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0061xc6e4d93e> f90x681a0c0c = new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.j();

    /* renamed from: d, reason: collision with root package name */
    public final android.content.IntentSender f90581d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f90582e;

    /* renamed from: f, reason: collision with root package name */
    public final int f90583f;

    /* renamed from: g, reason: collision with root package name */
    public final int f90584g;

    public C0061xc6e4d93e(android.content.IntentSender intentSender, android.content.Intent intent, int i17, int i18) {
        this.f90581d = intentSender;
        this.f90582e = intent;
        this.f90583f = i17;
        this.f90584g = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f90581d, i17);
        parcel.writeParcelable(this.f90582e, i17);
        parcel.writeInt(this.f90583f);
        parcel.writeInt(this.f90584g);
    }

    public C0061xc6e4d93e(android.os.Parcel parcel) {
        this.f90581d = (android.content.IntentSender) parcel.readParcelable(android.content.IntentSender.class.getClassLoader());
        this.f90582e = (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader());
        this.f90583f = parcel.readInt();
        this.f90584g = parcel.readInt();
    }
}
