package com.p314xaae8f345.mm.p839xf223db21;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/maas_api/MovieComposingOption;", "Landroid/os/Parcelable;", "maas-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.maas_api.MovieComposingOption */
/* loaded from: classes.dex */
public final class C10859x7be975f4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p839xf223db21.C10859x7be975f4> f29647x681a0c0c = new pp0.v0();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f150177d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f150178e;

    public C10859x7be975f4(boolean z17, boolean z18) {
        this.f150177d = z17;
        this.f150178e = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f150177d ? 1 : 0);
        out.writeInt(this.f150178e ? 1 : 0);
    }
}
