package com.tencent.mm.msgsubscription.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/msgsubscription/api/ISubscribeMsgService$Companion$SubscribeMsgListWrapper", "Landroid/os/Parcelable;", "CREATOR", "e31/f", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ISubscribeMsgService$Companion$SubscribeMsgListWrapper implements android.os.Parcelable {
    public static final e31.f CREATOR = new e31.f(null);

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f71832d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f71833e;

    public ISubscribeMsgService$Companion$SubscribeMsgListWrapper(java.util.List subscribeMsgList, boolean z17) {
        kotlin.jvm.internal.o.g(subscribeMsgList, "subscribeMsgList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f71832d = arrayList;
        arrayList.addAll(subscribeMsgList);
        this.f71833e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeTypedList(this.f71832d);
        parcel.writeByte(this.f71833e ? (byte) 1 : (byte) 0);
    }

    public ISubscribeMsgService$Companion$SubscribeMsgListWrapper(android.os.Parcel parcel) {
        k31.a aVar;
        k31.a aVar2;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f71832d = arrayList;
        try {
            parcel.readTypedList(arrayList, com.tencent.mm.msgsubscription.SubscribeMsgTmpItem.CREATOR);
            this.f71833e = parcel.readByte() != 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubscribeMsgListWrapper", e17, "SubscribeMsgListWrapper read parcel exception and clear storage", new java.lang.Object[0]);
            e31.n nVar = e31.n.f247087a;
            e31.k a17 = nVar.a("name_biz");
            if (a17 != null && (aVar2 = ((g31.l) a17).f268088a) != null) {
                ((k31.h) aVar2).a();
            }
            e31.k a18 = nVar.a("name_wxa");
            if (a18 == null || (aVar = ((g31.l) a18).f268088a) == null) {
                return;
            }
            ((k31.h) aVar).a();
        }
    }
}
