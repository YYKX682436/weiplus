package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/multitask/MultiTaskListParcel;", "Landroid/os/Parcelable;", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitask.MultiTaskListParcel */
/* loaded from: classes7.dex */
final class C16595x7ee52f25 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.C16595x7ee52f25> f37689x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.t0();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f231935d;

    public C16595x7ee52f25(java.util.List list) {
        this.f231935d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeTypedList(this.f231935d);
    }

    public C16595x7ee52f25(android.os.Parcel in6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
        this.f231935d = in6.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c.f37692x681a0c0c);
    }
}
