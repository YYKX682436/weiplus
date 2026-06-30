package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class u4 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.readInt();
        return new com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult.Failed();
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult.Failed[i17];
    }
}
