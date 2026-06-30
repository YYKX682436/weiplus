package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class u2 implements android.os.Parcelable.Creator {
    public u2(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult[i17];
    }
}
