package ek2;

/* loaded from: classes3.dex */
public final class w extends ek2.g0 {
    public final r45.k01 A;
    public final org.json.JSONObject B;
    public final org.json.JSONObject C;

    /* renamed from: u, reason: collision with root package name */
    public final r45.hn1 f335086u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f335087v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f335088w;

    /* renamed from: x, reason: collision with root package name */
    public final long f335089x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f335090y;

    /* renamed from: z, reason: collision with root package name */
    public final ek2.v f335091z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.fd2 fd2Var, int i17, int i18, java.util.LinkedList visibilityList, java.util.LinkedList visibilityRoomList, java.util.LinkedList visibilityUserList, java.util.LinkedList luckyMoneyChatroomList, java.util.LinkedList visibilityLabelList, java.lang.String str2, java.lang.String str3, int i19, r45.sd7 sd7Var, r45.hn1 hn1Var, boolean z17, byte[] bArr, int i27, r45.qt2 qt2Var, r45.ba4 ba4Var, java.lang.Boolean bool, int i28, long j17, r45.q12 q12Var, int i29, int i37, r45.kf5 kf5Var, r45.aa0 aa0Var, byte[] bArr2, java.lang.String str4, o0.m mVar, long j18, ek2.v callback, int i38, int i39, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, 1, null);
        byte[] bArr3;
        int i47;
        int i48;
        int i49;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        int i57;
        int i58;
        java.lang.String str5;
        r45.fd2 fd2Var2;
        byte[] bArr4;
        java.util.LinkedList linkedList;
        int i59;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (i38 & 4) != 0 ? null : gVar;
        int i66 = (i38 & 32) != 0 ? 0 : i18;
        r45.sd7 sd7Var2 = (i38 & 16384) != 0 ? null : sd7Var;
        r45.hn1 hn1Var2 = (32768 & i38) != 0 ? null : hn1Var;
        boolean z18 = (i38 & 65536) != 0 ? false : z17;
        byte[] bArr5 = (i38 & 131072) != 0 ? null : bArr;
        r45.qt2 qt2Var2 = (i38 & 524288) != 0 ? null : qt2Var;
        int i67 = (i38 & 4194304) != 0 ? 0 : i28;
        int i68 = (i38 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0 ? 0 : i29;
        int i69 = (i38 & 67108864) != 0 ? 0 : i37;
        r45.kf5 kf5Var2 = (i38 & 134217728) != 0 ? null : kf5Var;
        r45.aa0 aa0Var2 = (i38 & 268435456) != 0 ? r45.aa0.CREATELIVEPAGEMODE_DEFAULT_MODE : aa0Var;
        byte[] bArr6 = (i38 & com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965) != 0 ? null : bArr2;
        java.lang.String str6 = (i38 & 1073741824) != 0 ? null : str4;
        o0.m mVar2 = (i38 & Integer.MIN_VALUE) != 0 ? null : mVar;
        long j19 = (i39 & 1) != 0 ? 0L : j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibilityList, "visibilityList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibilityRoomList, "visibilityRoomList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibilityUserList, "visibilityUserList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(luckyMoneyChatroomList, "luckyMoneyChatroomList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibilityLabelList, "visibilityLabelList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        o0.m mVar3 = mVar2;
        this.f335086u = hn1Var2;
        this.f335087v = z18;
        this.f335088w = bArr5;
        r45.sd7 sd7Var3 = sd7Var2;
        this.f335089x = j19;
        this.f335090y = "Finder.CgiFinderCreateLive";
        this.f335091z = callback;
        r45.k01 k01Var = new r45.k01();
        this.A = k01Var;
        this.B = new org.json.JSONObject();
        this.C = new org.json.JSONObject();
        k01Var.f459782d = db2.t4.f309704a.b(3686, qt2Var2);
        k01Var.K = zl2.q4.d(zl2.q4.f555466a, null, null, 3, null);
        k01Var.f459784f = c19793xceab7f56;
        k01Var.f459789n = gVar3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (str != null) {
            bArr3 = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr3, "getBytes(...)");
        } else {
            bArr3 = null;
        }
        sb6.append(kk.k.g(bArr3));
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        k01Var.f459785g = sb6.toString();
        k01Var.f459783e = str;
        k01Var.f459791p = fd2Var;
        k01Var.U = kf5Var2;
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (q12Var != null) {
            i48 = q12Var.m75939xb282bd08(0);
            i47 = 3;
        } else {
            i47 = 3;
            i48 = 0;
        }
        if (!r4Var.O1(i48 == i47)) {
            k01Var.M = i66;
            k01Var.f459793q = i17;
            k01Var.f459794r = visibilityList;
            k01Var.f459796t = visibilityRoomList;
            k01Var.f459797u = visibilityUserList;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(visibilityLabelList, 10));
            java.util.Iterator it = visibilityLabelList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a((java.lang.String) it.next())));
            }
            k01Var.Y = new java.util.LinkedList(arrayList);
        }
        r45.k01 k01Var2 = this.A;
        k01Var2.f459795s = luckyMoneyChatroomList;
        k01Var2.I = str2;
        k01Var2.S = i68;
        k01Var2.f459798v = str3;
        k01Var2.f459788m = i19;
        k01Var2.C = sd7Var3;
        k01Var2.G = this.f335087v ? 1 : 0;
        byte[] bArr7 = this.f335088w;
        if (bArr7 != null) {
            i49 = 0;
            gVar2 = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr7, 0, bArr7.length);
        } else {
            i49 = 0;
            gVar2 = null;
        }
        k01Var2.F = gVar2;
        r45.k01 k01Var3 = this.A;
        k01Var3.f459781J = i27;
        k01Var3.P = i67;
        r45.hn1 hn1Var3 = this.f335086u;
        if (hn1Var3 != null) {
            int m75939xb282bd08 = hn1Var3.m75939xb282bd08(i49);
            int i76 = qs5.g.f447965a;
            if (m75939xb282bd08 == 2 || m75939xb282bd08 == 8 || m75939xb282bd08 == 16) {
                this.A.f459799w = this.f335086u.m75939xb282bd08(0);
                this.A.f459800x = this.f335086u.m75939xb282bd08(1);
                r45.k01 k01Var4 = this.A;
                r45.re2 re2Var = (r45.re2) this.f335086u.m75936x14adae67(2);
                k01Var4.f459803z = re2Var != null ? re2Var.m75941xfb821914(0) : null;
                r45.k01 k01Var5 = this.A;
                r45.re2 re2Var2 = (r45.re2) this.f335086u.m75936x14adae67(2);
                k01Var5.A = re2Var2 != null ? re2Var2.m75941xfb821914(1) : null;
                r45.k01 k01Var6 = this.A;
                r45.re2 re2Var3 = (r45.re2) this.f335086u.m75936x14adae67(2);
                if (re2Var3 == null || (m75941xfb8219142 = re2Var3.m75941xfb821914(4)) == null) {
                    linkedList = null;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
                    java.util.Iterator it6 = m75941xfb8219142.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a((java.lang.String) it6.next())));
                    }
                    linkedList = new java.util.LinkedList(arrayList2);
                }
                k01Var6.Z = linkedList;
                r45.re2 re2Var4 = (r45.re2) this.f335086u.m75936x14adae67(2);
                if (re2Var4 == null || (m75941xfb821914 = re2Var4.m75941xfb821914(3)) == null) {
                    i59 = 0;
                } else {
                    r45.k01 k01Var7 = this.A;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                    java.util.Iterator it7 = m75941xfb821914.iterator();
                    while (it7.hasNext()) {
                        arrayList3.add(((r45.il1) it7.next()).m75945x2fec8307(0));
                    }
                    i59 = 0;
                    k01Var7.E = new java.util.LinkedList(arrayList3);
                }
                r45.k01 k01Var8 = this.A;
                k01Var8.f459793q = i59;
                k01Var8.L = (r45.hf5) this.f335086u.m75936x14adae67(3);
            }
        }
        this.A.N = (zl2.q4.f555466a.F(zl2.r4.f555483a.T1(q12Var)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) ? 1 : 0;
        this.A.Q = j17;
        try {
            this.C.put(dm.i4.f66875xa013b0d5, str);
            this.C.put(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26768x16959c15.Columns.f56764x64cb2a26, this.A.f459785g);
            org.json.JSONObject jSONObject = this.C;
            r45.fd2 fd2Var3 = this.A.f459791p;
            jSONObject.put("tagId", fd2Var3 != null ? java.lang.Integer.valueOf(fd2Var3.m75939xb282bd08(0)) : null);
            org.json.JSONObject jSONObject2 = this.C;
            r45.fd2 fd2Var4 = this.A.f459791p;
            jSONObject2.put("tagName", fd2Var4 != null ? fd2Var4.m75945x2fec8307(1) : null);
            this.C.put("visibilityMode", this.A.f459793q);
            this.C.put("beautyData", dk2.b.f314761a.a());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f335090y, e17.toString());
        }
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(fo3.s.INSTANCE.h());
        k57Var.f459929f = cu5Var;
        r45.kv0 kv0Var = this.A.f459782d;
        if (kv0Var != null) {
            kv0Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(k57Var.mo14344x5f01b1f6()));
        }
        w04.l.INSTANCE.b(540999692);
        r45.k01 k01Var9 = this.A;
        k01Var9.H = ba4Var;
        k01Var9.R = q12Var;
        k01Var9.T = i69;
        r45.aa0 aa0Var3 = aa0Var2;
        k01Var9.V = aa0Var3 != null ? aa0Var3.f451401d : 0;
        mm2.g1 g1Var = (mm2.g1) dk2.ef.f314905a.i(mm2.g1.class);
        if (g1Var == null || (bArr4 = g1Var.f410614v) == null) {
            i57 = 0;
        } else {
            i57 = 0;
            this.A.W = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr4, 0, bArr4.length);
        }
        byte[] bArr8 = bArr6;
        this.A.X = bArr8 != null ? new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr8, i57, bArr8.length) : null;
        r45.k01 k01Var10 = this.A;
        k01Var10.f459792p0 = str6;
        k01Var10.F2 = mVar3;
        long j27 = this.f335089x;
        if (j27 != 0) {
            k01Var10.f459801x0 = j27;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335090y, "[CgiFinderCreateLive] coLiveInvitationId=" + this.f335089x);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.k01 k01Var11 = this.A;
        lVar.f152197a = k01Var11;
        r45.l01 l01Var = new r45.l01();
        l01Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) l01Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = l01Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercreatelive";
        lVar.f152200d = 3686;
        p(lVar.a());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("CgiFinderCreateLive init ");
        sb7.append(k01Var11.f459785g);
        sb7.append(',');
        sb7.append(k01Var11.f459783e);
        sb7.append(", liveEntranceType:");
        sb7.append(k01Var11.f459781J);
        sb7.append(", ");
        sb7.append(k01Var11.f459784f);
        sb7.append(", tag:[");
        r45.fd2 fd2Var5 = k01Var11.f459791p;
        if (fd2Var5 != null) {
            i58 = 1;
            str5 = fd2Var5.m75945x2fec8307(1);
        } else {
            i58 = 1;
            str5 = null;
        }
        sb7.append(str5);
        sb7.append('-');
        r45.fd2 fd2Var6 = k01Var11.f459791p;
        sb7.append((fd2Var6 == null || (fd2Var2 = (r45.fd2) fd2Var6.m75936x14adae67(3)) == null) ? null : fd2Var2.m75945x2fec8307(i58));
        sb7.append("], visibility_mode:");
        sb7.append(k01Var11.f459793q);
        sb7.append(", visible_username_list:");
        sb7.append(k01Var11.f459797u);
        sb7.append(", visibility_file_id_list:");
        sb7.append(k01Var11.f459794r);
        sb7.append(", visible_chatroom_id_list:");
        sb7.append(k01Var11.f459796t);
        sb7.append(", luckyMoneyChatroom:");
        sb7.append(k01Var11.f459795s);
        sb7.append(", gameAppId:");
        sb7.append(k01Var11.f459798v);
        sb7.append(", gameVersionType:");
        r45.sd7 sd7Var4 = k01Var11.C;
        sb7.append(sd7Var4 != null ? java.lang.Integer.valueOf(sd7Var4.m75939xb282bd08(0)) : null);
        sb7.append(", scene:");
        sb7.append(k01Var11.f459788m);
        sb7.append(",liveChargePost:[");
        sb7.append(cm2.a.f124861a.k(this.f335086u));
        sb7.append("], acknowledgeSpamMsg:");
        sb7.append(this.f335087v);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335090y, sb7.toString());
        r45.k01 req = this.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        java.lang.String jSONObject3 = req.mo12245xcc313de3().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject3, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePostReporter", "[reportCreateLive] data = ".concat(t17));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea c6300x6832e2ea = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6300x6832e2ea();
        c6300x6832e2ea.p("createLive");
        c6300x6832e2ea.q(t17);
        c6300x6832e2ea.k();
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.dm2 m76806xdef68064;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        r45.l01 resp = (r45.l01) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f335090y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "CgiFinderCreateLive result:" + pm0.b0.g(resp));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
            if (c19792x256d2725 != null && (m76760x76845fea = c19792x256d2725.m76760x76845fea()) != null) {
                ya2.g.m(ya2.h.f542017a, m76760x76845fea, false, 2, null);
            }
        }
        dk2.c1 c1Var = (dk2.c1) this.f335091z;
        c1Var.getClass();
        dk2.r4 r4Var = c1Var.f314799a;
        boolean a76 = ((mm2.e1) r4Var.m(mm2.e1.class)).a7();
        java.lang.String str4 = r4Var.f315542d;
        if (!a76 && !((mm2.c1) r4Var.m(mm2.c1.class)).X7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "current live status " + ((mm2.c1) r4Var.m(mm2.c1.class)).f410346h2 + " is illegal");
            return;
        }
        yz5.u uVar = c1Var.f314800b;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "launch live room failed");
            if (i18 != -200008) {
                if (uVar != null) {
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    uVar.K(bool, bool, "", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str == null ? "" : str, resp);
                    return;
                }
                return;
            }
            if (uVar != null) {
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                java.lang.String m75945x2fec8307 = resp.m75945x2fec8307(2);
                uVar.K(bool2, bool3, m75945x2fec8307 == null ? "" : m75945x2fec8307, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str == null ? "" : str, resp);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
        r45.nw1 m76794xd0557130 = c19792x256d27252 != null ? c19792x256d27252.m76794xd0557130() : null;
        mm2.e1 e1Var = (mm2.e1) r4Var.m(mm2.e1.class);
        if (m76794xd0557130 == null) {
            m76794xd0557130 = new r45.nw1();
        }
        e1Var.m7(m76794xd0557130);
        ((mm2.c1) r4Var.m(mm2.c1.class)).a9((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1));
        mm2.e1 e1Var2 = (mm2.e1) r4Var.m(mm2.e1.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
        e1Var2.q7(c19792x256d27253 != null ? c19792x256d27253.m76784x5db1b11() : 0L);
        mm2.e1 e1Var3 = (mm2.e1) r4Var.m(mm2.e1.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
        e1Var3.f410517n = (c19792x256d27254 == null || (m76806xdef68064 = c19792x256d27254.m76806xdef68064()) == null) ? null : m76806xdef68064.m75945x2fec8307(62);
        mm2.e1 e1Var4 = (mm2.e1) r4Var.m(mm2.e1.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27255 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
        java.lang.String m76803x6c285d75 = c19792x256d27255 != null ? c19792x256d27255.m76803x6c285d75() : null;
        if (m76803x6c285d75 == null) {
            m76803x6c285d75 = "";
        }
        e1Var4.f410525v = m76803x6c285d75;
        ((mm2.s1) r4Var.m(mm2.s1.class)).S6((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) r4Var.m(mm2.g1.class)).f410601f).mo144003x754a37bb());
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5289xa7f51752 c5289xa7f51752 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5289xa7f51752();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27256 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) resp.m75936x14adae67(1);
        am.o3 o3Var = c5289xa7f51752.f135609g;
        o3Var.f89042a = c19792x256d27256;
        o3Var.f89043b = ((mm2.s1) r4Var.m(mm2.s1.class)).D;
        c5289xa7f51752.e();
        if (uVar != null) {
            uVar.K(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE, "", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str == null ? "" : str, resp);
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.C;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.B;
    }
}
