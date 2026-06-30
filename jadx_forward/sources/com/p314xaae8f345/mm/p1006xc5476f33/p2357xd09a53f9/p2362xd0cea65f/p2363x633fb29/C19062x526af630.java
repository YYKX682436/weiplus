package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/model/WecoinEncashKVData;", "Landroid/os/Parcelable;", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData */
/* loaded from: classes8.dex */
public final class C19062x526af630 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630> f38665x681a0c0c = new ms4.p0();

    /* renamed from: d, reason: collision with root package name */
    public final int f260669d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f260670e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f260671f;

    public C19062x526af630(int i17, java.lang.String str, java.lang.String str2) {
        this.f260669d = i17;
        this.f260670e = str;
        this.f260671f = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f260669d);
        dest.writeString(this.f260670e);
        dest.writeString(this.f260671f);
    }
}
