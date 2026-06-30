package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ei implements com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer<com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a> {
    private static com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a a(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.json.JSONObject)) {
            return null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        java.lang.String string = jSONObject.getString("type");
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        if ("Point".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.tencent.mapsdk.internal.el.a.C30897a.d.class, new java.lang.Object[0]);
        }
        if ("Points".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.tencent.mapsdk.internal.el.a.C30897a.e.class, new java.lang.Object[0]);
        }
        if ("Line".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.tencent.mapsdk.internal.el.a.C30897a.b.class, new java.lang.Object[0]);
        }
        if (p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604.equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.tencent.mapsdk.internal.el.a.C30897a.c.class, new java.lang.Object[0]);
        }
        return null;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer
    /* renamed from: deserialize */
    public final /* synthetic */ com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a mo35869x6820db7f(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj2 == null || !(obj2 instanceof org.json.JSONObject)) {
            return null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
        java.lang.String string = jSONObject.getString("type");
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        if ("Point".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.tencent.mapsdk.internal.el.a.C30897a.d.class, new java.lang.Object[0]);
        }
        if ("Points".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.tencent.mapsdk.internal.el.a.C30897a.e.class, new java.lang.Object[0]);
        }
        if ("Line".equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.tencent.mapsdk.internal.el.a.C30897a.b.class, new java.lang.Object[0]);
        }
        if (p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604.equalsIgnoreCase(string)) {
            return (com.tencent.mapsdk.internal.el.a.C30897a.AbstractC30898a) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.tencent.mapsdk.internal.el.a.C30897a.c.class, new java.lang.Object[0]);
        }
        return null;
    }
}
