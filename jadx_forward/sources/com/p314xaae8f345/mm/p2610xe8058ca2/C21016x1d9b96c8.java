package com.p314xaae8f345.mm.p2610xe8058ca2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sendtowework/WeWorkBufferMessage;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "c85/i", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sendtowework.WeWorkBufferMessage */
/* loaded from: classes9.dex */
public final class C21016x1d9b96c8 extends com.p314xaae8f345.mm.p2610xe8058ca2.C21009xb9031cb5 {

    /* renamed from: CREATOR */
    public static final c85.i f39201x681a0c0c = new c85.i(null);

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f274714d;

    public C21016x1d9b96c8(byte[] bArr) {
        this.f274714d = bArr;
    }

    @Override // com.p314xaae8f345.mm.p2610xe8058ca2.C21009xb9031cb5, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2610xe8058ca2.C21009xb9031cb5, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeByteArray(this.f274714d);
    }
}
