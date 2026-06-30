package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/multitask/PluginMultiTaskUIServiceProxy$IPCAnimationConfig", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/multitask/w1", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitask.PluginMultiTaskUIServiceProxy$IPCAnimationConfig */
/* loaded from: classes8.dex */
final class C16598xd7f22df6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.w1 f37690x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.w1(null);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f231938d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f231939e;

    public C16598xd7f22df6(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f231938d = parcel.readByte() != 0;
        this.f231939e = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeByte(this.f231938d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f231939e ? (byte) 1 : (byte) 0);
    }

    public C16598xd7f22df6(boolean z17, boolean z18) {
        this.f231938d = z17;
        this.f231939e = z18;
    }
}
