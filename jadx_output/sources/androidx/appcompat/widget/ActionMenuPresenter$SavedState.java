package androidx.appcompat.widget;

/* loaded from: classes13.dex */
class ActionMenuPresenter$SavedState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.appcompat.widget.ActionMenuPresenter$SavedState> CREATOR = new androidx.appcompat.widget.p();

    /* renamed from: d, reason: collision with root package name */
    public int f9335d;

    public ActionMenuPresenter$SavedState(android.os.Parcel parcel) {
        this.f9335d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f9335d);
    }
}
