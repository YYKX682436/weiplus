package com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/rtos/model/RtosQuickReplyList;", "Landroid/os/Parcelable;", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.rtos.model.RtosQuickReplyList */
/* loaded from: classes11.dex */
public final /* data */ class C17251x5d26c8a1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17251x5d26c8a1> f37909x681a0c0c = new jy3.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f240117d;

    public C17251x5d26c8a1(java.util.ArrayList list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f240117d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m68510xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17251x5d26c8a1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f240117d, ((com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17251x5d26c8a1) obj).f240117d);
    }

    /* renamed from: hashCode */
    public int m68511x8cdac1b() {
        return this.f240117d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m68512x9616526c() {
        return "RtosQuickReplyList(list=" + this.f240117d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.ArrayList arrayList = this.f240117d;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17250x7f5e0d63) it.next()).writeToParcel(out, i17);
        }
    }
}
