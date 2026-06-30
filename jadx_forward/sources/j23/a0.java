package j23;

/* loaded from: classes12.dex */
public class a0 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public long f378800p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f378801q;

    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 8208;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public e23.g0 m(int i17, t13.i iVar) {
        int i18 = this.f496093f;
        if (i18 != 1 && i18 != 2 && i18 != 5) {
            return new e23.g0(i17);
        }
        e23.l1 l1Var = new e23.l1(i17);
        if (iVar instanceof j23.z) {
            l1Var.f328423v = ((j23.z) iVar).f378838k;
        } else {
            l1Var.f328423v = t(iVar.f496103f);
        }
        return l1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = i17 - iVar.f496098a;
        if (iVar.f496099b) {
            i18--;
        }
        if (i18 < iVar.f496103f.size() && i18 >= 0) {
            p13.y yVar = (p13.y) iVar.f496103f.get(i18);
            int i19 = yVar.f432718c;
            int i27 = this.f496093f;
            if (i19 == 55) {
                e23.h1 h1Var = new e23.h1(i17);
                h1Var.n(yVar.f432717b, yVar.f432718c);
                h1Var.f505298h = i27;
                h1Var.f328395q = yVar;
                h1Var.f505295e = iVar.f496104g;
                h1Var.f505297g = -21;
                h1Var.f505299i = i17;
                h1Var.f505296f = 7;
                if (i17 != iVar.f496103f.size() - 1) {
                    return h1Var;
                }
                h1Var.f505294d = true;
                return h1Var;
            }
            if (i19 == 56) {
                e23.e1 e1Var = new e23.e1(i17);
                e1Var.n(yVar.f432717b, yVar.f432718c);
                e1Var.f505298h = i27;
                e23.c1 c1Var = e1Var.f328370x;
                if (c1Var != null) {
                    c1Var.f328329b = i27;
                }
                e1Var.f328363q = yVar;
                e1Var.f505295e = iVar.f496104g;
                e1Var.f505297g = -21;
                e1Var.f505299i = i17;
                e1Var.f505296f = 7;
                return e1Var;
            }
            if (i19 == 57) {
                e23.x1 x1Var = new e23.x1(i17);
                x1Var.n(yVar.f432717b, yVar.f432718c);
                x1Var.f505298h = i27;
                x1Var.f328521q = yVar;
                x1Var.f505295e = iVar.f496104g;
                x1Var.f505297g = -21;
                x1Var.f505299i = i17;
                x1Var.f505296f = 7;
                return x1Var;
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432675d = this.f378801q;
        uVar.f432683l = r13.e.f450138d;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        int i17 = this.f496093f;
        if (i17 == 5) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f378800p = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27229, 1, 5, this.f219540i, 0, 0, 0);
        }
        if (i17 == 1 || i17 == 2) {
            uVar.f432673b = 1;
        } else if (i17 == 3) {
            uVar.f432673b = 10;
        } else if (i17 == 4) {
            uVar.f432673b = 12;
        } else if (i17 != 5) {
            uVar.f432673b = 0;
        } else {
            uVar.f432673b = 11;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(12, uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if ((t(r14.f432693e) > 0) == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[LOOP:1: B:27:0x006c->B:28:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(p13.v r14, java.util.HashSet r15) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.a0.s(p13.v, java.util.HashSet):void");
    }

    public final int t(java.util.List list) {
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            p13.y yVar = (p13.y) it.next();
            if (yVar != null && yVar.f432718c == 55) {
                i17++;
            }
        }
        return i17;
    }
}
