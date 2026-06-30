package db2;

/* loaded from: classes.dex */
public final class c4 extends az2.j {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c4(int r6, java.lang.String r7, int r8, r45.hx0 r9, r45.qt2 r10, java.lang.String r11, com.p314xaae8f345.mm.p2495xc50a8b8b.g r12, boolean r13, int r14, p3321xbce91901.jvm.p3324x21ffc6bd.i r15) {
        /*
            r5 = this;
            r15 = r14 & 2
            if (r15 == 0) goto L6
            java.lang.String r7 = ""
        L6:
            r15 = r14 & 4
            r0 = 0
            if (r15 == 0) goto Lc
            r8 = r0
        Lc:
            r15 = r14 & 8
            r1 = 0
            if (r15 == 0) goto L12
            r9 = r1
        L12:
            r15 = r14 & 16
            if (r15 == 0) goto L17
            r10 = r1
        L17:
            r15 = r14 & 32
            if (r15 == 0) goto L1c
            r11 = r1
        L1c:
            r15 = r14 & 64
            if (r15 == 0) goto L21
            r12 = r1
        L21:
            r14 = r14 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L26
            r13 = r0
        L26:
            java.lang.String r14 = "url"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r14)
            r14 = 2
            r5.<init>(r10, r1, r14, r1)
            r45.k23 r15 = new r45.k23
            r15.<init>()
            db2.t4 r1 = db2.t4.f309704a
            r2 = 4046(0xfce, float:5.67E-42)
            r45.kv0 r1 = r1.b(r2, r10)
            r3 = 8
            r4 = 4
            if (r13 == 0) goto L69
            cq.k1.a()
            com.tencent.mm.plugin.finder.storage.t70 r13 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            jz5.g r13 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209252ge
            jz5.n r13 = (jz5.n) r13
            java.lang.Object r13 = r13.mo141623x754a37bb()
            lb2.j r13 = (lb2.j) r13
            java.lang.Object r13 = r13.r()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L69
            int r13 = r1.m75939xb282bd08(r3)
            r13 = r13 | r4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r1.set(r3, r13)
        L69:
            r13 = 1
            r15.set(r13, r1)
            if (r11 != 0) goto L73
            java.lang.String r11 = xy2.c.f(r10)
        L73:
            r15.set(r14, r11)
            r10 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r15.set(r10, r11)
            r15.set(r4, r7)
            r10 = 6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r15.set(r10, r8)
            r8 = 7
            r15.set(r8, r9)
            r15.set(r3, r12)
            com.tencent.mm.modelbase.l r8 = new com.tencent.mm.modelbase.l
            r8.<init>()
            r8.f152197a = r15
            r45.l23 r9 = new r45.l23
            r9.<init>()
            r45.ie r10 = new r45.ie
            r10.<init>()
            r9.set(r0, r10)
            com.tencent.mm.protobuf.f r10 = r9.m75936x14adae67(r0)
            r45.ie r10 = (r45.ie) r10
            if (r10 != 0) goto Lad
            goto Lb4
        Lad:
            r45.du5 r11 = new r45.du5
            r11.<init>()
            r10.f458493e = r11
        Lb4:
            r8.f152198b = r9
            java.lang.String r9 = "/cgi-bin/micromsg-bin/finderutils"
            r8.f152199c = r9
            r8.f152200d = r2
            com.tencent.mm.modelbase.o r8 = r8.a()
            r5.p(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "init type:"
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = ", url:"
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "Finder.CgiFinderUtils"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.c4.<init>(int, java.lang.String, int, r45.hx0, r45.qt2, java.lang.String, com.tencent.mm.protobuf.g, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.l23 resp = (r45.l23) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderUtils", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
