package rg0;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476720d = str;
        this.f476721e = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rg0.q(this.f476720d, this.f476721e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rg0.q qVar = (rg0.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str = this.f476721e;
        java.lang.String str2 = this.f476720d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rg0.t tVar = rg0.t.f476724a;
        try {
            java.lang.String str3 = str2 + "/pkg/assets";
            java.lang.String str4 = com.p314xaae8f345.mm.vfs.q7.c("PublicResource") + "/anops";
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str4);
            java.lang.String str5 = a17.f294812f;
            if (str5 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str4);
                java.lang.String str6 = a18.f294812f;
                if (str6 != null) {
                    java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                    if (!str6.equals(l18)) {
                        a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a18, null);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            com.p314xaae8f345.mm.vfs.r6[] G = new com.p314xaae8f345.mm.vfs.r6(str3).G();
            if (G != null) {
                java.util.Iterator a19 = p3321xbce91901.jvm.p3324x21ffc6bd.c.a(G);
                while (true) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.b bVar = (p3321xbce91901.jvm.p3324x21ffc6bd.b) a19;
                    if (!bVar.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.vfs.r6 r6Var = (com.p314xaae8f345.mm.vfs.r6) bVar.next();
                    if (r6Var != null) {
                        java.lang.String m82467xfb82e301 = r6Var.m82467xfb82e301();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                        if (r26.i0.n(m82467xfb82e301, "up.img", false)) {
                            tVar.i(str4, r6Var, str);
                        } else {
                            tVar.b(str4, r6Var);
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLModuleManager", "copyAssetsToWXPublicResource failed: %s", e17.getLocalizedMessage());
            rg0.t tVar2 = rg0.t.f476724a;
        }
        if (rg0.t.f476726c) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            if (L != null) {
                L.putString("WXANOPSLAVR", str);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            if (L2 != null) {
                L2.putString("WXANOPSLAPH", str2);
            }
            rg0.d0 d0Var = rg0.d0.f476701a;
            synchronized (rg0.d0.f476704d) {
                d0Var.a();
            }
        }
        return jz5.f0.f384359a;
    }
}
