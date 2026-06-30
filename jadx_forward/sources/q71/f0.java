package q71;

/* loaded from: classes15.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public s71.a f441872a = new s71.a();

    /* renamed from: b, reason: collision with root package name */
    public boolean f441873b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f441874c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f441875d = new java.util.ArrayList();

    public s71.b a(int i17) {
        for (int i18 = 0; i18 < this.f441872a.f485502d.size(); i18++) {
            s71.b bVar = (s71.b) this.f441872a.f485502d.get(i18);
            if (bVar.f485503d == i17) {
                return bVar;
            }
        }
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 b(java.util.List list, java.lang.String str) {
        if (list == null || list.isEmpty() || android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) list.get(i17);
            if (c11485x80cda4c8 != null && str.startsWith(c11485x80cda4c8.f155904d)) {
                return c11485x80cda4c8;
            }
        }
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) this.f441874c.get(java.lang.Integer.valueOf(i17));
    }

    public java.util.List d(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f441875d).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 c11485x80cda4c8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8) it.next();
            if (c11485x80cda4c8.f155908h == i17) {
                arrayList.add(c11485x80cda4c8);
            }
        }
        return arrayList;
    }

    public java.util.List e(java.lang.String str) {
        return d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? 0 : str.hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0070 A[Catch: Exception -> 0x006c, TRY_LEAVE, TryCatch #2 {Exception -> 0x006c, blocks: (B:128:0x0068, B:121:0x0070), top: B:127:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0088 A[Catch: Exception -> 0x0084, TRY_LEAVE, TryCatch #14 {Exception -> 0x0084, blocks: (B:143:0x0080, B:134:0x0088), top: B:142:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q71.f0.f():void");
    }

    public void g() {
        try {
            qg0.b0 b0Var = (qg0.b0) i95.n0.c(qg0.b0.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ADDRESS_INFO_STRING_SYNC;
            ((pg0.a3) b0Var).getClass();
            java.lang.String str = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(u3Var, null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            this.f441872a = (s71.a) new s71.a().mo11468x92b714fd(str.getBytes(r26.c.f450400c));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletAddrMgr", e17, "", new java.lang.Object[0]);
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 h(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 b18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 b19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 b27;
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && (b17 = b(d(0), str)) != null) {
            java.lang.String str5 = b17.f155905e;
            if (!android.text.TextUtils.isEmpty(str5) && (b18 = b(e(str5), str2)) != null) {
                java.lang.String str6 = b18.f155905e;
                if (!android.text.TextUtils.isEmpty(str6)) {
                    return (android.text.TextUtils.isEmpty(str3) || (b19 = b(e(str6), str3)) == null) ? b18 : (android.text.TextUtils.isEmpty(str4) || (b27 = b(e(b19.f155905e), str4)) == null) ? b19 : b27;
                }
            }
        }
        return null;
    }

    public void i() {
        try {
            byte[] mo14344x5f01b1f6 = this.f441872a.mo14344x5f01b1f6();
            java.lang.System.currentTimeMillis();
            qg0.b0 b0Var = (qg0.b0) i95.n0.c(qg0.b0.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_ADDRESS_INFO_STRING_SYNC;
            java.lang.String str = new java.lang.String(mo14344x5f01b1f6, r26.c.f450400c);
            ((pg0.a3) b0Var).getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(u3Var, str);
            java.lang.System.currentTimeMillis();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletAddrMgr", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        if ((r0.f155907g == 3) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(java.util.LinkedList r8) {
        /*
            r7 = this;
            s71.a r0 = r7.f441872a
            java.util.LinkedList r0 = r0.f485502d
            r0.clear()
            java.util.Iterator r8 = r8.iterator()
        Lb:
            boolean r0 = r8.hasNext()
            r1 = 1
            if (r0 == 0) goto La9
            java.lang.Object r0 = r8.next()
            r45.zi5 r0 = (r45.zi5) r0
            s71.b r2 = new s71.b
            r2.<init>()
            int r3 = r0.f473642d
            r2.f485503d = r3
            r45.du5 r3 = r0.f473651p
            java.lang.String r3 = r3.f454289d
            r2.f485512p = r3
            r45.du5 r3 = r0.f473645g
            java.lang.String r3 = r3.f454289d
            r2.f485506g = r3
            r45.du5 r4 = r0.f473648m
            java.lang.String r4 = r4.f454289d
            r2.f485509m = r4
            r45.du5 r4 = r0.f473646h
            java.lang.String r4 = r4.f454289d
            r2.f485507h = r4
            r45.du5 r5 = r0.f473649n
            java.lang.String r5 = r5.f454289d
            r2.f485510n = r5
            r45.du5 r5 = r0.f473650o
            java.lang.String r5 = r5.f454289d
            r2.f485511o = r5
            r45.du5 r5 = r0.f473644f
            java.lang.String r5 = r5.f454289d
            r2.f485505f = r5
            r45.du5 r6 = r0.f473647i
            java.lang.String r6 = r6.f454289d
            r2.f485508i = r6
            r45.du5 r6 = r0.f473652q
            java.lang.String r6 = r6.f454289d
            r2.f485513q = r6
            r45.du5 r0 = r0.f473653r
            java.lang.String r0 = r0.f454289d
            r2.f485514r = r0
            com.tencent.mm.plugin.address.model.RcptItem r0 = r7.h(r5, r3, r4, r6)
            if (r0 == 0) goto L71
            java.lang.String r3 = r2.f485512p
            if (r3 == 0) goto L6d
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L71
        L6d:
            java.lang.String r3 = r0.f155905e
            r2.f485512p = r3
        L71:
            if (r0 == 0) goto L7c
            int r0 = r0.f155907g
            r3 = 3
            if (r0 != r3) goto L79
            goto L7a
        L79:
            r1 = 0
        L7a:
            if (r1 == 0) goto L9c
        L7c:
            java.lang.String r0 = r2.f485507h
            if (r0 == 0) goto L88
            java.lang.String r1 = r2.f485513q
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9c
        L88:
            java.lang.String r0 = "undefined"
            java.lang.String r1 = r2.f485513q
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "null"
            java.lang.String r1 = r2.f485513q
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto La0
        L9c:
            java.lang.String r0 = ""
            r2.f485513q = r0
        La0:
            s71.a r0 = r7.f441872a
            java.util.LinkedList r0 = r0.f485502d
            r0.add(r2)
            goto Lb
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q71.f0.j(java.util.LinkedList):boolean");
    }
}
