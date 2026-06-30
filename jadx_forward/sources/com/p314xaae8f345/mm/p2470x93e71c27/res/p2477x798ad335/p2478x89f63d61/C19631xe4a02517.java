package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/pluginsdk/res/downloader/checkresupdate/CheckResUpdateIPCUtils$QueryArgs", "Landroid/os/Parcelable;", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateIPCUtils$QueryArgs */
/* loaded from: classes4.dex */
public final /* data */ class C19631xe4a02517 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.C19631xe4a02517> f38831x681a0c0c = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.q();

    /* renamed from: d, reason: collision with root package name */
    public final int f271063d;

    /* renamed from: e, reason: collision with root package name */
    public final int f271064e;

    public C19631xe4a02517(int i17, int i18) {
        this.f271063d = i17;
        this.f271064e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m75295xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.C19631xe4a02517)) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.C19631xe4a02517 c19631xe4a02517 = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.C19631xe4a02517) obj;
        return this.f271063d == c19631xe4a02517.f271063d && this.f271064e == c19631xe4a02517.f271064e;
    }

    /* renamed from: hashCode */
    public int m75296x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f271063d) * 31) + java.lang.Integer.hashCode(this.f271064e);
    }

    /* renamed from: toString */
    public java.lang.String m75297x9616526c() {
        return "QueryArgs(resType=" + this.f271063d + ", subType=" + this.f271064e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f271063d);
        out.writeInt(this.f271064e);
    }
}
