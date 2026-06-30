package com.tencent.mm.plugin.appbrand.appcache;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "Landroid/os/Parcelable;", "UpdateResult", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class NotifyWxaCommLibUpdatedEvent extends com.tencent.mm.sdk.event.IEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.t4();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult f75373g;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult;", "Landroid/os/Parcelable;", "Failed", "Succeed", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Failed;", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Succeed;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public static abstract class UpdateResult implements android.os.Parcelable {

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Failed;", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes7.dex */
        public static final class Failed extends com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult {
            public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult.Failed> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.u4();

            public Failed() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel out, int i17) {
                kotlin.jvm.internal.o.g(out, "out");
                out.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult$Succeed;", "Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent$UpdateResult;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes7.dex */
        public static final class Succeed extends com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult {
            public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult.Succeed> CREATOR = new com.tencent.mm.plugin.appbrand.appcache.v4();

            /* renamed from: d, reason: collision with root package name */
            public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f75374d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Succeed(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader reader) {
                super(null);
                kotlin.jvm.internal.o.g(reader, "reader");
                this.f75374d = reader;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel out, int i17) {
                kotlin.jvm.internal.o.g(out, "out");
                out.writeParcelable(this.f75374d, i17);
            }
        }

        public UpdateResult(kotlin.jvm.internal.i iVar) {
        }
    }

    public NotifyWxaCommLibUpdatedEvent(com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult result) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f75373g = result;
    }

    public static final void f(com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent notifyWxaCommLibUpdatedEvent) {
        notifyWxaCommLibUpdatedEvent.e();
        java.lang.String[] strArr = gm0.j1.f273205l;
        for (int i17 = 0; i17 < 5; i17++) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b + strArr[i17];
            if (com.tencent.mm.sdk.platformtools.x2.o(str)) {
                com.tencent.mm.ipcinvoker.f.a(str, notifyWxaCommLibUpdatedEvent, com.tencent.mm.plugin.appbrand.appcache.w4.f76019d, null);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f75373g, i17);
    }
}
