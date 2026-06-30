package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes9.dex */
public final class f implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k f180417d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar) {
        this.f180417d = kVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "getCdnAuthInfo mediaId = ".concat(mediaId));
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar = this.f180417d;
        java.lang.String str = kVar.f180480d;
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExDeviceSendIotLogic", "cdnCallback Exception %s", e17);
        }
        if (i17 != 0) {
            kVar.f180485i = false;
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d(this.f180417d), "ExDeviceSendIotLogic");
            return 0;
        }
        if (gVar != null) {
            int i18 = (int) ((((float) gVar.f69496x83ec3dd) / ((float) gVar.f69500x8ab84c59)) * 100);
            if (i18 >= 100) {
                i18 = 99;
            }
            java.util.Iterator it = kVar.f180483g.keySet().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.k((java.lang.String) it.next(), i18);
            }
        }
        if (hVar != null) {
            r45.rf4 rf4Var = new r45.rf4();
            pt0.e0 e0Var = pt0.f0.f439742b1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar2 = this.f180417d;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(kVar2.f180478b, kVar2.f180477a);
            v32.d dVar = new v32.d();
            dVar.f67337xf9dbc27c = hVar.f69522xf9dbbe9c;
            dVar.f67336x419c440e = hVar.f69524x419c440e;
            dVar.f67335x1dfc107a = hVar.f69560x7b284d5e;
            dVar.f67333xf11e6e15 = hVar.f69502xf11df5f5;
            dVar.f67339x297eb8d7 = this.f180417d.f180477a;
            dVar.f67338x4b6e68b9 = hVar.f69526x419c9c3d;
            dVar.f67340x22618426 = (int) hVar.f69523x17c343e7;
            dVar.f67341x114ef53e = n17.Q0();
            if (this.f180417d.f180481e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExDeviceSendIotLogic", "no cdn type");
            }
            java.lang.Integer num = this.f180417d.f180481e;
            if (num != null) {
                dVar.f67334x9a7652c2 = num.intValue();
                int length = v32.d.D.f398485a.length;
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Zi().mo11260x413cb2b4(dVar);
                dn.m mVar = (dn.m) this.f180417d.f180487k.get(mediaId);
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar3 = this.f180417d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.b(rf4Var, mVar, kVar3.f180477a, kVar3.f180478b, "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "cdn uploaded md5 " + hVar.f69526x419c9c3d + " size " + hVar.f69523x17c343e7);
                r45.qf4 qf4Var = rf4Var.f466346h;
                if (qf4Var != null) {
                    r45.sx3 sx3Var = qf4Var.f465477p;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "deviceMsg.fileMsg key:" + sx3Var.f467539f + ", nonce: " + sx3Var.f467540g + ", tag: " + sx3Var.f467541h);
                }
                com.p314xaae8f345.mm.vfs.w6.h(mVar != null ? mVar.f69595x6d25b0d9 : null);
                com.p314xaae8f345.mm.vfs.w6.h(mVar != null ? mVar.f69619xe9ed65f6 : null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar4 = this.f180417d;
                kVar4.f180484h = rf4Var;
                kVar4.f180482f = 2;
                kVar4.f180485i = false;
                ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.e(this.f180417d), "ExDeviceSendIotLogic");
            }
            return 0;
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "decodePrepareResponse ");
        return inbuf;
    }
}
