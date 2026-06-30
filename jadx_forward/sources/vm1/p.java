package vm1;

/* loaded from: classes11.dex */
public final class p implements com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25011xd338858b, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25011xd338858b
    /* renamed from: getSessionBuffer */
    public java.lang.String mo92767x97edf6c0(java.lang.String feedId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        long Z = pm0.v.Z(feedId);
        int i17 = (int) j17;
        ((c61.w8) paVar).getClass();
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).ek(Z, null, i17);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25011xd338858b.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25011xd338858b.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25011xd338858b.Companion.m92770x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25011xd338858b.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25011xd338858b.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = p07.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25011xd338858b.Companion.m92770x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.InterfaceC25011xd338858b
    /* renamed from: requestMediaInfo */
    public void mo92768x2f6954e3(byte[] finderInfo, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderInfo, "finderInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizAudioFinderSourcePlugin", "requestMediaInfo");
        bw5.e70 mo11468x92b714fd = new bw5.e70().mo11468x92b714fd(finderInfo);
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        java.lang.String m11811xb5887159 = mo11468x92b714fd.m11811xb5887159();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m11811xb5887159);
        ((c61.l7) b6Var).ml(r26.q0.c(m11811xb5887159), mo11468x92b714fd.b(), 0, true, false, "", new vm1.o(mo11468x92b714fd, callback));
    }
}
