package la0;

/* loaded from: classes10.dex */
public class h0 implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        kl3.j jVar;
        kl3.e l17 = kl3.t.l();
        if (l17 instanceof kl3.z) {
            kl3.z zVar = (kl3.z) l17;
            zVar.getClass();
            if (m1Var instanceof nl3.a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "onSceneEnd errCode:%d", java.lang.Integer.valueOf(i18));
                if (!(i17 == 4 && i18 == -24)) {
                    if (i17 == 0 && i18 == 0) {
                        ll3.o2.Ai().D0(((nl3.a) m1Var).f419713f.f461591d, false);
                        return;
                    }
                    return;
                }
                r45.m10 m10Var = ((nl3.a) m1Var).f419713f;
                if (zVar.z() != null && m10Var.f461591d.equals(zVar.z().f66983xc8c6afdb)) {
                    ((kl3.t) zVar.B()).o();
                }
                ll3.o2.Ai().D0(m10Var.f461591d, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "onSceneEnd music is block %s", zVar.z().f66983xc8c6afdb);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5 c5721xb5961bd5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5();
                am.ik ikVar = c5721xb5961bd5.f136044g;
                ikVar.f88489a = i18;
                ikVar.f88490b = str;
                c5721xb5961bd5.e();
                return;
            }
            if (m1Var instanceof nl3.b) {
                if (i17 == 0 && i18 == 0) {
                    nl3.b bVar = (nl3.b) m1Var;
                    r45.bm3 bm3Var = bVar.f419716f;
                    java.lang.String str2 = bVar.f419717g.f66983xc8c6afdb;
                    if (bm3Var == null || str2 == null) {
                        return;
                    }
                    java.util.Iterator it = ((java.util.ArrayList) zVar.f390389e).iterator();
                    while (it.hasNext()) {
                        java.lang.String str3 = (java.lang.String) it.next();
                        if (str3.equals(str2)) {
                            java.lang.String f17 = x51.j1.f(bm3Var.f452403e);
                            java.lang.String f18 = x51.j1.f(bm3Var.f452404f);
                            java.lang.String f19 = x51.j1.f(bm3Var.f452402d);
                            ((ku5.t0) ku5.t0.f394148d).g(new kl3.v(zVar, str3, f17, f18, f19, bVar));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "get response %s %s %s", f17, f18, f19);
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f18)) {
                                return;
                            }
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
                            am.jk jkVar = c5722xb16ab0f4.f136045g;
                            jkVar.f88569b = 6;
                            jkVar.f88571d = bVar.f419717g.f66983xc8c6afdb;
                            c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (m1Var instanceof nl3.c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "GetShakeMusicUrl onSceneEnd errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                nl3.c cVar = (nl3.c) m1Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "getShakeMusicUrlScene callback, playUrl:%s, tempPlayUrl:%s", cVar.f419723g, cVar.f419722f);
                if (i17 == 0 && i18 == 0) {
                    java.lang.String str4 = cVar.f419723g;
                    java.lang.String str5 = cVar.f419722f;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = ml3.d.f409938a;
                    if (!android.text.TextUtils.isEmpty(str4) && !android.text.TextUtils.isEmpty(str5)) {
                        ml3.d.f409938a.put(str4, str5);
                        ml3.d.f409939b.put(str4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(558L, 214L, 1L, true);
                }
                ql3.a z17 = zVar.z();
                if (z17 != null && !android.text.TextUtils.isEmpty(z17.f446106h2) && z17.f446106h2.equalsIgnoreCase(cVar.f419723g)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is same, start to play shake music");
                    ((kl3.q) zVar.B()).d(z17.u0());
                    return;
                } else {
                    if (z17 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is diff, don't play, current playUrl is %s, netscene playUrl is %s", z17.f446106h2, cVar.f419723g);
                        return;
                    }
                    return;
                }
            }
            if (m1Var instanceof nl3.d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "MusicLiveGetLink onSceneEnd errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                nl3.d dVar = (nl3.d) m1Var;
                if (i17 == 0 && i18 == 0) {
                    ml3.c.f409932a.a(dVar.H());
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(558L, 221L, 1L, true);
                }
                ql3.a z18 = zVar.z();
                ml3.c cVar2 = ml3.c.f409932a;
                java.lang.String str6 = z18.f66981x4b6e6983;
                java.lang.String str7 = str6 == null ? null : (java.lang.String) ml3.c.f409933b.get(str6);
                if (str7 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicWechatPrivateLogic", "why cacheUrl is null after get new url.");
                }
                java.lang.String str8 = z18.f446106h2;
                java.lang.String str9 = str7 != null ? str7 : str8;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "change music url: old Url:%s, new url:%s", str8, str9);
                z18.f446106h2 = str9;
                if (dVar.H() != null && dVar.H().size() > 0) {
                    r45.cs4 cs4Var = (r45.cs4) dVar.H().get(0);
                    if (cs4Var == null) {
                        return;
                    }
                    java.lang.String str10 = cs4Var.f453347m;
                    if (str10 != null && str10.length() > 0 && (jVar = zVar.f390393i) != null) {
                        java.lang.String str11 = cs4Var.f453347m;
                        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m0) jVar;
                        m0Var.f232820a.f232843i.set(6, str11);
                        m0Var.f232820a.S6();
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m0Var.f232820a.m158354x19263085();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.class);
                        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var = m0Var.f232820a;
                        s1Var.V6(n0Var.f232843i, n0Var.f232844m, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.f232820a.f232839e, "get lyric from MidLink " + str11);
                        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l0(m0Var.f232820a, str11));
                        kl3.z zVar2 = (kl3.z) ((kl3.k) m0Var.f232821b);
                        if (zVar2.f390393i != null) {
                            zVar2.f390393i = null;
                        }
                    }
                }
                ((kl3.q) zVar.B()).d(z18.u0());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9) || !str9.equals(str8)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is diff, don't play, current playUrl is %s, netscene playUrl is %s", z18.f446106h2, str7);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "music playUrl is same, url:%s", z18.f446106h2);
                }
            }
        }
    }
}
