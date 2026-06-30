package p012xc85e97e9.p098xc4a6178c.p099x38a77192;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/compose/PagingPlaceholderKey;", "Landroid/os/Parcelable;", "paging-compose_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.paging.compose.PagingPlaceholderKey */
/* loaded from: classes.dex */
final /* data */ class C1136xecbebab8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p098xc4a6178c.p099x38a77192.C1136xecbebab8> f3582x681a0c0c = new p012xc85e97e9.p098xc4a6178c.p099x38a77192.k();

    /* renamed from: d, reason: collision with root package name */
    public final int f93242d;

    public C1136xecbebab8(int i17) {
        this.f93242d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m7889xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p012xc85e97e9.p098xc4a6178c.p099x38a77192.C1136xecbebab8) && this.f93242d == ((p012xc85e97e9.p098xc4a6178c.p099x38a77192.C1136xecbebab8) obj).f93242d;
    }

    /* renamed from: hashCode */
    public int m7890x8cdac1b() {
        return java.lang.Integer.hashCode(this.f93242d);
    }

    /* renamed from: toString */
    public java.lang.String m7891x9616526c() {
        return "PagingPlaceholderKey(index=" + this.f93242d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f93242d);
    }
}
