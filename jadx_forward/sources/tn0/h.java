package tn0;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f502207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(byte[] bArr, tn0.w0 w0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f502207d = bArr;
        this.f502208e = w0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tn0.h(this.f502207d, this.f502208e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tn0.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        kn0.g gVar;
        cl0.g gVar2;
        org.json.JSONObject jSONObject;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        byte[] bArr = this.f502207d;
        if (bArr != null) {
            boolean z17 = true;
            if (!(bArr.length == 0)) {
                tn0.w0 w0Var = this.f502208e;
                java.lang.String t17 = tn0.w0.t(w0Var, bArr);
                if (r26.n0.D(t17, "TencentStreamSEI", false, 2, null)) {
                    t17 = null;
                }
                if (t17 == null) {
                    return f0Var;
                }
                try {
                    gVar2 = new cl0.g(t17);
                    java.lang.String mo15082x48bce8a4 = gVar2.mo15082x48bce8a4("lm");
                    if (mo15082x48bce8a4 == null) {
                        mo15082x48bce8a4 = "";
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo15082x48bce8a4)) {
                        jSONObject = new org.json.JSONObject();
                    } else {
                        try {
                            jSONObject = new org.json.JSONObject(mo15082x48bce8a4);
                        } catch (org.json.JSONException unused) {
                            jSONObject = new org.json.JSONObject();
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiveCore", "handleSeiMessage seiData Exception:" + e17.getMessage() + " seiMessage:" + t17);
                    z17 = false;
                }
                if (jSONObject.optInt("lm") != 2) {
                    return f0Var;
                }
                w0Var.Z = t17;
                tn0.w0.w(w0Var, gVar2, t17);
                if (!z17) {
                    kn0.i iVar = w0Var.C;
                    w0Var.t0((iVar == null || (gVar = iVar.f391091b) == null) ? 0 : gVar.f391080n, bArr, false);
                }
                return f0Var;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "skip handleSeiMessageWithNoRestrict seiData: " + bArr);
        return f0Var;
    }
}
