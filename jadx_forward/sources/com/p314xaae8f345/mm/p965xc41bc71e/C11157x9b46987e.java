package com.p314xaae8f345.mm.p965xc41bc71e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgRequestDialogUiData;", "Landroid/os/Parcelable;", "com/tencent/mm/msgsubscription/a", "ItemUiData", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData */
/* loaded from: classes9.dex */
public final class C11157x9b46987e implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public int f153307d;

    /* renamed from: e, reason: collision with root package name */
    public int f153308e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f153309f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p965xc41bc71e.a f153306g = new com.p314xaae8f345.mm.p965xc41bc71e.a(null);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e> f32577x681a0c0c = new d31.c();

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/msgsubscription/SubscribeMsgRequestDialogUiData$ItemUiData;", "Landroid/os/Parcelable;", "wxbiz-msgsubscription-sdk_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData$ItemUiData */
    /* loaded from: classes9.dex */
    public static final class ItemUiData implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e.ItemUiData> f32578x681a0c0c = new com.p314xaae8f345.mm.p965xc41bc71e.b();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f153310d = "";

        /* renamed from: e, reason: collision with root package name */
        public int f153311e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f153312f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f153313g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
            parcel.writeString(this.f153310d);
            parcel.writeInt(this.f153311e);
            parcel.writeInt(this.f153312f ? 1 : 0);
            parcel.writeInt(this.f153313g ? 1 : 0);
        }
    }

    public C11157x9b46987e() {
        this.f153307d = 0;
        this.f153309f = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f153307d);
        parcel.writeInt(this.f153308e);
        parcel.writeList(this.f153309f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11157x9b46987e(android.os.Parcel parcel) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f153307d = parcel.readInt();
        this.f153308e = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readList(arrayList, com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e.ItemUiData.class.getClassLoader());
        this.f153309f = arrayList;
    }
}
