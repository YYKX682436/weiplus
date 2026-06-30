package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "foundation_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: androidx.compose.foundation.lazy.layout.DefaultLazyKey */
/* loaded from: classes.dex */
final /* data */ class C1056x3951a0ea implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.C1056x3951a0ea> f2643x681a0c0c = new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f91922d;

    public C1056x3951a0ea(int i17) {
        this.f91922d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m6998xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.C1056x3951a0ea) && this.f91922d == ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.C1056x3951a0ea) obj).f91922d;
    }

    /* renamed from: hashCode */
    public int m6999x8cdac1b() {
        return java.lang.Integer.hashCode(this.f91922d);
    }

    /* renamed from: toString */
    public java.lang.String m7000x9616526c() {
        return "DefaultLazyKey(index=" + this.f91922d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f91922d);
    }
}
