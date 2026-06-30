package androidx.customview.view;

/* loaded from: classes13.dex */
public abstract class AbsSavedState implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Parcelable f11112d;

    /* renamed from: e, reason: collision with root package name */
    public static final androidx.customview.view.AbsSavedState f11111e = new androidx.customview.view.AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final android.os.Parcelable.Creator<androidx.customview.view.AbsSavedState> CREATOR = new androidx.customview.view.a();

    public AbsSavedState(androidx.customview.view.AbsSavedState.AnonymousClass1 anonymousClass1) {
        this.f11112d = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f11112d, i17);
    }

    public AbsSavedState(android.os.Parcelable parcelable) {
        if (parcelable != null) {
            this.f11112d = parcelable == f11111e ? null : parcelable;
            return;
        }
        throw new java.lang.IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f11112d = readParcelable == null ? f11111e : readParcelable;
    }
}
