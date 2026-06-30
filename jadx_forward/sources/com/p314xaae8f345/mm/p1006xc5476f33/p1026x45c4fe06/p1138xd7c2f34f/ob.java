package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class ob extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f166397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f166399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b7 f166400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b7 b7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f166398e = str;
        this.f166399f = i17;
        this.f166400g = b7Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ob(this.f166398e, this.f166399f, this.f166400g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ob) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f166397d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b7 b7Var = this.f166400g;
        java.lang.String str = this.f166398e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x(str, this.f166399f);
                this.f166397d = 1;
                obj = xVar.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            r45.ts3 ts3Var = (r45.ts3) obj;
            java.lang.String str2 = ts3Var.f468290d;
            if (str2 == null || str2.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ib.b("CgiGetWxaDebugInfo-ext_json_empty", b7Var);
                return java.lang.Boolean.FALSE;
            }
            try {
                jSONObject = new org.json.JSONObject(ts3Var.f468290d);
            } catch (java.lang.Exception unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                java.lang.String str3 = this.f166398e;
                java.lang.String optString = jSONObject.optString("checkSumMd5");
                java.lang.String optString2 = jSONObject.optString("downloadURL");
                if (!(optString == null || optString.length() == 0)) {
                    if (!(optString2 == null || optString2.length() == 0)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().k(str3, 1, optString2, optString, 0L, java.util.concurrent.TimeUnit.HOURS.toSeconds(2L) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                    }
                }
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5.class)).D0(str, 1, ts3Var.f468290d, true)) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r.u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a(), this.f166398e, 1, false, 4, null);
            }
            return java.lang.Boolean.TRUE;
        } catch (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.d e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ib.b("CgiGetWxaDebugInfo-ERROR-" + e17, b7Var);
            return java.lang.Boolean.FALSE;
        }
    }
}
