package vw3;

/* loaded from: classes12.dex */
public final class t6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f522654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f522656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522657g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522658h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f522659i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f522655e = str;
        this.f522656f = j17;
        this.f522657g = str2;
        this.f522658h = str3;
        this.f522659i = repairerUploadTestUI;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vw3.t6(this.f522655e, this.f522656f, this.f522657g, this.f522658h, this.f522659i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw3.t6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object d76;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f522654d;
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f522659i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            v70.w wVar = (v70.w) ((xs.d1) i95.n0.c(xs.d1.class));
            java.lang.String str = this.f522655e;
            long j17 = this.f522656f;
            s70.a hj6 = wVar.hj(str, j17);
            java.lang.String b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("upimgjpg", c01.id.c(), str, j17 + "_0_0");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(this.f522657g, j17);
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(n17);
            java.lang.String str2 = this.f522658h;
            java.lang.String str3 = this.f522657g;
            java.lang.String str4 = this.f522655e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            s70.g gVar = new s70.g(null, str2, str3, str4, b17, S1.f404173h, new k70.i0(), 1, null);
            gVar.f485486j = new java.lang.ref.WeakReference(hj6);
            repairerUploadTestUI.runOnUiThread(new vw3.q6(repairerUploadTestUI));
            xs.d1 d1Var = (xs.d1) i95.n0.c(xs.d1.class);
            this.f522654d = 1;
            ((v70.w) d1Var).getClass();
            d76 = g80.o.f351052f.a().d7(gVar, this);
            if (d76 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            d76 = obj;
        }
        s70.h hVar = (s70.h) d76;
        if (hVar.f485489a == s70.i.f485494d) {
            repairerUploadTestUI.runOnUiThread(new vw3.r6(repairerUploadTestUI));
            try {
                java.lang.String format = java.lang.String.format("msg_img_upload_xml_" + c01.id.c() + ".txt", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
                byte[] bytes = hVar.f485490b.m126747x696739c().getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                ((zc0.h) i1Var).aj(format, bytes, true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(repairerUploadTestUI.d, e17, "record_attach_upload_xml", new java.lang.Object[0]);
            }
        } else {
            repairerUploadTestUI.runOnUiThread(new vw3.s6(repairerUploadTestUI));
        }
        return jz5.f0.f384359a;
    }
}
