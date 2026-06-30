package j23;

/* loaded from: classes12.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f378804p;

    public g(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f378804p = false;
    }

    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 48;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i17);
        p13.e eVar = new p13.e();
        if (yVar.f432720e.equals("create_chatroom\u200b")) {
            eVar.f432608c = 20;
            eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        } else {
            if (yVar.f432717b != 131075) {
                return null;
            }
            eVar.f432608c = 4;
            eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        }
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u13.g o(int r5, t13.i r6) {
        /*
            r4 = this;
            int r0 = r6.f496098a
            int r0 = r5 - r0
            int r0 = r0 + (-1)
            java.util.List r1 = r6.f496103f
            int r1 = r1.size()
            if (r0 >= r1) goto L40
            if (r0 < 0) goto L40
            java.util.List r1 = r6.f496103f
            java.lang.Object r1 = r1.get(r0)
            p13.y r1 = (p13.y) r1
            java.lang.String r2 = r1.f432720e
            java.lang.String r3 = "create_chatroom\u200b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2c
            e23.x r1 = new e23.x
            r1.<init>(r5)
            p13.r r5 = r6.f496104g
            r1.f505295e = r5
            goto L41
        L2c:
            int r2 = r1.f432717b
            r3 = 131075(0x20003, float:1.83675E-40)
            if (r2 != r3) goto L40
            u13.g r5 = r4.p(r3, r5, r1, r6)
            int r2 = r1.f432717b
            int r1 = r1.f432718c
            r5.n(r2, r1)
            r1 = r5
            goto L41
        L40:
            r1 = 0
        L41:
            if (r1 == 0) goto L54
            int r5 = r0 + 1
            r1.f505300j = r5
            java.util.List r5 = r6.f496103f
            int r5 = r5.size()
            int r5 = r5 + (-1)
            if (r0 != r5) goto L54
            r5 = 0
            r1.f505294d = r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.g.o(int, t13.i):u13.g");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g p(int i17, int i18, p13.y yVar, t13.i iVar) {
        e23.s1 s1Var = new e23.s1(i18);
        s1Var.f328491q = yVar;
        s1Var.f505295e = iVar.f496104g;
        s1Var.n(yVar.f432717b, yVar.f432718c);
        return s1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        this.f378804p = false;
        ((s50.m0) ((u50.x) i95.n0.c(u50.x.class))).x1();
        ((ku5.t0) ku5.t0.f394148d).h(new j23.f(this), "WCSearchGroupTrain.init");
        p13.u uVar = new p13.u();
        uVar.f432673b = 96;
        uVar.f432680i = 3;
        uVar.f432674c = this.f219540i;
        uVar.f432681j = hashSet;
        uVar.f432683l = r13.a.f450134d;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(p13.v r13, java.util.HashSet r14) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.g.s(p13.v, java.util.HashSet):void");
    }
}
