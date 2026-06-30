package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/report/SnsCameraEditorReportItemParcelable;", "Landroid/os/Parcelable;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItemParcelable */
/* loaded from: classes4.dex */
public final /* data */ class C17031x9fd08c34 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17031x9fd08c34> f37778x681a0c0c = new nu3.k();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f237414d;

    public C17031x9fd08c34(java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f237414d = items;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m68058xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17031x9fd08c34) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f237414d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17031x9fd08c34) obj).f237414d);
    }

    /* renamed from: hashCode */
    public int m68059x8cdac1b() {
        return this.f237414d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m68060x9616526c() {
        return "SnsCameraEditorReportItemParcelable(items=" + this.f237414d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f237414d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071) it.next()).writeToParcel(out, i17);
        }
    }
}
