package androidx.activity.result;

/* loaded from: classes13.dex */
public final class IntentSenderRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.IntentSenderRequest> CREATOR = new androidx.activity.result.j();

    /* renamed from: d, reason: collision with root package name */
    public final android.content.IntentSender f9048d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f9049e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9050f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9051g;

    public IntentSenderRequest(android.content.IntentSender intentSender, android.content.Intent intent, int i17, int i18) {
        this.f9048d = intentSender;
        this.f9049e = intent;
        this.f9050f = i17;
        this.f9051g = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f9048d, i17);
        parcel.writeParcelable(this.f9049e, i17);
        parcel.writeInt(this.f9050f);
        parcel.writeInt(this.f9051g);
    }

    public IntentSenderRequest(android.os.Parcel parcel) {
        this.f9048d = (android.content.IntentSender) parcel.readParcelable(android.content.IntentSender.class.getClassLoader());
        this.f9049e = (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader());
        this.f9050f = parcel.readInt();
        this.f9051g = parcel.readInt();
    }
}
