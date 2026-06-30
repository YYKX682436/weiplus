package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/multitask/PluginMultiTaskUIServiceProxy$IPCPoint", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/multitask/x1", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitask.PluginMultiTaskUIServiceProxy$IPCPoint */
/* loaded from: classes8.dex */
final class C16599x278bffa0 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.x1 f37691x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.x1(null);

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Point f231940d;

    public C16599x278bffa0() {
        this.f231940d = new android.graphics.Point(0, 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        android.graphics.Point point = this.f231940d;
        dest.writeInt(point.x);
        dest.writeInt(point.y);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16599x278bffa0(android.graphics.Point point) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(point, "point");
        this.f231940d = point;
    }
}
