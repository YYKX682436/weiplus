package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes7.dex */
public final class o implements android.os.Parcelable.Creator {
    public o(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageRequest[i17];
    }
}
