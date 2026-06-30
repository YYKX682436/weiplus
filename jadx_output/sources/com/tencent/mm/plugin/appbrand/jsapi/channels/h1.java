package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class h1 implements android.os.Parcelable.Creator {
    public h1(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.jsapi.channels.s1 s1Var;
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.appbrand.jsapi.channels.r1 r1Var = com.tencent.mm.plugin.appbrand.jsapi.channels.s1.f80268e;
        int readInt = parcel.readInt();
        r1Var.getClass();
        com.tencent.mm.plugin.appbrand.jsapi.channels.s1[] values = com.tencent.mm.plugin.appbrand.jsapi.channels.s1.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                s1Var = null;
                break;
            }
            s1Var = values[i17];
            if (readInt == s1Var.f80272d) {
                break;
            }
            i17++;
        }
        if (s1Var == null) {
            s1Var = com.tencent.mm.plugin.appbrand.jsapi.channels.s1.f80269f;
        }
        int readInt2 = parcel.readInt();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                jSONObject = new org.json.JSONObject(readString);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "OpenFinderFeedResult#<init>, create JSONObject fail for " + readString + " since " + e17);
                jSONObject = new org.json.JSONObject();
            }
        } else {
            jSONObject = new org.json.JSONObject();
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult(s1Var, readInt2, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult[i17];
    }
}
