package jr;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final im5.b f382834a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f382835b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f382836c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f382837d;

    public i(im5.b bVar) {
        this.f382834a = bVar;
    }

    public void a(java.lang.String desc, jr.n nVar) {
        java.lang.Integer num;
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        int i19 = 0;
        int i27 = 1;
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoji_suggest_remote_enable, false) && com.p314xaae8f345.mm.p2621x8fb0427b.h5.f276539d.Bi();
        boolean m164332x74219ae7 = ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).m164332x74219ae7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: remoteEnable " + z17);
        jr.j jVar = jr.j.f382838a;
        long j17 = jr.j.f382840c;
        int i28 = jr.j.f382839b;
        java.util.LinkedList linkedList = jr.j.f382841d;
        synchronized (linkedList) {
        }
        jr.q qVar = new jr.q(j17, i28, linkedList.size(), null, 8, null);
        if (m164332x74219ae7 || !z17) {
            if (nVar != null) {
                nVar.a(kz5.p0.f395529d, qVar);
                return;
            }
            return;
        }
        jr.e y07 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().f276711p.y0(desc);
        if (y07 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: has cache " + y07.f69115xa783a79b);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1418L, (long) 32, 1L);
            r45.hl5 hl5Var = new r45.hl5();
            byte[] bArr = y07.f69113xad49e234;
            if (bArr != null) {
                try {
                    hl5Var.mo11468x92b714fd(bArr);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            java.lang.String str = hl5Var.f457801e;
            if (str == null) {
                str = "";
            }
            qVar.f382854d = str;
            if (nVar != null) {
                java.util.LinkedList Emoji = hl5Var.f457800d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Emoji, "Emoji");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(Emoji, 10));
                int i29 = 0;
                for (java.lang.Object obj : Emoji) {
                    int i37 = i29 + 1;
                    if (i29 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.yk5 yk5Var = (r45.yk5) obj;
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(yk5Var.f472713d.f466419d);
                    if (u17 == null) {
                        u17 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                        n22.m.a(yk5Var.f472713d, u17);
                        u17.f68653x95b20dd4 = 65;
                    }
                    java.util.ArrayList d17 = gr.t.g().d();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getEmojiGroupInfoList(...)");
                    if (!d17.isEmpty()) {
                        java.util.Iterator it = d17.iterator();
                        while (it.hasNext()) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) it.next()).f68396x5bec8145, u17.f68663x861009b5)) {
                                i17 = i27;
                                break;
                            }
                        }
                    }
                    i17 = i19;
                    if (yk5Var.f472717h == i27) {
                        if (i17 != 0) {
                            i18 = i19;
                            arrayList.add(new jr.p(u17, new jr.o(i18, yk5Var.f472717h, hl5Var.f457803g, i37)));
                            i29 = i37;
                            i27 = 1;
                            i19 = 0;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: delete local emoji " + u17.mo42933xb5885648());
                        }
                    }
                    i18 = i27;
                    arrayList.add(new jr.p(u17, new jr.o(i18, yk5Var.f472717h, hl5Var.f457803g, i37)));
                    i29 = i37;
                    i27 = 1;
                    i19 = 0;
                }
                num = null;
                nVar.a(arrayList, qVar);
            } else {
                num = null;
            }
        } else {
            num = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSuggestMatchWord", "searchSuggest: no cache");
            if (nVar != null) {
                nVar.a(kz5.p0.f395529d, qVar);
            }
        }
        jr.e y08 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().f276711p.y0(desc);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkUpdate: ");
        sb6.append(desc);
        sb6.append(", ");
        sb6.append(y08 != null ? java.lang.Integer.valueOf(y08.f69115xa783a79b) : num);
        sb6.append(" needUpdate:");
        sb6.append(y08 != null ? java.lang.Boolean.valueOf(y08.t0()) : num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSuggestMatchWord", sb6.toString());
        if (y08 == null || y08.t0()) {
            r45.db4 db4Var = new r45.db4();
            if (this.f382837d) {
                java.util.ArrayList B = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).B(desc);
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_shuffle_size, 20);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSuggestMatchWord", "checkUpdate: shuffle " + Ni + ", local " + B.size());
                int min = java.lang.Math.min(Ni, B.size());
                for (int i38 = 0; i38 < min; i38++) {
                    db4Var.f453817d.add(B.get(i38));
                }
            }
            r45.gl5 gl5Var = new r45.gl5();
            gl5Var.f456866d = desc;
            gl5Var.f456867e = this.f382835b;
            gl5Var.f456868f = this.f382836c;
            gl5Var.f456871i = 4;
            gl5Var.f456872m = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(db4Var.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6947xa1fa1ae2 c6947xa1fa1ae2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6947xa1fa1ae2();
            c6947xa1fa1ae2.f142526d = c6947xa1fa1ae2.b("SessionId", this.f382836c, true);
            c6947xa1fa1ae2.f142527e = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1418L, 40, 1L);
            new gr.c(gl5Var).l().K(new jr.h(this, c6947xa1fa1ae2, desc));
        }
    }
}
