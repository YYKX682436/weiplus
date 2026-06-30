package no2;

/* loaded from: classes10.dex */
public abstract class f extends et1.e {

    /* renamed from: m, reason: collision with root package name */
    public final int f420280m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f420281n = jz5.h.b(no2.d.f420278d);

    public f(int i17) {
        this.f420280m = i17;
    }

    @Override // ct1.c
    public int h() {
        return this.f420280m;
    }

    @Override // ct1.c
    public int i() {
        return 4;
    }

    @Override // ct1.c
    public boolean o(java.lang.Exception e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        pm0.z.b(xy2.b.f539688b, this.f338100h, false, null, null, false, false, new no2.e(e17), 60, null);
        return false;
    }

    @Override // et1.e
    public java.lang.Object q(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0) ((jz5.n) this.f420281n).mo141623x754a37bb()).J0(sessionId);
    }

    @Override // et1.e
    public java.lang.String r(r45.w3 rawBypMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        java.lang.String g17 = x51.j1.g(rawBypMsg.f470359d.f459091e);
        java.lang.String g18 = x51.j1.g(rawBypMsg.f470359d.f459092f);
        if (!rawBypMsg.f470363h) {
            g17 = g18;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.U3(g17)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            return g17;
        }
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        return r17;
    }

    @Override // et1.e
    public void v(java.lang.Object obj, java.lang.String sessionId) {
        qb2.x1 session = (qb2.x1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0 dj0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0) ((jz5.n) this.f420281n).mo141623x754a37bb();
        java.lang.String field_talker = session.f65985x114ef53e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
        int i17 = session.f65986x2262335f;
        int i18 = session.f65976xaf64e94a;
        zy2.bb bbVar = zy2.bb.f558887d;
        int i19 = session.f65980x36454e5d;
        int i27 = session.f65977x83e02cb6;
        java.lang.String field_senderUserName = session.f65983x1362f030;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_senderUserName, "field_senderUserName");
        dj0Var.L0(sessionId, field_talker, i17, i18, bbVar, i19, i27, field_senderUserName, session.f65979x404ea322, session.f65978x3679555d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // et1.e
    public boolean x(java.lang.Object obj, r45.w3 rawBypMsg) {
        int i17;
        int i18;
        qb2.x1 localSessionInfo = (qb2.x1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localSessionInfo, "localSessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawBypMsg, "rawBypMsg");
        java.lang.String str = rawBypMsg.f470360e;
        r45.lo2 lo2Var = new r45.lo2();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = rawBypMsg.f470362g;
        java.lang.String str2 = this.f338100h;
        if (gVar == null || lo2Var.mo11468x92b714fd(gVar.g()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "extInfo is null! fromUser=" + rawBypMsg.f470359d.f459091e + " toUser=" + rawBypMsg.f470359d.f459092f + " sessionId=" + rawBypMsg.f470360e);
        }
        java.lang.String str3 = localSessionInfo.f65983x1362f030;
        boolean z17 = str3 == null || str3.length() == 0;
        boolean z18 = localSessionInfo.f72763xa3c65b86 > 0;
        ?? r122 = (lo2Var.m75939xb282bd08(1) & 1) > 0 ? 1 : 0;
        int i19 = localSessionInfo.f65980x36454e5d;
        java.lang.String r17 = r(rawBypMsg);
        java.lang.String s17 = s(rawBypMsg);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.T3(r17)) {
            i17 = 3;
            i18 = 1;
        } else if ((lo2Var.m75939xb282bd08(1) & 2) > 0) {
            i18 = 1;
            i17 = 2;
        } else if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "this sessionId[" + str + "] has exist, but it will be move to hi holder. just return");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(20492, 4L, 1L, str);
            g0Var.C(1473L, 4L, 1L);
            i17 = localSessionInfo.f65986x2262335f;
            i18 = 1;
        } else {
            i18 = 1;
            i17 = 1;
        }
        int i27 = (lo2Var.m75939xb282bd08(i18) & 4) > 0 ? 1 : 0;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.U3(s17) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(s17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "[beforeProcessAddMsg] talker[" + s17 + "] is invalid.");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.d(20492, 3L, 1L, s17);
            g0Var2.C(1473L, 3L, 1L);
            return false;
        }
        boolean z19 = (localSessionInfo.f65986x2262335f == i17 && r122 == localSessionInfo.f65976xaf64e94a && i27 == localSessionInfo.f65977x83e02cb6 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s17, localSessionInfo.f65985x114ef53e) && !z17) ? false : true;
        localSessionInfo.f65986x2262335f = i17;
        localSessionInfo.f65976xaf64e94a = r122;
        localSessionInfo.f65977x83e02cb6 = i27;
        localSessionInfo.f65985x114ef53e = s17;
        localSessionInfo.f65980x36454e5d = i19;
        localSessionInfo.f65983x1362f030 = r17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[beforeProcessAddMsg] isNeedReplaceSession=");
        sb6.append(z19);
        sb6.append(" svrMsgId=");
        boolean z27 = z19;
        sb6.append(rawBypMsg.f470359d.f459101r);
        sb6.append(" isSender=");
        sb6.append(rawBypMsg);
        sb6.append(".isSender msgType=");
        sb6.append(rawBypMsg.f470359d.f459093g);
        sb6.append(" createTime=");
        sb6.append(rawBypMsg.f470359d.f459098o);
        sb6.append(" isExitSessionInfo=");
        sb6.append(z18);
        sb6.append(" isSupportSendMedia=");
        sb6.append((boolean) r122);
        sb6.append(" convType=");
        sb6.append(i17);
        sb6.append(" fromUser=");
        sb6.append(rawBypMsg.f470359d.f459091e);
        sb6.append(" toUser=");
        sb6.append(rawBypMsg.f470359d.f459092f);
        sb6.append(" sessionId=");
        sb6.append(rawBypMsg.f470360e);
        sb6.append(" actionPermission=");
        sb6.append((int) r122);
        sb6.append(" extInfo=");
        sb6.append(lo2Var.m75939xb282bd08(1));
        sb6.append(" myUserName:");
        sb6.append(r17);
        sb6.append(" isSenderUserNameEmpty:");
        sb6.append(z17);
        sb6.append(", followFlag:");
        sb6.append(localSessionInfo.f65979x404ea322);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        return z27;
    }
}
