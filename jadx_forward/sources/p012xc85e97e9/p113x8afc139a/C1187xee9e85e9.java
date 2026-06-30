package p012xc85e97e9.p113x8afc139a;

/* renamed from: androidx.versionedparcelable.ParcelImpl */
/* loaded from: classes13.dex */
public class C1187xee9e85e9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p113x8afc139a.C1187xee9e85e9> f3658x681a0c0c = new w4.a();

    /* renamed from: d, reason: collision with root package name */
    public final w4.e f93934d;

    public C1187xee9e85e9(w4.e eVar) {
        this.f93934d = eVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        new w4.d(parcel).l(this.f93934d);
    }

    public C1187xee9e85e9(android.os.Parcel parcel) {
        this.f93934d = new w4.d(parcel).h();
    }
}
