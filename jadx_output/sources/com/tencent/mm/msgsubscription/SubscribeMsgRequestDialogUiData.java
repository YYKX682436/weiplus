package com.tencent.mm.msgsubscription;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgRequestDialogUiData;", "Landroid/os/Parcelable;", "com/tencent/mm/msgsubscription/a", "ItemUiData", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SubscribeMsgRequestDialogUiData implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public int f71774d;

    /* renamed from: e, reason: collision with root package name */
    public int f71775e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f71776f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.msgsubscription.a f71773g = new com.tencent.mm.msgsubscription.a(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData> CREATOR = new d31.c();

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgRequestDialogUiData$ItemUiData;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes9.dex */
    public static final class ItemUiData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.ItemUiData> CREATOR = new com.tencent.mm.msgsubscription.b();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f71777d = "";

        /* renamed from: e, reason: collision with root package name */
        public int f71778e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f71779f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f71780g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            kotlin.jvm.internal.o.g(parcel, "parcel");
            parcel.writeString(this.f71777d);
            parcel.writeInt(this.f71778e);
            parcel.writeInt(this.f71779f ? 1 : 0);
            parcel.writeInt(this.f71780g ? 1 : 0);
        }
    }

    public SubscribeMsgRequestDialogUiData() {
        this.f71774d = 0;
        this.f71776f = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f71774d);
        parcel.writeInt(this.f71775e);
        parcel.writeList(this.f71776f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscribeMsgRequestDialogUiData(android.os.Parcel parcel) {
        this();
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f71774d = parcel.readInt();
        this.f71775e = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readList(arrayList, com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.ItemUiData.class.getClassLoader());
        this.f71776f = arrayList;
    }
}
