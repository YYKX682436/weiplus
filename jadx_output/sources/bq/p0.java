package bq;

/* loaded from: classes10.dex */
public final class p0 {
    public p0(kotlin.jvm.internal.i iVar) {
    }

    public static /* synthetic */ byte[] e(bq.p0 p0Var, int i17, int i18, java.lang.String str, boolean z17, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            z17 = p0Var.b();
        }
        return p0Var.d(i17, i18, str, z17);
    }

    public final int a(int i17) {
        if (i17 == 1) {
            bq.p0 p0Var = bq.q0.f23513t;
            return 2;
        }
        if (i17 != 2) {
            return 0;
        }
        bq.p0 p0Var2 = bq.q0.f23513t;
        return 1;
    }

    public final boolean b() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_GET_MENTION_CONFIG_INT_SYNC;
        bq.p0 p0Var = bq.q0.f23513t;
        return c17.r(u3Var, 0) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r2 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (r2 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (r2 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r2 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        if (r2 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003e, code lost:
    
        if (r2 == null) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] c(int r5, java.lang.String r6) {
        /*
            r4 = this;
            g92.b r0 = g92.b.f269769e
            r1 = 1
            m92.b r0 = r0.b1(r6, r1)
            r1 = 3
            r2 = 0
            java.lang.String r3 = ""
            if (r5 == r1) goto L3a
            r1 = 4
            if (r5 == r1) goto L33
            r1 = 5
            if (r5 == r1) goto L2c
            switch(r5) {
                case 12: goto L25;
                case 13: goto L1e;
                case 14: goto L17;
                default: goto L16;
            }
        L16:
            goto L42
        L17:
            if (r0 == 0) goto L1b
            java.lang.String r2 = r0.field_memberMessageJoinBuf
        L1b:
            if (r2 != 0) goto L41
            goto L42
        L1e:
            if (r0 == 0) goto L22
            java.lang.String r2 = r0.field_memberMessageCommentBuf
        L22:
            if (r2 != 0) goto L41
            goto L42
        L25:
            if (r0 == 0) goto L29
            java.lang.String r2 = r0.field_memberMessageLikeBuf
        L29:
            if (r2 != 0) goto L41
            goto L42
        L2c:
            if (r0 == 0) goto L30
            java.lang.String r2 = r0.field_messageFollowBuf
        L30:
            if (r2 != 0) goto L41
            goto L42
        L33:
            if (r0 == 0) goto L37
            java.lang.String r2 = r0.field_messageCommentBuf
        L37:
            if (r2 != 0) goto L41
            goto L42
        L3a:
            if (r0 == 0) goto L3e
            java.lang.String r2 = r0.field_messageLikeBuf
        L3e:
            if (r2 != 0) goto L41
            goto L42
        L41:
            r3 = r2
        L42:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getBufByUserName type:"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " finderUserName:"
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = " userBuf:"
            r0.append(r5)
            r0.append(r3)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "Finder.FinderGetMentionListCGI"
            com.tencent.mars.xlog.Log.i(r6, r5)
            byte[] r5 = com.tencent.mm.sdk.platformtools.t8.h(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.p0.c(int, java.lang.String):byte[]");
    }

    public final byte[] d(int i17, int i18, java.lang.String finderUserName, boolean z17) {
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        if (z17) {
            byte[] bArr = (byte[]) bq.q0.f23514u.get(java.lang.Integer.valueOf(i18));
            return bArr == null ? new byte[0] : bArr;
        }
        int a17 = a(i17);
        bq.p0 p0Var = bq.q0.f23513t;
        if (a17 == 2) {
            if (i18 == 1) {
                java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
                kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
                return com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17);
            }
            if (i18 == 2) {
                java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_STRING_SYNC, "");
                kotlin.jvm.internal.o.e(m18, "null cannot be cast to non-null type kotlin.String");
                return com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m18);
            }
            if (i18 == 3) {
                byte[] c17 = c(i18, finderUserName);
                kotlin.jvm.internal.o.b(gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_LIKE_MSG_LAST_BUF_WRITE_INT_SYNC, 0), 1);
                return c17;
            }
            if (i18 == 4) {
                byte[] c18 = c(i18, finderUserName);
                kotlin.jvm.internal.o.b(gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_COMMENT_MSG_LAST_BUF_WRITE_INT_SYNC, 0), 1);
                return c18;
            }
            if (i18 == 5) {
                byte[] c19 = c(i18, finderUserName);
                kotlin.jvm.internal.o.b(gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_FOLLOW_MSG_LAST_BUF_WRITE_INT_SYNC, 0), 1);
                return c19;
            }
            switch (i18) {
                case 12:
                    return c(i18, finderUserName);
                case 13:
                    return c(i18, finderUserName);
                case 14:
                    return c(i18, finderUserName);
            }
        }
        if (a17 == 1) {
            if (i18 == 1) {
                java.lang.Object m19 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, "");
                kotlin.jvm.internal.o.e(m19, "null cannot be cast to non-null type kotlin.String");
                return com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m19);
            }
            if (i18 == 7) {
                java.lang.Object m27 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_LIKE_MSG_LAST_BUF_STRING_SYNC, "");
                kotlin.jvm.internal.o.e(m27, "null cannot be cast to non-null type kotlin.String");
                return com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m27);
            }
            if (i18 == 8) {
                java.lang.Object m28 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_COMMENT_MSG_LAST_BUF_STRING_SYNC, "");
                kotlin.jvm.internal.o.e(m28, "null cannot be cast to non-null type kotlin.String");
                return com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m28);
            }
        }
        return new byte[0];
    }

    public final void f(int i17, byte[] bArr, java.lang.String str) {
        m92.c cVar = new m92.c(str);
        if (i17 == 3) {
            cVar.field_messageLikeBuf = com.tencent.mm.sdk.platformtools.t8.l(bArr);
        } else if (i17 == 4) {
            cVar.field_messageCommentBuf = com.tencent.mm.sdk.platformtools.t8.l(bArr);
        } else if (i17 != 5) {
            switch (i17) {
                case 12:
                    cVar.field_memberMessageLikeBuf = com.tencent.mm.sdk.platformtools.t8.l(bArr);
                    break;
                case 13:
                    cVar.field_memberMessageCommentBuf = com.tencent.mm.sdk.platformtools.t8.l(bArr);
                    break;
                case 14:
                    cVar.field_memberMessageJoinBuf = com.tencent.mm.sdk.platformtools.t8.l(bArr);
                    break;
            }
        } else {
            cVar.field_messageFollowBuf = com.tencent.mm.sdk.platformtools.t8.l(bArr);
        }
        g92.b.f269769e.C(cVar, m92.j.f324993h);
    }

    public final void g(int i17, int i18, byte[] lastBuf, java.lang.String finderUserName, boolean z17) {
        kotlin.jvm.internal.o.g(lastBuf, "lastBuf");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        if (z17) {
            bq.q0.f23514u.put(java.lang.Integer.valueOf(i18), lastBuf);
            return;
        }
        int a17 = a(i17);
        bq.p0 p0Var = bq.q0.f23513t;
        if (a17 != 2) {
            if (a17 == 1) {
                if (i18 == 1) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(lastBuf));
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
                    return;
                } else if (i18 == 7) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_LIKE_MSG_LAST_BUF_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(lastBuf));
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_LIKE_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
                    return;
                } else {
                    if (i18 != 8) {
                        return;
                    }
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_COMMENT_MSG_LAST_BUF_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(lastBuf));
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_WX_IDENTITY_COMMENT_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
                    return;
                }
            }
            return;
        }
        if (i18 == 1) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(lastBuf));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_NORMAL_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
            return;
        }
        if (i18 == 2) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(lastBuf));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_SYSTEM_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
            return;
        }
        if (i18 == 3) {
            f(i18, lastBuf, finderUserName);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_LIKE_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
            return;
        }
        if (i18 == 4) {
            f(i18, lastBuf, finderUserName);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_COMMENT_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
            return;
        }
        if (i18 == 5) {
            f(i18, lastBuf, finderUserName);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GET_FINDER_IDENTITY_FOLLOW_MSG_LAST_BUF_WRITE_INT_SYNC, 1);
            return;
        }
        switch (i18) {
            case 12:
                f(i18, lastBuf, finderUserName);
                return;
            case 13:
                f(i18, lastBuf, finderUserName);
                return;
            case 14:
                f(i18, lastBuf, finderUserName);
                return;
            default:
                return;
        }
    }
}
