package j23;

/* loaded from: classes12.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 4128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        e23.x xVar;
        int i18 = (i17 - iVar.f496098a) - 1;
        if (i18 >= iVar.f496103f.size() || i18 < 0) {
            xVar = null;
        } else {
            p13.y yVar = (p13.y) iVar.f496103f.get(i18);
            if (yVar.f432720e.equals("create_chatroom\u200b")) {
                xVar = new e23.x(i17);
                xVar.f505295e = iVar.f496104g;
            } else {
                e23.s1 s1Var = new e23.s1(i17);
                s1Var.f328491q = yVar;
                s1Var.f505295e = iVar.f496104g;
                s1Var.n(yVar.f432717b, yVar.f432718c);
                xVar = s1Var;
            }
        }
        if (xVar != null) {
            xVar.f505300j = i18 + 1;
        }
        return xVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        uVar.f432673b = 32;
        uVar.f432674c = this.f219540i;
        uVar.f432681j = hashSet;
        uVar.f432683l = r13.a.f450134d;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f432693e)) {
            t13.i iVar = new t13.i();
            iVar.f496102e = -3;
            iVar.f496103f = vVar.f432693e;
            iVar.f496104g = vVar.f432692d;
            iVar.f496101d = false;
            this.f219542n.add(iVar);
        }
    }
}
