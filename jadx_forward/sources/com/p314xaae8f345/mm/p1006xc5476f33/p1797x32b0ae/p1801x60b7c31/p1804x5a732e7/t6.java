package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes5.dex */
public class t6 implements com.p314xaae8f345.mm.p947xba6de98f.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f225319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f225320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q6 f225321c;

    public t6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q6 q6Var, java.util.HashMap hashMap, org.json.JSONObject jSONObject) {
        this.f225321c = q6Var;
        this.f225319a = hashMap;
        this.f225320b = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        org.json.JSONObject jSONObject = this.f225320b;
        java.util.Objects.toString(n1Var.f152636a);
        com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = n1Var.f152636a;
        int ordinal = m1Var.ordinal();
        java.util.HashMap hashMap = this.f225319a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q6 q6Var = this.f225321c;
        if (ordinal != 3) {
            if (ordinal == 4) {
                dn.h hVar = n1Var.f152641f;
                if (hVar != null) {
                    try {
                        jSONObject.put("cdnthumburl", hVar.f69522xf9dbbe9c);
                        jSONObject.put("cdnthumbmd5", hVar.f69526x419c9c3d);
                        jSONObject.put("cdnthumblength", hVar.f69562x366b1958);
                        jSONObject.put("cdnthumbaeskey", hVar.f69502xf11df5f5);
                        q6Var.f225265i.put("oldImageInfo", jSONObject.toString());
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendAppMessage", e17.getMessage());
                    }
                    hashMap.put("oldImageInfo", jSONObject.toString());
                }
                q6Var.A(q6Var.f225265i, hashMap);
                return;
            }
            if (ordinal != 16 && ordinal != 17) {
                switch (ordinal) {
                    case 12:
                    case 13:
                    case 14:
                        break;
                    default:
                        return;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(23449, q6Var.C(q6Var.f225263g, java.lang.String.format("[uploadOldImageInfo] upload cdn error with action %s", m1Var)));
        q6Var.A(q6Var.f225265i, hashMap);
    }
}
