package cr;

/* loaded from: classes12.dex */
public final class k implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f303108d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f303109e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f303110f;

    /* renamed from: g, reason: collision with root package name */
    public final z12.h f303111g;

    public k(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f303108d = emojiInfo;
        this.f303109e = callback;
        this.f303110f = "MicroMsg.EmojiFetcherConfigRetriever";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(emojiInfo.mo42933xb5885648());
        boolean z17 = false;
        this.f303111g = new z12.h(linkedList, 0);
        cr.i a17 = a(emojiInfo);
        java.lang.String str = a17.f303102b;
        boolean z18 = true;
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFetcherConfigRetriever", "config retriever: db url is empty");
        } else {
            boolean b17 = b(str);
            try {
                z17 = android.webkit.URLUtil.isValidUrl(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiFetcherConfigRetriever", "isUrlValid: " + e17);
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiFetcherConfigRetriever", "url invalid ".concat(str));
            }
            if (z17) {
                z18 = b17;
            }
        }
        if (!z18) {
            this.f303109e.mo149xb9724478(java.lang.Boolean.TRUE, a17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f303110f, "config retriever: db url is empty");
        h12.f.a(9L, 1L);
        gm0.j1.n().f354821b.a(697, this);
        gm0.j1.n().f354821b.g(this.f303111g);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cr.i a(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 r12) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr.k.a(com.tencent.mm.storage.emotion.EmojiInfo):cr.i");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    public final boolean b(java.lang.String str) {
        boolean z17;
        java.lang.StringBuilder sb6;
        java.lang.String str2;
        boolean z18;
        java.lang.String str3 = this.f303110f;
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EmojiUpdateUrlDomain");
        java.lang.String[] split = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) ? null : d17.split(",");
        try {
            java.lang.String host = android.net.Uri.parse(str).getHost();
            if (split != null) {
                try {
                    if (kz5.z.G(split, host)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "config retriever: blocked host:" + host + ", list:" + kz5.z.d0(split, null, null, null, 0, null, null, 63, null));
                        return true;
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                    z17 = false;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isUrlBlocked: error ");
                    sb7.append(e);
                    sb7.append("; url ");
                    sb7.append(str);
                    sb7.append(", list:");
                    if (split != null) {
                        sb6 = sb7;
                        str2 = kz5.z.d0(split, null, null, null, 0, null, null, 63, null);
                    } else {
                        sb6 = sb7;
                        str2 = null;
                    }
                    sb6.append(str2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
                    if (split != null) {
                        int length = split.length;
                        ?? r152 = z17;
                        while (true) {
                            if (r152 >= length) {
                                z18 = z17;
                                break;
                            }
                            java.lang.String str4 = split[r152];
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                            if (r26.n0.D(str, str4, z17, 2, null)) {
                                z18 = true;
                                break;
                            }
                            r152++;
                        }
                        if (z18) {
                            return true;
                        }
                    }
                    return z17;
                }
            }
            return false;
        } catch (java.lang.Exception e18) {
            e = e18;
            z17 = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        int mo808xfb85f7b0 = scene.mo808xfb85f7b0();
        java.lang.String str2 = this.f303110f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onSceneEnd: " + i17 + ", " + i18 + ", " + mo808xfb85f7b0);
        if (mo808xfb85f7b0 == 697) {
            z12.h hVar = this.f303111g;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(scene, hVar)) {
                gm0.j1.n().f354821b.q(697, this);
                r45.ye I = hVar.I();
                java.util.LinkedList linkedList = I != null ? I.f472541g : null;
                boolean z17 = linkedList == null || linkedList.isEmpty();
                yz5.p pVar = this.f303109e;
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f303108d;
                if (z17) {
                    if (i17 == 0 && i18 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onSceneEnd: response list is empty");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(164L, 11L);
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6292xdef86542 c6292xdef86542 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6292xdef86542();
                        c6292xdef86542.f136546d = c6292xdef86542.b("Md5", c21053xdbf1e5f4.mo42933xb5885648(), true);
                        c6292xdef86542.f136547e = 5L;
                        c6292xdef86542.k();
                        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_sync_test, 0) & 4) > 0 && n22.m.k(c21053xdbf1e5f4)) {
                            gm0.j1.n().f354821b.g(new z12.g(0, 2, kz5.b0.c(c21053xdbf1e5f4.mo42933xb5885648()), null));
                            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().n1(kz5.b0.c(c21053xdbf1e5f4.mo42933xb5885648()), 0);
                        }
                    }
                    pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
                    return;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(c21053xdbf1e5f4.mo42933xb5885648());
                if (u17 == null) {
                    u17 = c21053xdbf1e5f4;
                }
                n22.m.a((r45.ri0) I.f472541g.get(0), u17);
                n22.m.a((r45.ri0) I.f472541g.get(0), c21053xdbf1e5f4);
                cr.i a17 = a(u17);
                java.lang.String str3 = a17.f303102b;
                if (!(str3.length() > 0)) {
                    pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
                    return;
                }
                if (b(str3)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6292xdef86542 c6292xdef865422 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6292xdef86542();
                    c6292xdef865422.f136546d = c6292xdef865422.b("Md5", c21053xdbf1e5f4.mo42933xb5885648(), true);
                    c6292xdef865422.f136547e = 4L;
                    c6292xdef865422.k();
                }
                ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().m(u17);
                pm0.v.L("EmojiFetcherConfigRetriever_onSceneEnd", true, new cr.j(this, a17));
            }
        }
    }
}
