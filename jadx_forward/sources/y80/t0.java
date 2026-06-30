package y80;

/* loaded from: classes12.dex */
public final class t0 extends qi3.c {

    /* renamed from: i, reason: collision with root package name */
    public final y80.q1 f541474i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f541475m;

    public t0(y80.q1 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f541474i = params;
    }

    @Override // qi3.b0
    public java.lang.Object B(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.ml4 ml4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " start to updateMsg");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        qi3.k0 k0Var = new qi3.k0(0);
        y80.q1 q1Var = this.f541474i;
        q1Var.f541454u = k0Var;
        oi3.g gVar = q1Var.f541436c;
        java.util.Map map = k0Var.f445273b;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg failed: msgInfo is null");
            k0Var.f445272a = -520009;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.f0 f0Var = q1Var.f541451r;
        if (f0Var != null && f0Var.f445233a != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: prepare failed with retCode=" + f0Var.f445233a);
            w(gVar, f0Var.f445233a);
            k0Var.f445272a = f0Var.f445233a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.i0 i0Var = q1Var.f541452s;
        if (i0Var != null && i0Var.f445258a != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: upload failed with retCode=" + i0Var.f445258a);
            w(gVar, i0Var.f445258a);
            k0Var.f445272a = i0Var.f445258a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.d0 d0Var = q1Var.f541453t;
        if (d0Var != null && d0Var.f445216a != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: sendCgi failed with retCode=" + d0Var.f445216a);
            w(gVar, d0Var.f445216a);
            k0Var.f445272a = d0Var.f445216a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        int i17 = gVar.f427150d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(gVar.m75945x2fec8307(i17 + 3), gVar.m75942xfb822ef2(i17 + 0));
        qi3.d0 d0Var2 = q1Var.f541453t;
        r45.ny3 ny3Var = d0Var2 != null ? d0Var2.f445222g : null;
        if (ny3Var instanceof r45.fz5) {
            java.util.LinkedList linkedList = ((r45.fz5) ny3Var).f456284e;
            if (linkedList != null && (ml4Var = (r45.ml4) kz5.n0.Z(linkedList)) != null) {
                n17.o1(ml4Var.f462166n);
                c01.ia.P(n17, ml4Var.f462167o, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: set MsgSvrId=" + ml4Var.f462166n);
            }
        } else if (ny3Var instanceof r45.rr) {
            r45.rr rrVar = (r45.rr) ny3Var;
            n17.o1(rrVar.f466663d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: byp set MsgSvrId=" + rrVar.f466663d);
        }
        n17.r1(2);
        e0Var.s(n17.Q0(), n17.m124847x74d37ac6(), n17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg success: msgId=" + n17.m124847x74d37ac6() + ", status=STATE_SENT");
        if (!q1Var.f541435b) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a c6194x6522023a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a();
            long m124847x74d37ac6 = n17.m124847x74d37ac6();
            am.xz xzVar = c6194x6522023a.f136451g;
            xzVar.f89942a = m124847x74d37ac6;
            xzVar.f89943b = 0;
            xzVar.f89944c = n17.Q0();
            c6194x6522023a.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " updateMsg: published UpdateForwardMsgIdEvent, msgId=" + n17.m124847x74d37ac6() + ", talker=" + n17.Q0());
        }
        map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return k0Var;
    }

    @Override // qi3.b0
    public qi3.h0 C() {
        return qi3.h0.f445252g;
    }

    @Override // qi3.b0
    public java.lang.Object D(yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object obj;
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " start to prepare");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        y80.q1 q1Var = this.f541474i;
        qi3.f0 f0Var = q1Var.f541451r;
        if (f0Var == null) {
            f0Var = new qi3.f0(0);
            q1Var.f541451r = f0Var;
        }
        f0Var.f445234b.put("send_msg_type", new java.lang.Integer(48));
        boolean z17 = q1Var.f541435b;
        java.util.Map map = f0Var.f445234b;
        if (z17) {
            map.put("resend_msg", new java.lang.Integer(1));
            oi3.g gVar = q1Var.f541436c;
            if (gVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " prepare failed: isResend=true but sendMsgInfo is null");
                f0Var.f445233a = -520009;
                map.put("prepare_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                return f0Var;
            }
            if (gVar != null) {
                int i17 = gVar.f427150d;
                map.put("send_msg_local_id", new java.lang.Long(gVar.m75942xfb822ef2(i17 + 0)));
                map.put("send_msg_create_time", new java.lang.Long(gVar.m75942xfb822ef2(i17 + 2)));
                pt0.e0 e0Var = pt0.f0.f439742b1;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(gVar.m75945x2fec8307(i17 + 3), gVar.m75942xfb822ef2(i17 + 0));
                if (k17 != null) {
                    long o17 = c01.w9.o(gVar.m75945x2fec8307(i17 + 3));
                    if (o17 == k17.mo78012x3fdd41df()) {
                        o17++;
                    }
                    k17.e1(o17);
                    k17.r1(1);
                    e0Var.s(k17.Q0(), k17.m124847x74d37ac6(), k17);
                    gVar.set(i17 + 2, java.lang.Long.valueOf(k17.mo78012x3fdd41df()));
                }
            }
            map.put("prepare_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return f0Var;
        }
        java.lang.String str2 = "<msg><location x=\"" + q1Var.f541437d + "\" y=\"" + q1Var.f541438e + "\" scale=\"" + q1Var.f541439f + "\" label=\"" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(q1Var.f541440g) + "\" poiname=\"" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(q1Var.f541441h) + "\" infourl=\"" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(q1Var.f541442i) + "\" maptype=\"0\" poiid=\"" + q1Var.f541443j + "\" isFromPoiList=\"" + q1Var.f541444k + "\" poiCategoryTips=\"" + q1Var.f541445l + "\" poiBusinessHour=\"" + q1Var.f541446m + "\" poiPhone=\"" + q1Var.f541447n + "\" poiPriceTips=\"" + q1Var.f541448o + "\" buildingId=\"" + q1Var.f541449p + "\" floorName=\"" + q1Var.f541450q + "\" /></msg>";
        this.f541475m = str2;
        oi3.g gVar2 = new oi3.g();
        q1Var.f541436c = gVar2;
        java.lang.String str3 = q1Var.f541434a;
        int i18 = gVar2.f427150d;
        gVar2.set(i18 + 3, str3);
        gVar2.set(i18 + 13, str2);
        gVar2.set(i18 + 4, 48);
        gVar2.set(i18 + 7, 1);
        gVar2.set(i18 + 9, 1);
        gVar2.set(i18 + 2, java.lang.Long.valueOf(c01.w9.o(q1Var.f541434a)));
        vg3.u3 u3Var = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).f523598e;
        if (u3Var != null) {
            ((j.f) ((p.j) i95.n0.c(p.j.class))).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            obj = "prepare_cost";
            f9Var.m124849x5361953a(gVar2.m75942xfb822ef2(i18 + 0));
            f9Var.o1(gVar2.m75942xfb822ef2(i18 + 1));
            f9Var.e1(gVar2.m75942xfb822ef2(i18 + 2));
            f9Var.u1(gVar2.m75945x2fec8307(i18 + 3));
            f9Var.m124850x7650bebc(gVar2.m75939xb282bd08(i18 + 4));
            f9Var.r1(gVar2.m75939xb282bd08(i18 + 7));
            f9Var.j1(gVar2.m75939xb282bd08(i18 + 9));
            f9Var.f1(gVar2.m75939xb282bd08(i18 + 10));
            f9Var.d1(gVar2.m75945x2fec8307(i18 + 13));
            f9Var.u3(gVar2.m75945x2fec8307(i18 + 12));
            str = ((aq1.u0) u3Var).a(f9Var);
        } else {
            obj = "prepare_cost";
            str = null;
        }
        if (str == null) {
            str = "";
        }
        gVar2.set(i18 + 12, str);
        gVar2.set(i18 + 0, java.lang.Long.valueOf(pt0.f0.f439742b1.r(gVar2)));
        if (gVar2.m75942xfb822ef2(i18 + 0) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " prepare failed: insertMsg returned " + gVar2.m75942xfb822ef2(i18 + 0));
            f0Var.f445233a = -520001;
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " prepare success: msgId=" + gVar2.m75942xfb822ef2(i18 + 0) + ", talker=" + gVar2.m75945x2fec8307(i18 + 3));
        lVar.mo146xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(gVar2.m75942xfb822ef2(i18 + 0), gVar2.m75945x2fec8307(i18 + 3)));
        map.put("send_msg_local_id", new java.lang.Long(gVar2.m75942xfb822ef2(i18 + 0)));
        map.put("send_msg_create_time", new java.lang.Long(gVar2.m75942xfb822ef2(i18 + 2)));
        map.put(obj, new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return f0Var;
    }

    @Override // qi3.c
    public qi3.e0 h() {
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5;
        qi3.e0 e0Var = new qi3.e0(this.f445210f, this);
        y80.q1 q1Var = this.f541474i;
        oi3.g gVar = q1Var.f541436c;
        if (gVar != null) {
            int i17 = gVar.f427150d;
            c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(gVar.m75942xfb822ef2(i17 + 0), gVar.m75945x2fec8307(i17 + 3));
        } else {
            c16564xb55e1d5 = null;
        }
        e0Var.f445230g = c16564xb55e1d5;
        e0Var.f445226c = q1Var.f541451r;
        e0Var.f445227d = q1Var.f541452s;
        e0Var.f445228e = q1Var.f541453t;
        e0Var.f445229f = q1Var.f541454u;
        return e0Var;
    }

    @Override // qi3.c
    public boolean j() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(this.f541474i.f541434a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(14:5|6|(1:(4:9|10|11|12)(2:54|55))(2:56|(2:58|59)(4:60|(1:62)|(1:91)(1:66)|(2:68|69)(9:70|71|72|73|74|75|76|77|(1:79)(1:80))))|13|14|(1:16)|17|(1:19)(1:48)|20|21|(7:23|24|25|(3:27|(1:29)(1:32)|(1:31))|33|34|35)(1:42)|36|37|38))|92|6|(0)(0)|13|14|(0)|17|(0)(0)|20|21|(0)(0)|36|37|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0209, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x020b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020c, code lost:
    
        r5 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0174 A[Catch: Exception -> 0x020b, TryCatch #2 {Exception -> 0x020b, blocks: (B:14:0x0158, B:17:0x0168, B:19:0x0174, B:20:0x017a, B:23:0x0182, B:25:0x0189, B:27:0x01a7, B:31:0x01b3, B:33:0x01b9), top: B:13:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0182 A[Catch: Exception -> 0x020b, TRY_LEAVE, TryCatch #2 {Exception -> 0x020b, blocks: (B:14:0x0158, B:17:0x0168, B:19:0x0174, B:20:0x017a, B:23:0x0182, B:25:0x0189, B:27:0x01a7, B:31:0x01b3, B:33:0x01b9), top: B:13:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ee A[Catch: Exception -> 0x0209, TRY_LEAVE, TryCatch #4 {Exception -> 0x0209, blocks: (B:35:0x01e9, B:42:0x01ee), top: B:21:0x0180 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.String] */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.t0.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01bc A[Catch: Exception -> 0x0045, TryCatch #2 {Exception -> 0x0045, blocks: (B:11:0x0040, B:12:0x016f, B:15:0x01b0, B:17:0x01bc, B:18:0x01c2, B:21:0x01cc, B:23:0x01ec, B:27:0x01f7, B:29:0x01fd, B:33:0x022e, B:35:0x0232, B:57:0x02f5, B:37:0x0251, B:39:0x0255, B:41:0x025b, B:43:0x026e, B:45:0x0278, B:47:0x027c, B:48:0x02cd, B:50:0x02e0, B:51:0x02ea), top: B:10:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01cc A[Catch: Exception -> 0x0045, TRY_ENTER, TryCatch #2 {Exception -> 0x0045, blocks: (B:11:0x0040, B:12:0x016f, B:15:0x01b0, B:17:0x01bc, B:18:0x01c2, B:21:0x01cc, B:23:0x01ec, B:27:0x01f7, B:29:0x01fd, B:33:0x022e, B:35:0x0232, B:57:0x02f5, B:37:0x0251, B:39:0x0255, B:41:0x025b, B:43:0x026e, B:45:0x0278, B:47:0x027c, B:48:0x02cd, B:50:0x02e0, B:51:0x02ea), top: B:10:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022e A[Catch: Exception -> 0x0045, TryCatch #2 {Exception -> 0x0045, blocks: (B:11:0x0040, B:12:0x016f, B:15:0x01b0, B:17:0x01bc, B:18:0x01c2, B:21:0x01cc, B:23:0x01ec, B:27:0x01f7, B:29:0x01fd, B:33:0x022e, B:35:0x0232, B:57:0x02f5, B:37:0x0251, B:39:0x0255, B:41:0x025b, B:43:0x026e, B:45:0x0278, B:47:0x027c, B:48:0x02cd, B:50:0x02e0, B:51:0x02ea), top: B:10:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.t0.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final r45.ez5 u(oi3.g gVar, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i());
        sb6.append(" createCgiRequest: start, toUserName=");
        y80.q1 q1Var = this.f541474i;
        sb6.append(q1Var.f541434a);
        sb6.append(", contentLen=");
        sb6.append(str.length());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", sb6.toString());
        r45.ll4 ll4Var = new r45.ll4();
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = q1Var.f541434a;
        du5Var.f454290e = true;
        ll4Var.f461105d = du5Var;
        ll4Var.f461106e = str;
        ll4Var.f461107f = 48;
        ll4Var.f461108g = (int) (gVar.m75942xfb822ef2(gVar.f427150d + 2) / 1000);
        java.lang.String r17 = c01.z1.r();
        int i17 = gVar.f427150d;
        ll4Var.f461109h = c01.y1.a(r17, gVar.m75942xfb822ef2(i17 + 2)).hashCode();
        try {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(q1Var.f541434a)) {
                ll4Var.f461111m = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(q1Var.f541434a);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " createCgiRequest: SendMsgTicket exception: " + e17.getMessage(), e17);
        }
        try {
            w11.i1 i1Var = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).f523597d;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(gVar.m75945x2fec8307(i17 + 3), gVar.m75942xfb822ef2(i17 + 0));
            if (k17 != null) {
                i1Var.j(ll4Var, k17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " createCgiRequest: tempMsgInfo is null, skipping MsgSource assembly");
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " createCgiRequest: MsgSource assembly exception: " + e18.getMessage(), e18);
        }
        r45.ez5 ez5Var = new r45.ez5();
        java.util.LinkedList linkedList = ez5Var.f455384e;
        linkedList.add(ll4Var);
        ez5Var.f455383d = linkedList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " createCgiRequest: done, Count=" + ez5Var.f455383d);
        return ez5Var;
    }

    public final void w(oi3.g gVar, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " onMsgSendFail: retCode=" + i17);
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(gVar.m75945x2fec8307(gVar.f427150d + 3), gVar.m75942xfb822ef2(gVar.f427150d + 0));
        if (k17 != null) {
            k17.r1(5);
            e0Var.s(k17.Q0(), k17.m124847x74d37ac6(), k17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " onMsgSendFail: updated msg status to STATE_FAILED");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363 c5991xa0d42363 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363();
            c5991xa0d42363.f136286g.f88994a = k17;
            c5991xa0d42363.e();
        }
    }

    @Override // qi3.b0
    public java.lang.Object y(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsg.LocationMsgSendTask", i() + " uploadAttach: no attachment needed for location msg");
        qi3.i0 i0Var = new qi3.i0(0);
        this.f541474i.f541452s = i0Var;
        i0Var.f445259b.put("upload_cost", new java.lang.Long(0L));
        return i0Var;
    }
}
