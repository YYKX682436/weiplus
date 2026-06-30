package dt1;

/* loaded from: classes12.dex */
public final class g extends dt1.a {

    /* renamed from: i, reason: collision with root package name */
    public final wf0.h1 f324687i;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, wf0.h1 r10) {
        /*
            r5 = this;
            java.lang.String r0 = "session_id"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.lang.String r0 = "from_username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r0 = "to_username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.String r0 = "fakeScene"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            r45.fr r0 = new r45.fr
            r0.<init>()
            r45.lr r1 = new r45.lr
            r1.<init>()
            r0.f456097p = r1
            r0.f456094m = r7
            r0.f456089e = r8
            r0.f456090f = r9
            r8 = 43
            r0.f456088d = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = c01.z1.r()
            java.lang.String r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(r9)
            r8.append(r9)
            r8.append(r7)
            r7 = r10
            t21.q1 r7 = (t21.q1) r7
            java.lang.String r7 = r7.f496419f
            r8.append(r7)
            r7 = 95
            r8.append(r7)
            long r1 = c01.id.c()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r7
            long r1 = r1 / r3
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            r0.f456091g = r7
            r5.<init>(r6, r0)
            r5.f324687i = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.g.<init>(int, java.lang.String, java.lang.String, java.lang.String, wf0.h1):void");
    }

    @Override // dt1.a, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        wf0.h1 h1Var = this.f324687i;
        java.lang.String str = ((t21.q1) h1Var).f496419f;
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Byp.CgiBypSendVideo", "null == info %s", ((t21.q1) h1Var).f496419f);
            ((t21.q1) h1Var).f496426p.a(3, -1, 0L, "");
            return -1;
        }
        r45.xu6 H = ((t21.q1) h1Var).H(h17, u0Var);
        java.lang.String str2 = H.f471986t;
        r45.fr frVar = this.f324658d;
        frVar.f456092h = str2;
        r45.lr lrVar = frVar.f456097p;
        lrVar.f461298d = H.f471988v;
        lrVar.f461299e = H.f471987u;
        lrVar.f461300f = 43;
        lrVar.f461301g = H.f471977m;
        lrVar.f461302h = H.f471980p;
        lrVar.f461303i = H.B;
        lrVar.f461304m = H.f471990x;
        lrVar.f461305n = H.f471993y;
        lrVar.f461306o = H.A;
        lrVar.f461307p = H.f471996z;
        lrVar.f461308q = H.E;
        lrVar.f461310s = H.Q;
        dn.h hVar = ((t21.q1) h1Var).f496424n;
        lrVar.f461309r = java.lang.String.valueOf(hVar != null ? java.lang.Integer.valueOf(hVar.f69571x9373c88d) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSendVideo", "[doScene] " + lrVar.f461306o + ':' + lrVar.f461307p + ", " + ((t21.q1) h1Var).f496419f);
        return mo9409x10f9447a(sVar, this.f324659e, this);
    }

    @Override // dt1.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        r45.yu6 yu6Var = new r45.yu6();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) rr6).f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BypSendResponse");
        r45.rr rrVar = (r45.rr) fVar;
        yu6Var.f472911h = rrVar.f466663d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSendVideo", "[onCgiBack] errType=" + i18 + " errCode=" + i19 + " errMsg=" + str + " newmsgid=" + rrVar.f466663d);
        ((t21.q1) this.f324687i).J(i17, i18, i19, str, yu6Var, this);
    }
}
