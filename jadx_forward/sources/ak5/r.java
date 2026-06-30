package ak5;

/* loaded from: classes9.dex */
public final class r extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final ak5.q f87222f = new ak5.q(null);

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f87223d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f87224e;

    public r(int i17, java.lang.String str, long j17, int i18, java.lang.String msgUserName, java.lang.String msgSummary, byte[] bArr, int i19, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgUserName, "msgUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgSummary, "msgSummary");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 11965;
        lVar.f152199c = "/cgi-bin/micromsg-bin/chatroomtopmsg";
        lVar.f152197a = new r45.yy();
        lVar.f152198b = new r45.zy();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f87224e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ChatRoomTopMsgRequest");
        r45.yy yyVar = (r45.yy) fVar;
        yyVar.f473019d = str;
        yyVar.f473020e = i17;
        yyVar.f473021f = j17;
        yyVar.f473022g = i18;
        yyVar.f473024i = msgUserName;
        yyVar.f473023h = msgSummary;
        yyVar.f473026n = i19;
        yyVar.f473027o = str2;
        if (bArr != null) {
            yyVar.f473025m = x51.j1.a(bArr);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f87223d = u0Var;
        return mo9409x10f9447a(sVar, this.f87224e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 11965;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TopMsg.NetSceneChatRoomTopMsg", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f87224e.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ChatRoomTopMsgResponse");
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f87223d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(int r16, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r17) {
        /*
            r15 = this;
            r0 = r17
            java.lang.String r1 = "msgInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r1)
            java.lang.String r4 = r17.Q0()
            long r5 = r17.I0()
            int r7 = r17.mo78013xfb85f7b0()
            java.lang.String r1 = en1.a.a()
            int r2 = r17.A0()
            r3 = 1
            java.lang.String r8 = ""
            if (r2 != r3) goto L25
            if (r1 != 0) goto L86
            r1 = r8
            goto L86
        L25:
            java.lang.String r2 = r17.j()
            int r2 = c01.w9.t(r2)
            r9 = -1
            if (r2 == r9) goto L83
            java.lang.String r9 = r17.j()
            java.lang.String r10 = "getContent(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r10)
            r10 = 0
            java.lang.String r2 = r9.substring(r10, r2)
            java.lang.String r9 = "substring(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r9)
            int r9 = r2.length()
            int r9 = r9 - r3
            r11 = r10
            r12 = r11
        L4a:
            if (r11 > r9) goto L6f
            if (r12 != 0) goto L50
            r13 = r11
            goto L51
        L50:
            r13 = r9
        L51:
            char r13 = r2.charAt(r13)
            r14 = 32
            int r13 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(r13, r14)
            if (r13 > 0) goto L5f
            r13 = r3
            goto L60
        L5f:
            r13 = r10
        L60:
            if (r12 != 0) goto L69
            if (r13 != 0) goto L66
            r12 = r3
            goto L4a
        L66:
            int r11 = r11 + 1
            goto L4a
        L69:
            if (r13 != 0) goto L6c
            goto L6f
        L6c:
            int r9 = r9 + (-1)
            goto L4a
        L6f:
            int r9 = r9 + r3
            java.lang.CharSequence r2 = r2.subSequence(r11, r9)
            java.lang.String r2 = r2.toString()
            int r9 = r2.length()
            if (r9 <= 0) goto L7f
            goto L80
        L7f:
            r3 = r10
        L80:
            if (r3 == 0) goto L83
            r1 = r2
        L83:
            if (r1 != 0) goto L86
            goto L87
        L86:
            r8 = r1
        L87:
            ak5.q r1 = ak5.r.f87222f
            java.lang.String r9 = r1.a(r0)
            a14.b r1 = a14.b.f82128a
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r3 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            java.lang.String r3 = en1.a.a()
            r45.j4 r1 = r1.a(r2, r0, r3)
            byte[] r10 = r1.mo14344x5f01b1f6()
            long r1 = r17.mo78012x3fdd41df()
            r3 = 1000(0x3e8, float:1.401E-42)
            long r11 = (long) r3
            long r1 = r1 / r11
            int r11 = (int) r1
            java.lang.String r0 = r0.G
            java.lang.String r12 = c01.ia.t(r0)
            r2 = r15
            r3 = r16
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak5.r.<init>(int, com.tencent.mm.storage.f9):void");
    }
}
