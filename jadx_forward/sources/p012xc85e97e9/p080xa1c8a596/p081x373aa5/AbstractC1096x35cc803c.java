package p012xc85e97e9.p080xa1c8a596.p081x373aa5;

/* renamed from: androidx.customview.view.AbsSavedState */
/* loaded from: classes13.dex */
public abstract class AbstractC1096x35cc803c implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Parcelable f92645d;

    /* renamed from: e, reason: collision with root package name */
    public static final p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c f92644e = new p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c() { // from class: androidx.customview.view.AbsSavedState.1
    };

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c> f2882x681a0c0c = new p012xc85e97e9.p080xa1c8a596.p081x373aa5.a();

    public AbstractC1096x35cc803c(p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c.AnonymousClass1 anonymousClass1) {
        this.f92645d = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f92645d, i17);
    }

    public AbstractC1096x35cc803c(android.os.Parcelable parcelable) {
        if (parcelable != null) {
            this.f92645d = parcelable == f92644e ? null : parcelable;
            return;
        }
        throw new java.lang.IllegalArgumentException("superState must not be null");
    }

    public AbstractC1096x35cc803c(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f92645d = readParcelable == null ? f92644e : readParcelable;
    }
}
