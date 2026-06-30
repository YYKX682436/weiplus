package com.p314xaae8f345.p2891x34da02;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/qbar/WxQBarPoint;", "Lcom/tencent/qbar/QbarNative$QBarPoint;", "Landroid/os/Parcelable;", "CREATOR", "zs5/w0", "scan-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.qbar.WxQBarPoint */
/* loaded from: classes13.dex */
public final class C25310xa03ac6cd extends com.p314xaae8f345.p2891x34da02.C25303x87b156a3 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final zs5.w0 f45406x681a0c0c = new zs5.w0(null);

    public C25310xa03ac6cd(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f45383x5d45be3a = parcel.readInt();
        this.f296763x0 = parcel.readFloat();
        this.f296764x1 = parcel.readFloat();
        this.f296765x2 = parcel.readFloat();
        this.f296766x3 = parcel.readFloat();
        this.f296767y0 = parcel.readFloat();
        this.f296768y1 = parcel.readFloat();
        this.f296769y2 = parcel.readFloat();
        this.f296770y3 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f45383x5d45be3a);
        parcel.writeFloat(this.f296763x0);
        parcel.writeFloat(this.f296764x1);
        parcel.writeFloat(this.f296765x2);
        parcel.writeFloat(this.f296766x3);
        parcel.writeFloat(this.f296767y0);
        parcel.writeFloat(this.f296768y1);
        parcel.writeFloat(this.f296769y2);
        parcel.writeFloat(this.f296770y3);
    }

    public C25310xa03ac6cd(com.p314xaae8f345.p2891x34da02.C25303x87b156a3 c25303x87b156a3) {
        if (c25303x87b156a3 == null) {
            return;
        }
        this.f45383x5d45be3a = c25303x87b156a3.f45383x5d45be3a;
        this.f296763x0 = c25303x87b156a3.f296763x0;
        this.f296764x1 = c25303x87b156a3.f296764x1;
        this.f296765x2 = c25303x87b156a3.f296765x2;
        this.f296766x3 = c25303x87b156a3.f296766x3;
        this.f296767y0 = c25303x87b156a3.f296767y0;
        this.f296768y1 = c25303x87b156a3.f296768y1;
        this.f296769y2 = c25303x87b156a3.f296769y2;
        this.f296770y3 = c25303x87b156a3.f296770y3;
    }
}
