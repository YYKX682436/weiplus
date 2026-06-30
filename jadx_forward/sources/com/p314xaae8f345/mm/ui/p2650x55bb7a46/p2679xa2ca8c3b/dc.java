package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class dc {
    public static com.p314xaae8f345.mm.p2621x8fb0427b.f9 a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "getFixQuoteMsgInfo,quotedMsg is null!");
            return null;
        }
        if (f9Var.m124847x74d37ac6() == 0) {
            f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.m124850x7650bebc(c16565x9bc03d4e.f231015d);
            f9Var.o1(c16565x9bc03d4e.f231016e);
            f9Var.u1(c16565x9bc03d4e.f231017f);
            f9Var.u3(c16565x9bc03d4e.f231020i);
            f9Var.d1(c16565x9bc03d4e.f231021m);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c16565x9bc03d4e.f231018g, c01.z1.r())) {
                f9Var.j1(1);
            }
            if (c16565x9bc03d4e.f231023o == 1) {
                f9Var.f275470q2 = 1;
            }
        }
        return f9Var;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.f9 b(boolean z17, java.lang.String str, long j17, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e, java.lang.String str3) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27;
        if (c16565x9bc03d4e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msgQuoteItem is null!");
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(str2, j17);
        if (f27 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msg is null!");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "getQuoteMsgInfo %s msgId:%s msgSvrId:%s msgTaker:%s MsgQuoteItem(type:%s svrid:%s content:%s)", str3, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(f27.I0()), f27.Q0(), java.lang.Integer.valueOf(c16565x9bc03d4e.f231015d), java.lang.Long.valueOf(c16565x9bc03d4e.f231016e), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(c16565x9bc03d4e.f231021m));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16565x9bc03d4e.f231017f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msgQuoteItem.fromusr is null!(1)");
            ot0.q v17 = ot0.q.v(f27.U1());
            if (v17 != null && (c16565x9bc03d4e = v17.f430258w2) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msgQuoteItem is null in content");
                return null;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16565x9bc03d4e.f231017f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msgQuoteItem.fromusr is null!(2)");
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        if (c16565x9bc03d4e.f231016e != 0) {
            f9Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(c16565x9bc03d4e.f231017f, c16565x9bc03d4e.f231016e);
        }
        if (!android.text.TextUtils.isEmpty(str) && f9Var.m124847x74d37ac6() == 0 && !android.text.TextUtils.isEmpty(c16565x9bc03d4e.f231020i)) {
            long r17 = c01.ia.r(c16565x9bc03d4e.f231020i);
            if (r17 != -1 && r17 != 0 && (o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, r17)) != null && o27.m124847x74d37ac6() != 0) {
                f9Var = o27;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "getQuoteMsgInfo found quotedMsg: local id:%s,msg svr id:%s,msg talker: %s,msg createTime:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.I0()), f9Var.Q0(), java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()));
        return f9Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:72|(2:74|(2:76|(2:78|(6:80|(2:82|(2:84|(5:86|(2:88|(6:90|91|(2:(1:104)(1:106)|105)|107|(1:109)(1:119)|(1:(2:112|113)(1:114))(1:(2:116|117)(1:118)))(3:299|(1:301)(1:305)|(1:303)(1:304)))|306|(1:308)(1:312)|(1:310)(1:311)))(1:313))|314|(1:316)(1:321)|317|(1:319)(1:320))(1:322))(1:323))(3:324|(1:326)|327))|328|139|140|141|(0)(0)|145|(0)|148|(3:150|153|154)|156|154) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x065e, code lost:
    
        if (r6 == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x07e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x07e9, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "jump to finder feed fail: %s", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03c1, code lost:
    
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2.e0(r3, r35, r15, r43) == false) goto L168;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0184. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x01ed. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x01f3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x01fb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x01fe. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0766 A[Catch: Exception -> 0x07e8, TryCatch #1 {Exception -> 0x07e8, blocks: (B:140:0x0738, B:144:0x0752, B:145:0x075a, B:147:0x0766, B:148:0x0772, B:150:0x0792, B:153:0x0799, B:154:0x07a5, B:157:0x0756), top: B:139:0x0738 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0756 A[Catch: Exception -> 0x07e8, TryCatch #1 {Exception -> 0x07e8, blocks: (B:140:0x0738, B:144:0x0752, B:145:0x075a, B:147:0x0766, B:148:0x0772, B:150:0x0792, B:153:0x0799, B:154:0x07a5, B:157:0x0756), top: B:139:0x0738 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(yb5.d r35, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r36, android.view.View r37, long r38, java.lang.String r40, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e r41, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cc r42, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq r43) {
        /*
            Method dump skipped, instructions count: 3082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dc.c(yb5.d, com.tencent.mm.ui.chatting.viewitems.g0, android.view.View, long, java.lang.String, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem, com.tencent.mm.ui.chatting.viewitems.cc, com.tencent.mm.ui.chatting.viewitems.qq):void");
    }

    public static void d(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, android.view.View view, long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        c(dVar, g0Var, view, j17, str, c16565x9bc03d4e, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cc(), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq(a0Var, ""));
    }

    public static void e(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.view.View view, long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e, ty.q0 q0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17 = b(dVar.D(), dVar.x(), j17, str, c16565x9bc03d4e, "handleQuoteMsgClick");
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "handleItemClickToPositionEvent,quotedMsg is null!");
            return;
        }
        if (b17.m124847x74d37ac6() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "handleItemClickToPositionEvent,show toast");
            ty.p0 p0Var = q0Var == ty.q0.f504282d ? ty.p0.f504274m : ty.p0.f504273i;
            switch (c16565x9bc03d4e.f231015d) {
                case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                case 1048625:
                case 419430449:
                case 436207665:
                case 754974769:
                case 771751985:
                case 805306417:
                case 822083633:
                case 855638065:
                case 939524145:
                case 973078577:
                case 974127153:
                case 975175729:
                case 976224305:
                case 978321457:
                case 979370033:
                case 1040187441:
                case 1090519089:
                case 1157627953:
                case 1174405169:
                case 1224736817:
                case 1241514033:
                    ot0.q v17 = ot0.q.v(b17.j());
                    if (v17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "appMsgContent is null");
                        break;
                    } else {
                        ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ni(p0Var, c16565x9bc03d4e, java.lang.Integer.valueOf(v17.f430199i), dVar.x());
                        break;
                    }
                default:
                    ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ni(p0Var, c16565x9bc03d4e, 0, dVar.x());
                    break;
            }
            db5.t7.m123882x26a183b(view.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.b5a, 0).show();
            return;
        }
        ty.p0 p0Var2 = q0Var == ty.q0.f504283e ? ty.p0.f504278q : ty.p0.f504271g;
        ty.r0 r0Var = a0Var == null ? ty.r0.f504286e : ty.r0.f504287f;
        int mo75763x413e8f6f = dVar.p().mo75763x413e8f6f(view);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_POSITION_AT_CHATRECORD_FIRST_IN_BOOLEAN, java.lang.Boolean.TRUE);
        int b18 = i65.a.b(dVar.g(), 120);
        r15.f b19 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hc.b(c16565x9bc03d4e.f231026r, b17, dVar.g());
        sb5.y yVar = new sb5.y();
        yVar.f487130b = true;
        yVar.f487131c = true;
        yVar.f487133e = b18;
        yVar.f487134f = true;
        yVar.f487135g = true;
        yVar.f487136h = b19;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) cVar.a(sb5.z.class))).T0(b17.Q0(), b17.m124847x74d37ac6(), hd5.n.ACTION_POSITION, yVar);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) cVar.a(sb5.s0.class));
        jbVar.getClass();
        try {
            if (jbVar.f280796e.K0()) {
                jbVar.f280796e.m75483x4f8b3b49(8);
            }
        } catch (java.lang.Exception unused) {
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.yb(dVar, b17, c16565x9bc03d4e, f9Var, mo75763x413e8f6f), 500L);
        ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ri(p0Var2, r0Var, c16565x9bc03d4e, dVar.x());
    }
}
