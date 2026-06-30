package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class e1 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f1 f219045q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f1 f1Var, p13.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.C15575x38aaa00d c15575x38aaa00d) {
        super(uVar);
        this.f219045q = f1Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchFeatureTask";
    }

    @Override // p13.c
    public int k() {
        return 12;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        boolean z17;
        p13.u uVar = this.f432668n;
        vVar.f432692d = p13.r.b(uVar.f432674c, true);
        vVar.f432693e = new java.util.ArrayList();
        boolean z18 = vVar.f432692d.f432663b.getBytes(java.nio.charset.StandardCharsets.UTF_8).length >= 4;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f1 f1Var = this.f219045q;
        if (z18 && uVar.f432673b == 97) {
            android.database.Cursor H = f1Var.f219063g.H(vVar.f432692d, o13.d.f423750c, null, java.lang.String.valueOf(39), false, false);
            try {
                z17 = !H.moveToFirst();
            } finally {
                H.close();
            }
        } else {
            z17 = true;
        }
        if (z17) {
            java.util.HashSet hashSet = new java.util.HashSet();
            android.database.Cursor H2 = f1Var.f219063g.H(vVar.f432692d, o13.d.f423750c, uVar.f432679h, null, true, true);
            while (H2.moveToNext()) {
                p13.z zVar = new p13.z();
                zVar.c(H2);
                if (!hashSet.contains(java.lang.Long.valueOf(zVar.f432719d)) && !uVar.f432681j.contains(zVar.f432720e)) {
                    zVar.a();
                    vVar.f432693e.add(zVar);
                    hashSet.add(java.lang.Long.valueOf(zVar.f432719d));
                }
            }
            H2.close();
            java.util.Comparator comparator = uVar.f432683l;
            if (comparator != null) {
                java.util.Collections.sort(vVar.f432693e, comparator);
            }
            for (p13.y yVar : vVar.f432693e) {
                yVar.f432730o = f1Var.f219063g.N((int) yVar.f432719d);
            }
        }
        java.util.Set Ui = ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ui();
        if (f1Var.f219064h != null) {
            java.util.HashSet hashSet2 = (java.util.HashSet) Ui;
            if (hashSet2.isEmpty()) {
                return;
            }
            android.database.Cursor R = f1Var.f219064h.R(vVar.f432692d, new int[]{131072});
            java.util.HashSet hashSet3 = new java.util.HashSet(uVar.f432681j);
            java.util.Iterator it = vVar.f432693e.iterator();
            while (it.hasNext()) {
                hashSet3.add(((p13.y) it.next()).f432720e);
            }
            while (R.moveToNext()) {
                java.lang.String string = R.getString(4);
                if (hashSet2.contains(string) && !hashSet3.contains(string)) {
                    hashSet3.add(string);
                    p13.z zVar2 = new p13.z();
                    zVar2.c(R);
                    zVar2.f432717b = 262144;
                    zVar2.a();
                    p13.f fVar = new p13.f();
                    fVar.f68145x818dc9ac = 98;
                    fVar.f68150x29dd02d3 = o13.n.d(string);
                    fVar.f68143x2788aaf5 = 1;
                    zVar2.f432730o = fVar;
                    vVar.f432693e.add(zVar2);
                }
            }
            R.close();
        }
    }
}
