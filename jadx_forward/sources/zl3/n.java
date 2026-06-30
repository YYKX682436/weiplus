package zl3;

/* loaded from: classes11.dex */
public class n implements com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24659x1136450 f555603d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f555604e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1913x1747e6fd.p1914x633fb29.C16644xe1e76480 f555605f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k f555606g;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin$musicPlayerListener$1] */
    public n() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f555605f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(a0Var) { // from class: com.tencent.mm.plugin.musicchat.model.FlutterMusicPlayerPlugin$musicPlayerListener$1
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24615x764bb7d7 a17;
                com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24659x1136450 c24659x1136450;
                com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24659x1136450 c24659x11364502;
                com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24659x1136450 c24659x11364503;
                com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24659x1136450 c24659x11364504;
                com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24659x1136450 c24659x11364505;
                com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24659x1136450 c24659x11364506;
                com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24659x1136450 c24659x11364507;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 event = c5722xb16ab0f4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.jk jkVar = event.f136045g;
                if (jkVar == null) {
                    return false;
                }
                zl3.n nVar = zl3.n.this;
                nVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMusicPlayerPlugin", "callback: player " + jkVar.f88569b);
                int i17 = jkVar.f88569b;
                if (i17 == 0) {
                    b21.r rVar = jkVar.f88570c;
                    a17 = rVar != null ? nVar.a(rVar) : null;
                    if (a17 == null || (c24659x1136450 = nVar.f555603d) == null) {
                        return false;
                    }
                    c24659x1136450.m91470x7f3dff97(a17, new zl3.j(nVar));
                    return false;
                }
                if (i17 == 1) {
                    b21.r rVar2 = jkVar.f88570c;
                    a17 = rVar2 != null ? nVar.a(rVar2) : null;
                    if (a17 == null || (c24659x11364502 = nVar.f555603d) == null) {
                        return false;
                    }
                    c24659x11364502.m91467xa5e74840(a17, new zl3.j(nVar));
                    return false;
                }
                if (i17 == 2) {
                    b21.r rVar3 = jkVar.f88570c;
                    a17 = rVar3 != null ? nVar.a(rVar3) : null;
                    if (a17 == null || (c24659x11364503 = nVar.f555603d) == null) {
                        return false;
                    }
                    c24659x11364503.m91471xb4e5955(a17, new zl3.j(nVar));
                    return false;
                }
                if (i17 == 3) {
                    b21.r rVar4 = jkVar.f88570c;
                    a17 = rVar4 != null ? nVar.a(rVar4) : null;
                    if (a17 == null || (c24659x11364504 = nVar.f555603d) == null) {
                        return false;
                    }
                    c24659x11364504.m91465x2f98772b(a17, zl3.l.f555601d);
                    return false;
                }
                if (i17 == 7) {
                    b21.r rVar5 = jkVar.f88570c;
                    a17 = rVar5 != null ? nVar.a(rVar5) : null;
                    if (a17 == null || (c24659x11364505 = nVar.f555603d) == null) {
                        return false;
                    }
                    c24659x11364505.m91464x7bdb19ef(a17, new zl3.j(nVar));
                    return false;
                }
                if (i17 == 8) {
                    b21.r rVar6 = jkVar.f88570c;
                    a17 = rVar6 != null ? nVar.a(rVar6) : null;
                    if (a17 == null || (c24659x11364506 = nVar.f555603d) == null) {
                        return false;
                    }
                    c24659x11364506.m91468x58f0f3d6(a17, new zl3.j(nVar));
                    return false;
                }
                if (i17 != 12) {
                    return false;
                }
                b21.r rVar7 = jkVar.f88570c;
                a17 = rVar7 != null ? nVar.a(rVar7) : null;
                if (a17 == null || (c24659x11364507 = nVar.f555603d) == null) {
                    return false;
                }
                c24659x11364507.m91469xc52d978b(a17, new zl3.j(nVar));
                return false;
            }
        };
        this.f555606g = new zl3.m(this);
    }

    public final com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24615x764bb7d7 a(b21.r rVar) {
        java.lang.String str = rVar.P;
        java.lang.String str2 = rVar.f98882h;
        java.lang.String str3 = rVar.f98891t;
        java.lang.String str4 = rVar.f98887p;
        java.lang.String str5 = rVar.f98884m;
        java.lang.String str6 = rVar.f98888q;
        return new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24615x764bb7d7(rVar.f98879e, null, str2, null, str3, str4, str5, mo91480x51e8b0a(), str, str6, null, null, null, null, null, null, 64522, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: canPlayMusic */
    public boolean mo91476x6275bd61() {
        java.lang.String string;
        boolean z17;
        if (((o95.k) ((ve0.e) i95.n0.c(ve0.e.class))).Ai()) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573852g14);
        } else if (iq.b.a()) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g17);
        } else {
            ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
            if (!vq4.p0.d()) {
                ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
                if (!vq4.p0.c() && !iq.b.H() && !iq.b.d()) {
                    if (i95.n0.h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class)) {
                        java.util.Iterator it = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class))).Bi()).iterator();
                        while (it.hasNext()) {
                            if (((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6) it.next()).f158456f & 1) << 2) > 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMusicPlayerPlugin", "isAnyAppInVOIP, already exist wxa using VOIP");
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g17);
                    } else {
                        string = null;
                        if (iq.b.l(null, false)) {
                            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573849g11);
                        } else {
                            iq.b.r();
                        }
                    }
                }
            }
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g18);
        }
        if (string == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return true;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new zl3.k(string));
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: clearHistory */
    public void mo91477x35d48587() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("musicHistory_config" + gm0.j1.b().j()).putString("musicHistory", "");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: getCurrentMusic */
    public com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24615x764bb7d7 mo91478xb78356a2() {
        b21.r b17 = b21.m.b();
        return (b17 == null || !b21.m.c()) ? new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24615x764bb7d7(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null) : a(b17);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: getCurrentPosition */
    public com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24558x7f89d5ca mo91479x9746038c() {
        return new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24558x7f89d5ca(java.lang.Long.valueOf(b21.m.a().f98871b));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: getDuration */
    public com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24558x7f89d5ca mo91480x51e8b0a() {
        return new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24558x7f89d5ca(java.lang.Long.valueOf(b21.m.a().f98870a));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: getHistory */
    public java.lang.String mo91481x750d205e() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("musicHistory_config" + gm0.j1.b().j()).getString("musicHistory", "");
        return string != null ? string : "";
    }

    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.Companion.m91488x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        mo48813x58998cd();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f555603d = new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24659x1136450(m137983x3b5b91dc2, null, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l a17 = kl3.t.g().a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k kVar = this.f555606g;
        rl3.b bVar = (rl3.b) a17;
        if (kVar == null) {
            bVar.getClass();
            return;
        }
        java.util.LinkedList linkedList = bVar.f478768j;
        if (linkedList.contains(kVar)) {
            return;
        }
        linkedList.add(kVar);
    }

    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.Companion.m91488x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        mo48814x2efc64();
        ((rl3.b) kl3.t.g().a()).u(this.f555606g);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: pause */
    public void mo91482x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMusicPlayerPlugin", "pause: ");
        b21.m.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r0 == null) goto L17;
     */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: play */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo91483x348b34(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24615x764bb7d7 r15) {
        /*
            r14 = this;
            java.lang.String r0 = "info"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            java.lang.Class<c21.i> r0 = c21.i.class
            i95.m r0 = i95.n0.c(r0)
            c21.i r0 = (c21.i) r0
            ll3.j1 r0 = (ll3.j1) r0
            r0.getClass()
            ll3.b1 r0 = ll3.b1.f400673a
            ll3.e1 r0 = ll3.b1.f400674b
            boolean r0 = r0.u()
            r1 = 1
            if (r0 == 0) goto L20
            ll3.q0.b(r1)
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "play "
            r0.<init>(r2)
            java.lang.String r2 = r15.m91299x92013dea()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.FlutterMusicPlayerPlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            java.lang.String r0 = r15.m91299x92013dea()
            if (r0 == 0) goto L51
            java.lang.String r2 = r15.m91299x92013dea()
            if (r2 == 0) goto L4b
            int r2 = r2.length()
            if (r2 <= 0) goto L4a
            goto L4b
        L4a:
            r1 = 0
        L4b:
            if (r1 == 0) goto L4e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r0 != 0) goto L66
        L51:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r15.m91298xb5885712()
            r0.append(r1)
            java.lang.String r1 = "_send_music_in_chat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L66:
            r8 = r0
            r45.xs4 r0 = new r45.xs4
            r0.<init>()
            java.lang.String r1 = r15.m91294x66e287ae()
            r2 = 13
            r0.set(r2, r1)
            java.lang.String r1 = r15.m91294x66e287ae()
            r2 = 16
            r0.set(r2, r1)
            java.lang.String r1 = r15.m91302xd75a8eb6()
            r2 = 14
            r0.set(r2, r1)
            java.lang.String r1 = r15.m91297x74c84aa9()
            r2 = 15
            r0.set(r2, r1)
            java.lang.String r1 = r15.m91298xb5885712()
            r2 = 11
            r0.set(r2, r1)
            java.lang.String r1 = r15.m91294x66e287ae()
            r2 = 2
            r0.set(r2, r1)
            b21.t r13 = b21.t.a(r8, r0)
            r1 = 15
            java.lang.String r2 = r15.m91294x66e287ae()
            java.lang.String r3 = r15.m91302xd75a8eb6()
            java.lang.String r0 = r15.m91301x2f4fa672()
            java.lang.String r4 = ""
            if (r0 != 0) goto Lb8
            r0 = r4
        Lb8:
            java.lang.String r5 = r15.m91307x35e4f471()
            if (r5 != 0) goto Lbf
            r5 = r4
        Lbf:
            java.lang.String r6 = ""
            java.lang.String r7 = r15.m91295x93d2812f()
            gm0.b0 r4 = gm0.j1.u()
            java.lang.String r9 = r4.d()
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            java.lang.String r12 = r15.m91292x74292946()
            r4 = r0
            b21.r r15 = b21.u.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r14.f555604e
            r15.N = r0
            b21.m.i(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zl3.n.mo91483x348b34(com.tencent.pigeon.mm_foundation.FlutterMusicInfo):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: resume */
    public void mo91484xc84dc82d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMusicPlayerPlugin", "resume: ");
        b21.m.g();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: seek */
    public void mo91485x35ce78(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24558x7f89d5ca time) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        java.lang.Long m91045x754a37bb = time.m91045x754a37bb();
        b21.m.h(m91045x754a37bb != null ? (int) m91045x754a37bb.longValue() : 0);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: stop */
    public void mo91486x360802() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterMusicPlayerPlugin", "stop: ");
        b21.m.j();
    }
}
