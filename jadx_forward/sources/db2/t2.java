package db2;

/* loaded from: classes2.dex */
public final class t2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f309697t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.eg2 f309698u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f309699v;

    /* renamed from: w, reason: collision with root package name */
    public final long f309700w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f309701x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem, byte[] bArr, int i17) {
        super(null, null, 3, null);
        byte[] mo14344x5f01b1f6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        this.f309697t = finderItem;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = finderItem.getFeedObject();
        this.f309699v = feedObject;
        this.f309700w = finderItem.m59260x51f8f5b0();
        java.lang.String m59213xb1ff73bc = finderItem.m59213xb1ff73bc();
        this.f309701x = m59213xb1ff73bc;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findermemberqaoprqa";
        lVar.f152200d = 7945;
        r45.eg2 eg2Var = new r45.eg2();
        this.f309698u = eg2Var;
        eg2Var.f454972q = m59213xb1ff73bc;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = feedObject.m76802x2dd01666();
        if (m76802x2dd01666 != null && (mo14344x5f01b1f6 = m76802x2dd01666.mo14344x5f01b1f6()) != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56();
            try {
                c19793xceab7f56.mo11468x92b714fd(mo14344x5f01b1f6);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                c19793xceab7f56 = null;
            }
            if (c19793xceab7f56 != null) {
                r45.eg2 eg2Var2 = this.f309698u;
                mv2.f0.f413094a.b("Cgi.FinderMemberQAOprQA", c19793xceab7f56, this.f309699v, this.f309697t);
                eg2Var2.f454963e = c19793xceab7f56;
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(this.f309697t.f66949xdec927b)) {
            r45.eg2 eg2Var3 = this.f309698u;
            eg2Var3.f454974s = 2;
            eg2Var3.f454964f = this.f309697t.f66949xdec927b;
        } else {
            r45.eg2 eg2Var4 = this.f309698u;
            eg2Var4.f454974s = 1;
            eg2Var4.f454964f = this.f309697t.f66945x4aebb6f3.m75945x2fec8307(20);
        }
        this.f309698u.f454966h = this.f309699v.m76824xa52af937();
        this.f309698u.f454965g = this.f309697t.f66945x4aebb6f3.m75945x2fec8307(19);
        this.f309698u.f454962d = db2.t4.f309704a.a(7945);
        r45.eg2 eg2Var5 = this.f309698u;
        eg2Var5.f454971p = i17;
        eg2Var5.f454975t |= 2;
        eg2Var5.f454973r = java.lang.System.currentTimeMillis();
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        fo3.s sVar = fo3.s.INSTANCE;
        cu5Var.d(sVar.Ci("ce_feed_publish"));
        k57Var.f459928e = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.h());
        k57Var.f459929f = cu5Var2;
        r45.kv0 kv0Var = this.f309698u.f454962d;
        if (kv0Var != null) {
            kv0Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(k57Var.mo14344x5f01b1f6()));
        }
        w04.l.INSTANCE.b(540999699);
        lVar.f152197a = this.f309698u;
        r45.fg2 fg2Var = new r45.fg2();
        fg2Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = fg2Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = fg2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("postRequest detail: clientId ");
        sb6.append(this.f309701x);
        sb6.append("  draftId:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f562 = this.f309698u.f454963e;
        sb6.append(c19793xceab7f562 != null ? java.lang.Long.valueOf(c19793xceab7f562.m76945x4dd641c5()) : null);
        sb6.append(", mediaFeature:");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        sb6.append(" content: ");
        java.lang.Object obj = this.f309698u.f454963e;
        sb6.append(pm0.b0.g(obj != null ? obj : ""));
        sb6.append(" refId: ");
        sb6.append(this.f309698u.f454966h);
        sb6.append(" localId:");
        sb6.append(this.f309697t.m59260x51f8f5b0());
        sb6.append(" originalFlag:");
        sb6.append(this.f309699v.m76809xe05b3f53());
        sb6.append(" opr_type: ");
        sb6.append(this.f309698u.f454971p);
        sb6.append(" memberProviderUsername: ");
        sb6.append(this.f309698u.f454965g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderMemberQAOprQA", sb6.toString());
        p(lVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    @Override // az2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(int r19, int r20, java.lang.String r21, com.p314xaae8f345.mm.p2495xc50a8b8b.f r22, com.p314xaae8f345.mm.p944x882e457a.m1 r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r45.fg2 r3 = (r45.fg2) r3
            java.lang.String r4 = "resp"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "errType %d, errCode %d, errMsg %s, localId %s localId:"
            r4.<init>(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r0.f309697t
            long r6 = r5.m59260x51f8f5b0()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            long r8 = r0.f309700w
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            r11 = r21
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7, r11, r10}
            java.lang.String r7 = "Cgi.FinderMemberQAOprQA"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r4, r6)
            r4 = 0
            if (r1 != 0) goto L4d
            if (r2 != 0) goto L4d
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r3.f455839d
            mv2.f0 r2 = mv2.f0.f413094a
            java.lang.String r3 = ""
            r2.q(r5, r1, r3, r4)
            goto Lb5
        L4d:
            jx3.f r10 = jx3.f.INSTANCE
            r11 = 1279(0x4ff, double:6.32E-321)
            r13 = 6
            r15 = 1
            r17 = 0
            r10.mo68477x336bdfd8(r11, r13, r15, r17)
            com.tencent.mm.plugin.finder.report.t4 r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t4.f206898a
            boolean r6 = r5.m59314x4d5c4d55()
            r3.f(r6)
            r6 = 1
            r7 = 4
            if (r1 != r7) goto L7d
            r10 = -5002(0xffffffffffffec76, float:NaN)
            if (r2 == r10) goto L7b
            r10 = -5001(0xffffffffffffec77, float:NaN)
            if (r2 == r10) goto L7b
            r10 = -4065(0xfffffffffffff01f, float:NaN)
            if (r2 == r10) goto L7b
            r10 = -4059(0xfffffffffffff025, float:NaN)
            if (r2 == r10) goto L7b
            switch(r2) {
                case -4007: goto L7b;
                case -4006: goto L7b;
                case -4005: goto L7b;
                default: goto L7a;
            }
        L7a:
            goto L7d
        L7b:
            r10 = r4
            goto L7e
        L7d:
            r10 = r6
        L7e:
            r11 = -4013(0xfffffffffffff053, float:NaN)
            if (r2 != r11) goto L83
            r4 = r6
        L83:
            if (r1 == r7) goto L89
            if (r10 == 0) goto L89
            if (r4 == 0) goto Lb5
        L89:
            cu2.t r1 = cu2.u.f303974a
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r1.f(r8)
            if (r6 == 0) goto Lae
            if (r10 == 0) goto L9d
            if (r4 == 0) goto L99
            r6.m59404x30b06781()
            goto La7
        L99:
            r6.m59403x65a826ff()
            goto La7
        L9d:
            boolean r4 = r5.m59314x4d5c4d55()
            r3.g(r4)
            r6.m59405x1b47e60d(r2)
        La7:
            int r2 = r6.f66940x52c1d072
            r5.f66940x52c1d072 = r2
            r1.l(r6)
        Lae:
            boolean r1 = r5.m59314x4d5c4d55()
            r3.e(r1)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.t2.A(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }
}
