package com.p314xaae8f345.mm.p2610xe8058ca2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sendtowework/LocationData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "c85/f", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sendtowework.LocationData */
/* loaded from: classes8.dex */
public final class C21013x64a751f extends com.p314xaae8f345.mm.p2610xe8058ca2.C21009xb9031cb5 {

    /* renamed from: CREATOR */
    public static final c85.f f39198x681a0c0c = new c85.f(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f274707d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f274708e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Double f274709f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Double f274710g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Double f274711h;

    public C21013x64a751f(java.lang.String str, java.lang.String str2, java.lang.Double d17, java.lang.Double d18, java.lang.Double d19) {
        this.f274707d = str;
        this.f274708e = str2;
        this.f274709f = d17;
        this.f274710g = d18;
        this.f274711h = d19;
    }

    @Override // com.p314xaae8f345.mm.p2610xe8058ca2.C21009xb9031cb5, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2610xe8058ca2.C21009xb9031cb5, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f274707d);
        parcel.writeString(this.f274708e);
        parcel.writeValue(this.f274709f);
        parcel.writeValue(this.f274710g);
        parcel.writeValue(this.f274711h);
    }
}
