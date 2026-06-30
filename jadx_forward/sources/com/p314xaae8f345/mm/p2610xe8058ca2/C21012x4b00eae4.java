package com.p314xaae8f345.mm.p2610xe8058ca2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sendtowework/LinkData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "c85/e", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sendtowework.LinkData */
/* loaded from: classes9.dex */
public final class C21012x4b00eae4 extends com.p314xaae8f345.mm.p2610xe8058ca2.C21009xb9031cb5 {

    /* renamed from: CREATOR */
    public static final c85.e f39197x681a0c0c = new c85.e(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f274703d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f274704e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f274705f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f274706g;

    public C21012x4b00eae4(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f274703d = str;
        this.f274704e = str2;
        this.f274705f = str3;
        this.f274706g = str4;
    }

    @Override // com.p314xaae8f345.mm.p2610xe8058ca2.C21009xb9031cb5, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2610xe8058ca2.C21009xb9031cb5, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f274703d);
        parcel.writeString(this.f274704e);
        parcel.writeString(this.f274705f);
        parcel.writeString(this.f274706g);
    }
}
