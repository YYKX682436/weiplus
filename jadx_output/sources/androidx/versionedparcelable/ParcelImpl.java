package androidx.versionedparcelable;

/* loaded from: classes13.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = new w4.a();

    /* renamed from: d, reason: collision with root package name */
    public final w4.e f12401d;

    public ParcelImpl(w4.e eVar) {
        this.f12401d = eVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        new w4.d(parcel).l(this.f12401d);
    }

    public ParcelImpl(android.os.Parcel parcel) {
        this.f12401d = new w4.d(parcel).h();
    }
}
