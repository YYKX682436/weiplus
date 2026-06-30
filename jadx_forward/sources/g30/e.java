package g30;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class})
/* loaded from: classes9.dex */
public class e extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.l5, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f349564d = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f349565e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f349566f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.m1 f349567g;

    public void Ai(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5) {
        long j17;
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = f9Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || c21053xdbf1e5f4 == null) {
            return;
        }
        if (c16564xb55e1d5 != null && c16564xb55e1d5.f231013d > 0) {
            if (((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).Ni(str, c16564xb55e1d5.a(), c16564xb55e1d5.f231013d, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "checkEmojiExist: claw user forwarding emoji, converted to text summary");
                return;
            }
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (f9Var2 == null) {
            f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            int i18 = c21053xdbf1e5f4.f68689x2262335f;
            if (i18 > 3 || i18 < 1) {
                g30.a aVar = new g30.a(this);
                if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(aVar);
                } else {
                    aVar.run();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "gamelife fobidden image: wrong format: emoji Type:%d", java.lang.Integer.valueOf(c21053xdbf1e5f4.f68689x2262335f));
                return;
            }
            f9Var2.m124850x7650bebc(47);
            f9Var2.u1(str);
            f9Var2.j1(1);
            f9Var2.d1(com.p314xaae8f345.mm.p2621x8fb0427b.y4.e("", currentTimeMillis, (c21053xdbf1e5f4.k() || c21053xdbf1e5f4.B1()) ? false : true, c21053xdbf1e5f4.mo42933xb5885648(), false, ""));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).fj(f9Var2, c21053xdbf1e5f4.mo42933xb5885648());
            f9Var2.e1(c01.w9.o(f9Var2.Q0()));
            j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
        } else {
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            long j18 = new com.p314xaae8f345.mm.p2621x8fb0427b.y4(f9Var.j()).f277887b;
            if (j18 == 0) {
                f9Var2.r1(5);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(m124847x74d37ac6, f9Var2, true);
                return;
            } else {
                j17 = m124847x74d37ac6;
                currentTimeMillis = j18;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "add Emoji: msgId = %s, md5 %s, len %s", java.lang.Long.valueOf(j17), c21053xdbf1e5f4.mo42933xb5885648(), java.lang.Integer.valueOf(c21053xdbf1e5f4.f68679x22618426));
        c01.h7 h7Var = new c01.h7();
        if (c16564xb55e1d5 != null) {
            h7Var.f118760b = c16564xb55e1d5.f231013d;
            h7Var.f118762d = c16564xb55e1d5.a();
        }
        java.util.List list = this.f349565e;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.add(new g30.d(this, f9Var2.Q0(), j17, str, c21053xdbf1e5f4, "" + currentTimeMillis, h7Var));
        if (!this.f349564d || linkedList.size() == 1) {
            this.f349564d = true;
            int i19 = c21053xdbf1e5f4.f68653x95b20dd4;
            l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
            if (i19 == 50 || i19 == 49) {
                wi();
                return;
            }
            if (c16564xb55e1d5.f231013d > 0) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a c6194x6522023a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a();
                long longValue = valueOf.longValue();
                am.xz xzVar = c6194x6522023a.f136451g;
                xzVar.f89942a = longValue;
                xzVar.f89943b = 0;
                i17 = 0;
                xzVar.f89944c = str;
                c6194x6522023a.e();
            } else {
                i17 = 0;
            }
            java.util.List list2 = this.f349566f;
            java.util.LinkedList linkedList2 = (java.util.LinkedList) list2;
            linkedList2.clear();
            linkedList2.add(((g30.d) linkedList.get(i17)).f349561d.f68671x4b6e68b9);
            gm0.j1.n().f354821b.g(new z12.i((java.util.LinkedList) list2));
        }
    }

    public final void Bi(int i17) {
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f349565e;
        if (linkedList.size() < 1) {
            this.f349564d = false;
            return;
        }
        g30.d dVar = (g30.d) linkedList.remove(0);
        java.lang.String str = dVar.f349560c;
        long j17 = dVar.f349558a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        Li.r1(i17);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
        if (linkedList.size() <= 0) {
            this.f349564d = false;
            return;
        }
        java.util.List list = this.f349566f;
        java.util.LinkedList linkedList2 = (java.util.LinkedList) list;
        linkedList2.clear();
        linkedList2.add(((g30.d) linkedList.get(0)).f349561d.f68671x4b6e68b9);
        gm0.j1.n().f354821b.g(new z12.i((java.util.LinkedList) list));
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        gm0.j1.n().f354821b.a(3862, this);
        gm0.j1.n().f354821b.a(697, this);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        gm0.j1.n().f354821b.q(3862, this);
        gm0.j1.n().f354821b.q(697, this);
        ((java.util.LinkedList) this.f349565e).clear();
        ((java.util.LinkedList) this.f349566f).clear();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int i19 = 5;
        if (m1Var instanceof z12.i) {
            java.util.List list = this.f349565e;
            if (!list.isEmpty()) {
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiBypService", "handleDownloadResult errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    Bi(5);
                    return;
                }
                com.p314xaae8f345.mm.p944x882e457a.o oVar = ((z12.i) m1Var).f550843e;
                r45.ye yeVar = oVar == null ? null : (r45.ye) oVar.f152244b.f152233a;
                if (yeVar.f472541g.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiBypService", "handleDownloadResult: BatchEmojiDownLoadResponse resp EmojiList empty ");
                } else {
                    r45.ri0 ri0Var = (r45.ri0) yeVar.f472541g.getFirst();
                    if (ri0Var.f466419d.equals(((java.util.LinkedList) this.f349566f).get(0)) && ri0Var.f466420e != null) {
                        wi();
                        return;
                    }
                }
                if (list.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiBypService", "no emoji to upload");
                    return;
                } else {
                    new qr.r(((g30.d) ((java.util.LinkedList) list).get(0)).f349561d, false, new g30.b(this));
                    return;
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = this.f349567g;
        if (m1Var2 == null || !m1Var2.getClass().isInstance(m1Var)) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            i19 = 2;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiBypService", "handleBypSendResult errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        Bi(i19);
    }

    public void wi() {
        java.util.List list = this.f349565e;
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiBypService", "no emoji to upload");
            return;
        }
        g30.d dVar = (g30.d) ((java.util.LinkedList) list).get(0);
        java.lang.String str = dVar.f349560c;
        java.lang.Long valueOf = java.lang.Long.valueOf(dVar.f349558a);
        h12.a aVar = new h12.a();
        aVar.f523670l = w11.p1.f523639h;
        aVar.f359610q = dVar.f349561d;
        aVar.g(str);
        java.lang.String str2 = dVar.f349559b;
        if (str2 == null) {
            str2 = "";
        }
        aVar.f523659a = str2;
        aVar.f(dVar.f349562e);
        aVar.f523665g = valueOf.longValue();
        w11.n1 a17 = aVar.a();
        this.f349567g = a17.f523628a;
        a17.a();
    }
}
