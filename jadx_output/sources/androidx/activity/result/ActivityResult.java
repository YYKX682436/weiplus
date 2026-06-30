package androidx.activity.result;

/* loaded from: classes10.dex */
public final class ActivityResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.ActivityResult> CREATOR = new androidx.activity.result.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f9042d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f9043e;

    public ActivityResult(int i17, android.content.Intent intent) {
        this.f9042d = i17;
        this.f9043e = intent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ActivityResult{resultCode=");
        int i17 = this.f9042d;
        sb6.append(i17 != -1 ? i17 != 0 ? java.lang.String.valueOf(i17) : "RESULT_CANCELED" : "RESULT_OK");
        sb6.append(", data=");
        sb6.append(this.f9043e);
        sb6.append('}');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f9042d);
        android.content.Intent intent = this.f9043e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i17);
        }
    }

    public ActivityResult(android.os.Parcel parcel) {
        this.f9042d = parcel.readInt();
        this.f9043e = parcel.readInt() == 0 ? null : (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel);
    }
}
