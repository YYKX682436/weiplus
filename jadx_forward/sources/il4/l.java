package il4;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a */
    public static final il4.l f373675a = new il4.l();

    /* renamed from: b */
    public static final jz5.g f373676b = jz5.h.b(il4.g.f373669d);

    /* renamed from: c */
    public static final jz5.g f373677c = jz5.h.b(il4.h.f373670d);

    /* renamed from: d */
    public static java.lang.Boolean f373678d;

    /* renamed from: e */
    public static java.lang.String f373679e;

    public static final java.lang.String d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
        if (n07 == null) {
            return "";
        }
        java.lang.String c17 = n07.c();
        if (c17 == null || c17.length() == 0) {
            c17 = n07.d();
        }
        return c17 == null ? "" : c17;
    }

    public static final java.lang.String e(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return f(context, i17, true);
    }

    public static final java.lang.String f(android.content.Context context, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = !g(i17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyz) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (!z17) {
            return string;
        }
        return "[" + string + ']';
    }

    public static final boolean g(int i17) {
        if (j(i17)) {
            return true;
        }
        if (i17 == 4) {
            return true;
        }
        if (i17 == 2) {
            return true;
        }
        if (i17 == 100 || i17 == 105) {
            return true;
        }
        return i17 == 101;
    }

    public static final boolean i(int i17) {
        if (!(i17 == 100 || i17 == 105)) {
            if (!(i17 == 102)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j(int i17) {
        return i17 == 3;
    }

    public static final boolean k(int i17) {
        if (i17 == 1) {
            return true;
        }
        if (i17 == 102) {
            return true;
        }
        return i17 == 103;
    }

    public static final boolean l(int i17) {
        if (k(i17)) {
            return true;
        }
        return i17 == 7 || i17 == 8;
    }

    public static final boolean m(int i17) {
        bw5.a80 a80Var;
        if (i17 == 5 || i17 == 6) {
            return false;
        }
        switch (i17) {
            case 1:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_MUSIC;
                break;
            case 2:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_ARTICLE;
                break;
            case 3:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_ARTICLE_AUDIO;
                break;
            case 4:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_FINDER;
                break;
            case 5:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LIVE;
                break;
            case 6:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_BROADCAST;
                break;
            case 7:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_MV_V2;
                break;
            case 8:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_MV_BIZ;
                break;
            case 9:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_CHAT_TTS;
                break;
            case 10:
                a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_CHATROOM_TTS;
                break;
            default:
                switch (i17) {
                    case 100:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LOCAL_FILE;
                        break;
                    case 101:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LOCAL_WEAPP;
                        break;
                    case 102:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LOCAL_MUSIC_FILE;
                        break;
                    case 103:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LOCAL_MUSIC_WEAPP;
                        break;
                    case 104:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_AUDIO_URL;
                        break;
                    case 105:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_LOCAL_RECORD_FILE;
                        break;
                    case 106:
                        a80Var = bw5.a80.MMLISTEN_ITEM_TYPE_MUSIC_CHORUS_MV;
                        break;
                    default:
                        a80Var = null;
                        break;
                }
        }
        return a80Var != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01bc, code lost:
    
        if ((r0 != null && r0.f116555i[1]) == false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02cc, code lost:
    
        if (r0 != null) goto L393;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v31, types: [jm4.i4] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v11, types: [jm4.i4] */
    /* JADX WARN: Type inference failed for: r13v13, types: [fm4.f] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v24, types: [jm4.i4] */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v29, types: [jm4.i4] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(il4.e r12, boolean r13, android.content.Context r14, bw5.lp0 r15) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: il4.l.p(il4.e, boolean, android.content.Context, bw5.lp0):void");
    }

    public static /* synthetic */ void q(il4.e eVar, boolean z17, android.content.Context context, bw5.lp0 lp0Var, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            context = null;
        }
        if ((i17 & 8) != 0) {
            lp0Var = null;
        }
        p(eVar, z17, context, lp0Var);
    }

    public final bw5.o50 a(bw5.mb0 simPlayInfo, bw5.xa0 xa0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simPlayInfo, "simPlayInfo");
        bw5.o50 o50Var = new bw5.o50();
        o50Var.k(simPlayInfo.f111684e);
        o50Var.i(simPlayInfo.b());
        o50Var.j(simPlayInfo.f111685f);
        o50Var.f112490e = simPlayInfo.m12484xfb82e301();
        boolean[] zArr = o50Var.L1;
        zArr[2] = true;
        o50Var.Q = simPlayInfo.f111692p[6] ? simPlayInfo.f111688i : "";
        zArr[36] = true;
        o50Var.f112493h = simPlayInfo.c();
        zArr[5] = true;
        o50Var.f112505t = simPlayInfo.f111689m;
        zArr[14] = true;
        if (xa0Var != null) {
            o50Var.f112512y = xa0Var;
            zArr[19] = true;
        }
        return o50Var;
    }

    public final bw5.o50 b(java.lang.String simplePlayableInfoBuff, bw5.xa0 xa0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simplePlayableInfoBuff, "simplePlayableInfoBuff");
        try {
            bw5.mb0 mo11468x92b714fd = new bw5.mb0().mo11468x92b714fd(android.util.Base64.decode(simplePlayableInfoBuff, 0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            return a(mo11468x92b714fd, xa0Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMusicUtils", "tingItemFromListenPlayableInfoBuff ex " + e17.getMessage());
            return null;
        }
    }

    public final java.lang.Object c(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        bw5.d50 d50Var = new bw5.d50();
        d50Var.f107861e = str;
        d50Var.f107869p[4] = true;
        byte[] mo14344x5f01b1f6 = d50Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        lVar.f152197a = new qk.s9(mo14344x5f01b1f6);
        lVar.f152198b = new qk.t9();
        lVar.f152199c = "/cgi-bin/mmlistenappsvr/listencategories";
        lVar.f152200d = 6264;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new il4.k(new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), nVar), false);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(android.content.Context context) {
        return (context instanceof qk.c9) && ((qk.c9) context).getF191047v();
    }

    public final bw5.mb0 n(bw5.o50 categoryItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryItem, "categoryItem");
        bw5.mb0 mb0Var = new bw5.mb0();
        mb0Var.f111684e = categoryItem.f112497n;
        boolean[] zArr = mb0Var.f111692p;
        zArr[2] = true;
        mb0Var.f111683d = categoryItem.c();
        zArr[1] = true;
        mb0Var.f111685f = categoryItem.S;
        zArr[3] = true;
        mb0Var.f111686g = categoryItem.m12637xfb82e301();
        zArr[4] = true;
        mb0Var.f111688i = categoryItem.L1[36] ? categoryItem.Q : "";
        zArr[6] = true;
        mb0Var.f111687h = categoryItem.d();
        zArr[5] = true;
        mb0Var.f111689m = categoryItem.f112505t;
        zArr[7] = true;
        return mb0Var;
    }

    public final bw5.xa0 o(java.lang.String simplePlayableInfoBuff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simplePlayableInfoBuff, "simplePlayableInfoBuff");
        try {
            return new bw5.xa0().mo11468x92b714fd(android.util.Base64.decode(simplePlayableInfoBuff, 0));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMusicUtils", "recommendInfoFromBuffer ex " + e17.getMessage());
            return null;
        }
    }

    public final bw5.v70 r(bw5.lb0 simPlayInfo, bw5.xa0 xa0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simPlayInfo, "simPlayInfo");
        bw5.v70 v70Var = new bw5.v70();
        v70Var.y(simPlayInfo.f111247e);
        v70Var.u(simPlayInfo.m12396xcc16feb8());
        boolean[] zArr = simPlayInfo.f111257r;
        v70Var.x(zArr[3] ? simPlayInfo.f111248f : "");
        v70Var.r(simPlayInfo.f111251i);
        v70Var.p(zArr[4] ? simPlayInfo.f111249g : "");
        v70Var.q(simPlayInfo.b());
        java.lang.String c17 = simPlayInfo.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getFinderFeedId(...)");
        if (c17.length() > 0) {
            java.lang.String d17 = simPlayInfo.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getFinderNonceId(...)");
            if (d17.length() > 0) {
                bw5.e70 e70Var = new bw5.e70();
                e70Var.e(simPlayInfo.c());
                e70Var.d(simPlayInfo.d());
                v70Var.s(e70Var);
            }
        }
        if (xa0Var != null) {
            v70Var.f115723f = xa0Var;
            v70Var.Q.put(3, java.lang.Boolean.TRUE);
        }
        return v70Var;
    }
}
