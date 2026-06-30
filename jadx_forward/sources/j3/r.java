package j3;

/* loaded from: classes13.dex */
public class r implements android.os.Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final j3.s f378874a;

    public r(j3.s sVar) {
        this.f378874a = sVar;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return this.f378874a.mo70262xe7458e6f(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return this.f378874a.mo70263x5070dc99(i17);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return this.f378874a.mo70262xe7458e6f(parcel, classLoader);
    }
}
