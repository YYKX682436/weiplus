package tn0;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f502201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f502202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, byte[] bArr, tn0.w0 w0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f502201d = i17;
        this.f502202e = bArr;
        this.f502203f = w0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tn0.g(this.f502201d, this.f502202e, this.f502203f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tn0.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        cl0.g gVar;
        int optInt;
        cl0.g b17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        byte[] bArr = this.f502202e;
        int i17 = this.f502201d;
        if (i17 != 0 && bArr != null) {
            boolean z17 = false;
            if (!(bArr.length == 0)) {
                tn0.w0 w0Var = this.f502203f;
                java.lang.String t17 = tn0.w0.t(w0Var, bArr);
                if (r26.n0.D(t17, "TencentStreamSEI", false, 2, null)) {
                    t17 = null;
                }
                if (t17 == null) {
                    return f0Var;
                }
                ko0.d0.f391373a.a("handleSeiMessage", 2, "MicroMsg.LiveCore", "handleSeiMessage seiMode:" + i17 + " anchorId:" + w0Var.D.f391119f + " seiMessage:" + t17);
                try {
                    gVar = new cl0.g(t17);
                    w0Var.Z = t17;
                    optInt = gVar.optInt("wxT");
                    try {
                    } catch (java.lang.Exception unused) {
                        z17 = false;
                    }
                } catch (java.lang.Exception unused2) {
                }
                if (optInt == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.mo15082x48bce8a4("d"))) {
                    hn0.u uVar = hn0.u.f363970e;
                    if (pm0.v.z(i17, 1) && r26.n0.B(t17, "sgame", false)) {
                        w0Var.q0(1, t17);
                    }
                    if (pm0.v.z(i17, 2) && r26.n0.B(t17, "subtitle", false) && gVar.optInt("wxT") == 2) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("live_cdn_sei_msg", t17);
                        hn0.i iVar = w0Var.A;
                        if (iVar != null) {
                            iVar.mo57125xf5bc2045(21, bundle);
                        }
                    }
                    z17 = true;
                    if (!z17) {
                        w0Var.t0(i17, bArr, true);
                    }
                    return f0Var;
                }
                hn0.u uVar2 = hn0.u.f363970e;
                if (pm0.v.z(optInt, 8) && (b17 = gVar.b("d")) != null) {
                    long optLong = b17.optLong("anchorT");
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("live_cdn_sei_msg", gVar.mo15082x48bce8a4("d"));
                    bundle2.putLong("live_cdn_sei_msg_time", optLong);
                    hn0.i iVar2 = w0Var.A;
                    if (iVar2 != null) {
                        iVar2.mo57125xf5bc2045(29, bundle2);
                    }
                }
                if (pm0.v.z(optInt, 32)) {
                    java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("d");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                    if (!(mo15082x48bce8a4.length() > 0)) {
                        mo15082x48bce8a4 = null;
                    }
                    if (mo15082x48bce8a4 != null) {
                        tn0.w0.u(w0Var, mo15082x48bce8a4);
                    }
                }
                if (pm0.v.z(optInt, 16)) {
                    java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("rs");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a42);
                    java.lang.String str = mo15082x48bce8a42.length() > 0 ? mo15082x48bce8a42 : null;
                    if (str != null) {
                        tn0.w0.v(w0Var, new org.json.JSONObject(str));
                    }
                }
                if (pm0.v.z(i17, 4) && pm0.v.z(optInt, 4)) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString("live_cdn_sei_msg", gVar.mo15082x48bce8a4("d"));
                    hn0.i iVar3 = w0Var.A;
                    if (iVar3 != null) {
                        iVar3.mo57125xf5bc2045(18, bundle3);
                    }
                } else if (pm0.v.z(i17, 16) && pm0.v.z(optInt, 16)) {
                    tn0.w0.w(w0Var, gVar, t17);
                }
                return f0Var;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "skip handleSeiMessage seiMode " + i17 + " seiData: " + bArr);
        return f0Var;
    }
}
