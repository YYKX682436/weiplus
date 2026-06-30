package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class b implements android.os.Parcelable.Creator {
    public b(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                jSONObject = new org.json.JSONObject(readString);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "EnterFinderResult#<init>, create JSONObject fail for " + readString + " since " + e17);
            }
            return new com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderResult(readInt, jSONObject);
        }
        jSONObject = null;
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderResult(readInt, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderResult[i17];
    }
}
