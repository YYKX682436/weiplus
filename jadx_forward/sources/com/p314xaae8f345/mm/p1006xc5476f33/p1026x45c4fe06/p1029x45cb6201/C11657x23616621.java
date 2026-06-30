package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "Landroid/os/Parcelable;", "UpdateResult", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent */
/* loaded from: classes7.dex */
public final class C11657x23616621 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621> f33457x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t4();

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.UpdateResult f156906g;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult;", "Landroid/os/Parcelable;", "Failed", "Succeed", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Failed;", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Succeed;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent$UpdateResult */
    /* loaded from: classes7.dex */
    public static abstract class UpdateResult implements android.os.Parcelable {

        @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Failed;", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent$UpdateResult$Failed */
        /* loaded from: classes7.dex */
        public static final class Failed extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.UpdateResult {

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.UpdateResult.Failed> f33458x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u4();

            public Failed() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel out, int i17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
                out.writeInt(1);
            }
        }

        @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Succeed;", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent$UpdateResult$Succeed */
        /* loaded from: classes7.dex */
        public static final class Succeed extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.UpdateResult {

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.UpdateResult.Succeed> f33459x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v4();

            /* renamed from: d, reason: collision with root package name */
            public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f156907d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Succeed(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 reader) {
                super(null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reader, "reader");
                this.f156907d = reader;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel out, int i17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
                out.writeParcelable(this.f156907d, i17);
            }
        }

        public UpdateResult(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        }
    }

    public C11657x23616621(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621.UpdateResult result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f156906g = result;
    }

    public static final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11657x23616621 c11657x23616621) {
        c11657x23616621.e();
        java.lang.String[] strArr = gm0.j1.f354738l;
        for (int i17 = 0; i17 < 5; i17++) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + strArr[i17];
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.o(str)) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(str, c11657x23616621, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w4.f157552d, null);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f156906g, i17);
    }
}
