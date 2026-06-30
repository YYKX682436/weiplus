package com.tencent.mm.plugin.appbrand.skyline.nativeview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/skyline/nativeview/SkylineNativeViewManager$InnerMotionEvent", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class SkylineNativeViewManager$InnerMotionEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.skyline.nativeview.SkylineNativeViewManager$InnerMotionEvent> CREATOR = new com.tencent.mm.plugin.appbrand.skyline.nativeview.u();

    /* renamed from: d, reason: collision with root package name */
    public final int f88881d;

    /* renamed from: e, reason: collision with root package name */
    public final int f88882e;

    /* renamed from: f, reason: collision with root package name */
    public final long f88883f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f88884g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f88885h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f88886i;

    public SkylineNativeViewManager$InnerMotionEvent(int i17, int i18, long j17, java.util.List pointerIds, java.util.List x17, java.util.List y17) {
        kotlin.jvm.internal.o.g(pointerIds, "pointerIds");
        kotlin.jvm.internal.o.g(x17, "x");
        kotlin.jvm.internal.o.g(y17, "y");
        this.f88881d = i17;
        this.f88882e = i18;
        this.f88883f = j17;
        this.f88884g = pointerIds;
        this.f88885h = x17;
        this.f88886i = y17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.skyline.nativeview.SkylineNativeViewManager$InnerMotionEvent)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.skyline.nativeview.SkylineNativeViewManager$InnerMotionEvent skylineNativeViewManager$InnerMotionEvent = (com.tencent.mm.plugin.appbrand.skyline.nativeview.SkylineNativeViewManager$InnerMotionEvent) obj;
        return this.f88881d == skylineNativeViewManager$InnerMotionEvent.f88881d && this.f88882e == skylineNativeViewManager$InnerMotionEvent.f88882e && this.f88883f == skylineNativeViewManager$InnerMotionEvent.f88883f && kotlin.jvm.internal.o.b(this.f88884g, skylineNativeViewManager$InnerMotionEvent.f88884g) && kotlin.jvm.internal.o.b(this.f88885h, skylineNativeViewManager$InnerMotionEvent.f88885h) && kotlin.jvm.internal.o.b(this.f88886i, skylineNativeViewManager$InnerMotionEvent.f88886i);
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f88881d) * 31) + java.lang.Integer.hashCode(this.f88882e)) * 31) + java.lang.Long.hashCode(this.f88883f)) * 31) + this.f88884g.hashCode()) * 31) + this.f88885h.hashCode()) * 31) + this.f88886i.hashCode();
    }

    public java.lang.String toString() {
        return "InnerMotionEvent(action=" + this.f88881d + ", actionIndex=" + this.f88882e + ", time=" + this.f88883f + ", pointerIds=" + this.f88884g + ", x=" + this.f88885h + ", y=" + this.f88886i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f88881d);
        out.writeInt(this.f88882e);
        out.writeLong(this.f88883f);
        java.util.List list = this.f88884g;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeInt(((java.lang.Number) it.next()).intValue());
        }
        java.util.List list2 = this.f88885h;
        out.writeInt(list2.size());
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            out.writeFloat(((java.lang.Number) it6.next()).floatValue());
        }
        java.util.List list3 = this.f88886i;
        out.writeInt(list3.size());
        java.util.Iterator it7 = list3.iterator();
        while (it7.hasNext()) {
            out.writeFloat(((java.lang.Number) it7.next()).floatValue());
        }
    }
}
