package com.p314xaae8f345.mm.p965xc41bc71e.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/msgsubscription/api/ISubscribeMsgService$Companion$SubscribeMsgListWrapper", "Landroid/os/Parcelable;", "CREATOR", "e31/f", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper */
/* loaded from: classes9.dex */
public final class C11161xb2ee02d7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final e31.f f32582x681a0c0c = new e31.f(null);

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f153365d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f153366e;

    public C11161xb2ee02d7(java.util.List subscribeMsgList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subscribeMsgList, "subscribeMsgList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f153365d = arrayList;
        arrayList.addAll(subscribeMsgList);
        this.f153366e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeTypedList(this.f153365d);
        parcel.writeByte(this.f153366e ? (byte) 1 : (byte) 0);
    }

    public C11161xb2ee02d7(android.os.Parcel parcel) {
        k31.a aVar;
        k31.a aVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f153365d = arrayList;
        try {
            parcel.readTypedList(arrayList, com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3.f32580x681a0c0c);
            this.f153366e = parcel.readByte() != 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubscribeMsgListWrapper", e17, "SubscribeMsgListWrapper read parcel exception and clear storage", new java.lang.Object[0]);
            e31.n nVar = e31.n.f328620a;
            e31.k a17 = nVar.a("name_biz");
            if (a17 != null && (aVar2 = ((g31.l) a17).f349621a) != null) {
                ((k31.h) aVar2).a();
            }
            e31.k a18 = nVar.a("name_wxa");
            if (a18 == null || (aVar = ((g31.l) a18).f349621a) == null) {
                return;
            }
            ((k31.h) aVar).a();
        }
    }
}
