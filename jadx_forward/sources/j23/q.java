package j23;

/* loaded from: classes12.dex */
public class q extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f378812p;

    public q(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        this.f378812p = false;
    }

    @Override // t13.b, t13.k
    public boolean a(android.view.View view, u13.g gVar, boolean z17) {
        if (gVar instanceof e23.p0) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.h(gVar, t(), this.f378812p);
            return false;
        }
        if (!(gVar instanceof e23.m0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.h(gVar, t(), this.f378812p);
        return false;
    }

    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 112;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        if (yVar.f432720e.equals("create_talker_message\u200b")) {
            eVar.f432608c = 22;
            return eVar;
        }
        eVar.f432608c = 11;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(yVar.f432720e)) {
            eVar.f432613h = 5;
            return eVar;
        }
        if (yVar.f432720e.equals("appbrandcustomerservicemsg")) {
            eVar.f432613h = 6;
            return eVar;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(yVar.f432720e)) {
            eVar.f432613h = 4;
            return eVar;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(yVar.f432720e)) {
            eVar.f432613h = 2;
            return eVar;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.O4(yVar.f432720e)) {
            eVar.f432613h = 1;
            return eVar;
        }
        eVar.f432613h = 7;
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        e23.a0 a0Var;
        e23.a0 a0Var2;
        int i18 = i17 - iVar.f496098a;
        if (iVar.f496099b) {
            i18--;
        }
        if (i18 >= iVar.f496103f.size() || i18 < 0) {
            a0Var = null;
        } else {
            p13.y yVar = (p13.y) iVar.f496103f.get(i18);
            if (yVar.f432720e.equals("create_talker_message\u200b")) {
                a0Var = new e23.a0(i17);
                a0Var.f328304q = iVar.f496103f.size() == 1;
                this.f378812p = true;
            } else {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(yVar.f432720e) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.C3(yVar.f432720e)) {
                    e23.m0 m0Var = new e23.m0(i17);
                    m0Var.f328427q = yVar;
                    m0Var.n(yVar.f432717b, yVar.f432718c);
                    a0Var2 = m0Var;
                } else {
                    e23.p0 p0Var = new e23.p0(i17);
                    p0Var.f328458q = yVar;
                    p0Var.n(yVar.f432717b, yVar.f432718c);
                    a0Var2 = p0Var;
                }
                a0Var = a0Var2;
            }
        }
        if (a0Var != null) {
            a0Var.f505300j = i18 + 1;
            a0Var.f505295e = iVar.f496104g;
            if (i18 == iVar.f496103f.size() - 1) {
                a0Var.f505294d = false;
            }
        }
        return a0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        this.f378812p = false;
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432681j = hashSet;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        uVar.f432673b = 1;
        uVar.f432680i = 3;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        if (k(vVar.f432693e)) {
            vVar.f432693e.removeIf(new j23.C28995x33e9d0());
            t13.i iVar = new t13.i();
            iVar.f496102e = -2;
            iVar.f496104g = vVar.f432692d;
            java.util.List list = vVar.f432693e;
            iVar.f496103f = list;
            if (list.size() > 3) {
                if (((p13.y) vVar.f432693e.get(3)).f432720e.equals("create_talker_message\u200b")) {
                    iVar.f496101d = false;
                    iVar.f496103f = new java.util.ArrayList(iVar.f496103f.subList(0, 4));
                } else {
                    iVar.f496101d = true;
                    iVar.f496103f = new java.util.ArrayList(iVar.f496103f.subList(0, 3));
                }
            } else if (vVar.f432693e.size() == 1 && ((p13.y) vVar.f432693e.get(0)).f432720e.equals("create_talker_message\u200b")) {
                iVar.f496099b = false;
            }
            this.f219542n.add(iVar);
        }
    }

    public int t() {
        return 0;
    }
}
