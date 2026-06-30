package ez;

@j95.b
/* loaded from: classes9.dex */
public final class e extends jm0.o implements pt.j0 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Zi(ot0.q r17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            boolean r3 = r2 instanceof ez.a
            if (r3 == 0) goto L19
            r3 = r2
            ez.a r3 = (ez.a) r3
            int r4 = r3.f339226g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f339226g = r4
            goto L1e
        L19:
            ez.a r3 = new ez.a
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f339224e
            pz5.a r4 = pz5.a.f440719d
            int r5 = r3.f339226g
            r6 = 1
            java.lang.String r7 = ""
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L33
            java.lang.Object r1 = r3.f339223d
            ez.e r1 = (ez.e) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r2)
            goto L84
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r2)
            java.lang.String r2 = r1.T
            int r5 = x51.t1.f533619a
            if (r2 != 0) goto L46
            r10 = r7
            goto L47
        L46:
            r10 = r2
        L47:
            java.lang.String r2 = r1.f430243t
            if (r2 != 0) goto L4d
            r11 = r7
            goto L4e
        L4d:
            r11 = r2
        L4e:
            java.lang.String r2 = r17.n()
            if (r2 != 0) goto L56
            r12 = r7
            goto L57
        L56:
            r12 = r2
        L57:
            java.lang.String r2 = r1.f430223o
            if (r2 != 0) goto L5c
            r2 = r7
        L5c:
            java.lang.String r13 = r2.toLowerCase()
            java.lang.String r2 = "toLowerCase(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r13, r2)
            java.lang.String r1 = r1.I
            if (r1 != 0) goto L6c
            r14 = r7
            goto L6d
        L6c:
            r14 = r1
        L6d:
            ez.c r1 = new ez.c
            r15 = 0
            r8 = r1
            r9 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r3.f339223d = r0
            r3.f339226g = r6
            r5 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.a4.c(r5, r1, r3)
            if (r2 != r4) goto L84
            return r4
        L84:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L89
            return r7
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ez.e.Zi(ot0.q, com.tencent.mm.pluginsdk.model.app.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean aj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, v05.b bVar, java.lang.String str) {
        return ez.v0.f339310a.a(f9Var, bVar, str);
    }

    public int bj(r05.k baseAppMsg) {
        s05.b z17;
        b15.a q17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseAppMsg, "baseAppMsg");
        int i17 = baseAppMsg.f449898d;
        int m75939xb282bd08 = baseAppMsg.m75939xb282bd08(i17 + 6);
        int m75939xb282bd082 = baseAppMsg.m75939xb282bd08(i17 + 7);
        int d17 = ot.a.d(baseAppMsg);
        int e17 = ot.a.e(baseAppMsg);
        java.lang.Object m126734x4dcbcf6d = baseAppMsg.m126734x4dcbcf6d("wcpayinfo");
        int k17 = (!(m126734x4dcbcf6d instanceof b15.c) || (q17 = ((b15.c) m126734x4dcbcf6d).q()) == null) ? 0 : q17.k();
        java.lang.Object m126734x4dcbcf6d2 = baseAppMsg.m126734x4dcbcf6d("wcpayinfo");
        int j17 = m126734x4dcbcf6d2 instanceof b15.c ? ((b15.c) m126734x4dcbcf6d2).j() : 0;
        if (m75939xb282bd08 == 76) {
            return 1040187441;
        }
        if (m75939xb282bd08 == 92) {
            return 1409286193;
        }
        if (m75939xb282bd08 == 93) {
            return 1426063409;
        }
        if (m75939xb282bd08 == 133) {
            return 1476395057;
        }
        if (m75939xb282bd08 == 118) {
            return 1442840625;
        }
        if (m75939xb282bd08 == 3) {
            ka0.r0 r0Var = (ka0.r0) i95.n0.c(ka0.r0.class);
            java.lang.String m75945x2fec8307 = baseAppMsg.m75945x2fec8307(i17 + 0);
            ((ja0.o0) r0Var).getClass();
            if (ll3.j2.i(m75945x2fec8307) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wx485a97c844086dc9", baseAppMsg.m75945x2fec8307(i17 + 0))) {
                return 1040187441;
            }
        }
        if (m75939xb282bd08 == 116) {
            return 1191182385;
        }
        if (m75939xb282bd08 == 41) {
            return 1124073521;
        }
        if (d17 == 4 || e17 != 0) {
            return 318767153;
        }
        if (m75939xb282bd08 == 2001) {
            if (m75939xb282bd082 == 1 || j17 == 1) {
                return 469762097;
            }
            return k17 == 4 ? 503316529 : 436207665;
        }
        if (m75939xb282bd08 == 2002) {
            return 536870961;
        }
        if (m75939xb282bd08 == 2003) {
            return 536936497;
        }
        if (m75939xb282bd08 == 66) {
            return 905969713;
        }
        if (m75939xb282bd082 == 1) {
            return m75939xb282bd08 == 21 ? -1879048185 : 285212721;
        }
        if (m75939xb282bd082 == 2) {
            return m75939xb282bd08 == 21 ? -1879048183 : 301989937;
        }
        if (m75939xb282bd082 == 3) {
            return m75939xb282bd08 == 21 ? -1879048176 : -1879048189;
        }
        if (m75939xb282bd082 == 4) {
            return m75939xb282bd08 == 21 ? -1879048183 : -1879048190;
        }
        if (m75939xb282bd082 == 5) {
            return -1879048191;
        }
        if (m75939xb282bd082 == 17) {
            return -1879048186;
        }
        switch (m75939xb282bd08) {
            case 1:
                return 16777265;
            case 2:
                return 268435505;
            case 6:
            case 74:
            case 130:
            case 131:
                return 1090519089;
            case 8:
                return 1048625;
            case 10:
                return 335544369;
            case 13:
                return 369098801;
            case 16:
                return 452984881;
            case 17:
                return -1879048186;
            case 20:
                return 402653233;
            case 33:
            case 36:
                java.lang.Object m126734x4dcbcf6d3 = baseAppMsg.m126734x4dcbcf6d("weappinfo");
                s05.d dVar = m126734x4dcbcf6d3 instanceof s05.d ? (s05.d) m126734x4dcbcf6d3 : null;
                if (dVar != null && (z17 = dVar.z()) != null && z17.j() == 1) {
                    r8 = 1;
                }
                s05.c A = dVar != null ? dVar.A() : null;
                if (dVar != null && r8 != 0 && (dVar.m163514xfb85f7b0() == 2 || dVar.m163514xfb85f7b0() == 3)) {
                    return 553648177;
                }
                if (dVar != null && A != null && ((A.k() == 1 || A.j() == 1) && dVar.m163514xfb85f7b0() == 3)) {
                    return 587202609;
                }
                break;
            case 34:
                return 520093745;
            case 46:
                return 687865905;
            case 47:
                return 704643121;
            case 48:
                return 738197553;
            case 50:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 771751985;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) != 1) {
                    return 771751985;
                }
                break;
            case 51:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 754974769;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) != 1) {
                    return 754974769;
                }
                break;
            case 52:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 788529201;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) != 1) {
                    return 788529201;
                }
                break;
            case 53:
                return 805306417;
            case 54:
                if (baseAppMsg.m126734x4dcbcf6d("mmbrandmpvideo") != null) {
                    return 486539313;
                }
                break;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
                return 822083633;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 838860849;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) != 1) {
                    return 838860849;
                }
                break;
            case 60:
                return 855638065;
            case 62:
                return 922746929;
            case 63:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 973078577;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) != 1) {
                    return 973078577;
                }
                break;
            case 65:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 989855793;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) != 1) {
                    return 989855793;
                }
                break;
            case 69:
                return 939524145;
            case 72:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1006633009;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) != 1) {
                    return 1006633009;
                }
                break;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.k.f34811x366c91de /* 73 */:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 956301361;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) != 1) {
                    return 956301361;
                }
                break;
            case 75:
                java.lang.Object m126734x4dcbcf6d4 = baseAppMsg.m126734x4dcbcf6d("finder");
                x05.i iVar = m126734x4dcbcf6d4 instanceof x05.i ? (x05.i) m126734x4dcbcf6d4 : null;
                r8 = iVar != null ? iVar.m174812xfb85f7b0() : 0;
                if (r8 == 2) {
                    return 1057030193;
                }
                if (r8 == 3) {
                    return 1023541297;
                }
                if (r8 == 4 || r8 == 5) {
                    return 1023606833;
                }
                if (r8 == 6) {
                    return 1023672369;
                }
                if (r8 == 100000000) {
                    return 1023475761;
                }
                break;
            case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51705xc4897837 /* 77 */:
                return 1074790449;
            case 80:
                return 1075839025;
            case 81:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1076887601;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) != 1) {
                    return 1076887601;
                }
                break;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                return 974127153;
            case 87:
                return 1107296305;
            case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                return 975175729;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45659xd352f050 /* 89 */:
                return 1078984753;
            case 94:
                return 976224305;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45664xedca4d42 /* 95 */:
                return 1080033329;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45665x7309a58f /* 96 */:
                return 977272881;
            case 101:
                return 1140850737;
            case 105:
                return 1157627953;
            case 106:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1174405169;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) != 1) {
                    return 1174405169;
                }
                break;
            case 109:
                return 1627390001;
            case 111:
                return 978321457;
            case 112:
                return 1081081905;
            case 113:
                return 979370033;
            case 114:
                return 1895825457;
            case 115:
                return -2130706383;
            case 119:
                return 1207959601;
            case 120:
                return 1224736817;
            case 124:
                return -2113929167;
            case 126:
                return -2097151951;
            case 128:
                return -2080374735;
            case 129:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1241514033;
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) != 1) {
                    return 1241514033;
                }
                break;
            case 2000:
            case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26 /* 2011 */:
                return 419430449;
            case 671088689:
                return 671088689;
        }
        return 49;
    }

    public java.lang.String cj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.String title, java.lang.String ext, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        return bm5.z.g(bm5.y.f104289i.b(msgInfo, bm5.f0.f104108w, title), null, null, null, ext, z17, 7, null);
    }

    public java.lang.String fj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, boolean z17) {
        java.lang.String r17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        v05.b bVar = new v05.b();
        java.lang.String U1 = msgInfo.U1();
        java.lang.String str = "";
        if (U1 == null) {
            U1 = "";
        }
        bVar.m126728xdc93280d(U1);
        java.lang.String g17 = ez.v0.f339310a.g(bVar);
        if (g17 == null) {
            g17 = "";
        }
        v05.a aVar = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8);
        if (aVar != null && (r17 = aVar.r()) != null) {
            str = r17;
        }
        return cj(msgInfo, g17, str, z17);
    }

    public java.lang.String hj(oi3.g simpleMsgInfo, java.lang.String title, java.lang.String ext, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        return bm5.z.g(bm5.y.f104289i.e(simpleMsgInfo, bm5.f0.f104108w, title), null, null, null, ext, z17, 7, null);
    }

    public java.lang.String ij(oi3.g simpleMsgInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        return bm5.z.h(bm5.y.f104289i.e(simpleMsgInfo, bm5.f0.f104097i, ""), null, z17, 1, null);
    }

    public java.lang.String mj(java.lang.String title, java.lang.String ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        java.lang.String f17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.f(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.k(), title, ext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "genAttachCopyDir(...)");
        return f17;
    }

    public int nj(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(z17);
        sb6.append(", stack = ");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        return 101;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object oj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ez.e.oj(com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 pj(oi3.e simpleAppMsgMsgInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleAppMsgMsgInfo, "simpleAppMsgMsgInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        int i17 = simpleAppMsgMsgInfo.f427150d;
        f9Var.m124849x5361953a(simpleAppMsgMsgInfo.m75942xfb822ef2(i17 + 0));
        f9Var.o1(simpleAppMsgMsgInfo.m75942xfb822ef2(i17 + 1));
        f9Var.u1(simpleAppMsgMsgInfo.m75945x2fec8307(i17 + 3));
        f9Var.e1(simpleAppMsgMsgInfo.m75942xfb822ef2(i17 + 2));
        f9Var.j1(simpleAppMsgMsgInfo.m75939xb282bd08(i17 + 9));
        f9Var.i1(simpleAppMsgMsgInfo.j());
        f9Var.u3(simpleAppMsgMsgInfo.m75945x2fec8307(i17 + 12));
        f9Var.m124850x7650bebc(simpleAppMsgMsgInfo.m75939xb282bd08(i17 + 4));
        if (r26.n0.N(simpleAppMsgMsgInfo.m75945x2fec8307(i17 + 11))) {
            str = simpleAppMsgMsgInfo.m75945x2fec8307(i17 + 13);
        } else {
            str = simpleAppMsgMsgInfo.m75945x2fec8307(i17 + 11) + ":\n" + simpleAppMsgMsgInfo.m75945x2fec8307(i17 + 13);
        }
        f9Var.d1(str);
        return f9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oi3.e qj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r8) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ez.e.qj(com.tencent.mm.storage.f9):oi3.e");
    }
}
