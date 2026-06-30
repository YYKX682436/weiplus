package nn;

@j95.b
/* loaded from: classes11.dex */
public class j extends i95.w implements nn.i {

    /* renamed from: d, reason: collision with root package name */
    public rn.e f420053d = null;

    /* renamed from: e, reason: collision with root package name */
    public jn.k f420054e = null;

    /* renamed from: f, reason: collision with root package name */
    public rn.i f420055f = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile jn.j f420056g = null;

    /* renamed from: h, reason: collision with root package name */
    public rn.b f420057h = null;

    public rn.b Ai() {
        gm0.j1.b().c();
        if (this.f420057h == null) {
            gm0.j1.i();
            this.f420057h = new rn.b(gm0.j1.u().f354686f);
        }
        return this.f420057h;
    }

    public rn.e Bi() {
        gm0.j1.b().c();
        if (this.f420053d == null) {
            gm0.j1.i();
            this.f420053d = new rn.e(gm0.j1.u().f354686f);
        }
        return this.f420053d;
    }

    public rn.i Di() {
        gm0.j1.b().c();
        if (this.f420055f == null) {
            gm0.j1.i();
            this.f420055f = new rn.i(gm0.j1.u().f354686f);
        }
        return this.f420055f;
    }

    public jn.j Ni() {
        gm0.j1.b().c();
        if (this.f420056g == null) {
            synchronized (this) {
                if (this.f420056g == null) {
                    this.f420056g = new jn.j();
                }
            }
        }
        return this.f420056g;
    }

    public jn.k Ri() {
        gm0.j1.b().c();
        if (this.f420054e == null) {
            this.f420054e = new jn.k();
        }
        return this.f420054e;
    }

    public int Ui(java.lang.String str, long j17) {
        p75.n0 n0Var = dm.w9.f322399o;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.y yVar = new p75.y(dm.w9.f322401q.j(str));
        yVar.f(dm.w9.f322404t.i(0).c(dm.w9.f322403s.i(0)));
        linkedList2.add(dm.w9.f322405u.u());
        p75.i0 g17 = dm.w9.f322399o.g(linkedList);
        g17.f434190d = yVar;
        g17.d(linkedList2);
        g17.b(linkedList3);
        java.util.ArrayList arrayList = (java.util.ArrayList) g17.a().k(gm0.j1.u().f354686f, dm.w9.class);
        if (arrayList.size() <= 0 || ((dm.w9) arrayList.get(0)).f69032xa783a79b <= j17) {
            return 0;
        }
        return arrayList.size();
    }

    public void Vi(java.lang.String str) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.PluginChatroomUI", "handleChatroomBackup talker:%s", str);
            rn.h c17 = kn.l0.c(str);
            if (c17 == null || c17.f66386xae782d0e == 0) {
                return;
            }
            c17.f66386xae782d0e = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.PluginChatroomUI", "handleChatroomBackup result:%s", java.lang.Boolean.valueOf(((nn.j) i95.n0.c(nn.j.class)).Di().mo9952xce0038c9(c17, new java.lang.String[0])));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Zi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.Q0()
            boolean r0 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(r0)
            if (r0 == 0) goto L7c
            java.lang.String r0 = r8.j()
            ot0.q r0 = ot0.q.v(r0)
            if (r0 != 0) goto L15
            return
        L15:
            java.lang.String r1 = r8.Q0()
            rn.h r1 = kn.l0.c(r1)
            if (r1 != 0) goto L20
            return
        L20:
            int r2 = r1.f66386xae782d0e
            if (r2 != 0) goto L25
            return
        L25:
            boolean r2 = k01.i.a(r0)
            r3 = 0
            if (r2 != 0) goto L3a
            int r0 = r0.f430199i
            r2 = 44
            if (r0 != r2) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = r3
        L35:
            if (r0 == 0) goto L38
            goto L3a
        L38:
            r0 = 0
            goto L3e
        L3a:
            com.tencent.mm.chatroom.storage.GroupToolItem r0 = kn.l0.b(r8)
        L3e:
            boolean r2 = kn.l0.d(r8)
            if (r2 == 0) goto L52
            com.tencent.mm.chatroom.storage.GroupToolItem r0 = new com.tencent.mm.chatroom.storage.GroupToolItem
            java.lang.String r2 = ""
            long r4 = r8.mo78012x3fdd41df()
            java.lang.String r6 = "roomaa@app.origin"
            r0.<init>(r6, r2, r4)
        L52:
            if (r0 == 0) goto L7c
            r1.t0(r0)
            java.lang.Class<nn.j> r0 = nn.j.class
            i95.m r0 = i95.n0.c(r0)
            nn.j r0 = (nn.j) r0
            rn.i r0 = r0.Di()
            java.lang.String[] r2 = new java.lang.String[r3]
            boolean r0 = r0.mo9952xce0038c9(r1, r2)
            java.lang.String r8 = r8.Q0()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            java.lang.String r0 = "MicroMsg.roomtools.PluginChatroomUI"
            java.lang.String r1 = "handleGroupToolByReceiverAppMsg room:%s result:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1, r8)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.j.Zi(com.tencent.mm.storage.f9):void");
    }

    public void wi(l81.b1 b1Var, rn.c cVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27;
        java.lang.String j17;
        ot0.q v17;
        if (cVar == null) {
            return;
        }
        java.lang.String str = cVar.f66260xf16ddfa5;
        java.lang.String str2 = cVar.f66261x3c4f6205;
        if (android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2) && cVar.u0() != 0 && (o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(cVar.f66259x137a1f8b, cVar.u0())) != null && (j17 = o27.j()) != null && (v17 = ot0.q.v(c01.w9.l(true, j17, o27.A0()))) != null) {
            str = v17.f430226o2;
            str2 = cVar.f66259x137a1f8b;
        }
        b1Var.C = str;
        b1Var.D = str2;
    }
}
