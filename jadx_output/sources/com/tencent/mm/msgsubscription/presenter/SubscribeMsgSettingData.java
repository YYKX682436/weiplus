package com.tencent.mm.msgsubscription.presenter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/msgsubscription/presenter/SubscribeMsgSettingData;", "Landroid/os/Parcelable;", "CREATOR", "i31/e", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SubscribeMsgSettingData implements android.os.Parcelable {
    public static final i31.e CREATOR = new i31.e(null);

    /* renamed from: d, reason: collision with root package name */
    public boolean f71834d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f71835e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f71836f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f71837g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f71838h;

    public SubscribeMsgSettingData(com.tencent.mm.msgsubscription.SubscribeMsgRequestResult result, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(result, "result");
        this.f71838h = result;
        this.f71834d = result.f71790p;
        this.f71835e = result.f71789o;
        com.tencent.mm.msgsubscription.WordingInfo wordingInfo = result.f71788n;
        this.f71837g = (wordingInfo == null || (str = wordingInfo.f71825h) == null) ? "" : str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : result.f71785h) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            kotlin.jvm.internal.o.f(obtain, "obtain(...)");
            subscribeMsgTmpItem.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            arrayList.add(new com.tencent.mm.msgsubscription.SubscribeMsgTmpItem(obtain));
            obtain.recycle();
        }
        this.f71836f = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeByte(this.f71834d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f71835e ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.f71836f);
        parcel.writeString(this.f71837g);
        parcel.writeParcelable(this.f71838h, i17);
    }

    public SubscribeMsgSettingData(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f71834d = parcel.readByte() != 0;
        this.f71835e = parcel.readByte() != 0;
        java.util.ArrayList createTypedArrayList = parcel.createTypedArrayList(com.tencent.mm.msgsubscription.SubscribeMsgTmpItem.CREATOR);
        kotlin.jvm.internal.o.d(createTypedArrayList);
        this.f71836f = createTypedArrayList;
        this.f71837g = java.lang.String.valueOf(parcel.readString());
        android.os.Parcelable readParcelable = parcel.readParcelable(com.tencent.mm.msgsubscription.SubscribeMsgRequestResult.class.getClassLoader());
        kotlin.jvm.internal.o.d(readParcelable);
        this.f71838h = (com.tencent.mm.msgsubscription.SubscribeMsgRequestResult) readParcelable;
    }
}
