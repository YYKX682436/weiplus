package fr1;

/* loaded from: classes11.dex */
public final class a extends et1.a implements et1.n {
    @Override // et1.l
    public boolean k(w11.r1 r1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1Var);
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.E3(r1Var.f523660b) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.G3(r1Var.f523660b) || o(r1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // et1.a, et1.l
    public w11.m1 l(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var instanceof k12.q) {
            java.lang.String str = r1Var.f523660b;
            r1Var.f523660b = t(str);
            r1Var.f523661c = s(str);
            qx.e0 e0Var = (qx.e0) i95.n0.c(qx.e0.class);
            java.lang.String str2 = r1Var.f523661c;
            java.lang.String str3 = r1Var.f523660b;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = ((h12.a) ((k12.q) r1Var)).f359610q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c21053xdbf1e5f4, "getEmojiInfo(...)");
            m1Var.f523621a = ((px.c) e0Var).wi(16, str, str2, str3, c21053xdbf1e5f4, r1Var.f523665g, r1Var.f523659a);
        }
        return m1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // et1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(w11.r1 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "params"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            boolean r0 = r6 instanceof m11.m1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L21
            java.lang.String r3 = r6.f523674p
            java.lang.String r4 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a
            if (r3 == 0) goto L1c
            java.lang.String r4 = "bizfansmsg"
            boolean r3 = r3.endsWith(r4)
            if (r3 == 0) goto L1c
            r3 = r1
            goto L1d
        L1c:
            r3 = r2
        L1d:
            if (r3 == 0) goto L21
            r3 = r1
            goto L22
        L21:
            r3 = r2
        L22:
            if (r0 == 0) goto L3a
            java.lang.String r6 = r6.f523674p
            java.lang.String r0 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a
            if (r6 == 0) goto L35
            java.lang.String r0 = "picfansmsg"
            boolean r6 = r6.endsWith(r0)
            if (r6 == 0) goto L35
            r6 = r1
            goto L36
        L35:
            r6 = r2
        L36:
            if (r6 == 0) goto L3a
            r6 = r1
            goto L3b
        L3a:
            r6 = r2
        L3b:
            if (r3 != 0) goto L41
            if (r6 == 0) goto L40
            goto L41
        L40:
            r1 = r2
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fr1.a.o(w11.r1):boolean");
    }

    @Override // et1.a
    public int r() {
        return 16;
    }

    @Override // et1.a
    public java.lang.String s(java.lang.String sessionId) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        if (r26.i0.n(sessionId, "@picfansmsg", false)) {
            str = yq1.u0.Zi().z0(sessionId).f66478x1362f030;
            if (str == null) {
                return "";
            }
        } else {
            str = yq1.u0.Ni().y0(sessionId).f66478x1362f030;
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    @Override // et1.a
    public java.lang.String t(java.lang.String sessionId) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        if (r26.i0.n(sessionId, "@picfansmsg", false)) {
            str = yq1.u0.Zi().z0(sessionId).f66480x114ef53e;
            if (str == null) {
                return "";
            }
        } else {
            str = yq1.u0.Ni().y0(sessionId).f66480x114ef53e;
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    @Override // et1.a
    public void u(java.lang.String str, int i17, int i18, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String g17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansCreateSendMsgInterceptor", "biz fans cgi callback, errCode: " + i18 + ", errMsg: " + str2);
        if (i18 == 0) {
            return;
        }
        switch (i18) {
            case 1001:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n5k);
                break;
            case 1002:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n5m);
                break;
            case 1003:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n5h);
                break;
            case 1004:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n5i);
                break;
            case 1005:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n5g);
                break;
            case 1006:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n5j);
                break;
            case 1007:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n5d);
                break;
            case 1008:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n5e);
                break;
            case 1009:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n5f);
                break;
            case 1010:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n5l);
                break;
            case 1011:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573587o14);
                break;
            case 1012:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573595o15);
                break;
            case 1013:
                g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572704ng0);
                break;
            default:
                g17 = null;
                break;
        }
        if (g17 == null || g17.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.e1(c01.w9.o(str));
        f9Var.u1(str);
        f9Var.d1(g17);
        f9Var.m124850x7650bebc(10000);
        f9Var.r1(6);
        f9Var.j1(2);
        c01.w9.x(f9Var);
    }
}
