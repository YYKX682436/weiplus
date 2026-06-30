package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/magicbrush/jsapi/launch/MBJsApiHandleEcsAction$AllocTempFileResult", "Landroid/os/Parcelable;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileResult */
/* loaded from: classes.dex */
public final /* data */ class C16441x299753c5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16441x299753c5> f37491x681a0c0c = new md3.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229586d;

    public C16441x299753c5(java.lang.String str) {
        this.f229586d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66390xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16441x299753c5) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229586d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16441x299753c5) obj).f229586d);
    }

    /* renamed from: hashCode */
    public int m66391x8cdac1b() {
        java.lang.String str = this.f229586d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m66392x9616526c() {
        return "AllocTempFileResult(absolutePath=" + this.f229586d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f229586d);
    }
}
