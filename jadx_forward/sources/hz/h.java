package hz;

/* loaded from: classes12.dex */
public final class h extends qi3.c {

    /* renamed from: i, reason: collision with root package name */
    public final hz.m f367761i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f367762m;

    public h(hz.m params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f367761i = params;
    }

    @Override // qi3.b0
    public java.lang.Object B(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.ml4 ml4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " start to updateMsg");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        qi3.k0 k0Var = new qi3.k0(0);
        hz.m mVar = this.f367761i;
        mVar.f367775j = k0Var;
        oi3.g gVar = mVar.f367771f;
        java.util.Map map = k0Var.f445273b;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg failed: msgInfo is null");
            k0Var.f445272a = -520009;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.f0 f0Var = mVar.f367772g;
        if (f0Var != null && f0Var.f445233a != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: prepare failed with retCode=" + f0Var.f445233a);
            w(gVar, f0Var.f445233a);
            k0Var.f445272a = f0Var.f445233a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.i0 i0Var = mVar.f367773h;
        if (i0Var != null && i0Var.f445258a != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: upload failed with retCode=" + i0Var.f445258a);
            w(gVar, i0Var.f445258a);
            k0Var.f445272a = i0Var.f445258a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        qi3.d0 d0Var = mVar.f367774i;
        if (d0Var != null && d0Var.f445216a != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: sendCgi failed with retCode=" + d0Var.f445216a);
            w(gVar, d0Var.f445216a);
            k0Var.f445272a = d0Var.f445216a;
            map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return k0Var;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        int i17 = gVar.f427150d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(gVar.m75945x2fec8307(i17 + 3), gVar.m75942xfb822ef2(i17 + 0));
        if (k17 != null) {
            qi3.d0 d0Var2 = mVar.f367774i;
            r9 = d0Var2 != null ? d0Var2.f445222g : null;
            if (r9 instanceof r45.fz5) {
                java.util.LinkedList linkedList = ((r45.fz5) r9).f456284e;
                if (linkedList != null && (ml4Var = (r45.ml4) kz5.n0.Z(linkedList)) != null) {
                    k17.o1(ml4Var.f462166n);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: set MsgSvrId=" + ml4Var.f462166n);
                }
            } else if (r9 instanceof r45.rr) {
                r45.rr rrVar = (r45.rr) r9;
                k17.o1(rrVar.f466663d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: byp set MsgSvrId=" + rrVar.f466663d);
            }
            k17.r1(2);
            e0Var.s(k17.Q0(), k17.m124847x74d37ac6(), k17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg success: msgId=" + k17.m124847x74d37ac6() + ", status=STATE_SENT");
            if (!mVar.f367768c) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a c6194x6522023a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a();
                long m124847x74d37ac6 = k17.m124847x74d37ac6();
                am.xz xzVar = c6194x6522023a.f136451g;
                xzVar.f89942a = m124847x74d37ac6;
                xzVar.f89943b = 0;
                xzVar.f89944c = k17.Q0();
                c6194x6522023a.e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: published UpdateForwardMsgIdEvent, msgId=" + k17.m124847x74d37ac6() + ", talker=" + k17.Q0());
            }
            r9 = jz5.f0.f384359a;
        }
        if (r9 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " updateMsg: getMsgAndCheckById returned null");
            k0Var.f445272a = -520002;
        }
        map.put("update_msg_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return k0Var;
    }

    @Override // qi3.b0
    public qi3.h0 C() {
        return qi3.h0.f445253h;
    }

    @Override // qi3.b0
    public java.lang.Object D(yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        long j17;
        java.lang.Object obj;
        java.lang.String str;
        qk.o oVar;
        java.lang.String Vi;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " start to prepare");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        hz.m mVar = this.f367761i;
        qi3.f0 f0Var = mVar.f367772g;
        if (f0Var == null) {
            f0Var = new qi3.f0(0);
            mVar.f367772g = f0Var;
        }
        qi3.f0 f0Var2 = f0Var;
        f0Var2.f445234b.put("send_msg_type", new java.lang.Integer(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(mVar.f367767b) ? 66 : 42));
        boolean z17 = mVar.f367768c;
        java.util.Map map = f0Var2.f445234b;
        if (z17) {
            map.put("resend_msg", new java.lang.Integer(1));
            oi3.g gVar = mVar.f367771f;
            if (gVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " prepare failed: isResend=true but sendMsgInfo is null");
                f0Var2.f445233a = -520009;
                map.put("prepare_cost", new java.lang.Long(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                return f0Var2;
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
            return f0Var2;
        }
        java.lang.String str2 = mVar.f367770e;
        if (str2 == null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(mVar.f367767b, true);
            java.lang.String str3 = mVar.f367767b;
            if (n17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", "buildCardXmlContent: contact is null for " + str3);
                j17 = elapsedRealtime;
                obj = "prepare_cost";
                str2 = null;
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str3);
                str = "";
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str3)) {
                    java.lang.String Q0 = n17.Q0();
                    if (n17.A0() == null || n17.A0().f463552e == 0 || n17.A0().f463552e == 2) {
                        obj = "prepare_cost";
                        j17 = elapsedRealtime;
                        Vi = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Vi(n17.Q0(), "openim_desc_icon", j41.a0.TYPE_URL, 0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Vi, "getAppIDString(...)");
                    } else {
                        j17 = elapsedRealtime;
                        obj = "prepare_cost";
                        Vi = "";
                    }
                    java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fj6, "getWordingFromID(...)");
                    java.lang.Object[] objArr = new java.lang.Object[8];
                    java.lang.String c17 = n07 != null ? n07.c() : null;
                    if (c17 == null) {
                        c17 = "";
                    }
                    objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(c17);
                    java.lang.String d17 = n07 != null ? n07.d() : null;
                    if (d17 == null) {
                        d17 = "";
                    }
                    objArr[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(d17);
                    objArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n17.d1());
                    objArr[3] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(n17.f2());
                    objArr[4] = java.lang.Integer.valueOf(n17.I);
                    objArr[5] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(Q0 != null ? Q0 : "");
                    objArr[6] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(fj6);
                    objArr[7] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(Vi);
                    str2 = java.lang.String.format("<msg bigheadimgurl=\"%s\" smallheadimgurl=\"%s\" username=\"%s\" nickname=\"%s\" sex=\"%d\" openimappid=\"%s\" openimdesc=\"%s\" openimdescicon=\"%s\"/>", java.util.Arrays.copyOf(objArr, 8));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "format(...)");
                } else {
                    j17 = elapsedRealtime;
                    obj = "prepare_cost";
                    int i18 = n07 != null ? n07.f152063b : n17.H;
                    rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                    if (n17.k2()) {
                        java.lang.String d18 = n17.d1();
                        ((qv.o) u2Var).getClass();
                        oVar = r01.z.b(d18);
                    } else {
                        oVar = null;
                    }
                    java.lang.Object[] objArr2 = new java.lang.Object[17];
                    java.lang.String d19 = n17.d1();
                    if (d19 == null) {
                        d19 = "";
                    }
                    objArr2[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(d19);
                    java.lang.String f27 = n17.f2();
                    if (f27 == null) {
                        f27 = "";
                    }
                    objArr2[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(f27);
                    java.lang.String t07 = n17.t0();
                    if (t07 == null) {
                        t07 = "";
                    }
                    objArr2[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(t07);
                    java.lang.String f28 = n17.f2();
                    if (f28 == null) {
                        f28 = "";
                    }
                    objArr2[3] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(f28);
                    java.lang.String T0 = n17.T0();
                    if (T0 == null) {
                        T0 = "";
                    }
                    objArr2[4] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(T0);
                    objArr2[5] = java.lang.Integer.valueOf(i18);
                    java.lang.String str4 = n17.W;
                    if (str4 == null) {
                        str4 = "";
                    }
                    objArr2[6] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str4);
                    java.lang.String str5 = n17.X;
                    if (str5 == null) {
                        str5 = "";
                    }
                    objArr2[7] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str5);
                    java.lang.String str6 = n17.V;
                    if (str6 == null) {
                        str6 = "";
                    }
                    objArr2[8] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str6);
                    objArr2[9] = java.lang.Integer.valueOf(n17.U);
                    objArr2[10] = java.lang.Integer.valueOf(n17.I);
                    objArr2[11] = java.lang.Integer.valueOf(n17.f1());
                    java.lang.String str7 = n17.f318121y0;
                    if (str7 == null) {
                        str7 = "";
                    }
                    objArr2[12] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str7);
                    java.lang.String str8 = oVar != null ? oVar.f66734xea1bd3d4 : null;
                    if (str8 == null) {
                        str8 = "";
                    }
                    objArr2[13] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str8);
                    java.lang.String str9 = n17.f318103l1;
                    if (str9 == null) {
                        str9 = "";
                    }
                    objArr2[14] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str9);
                    byte[] bArr = mVar.f367769d;
                    if (bArr != null) {
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", "getBizNameCardString buffer size: " + bArr.length);
                            java.lang.String encodeToString = android.util.Base64.encodeToString(bArr, 2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(encodeToString);
                            str = encodeToString;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", "getBizNameCardString exception: " + e17.getMessage());
                        }
                    }
                    objArr2[15] = str;
                    objArr2[16] = 0;
                    str2 = java.lang.String.format("<msg username=\"%s\" nickname=\"%s\" alias=\"%s\" fullpy=\"%s\" shortpy=\"%s\" imagestatus=\"%d\" scene=\"17\" province=\"%s\" city=\"%s\" sign=\"%s\" percard=\"%d\" sex=\"%d\" certflag=\"%d\" certinfo=\"%s\" certinfoext=\"\" brandIconUrl=\"%s\" brandHomeUrl=\"\" brandSubscriptConfigUrl=\"\" brandFlags=\"\" regionCode=\"%s\" biznamecardinfo=\"%s\" brandType=\"%d\"/>", java.util.Arrays.copyOf(objArr2, 17));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "format(...)");
                }
            }
        } else {
            j17 = elapsedRealtime;
            obj = "prepare_cost";
        }
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " prepare failed: buildCardXmlContent returned null");
            f0Var2.f445233a = -520009;
            return f0Var2;
        }
        this.f367762m = str2;
        oi3.g gVar2 = new oi3.g();
        mVar.f367771f = gVar2;
        java.lang.String str10 = mVar.f367766a;
        int i19 = gVar2.f427150d;
        gVar2.set(i19 + 3, str10);
        gVar2.set(i19 + 13, str2);
        gVar2.set(i19 + 4, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(mVar.f367767b) ? 66 : 42));
        gVar2.set(i19 + 7, 1);
        gVar2.set(i19 + 9, 1);
        gVar2.set(i19 + 2, java.lang.Long.valueOf(c01.w9.o(mVar.f367766a)));
        gVar2.set(i19 + 0, java.lang.Long.valueOf(pt0.f0.f439742b1.r(gVar2)));
        if (gVar2.m75942xfb822ef2(i19 + 0) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " prepare failed: insertMsg returned " + gVar2.m75942xfb822ef2(i19 + 0));
            f0Var2.f445233a = -520001;
            return f0Var2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " prepare success: msgId=" + gVar2.m75942xfb822ef2(i19 + 0) + ", talker=" + gVar2.m75945x2fec8307(i19 + 3));
        lVar.mo146xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(gVar2.m75942xfb822ef2(i19 + 0), gVar2.m75945x2fec8307(i19 + 3)));
        map.put("send_msg_local_id", new java.lang.Long(gVar2.m75942xfb822ef2(i19 + 0)));
        map.put("send_msg_create_time", new java.lang.Long(gVar2.m75942xfb822ef2(i19 + 2)));
        map.put(obj, new java.lang.Long(android.os.SystemClock.elapsedRealtime() - j17));
        return f0Var2;
    }

    @Override // qi3.c
    public qi3.e0 h() {
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5;
        qi3.e0 e0Var = new qi3.e0(this.f445210f, this);
        hz.m mVar = this.f367761i;
        oi3.g gVar = mVar.f367771f;
        if (gVar != null) {
            int i17 = gVar.f427150d;
            c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(gVar.m75942xfb822ef2(i17 + 0), gVar.m75945x2fec8307(i17 + 3));
        } else {
            c16564xb55e1d5 = null;
        }
        e0Var.f445230g = c16564xb55e1d5;
        e0Var.f445226c = mVar.f367772g;
        e0Var.f445227d = mVar.f367773h;
        e0Var.f445228e = mVar.f367774i;
        e0Var.f445229f = mVar.f367775j;
        return e0Var;
    }

    @Override // qi3.c
    public boolean j() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(this.f367761i.f367766a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(14:5|6|7|(2:121|(1:(4:124|125|126|47)(2:127|128))(4:129|130|131|98))(2:9|(2:11|12)(4:14|(1:16)|(1:120)(1:20)|(2:22|23)(16:24|25|26|28|29|30|31|32|33|34|35|36|37|38|39|(6:90|91|92|93|94|(1:96)(2:97|98))(4:41|42|43|(1:45)(2:46|47)))))|48|(1:50)|51|(1:53)(1:85)|54|55|(7:57|58|59|(3:61|(1:63)(1:66)|(1:65))|67|68|69)(3:75|(1:77)(1:79)|78)|70|71|72))|135|6|7|(0)(0)|48|(0)|51|(0)(0)|54|55|(0)(0)|70|71|72|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0185, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0271, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4 A[Catch: Exception -> 0x0185, TryCatch #5 {Exception -> 0x0185, blocks: (B:47:0x01b8, B:48:0x01ba, B:51:0x01c8, B:53:0x01d4, B:54:0x01da, B:57:0x01e2, B:59:0x01e9, B:61:0x0207, B:65:0x0213, B:67:0x0219, B:98:0x0182), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e2 A[Catch: Exception -> 0x0185, TRY_LEAVE, TryCatch #5 {Exception -> 0x0185, blocks: (B:47:0x01b8, B:48:0x01ba, B:51:0x01c8, B:53:0x01d4, B:54:0x01da, B:57:0x01e2, B:59:0x01e9, B:61:0x0207, B:65:0x0213, B:67:0x0219, B:98:0x0182), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024e A[Catch: Exception -> 0x0271, TryCatch #10 {Exception -> 0x0271, blocks: (B:69:0x0249, B:75:0x024e, B:78:0x0266), top: B:55:0x01e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
    /* JADX WARN: Type inference failed for: r2v18, types: [qi3.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.Continuation, hz.f] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [qi3.c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [qi3.c] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [qi3.d0] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, qi3.d0] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [qi3.d0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, qi3.d0] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v22 */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r31) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz.h.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d6 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:11:0x003a, B:12:0x0189, B:15:0x01ca, B:17:0x01d6, B:18:0x01dc, B:20:0x01e4, B:22:0x01eb, B:24:0x0209, B:28:0x0214, B:30:0x021a, B:34:0x024b, B:36:0x024f, B:44:0x02ad, B:47:0x028a, B:38:0x026e, B:40:0x0272, B:42:0x0279), top: B:10:0x003a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e4 A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:11:0x003a, B:12:0x0189, B:15:0x01ca, B:17:0x01d6, B:18:0x01dc, B:20:0x01e4, B:22:0x01eb, B:24:0x0209, B:28:0x0214, B:30:0x021a, B:34:0x024b, B:36:0x024f, B:44:0x02ad, B:47:0x028a, B:38:0x026e, B:40:0x0272, B:42:0x0279), top: B:10:0x003a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024b A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:11:0x003a, B:12:0x0189, B:15:0x01ca, B:17:0x01d6, B:18:0x01dc, B:20:0x01e4, B:22:0x01eb, B:24:0x0209, B:28:0x0214, B:30:0x021a, B:34:0x024b, B:36:0x024f, B:44:0x02ad, B:47:0x028a, B:38:0x026e, B:40:0x0272, B:42:0x0279), top: B:10:0x003a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz.h.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final r45.ez5 u(oi3.g gVar, java.lang.String str, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i());
        sb6.append(" createCgiRequest: start, toUserName=");
        hz.m mVar = this.f367761i;
        sb6.append(mVar.f367766a);
        sb6.append(", msgType=");
        sb6.append(i17);
        sb6.append(", contentLen=");
        sb6.append(str.length());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", sb6.toString());
        r45.ll4 ll4Var = new r45.ll4();
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = mVar.f367766a;
        du5Var.f454290e = true;
        ll4Var.f461105d = du5Var;
        ll4Var.f461106e = str;
        ll4Var.f461107f = i17;
        ll4Var.f461108g = (int) (gVar.m75942xfb822ef2(gVar.f427150d + 2) / 1000);
        java.lang.String r17 = c01.z1.r();
        int i18 = gVar.f427150d;
        ll4Var.f461109h = c01.y1.a(r17, gVar.m75942xfb822ef2(i18 + 2)).hashCode();
        try {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(mVar.f367766a)) {
                ll4Var.f461111m = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(mVar.f367766a);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " createCgiRequest: SendMsgTicket exception: " + e17.getMessage(), e17);
        }
        try {
            w11.i1 i1Var = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).f523597d;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(gVar.m75945x2fec8307(i18 + 3), gVar.m75942xfb822ef2(i18 + 0));
            if (k17 != null) {
                i1Var.j(ll4Var, k17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " createCgiRequest: tempMsgInfo is null, skipping MsgSource assembly");
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " createCgiRequest: MsgSource assembly exception: " + e18.getMessage(), e18);
        }
        r45.ez5 ez5Var = new r45.ez5();
        java.util.LinkedList linkedList = ez5Var.f455384e;
        linkedList.add(ll4Var);
        ez5Var.f455383d = linkedList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " createCgiRequest: done, Count=" + ez5Var.f455383d);
        return ez5Var;
    }

    public final void w(oi3.g gVar, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " onMsgSendFail: retCode=" + i17);
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(gVar.m75945x2fec8307(gVar.f427150d + 3), gVar.m75942xfb822ef2(gVar.f427150d + 0));
        if (k17 != null) {
            k17.r1(5);
            e0Var.s(k17.Q0(), k17.m124847x74d37ac6(), k17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " onMsgSendFail: updated msg status to STATE_FAILED");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363 c5991xa0d42363 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363();
            c5991xa0d42363.f136286g.f88994a = k17;
            c5991xa0d42363.e();
        }
    }

    @Override // qi3.b0
    public java.lang.Object y(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsg.ContactCardMsgSendTask", i() + " uploadAttach: no attachment needed for contact card");
        qi3.i0 i0Var = new qi3.i0(0);
        this.f367761i.f367773h = i0Var;
        i0Var.f445259b.put("upload_cost", new java.lang.Long(0L));
        return i0Var;
    }
}
