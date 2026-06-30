package com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/msgsubscription/presenter/SubscribeMsgSettingData;", "Landroid/os/Parcelable;", "CREATOR", "i31/e", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData */
/* loaded from: classes9.dex */
public final class C11162xe78737a3 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final i31.e f32583x681a0c0c = new i31.e(null);

    /* renamed from: d, reason: collision with root package name */
    public boolean f153367d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f153368e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f153369f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f153370g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f153371h;

    public C11162xe78737a3(com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f153371h = result;
        this.f153367d = result.f153323p;
        this.f153368e = result.f153322o;
        com.p314xaae8f345.mm.p965xc41bc71e.C11160x93f17146 c11160x93f17146 = result.f153321n;
        this.f153370g = (c11160x93f17146 == null || (str = c11160x93f17146.f153358h) == null) ? "" : str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 : result.f153318h) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
            c11159x8f55e6d3.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            arrayList.add(new com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3(obtain));
            obtain.recycle();
        }
        this.f153369f = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeByte(this.f153367d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f153368e ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.f153369f);
        parcel.writeString(this.f153370g);
        parcel.writeParcelable(this.f153371h, i17);
    }

    public C11162xe78737a3(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f153367d = parcel.readByte() != 0;
        this.f153368e = parcel.readByte() != 0;
        java.util.ArrayList createTypedArrayList = parcel.createTypedArrayList(com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3.f32580x681a0c0c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createTypedArrayList);
        this.f153369f = createTypedArrayList;
        this.f153370g = java.lang.String.valueOf(parcel.readString());
        android.os.Parcelable readParcelable = parcel.readParcelable(com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5.class.getClassLoader());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(readParcelable);
        this.f153371h = (com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5) readParcelable;
    }
}
