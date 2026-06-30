package com.p314xaae8f345.mm.p621xcc7b5c73;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/analyse/DownloadAnalyse$AnalyseData", "Landroid/os/Parcelable;", "feature-cdn_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.analyse.DownloadAnalyse$AnalyseData */
/* loaded from: classes7.dex */
public final /* data */ class C4984xbc204a24 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p621xcc7b5c73.C4984xbc204a24> f21395x681a0c0c = new nk.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f134721d;

    public C4984xbc204a24(java.util.HashSet data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f134721d = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42916xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p621xcc7b5c73.C4984xbc204a24) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134721d, ((com.p314xaae8f345.mm.p621xcc7b5c73.C4984xbc204a24) obj).f134721d);
    }

    /* renamed from: hashCode */
    public int m42917x8cdac1b() {
        return this.f134721d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m42918x9616526c() {
        return "AnalyseData(data=" + this.f134721d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.HashSet hashSet = this.f134721d;
        out.writeInt(hashSet.size());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p621xcc7b5c73.C4985x6dc3c08e) it.next()).writeToParcel(out, i17);
        }
    }
}
