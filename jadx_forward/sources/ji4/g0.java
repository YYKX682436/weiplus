package ji4;

/* loaded from: classes11.dex */
public final class g0 extends et1.e implements ct1.x {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f381464m = "MicroMsg.TextStatus.TextStatusMsgSyncHandler";

    public g0() {
        new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // ct1.c
    public int h() {
        return 9;
    }

    @Override // ct1.c
    public int i() {
        return 9;
    }

    @Override // et1.e
    public java.lang.Object q(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ni4.x.f419309d.m().y0(sessionId);
    }

    @Override // et1.e
    public java.lang.String t() {
        return this.f381464m;
    }

    @Override // et1.e
    public boolean u(r45.w3 rawBypMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        r45.j4 j4Var = rawBypMsg.f470359d;
        int i17 = j4Var.f459093g;
        if (j4Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FromUserName=");
            sb6.append(j4Var.f459091e);
            sb6.append(" ToUserName=");
            sb6.append(j4Var.f459092f);
            sb6.append(" MsgType=");
            sb6.append(j4Var.f459093g);
            sb6.append(" NewMsgId=");
            sb6.append(j4Var.f459101r);
            sb6.append(" content=");
            sb6.append(x51.j1.g(j4Var.f459094h));
        }
        r45.j4 j4Var2 = rawBypMsg.f470359d;
        if (j4Var2.f459093g != 10002) {
            return false;
        }
        r45.du5 du5Var = j4Var2.f459094h;
        java.lang.String str = du5Var != null ? du5Var.f454289d : null;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null);
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.$type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f381464m, "processMsg: type：%s", str2);
        boolean z17 = true;
        if (bi4.v1.e(str2, true) == 0) {
            return true;
        }
        di4.i iVar = di4.i.f314315a;
        if (ai4.b0.f86659d) {
            com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.p2572x26f8a610.C20733x75569d c20733x75569d = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.p2572x26f8a610.C20733x75569d();
            int h17 = bm5.o1.f104252a.h(c20733x75569d);
            if (h17 != 2 && (h17 == 3 || 1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(c20733x75569d))) {
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusLogicConfig", "canParseMsgByAff: " + z17);
        } else {
            z17 = false;
        }
        if (!z17) {
            if (str2 == null) {
                return false;
            }
            int hashCode = str2.hashCode();
            if (hashCode == -1813338250) {
                if (!str2.equals("textstatuslike")) {
                    return false;
                }
                ai4.m0.f86706a.z(d17);
                return false;
            }
            if (hashCode == -1306850335) {
                if (!str2.equals("modtextstatus")) {
                    return false;
                }
                ni4.x.f419309d.b(d17);
                return false;
            }
            if (hashCode != 1667082797 || !str2.equals("statuscomment")) {
                return false;
            }
            ni4.x.f419309d.c(d17);
            return false;
        }
        if (str2 == null) {
            return false;
        }
        switch (str2.hashCode()) {
            case -1813338250:
                if (!str2.equals("textstatuslike")) {
                    return false;
                }
                ai4.m0.f86706a.z(d17);
                return false;
            case -1461318868:
                if (!str2.equals("statusmodify")) {
                    return false;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27551xb1577cbf m117505x9cf0d20b = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27551xb1577cbf.m117505x9cf0d20b();
                if (str == null) {
                    str = "";
                }
                y(m117505x9cf0d20b.m117509xae2692f7(str));
                return false;
            case -1306850335:
                if (!str2.equals("modtextstatus")) {
                    return false;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27551xb1577cbf m117505x9cf0d20b2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27551xb1577cbf.m117505x9cf0d20b();
                if (str == null) {
                    str = "";
                }
                y(m117505x9cf0d20b2.m117508x758e13d4(str));
                return false;
            case 1667082797:
                if (!str2.equals("statuscomment")) {
                    return false;
                }
                ni4.x.f419309d.c(d17);
                return false;
            default:
                return false;
        }
    }

    @Override // et1.e
    public void v(java.lang.Object obj, java.lang.String sessionId) {
        hi4.n session = (hi4.n) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        li4.d m17 = ni4.x.f419309d.m();
        java.lang.String field_talker = session.f76632x114ef53e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
        int i17 = session.f76633x2262335f;
        int i18 = session.f76625xaf64e94a;
        int i19 = session.f76627x36454e5d;
        int i27 = session.f76626x83e02cb6;
        java.lang.String field_senderUserName = session.f76630x1362f030;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_senderUserName, "field_senderUserName");
        m17.z0(sessionId, field_talker, i17, i18, i19, i27, field_senderUserName);
    }

    @Override // et1.e
    public boolean x(java.lang.Object obj, r45.w3 rawBypMsg) {
        hi4.n localSessionInfo = (hi4.n) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localSessionInfo, "localSessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        java.lang.String str = localSessionInfo.f76630x1362f030;
        boolean z17 = str == null || str.length() == 0;
        boolean z18 = localSessionInfo.f72763xa3c65b86 > 0;
        int i17 = localSessionInfo.f76627x36454e5d;
        java.lang.String r17 = r(rawBypMsg);
        java.lang.String s17 = s(rawBypMsg);
        boolean z19 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s17, localSessionInfo.f76632x114ef53e) || z17;
        localSessionInfo.f76632x114ef53e = s17;
        localSessionInfo.f76627x36454e5d = i17;
        localSessionInfo.f76630x1362f030 = r17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f381464m, "[beforeProcessAddMsg] isNeedReplaceSession=" + z19 + " svrMsgId=" + rawBypMsg.f470359d.f459101r + " isSender=" + rawBypMsg + ".isSender msgType=" + rawBypMsg.f470359d.f459093g + " createTime=" + rawBypMsg.f470359d.f459098o + " isExitSessionInfo=" + z18 + " fromUser=" + rawBypMsg.f470359d.f459091e + " toUser=" + rawBypMsg.f470359d.f459092f + " sessionId=" + rawBypMsg.f470360e + " myUserName:" + r17 + " isSenderUserNameEmpty:" + z17);
        return z19;
    }

    public final void y(bw5.hn0 hn0Var) {
        if (hn0Var == null) {
            return;
        }
        boolean[] zArr = hn0Var.f109824i;
        bw5.sm0 sm0Var = zArr[5] ? hn0Var.f109823h : new bw5.sm0();
        java.lang.String m12979xca73e223 = sm0Var != null ? sm0Var.m12979xca73e223() : null;
        if (m12979xca73e223 == null) {
            m12979xca73e223 = "";
        }
        java.lang.String e17 = sm0Var != null ? sm0Var.e() : null;
        java.lang.String str = e17 != null ? e17 : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleStatusXmlParseResponse: ");
        sb6.append(m12979xca73e223);
        sb6.append(", ");
        sb6.append(str);
        sb6.append(", ");
        boolean z17 = zArr[4];
        bw5.ks0 ks0Var = bw5.ks0.StatusXmlUpdateNone;
        sb6.append((z17 ? hn0Var.f109822g : ks0Var).name());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f381464m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (zArr[4]) {
            ks0Var = hn0Var.f109822g;
        }
        int i17 = ks0Var == null ? -1 : ji4.f0.f381463a[ks0Var.ordinal()];
        if (i17 == 1) {
            qi4.p pVar = qi4.p.f445309a;
            si4.a d17 = pVar.d(false);
            si4.f fVar = d17 instanceof si4.f ? (si4.f) d17 : null;
            if (fVar != null) {
                fVar.u(str, m12979xca73e223);
            }
            si4.a d18 = pVar.d(true);
            si4.c cVar = d18 instanceof si4.c ? (si4.c) d18 : null;
            if (cVar != null) {
                cVar.u(str, m12979xca73e223);
            }
            qi4.v.f445321a.a(str, m12979xca73e223);
            bk4.n.f103046a.a(m12979xca73e223, 7);
            return;
        }
        if (i17 != 2) {
            return;
        }
        ai4.f fVar2 = ai4.f.f86672a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sm0Var);
        mj4.h e18 = ai4.f.e(fVar2, sm0Var, null, 2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "StatusXmlUpdateExtInfo: result=" + hn0Var.f109819d + ", " + e18);
        qi4.p pVar2 = qi4.p.f445309a;
        si4.a d19 = pVar2.d(true);
        si4.c cVar2 = d19 instanceof si4.c ? (si4.c) d19 : null;
        si4.a d27 = pVar2.d(false);
        si4.f fVar3 = d27 instanceof si4.f ? (si4.f) d27 : null;
        mj4.h x17 = cVar2 != null ? cVar2.x(e18) : null;
        mj4.k kVar = (mj4.k) e18;
        mj4.j jVar = new mj4.j(kVar);
        if (x17 != null) {
            jVar.f408599b.put("systemRowid", java.lang.Long.valueOf(((mj4.k) x17).f408600b.f72763xa3c65b86));
        }
        mj4.h a17 = jVar.a();
        if (fVar3 != null) {
            fVar3.s(a17);
        }
        qi4.v.f445321a.f(sm0Var, e18);
        if (hn0Var.f109819d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "handleStatusXmlParseResponse: desc:" + kVar.g() + ", user:" + sm0Var.e());
            dj4.u uVar = dj4.u.f314582a;
            java.lang.String e19 = sm0Var.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e19, "getUserName(...)");
            uVar.j(e19, a17);
            if (cVar2 != null) {
                java.lang.String m12979xca73e2232 = sm0Var.m12979xca73e223();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12979xca73e2232, "getStatusId(...)");
                java.lang.String e27 = sm0Var.e();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e27, "getUserName(...)");
                cVar2.y(4, m12979xca73e2232, e27);
            }
        }
    }
}
