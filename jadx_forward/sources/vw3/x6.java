package vw3;

/* loaded from: classes12.dex */
public final class x6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f522715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f522718g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f522716e = c22621x7603e017;
        this.f522717f = c22621x7603e0172;
        this.f522718g = repairerUploadTestUI;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vw3.x6(this.f522716e, this.f522717f, this.f522718g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw3.x6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String aj6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f522715d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f522716e;
            android.text.Editable text = c22621x7603e017.getText();
            long parseLong = !(text == null || r26.n0.N(text)) ? java.lang.Long.parseLong(c22621x7603e017.getText().toString()) : 0L;
            android.text.Editable text2 = this.f522717f.getText();
            if (text2 == null || (str = text2.toString()) == null) {
                str = "";
            }
            if (parseLong != 0) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(str, parseLong);
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b0 T1 = m11.b1.Di().T1(n17.Q0(), n17.m124847x74d37ac6());
                if (T1.j()) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(n17, bm5.f0.f104095g, m11.b1.Di().C1(new java.lang.Long(T1.f404182q)).f404170e, "", "");
                } else {
                    aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(n17, bm5.c0.f104083a.d(false), T1.f404170e, "", "");
                }
                java.lang.String str2 = aj6;
                java.lang.String r17 = c01.z1.r();
                java.lang.String str3 = r17 == null ? "" : r17;
                java.lang.String Q0 = n17.Q0();
                r70.g gVar = new r70.g(str2, 1, str3, Q0 == null ? "" : Q0, new k70.i0());
                xs.d1 d1Var = (xs.d1) i95.n0.c(xs.d1.class);
                this.f522715d = 1;
                ((v70.w) d1Var).getClass();
                obj = e80.r.f331608f.a().Z6(gVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r70.i iVar = ((r70.h) obj).f474642a;
        r70.i iVar2 = r70.i.f474646d;
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f522718g;
        if (iVar == iVar2) {
            repairerUploadTestUI.runOnUiThread(new vw3.v6(repairerUploadTestUI));
        } else {
            repairerUploadTestUI.runOnUiThread(new vw3.w6(repairerUploadTestUI));
        }
        return jz5.f0.f384359a;
    }
}
