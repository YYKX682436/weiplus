package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class q0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219185q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, p13.u uVar) {
        super(uVar);
        this.f219185q = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchChatroomMemberTask";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0161. Please report as an issue. */
    @Override // p13.t
    public void p(p13.v vVar) {
        java.lang.String string;
        vVar.f432692d = p13.r.b(this.f432668n.f432674c, true);
        vVar.f432693e = new java.util.ArrayList();
        w13.b bVar = this.f219185q.f219121g;
        java.lang.String str = this.f432668n.f432675d;
        p13.r rVar = vVar.f432692d;
        bVar.getClass();
        android.database.Cursor dVar = rVar.a() ? new d95.d() : ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) bVar.f423731f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMChatroomMember(%s) AS Offsets FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131075 AND subtype = 38 AND aux_index = ? ;", bVar.r(), bVar.o(), bVar.o(), bVar.r(), bVar.r(), bVar.o(), bVar.o(), rVar.f()), new java.lang.String[]{str});
        if (dVar.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.c(dVar);
            zVar.a();
            vVar.f432693e.add(zVar);
        }
        dVar.close();
        android.database.Cursor f17 = gm0.j1.u().f354686f.f("SELECT memberlist FROM chatroom WHERE chatroomname=?;", new java.lang.String[]{this.f432668n.f432675d}, 2);
        java.lang.String[] strArr = null;
        if (f17.moveToFirst() && (string = f17.getString(0)) != null) {
            strArr = o13.c.f423741a.split(string);
        }
        f17.close();
        java.util.HashSet hashSet = new java.util.HashSet(this.f432668n.f432681j);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Arrays.sort(strArr, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.o0(this, (o13.z) i95.n0.c(o13.z.class)));
        if (strArr == null || vVar.f432693e.isEmpty() || ((p13.y) vVar.f432693e.get(0)).f432729n == null) {
            return;
        }
        for (p13.l lVar : ((p13.y) vVar.f432693e.get(0)).f432729n) {
            int i17 = lVar.f432643a;
            if (i17 < strArr.length) {
                java.lang.String str2 = strArr[i17];
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    lVar.f432647e = str2;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 e07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e0(str2);
                    if (e07 == null) {
                        e07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str2);
                    }
                    if (e07 != null && (this.f432668n.f432682k.isEmpty() || this.f432668n.f432682k.contains(str2))) {
                        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                        java.lang.String d17 = e07.d1();
                        java.lang.String str3 = this.f432668n.f432675d;
                        ((sg3.a) v0Var).getClass();
                        java.lang.String f18 = c01.a2.f(d17, str3);
                        switch (lVar.f432644b) {
                            case 31:
                                lVar.f432652j = true;
                            case 30:
                                lVar.f432651i = true;
                            case 29:
                                lVar.f432648f = f18;
                                break;
                            case 32:
                                lVar.f432648f = e07.f318122y1;
                                lVar.f432649g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574476id2);
                                break;
                            case 33:
                                lVar.f432648f = lVar.f432645c;
                                lVar.f432649g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ict);
                                lVar.f432648f = lVar.f432645c;
                                break;
                            case 36:
                                lVar.f432652j = true;
                            case 35:
                                lVar.f432651i = true;
                            case 34:
                                lVar.f432648f = e07.P0();
                                if (!e07.P0().equals(f18)) {
                                    lVar.f432649g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icz);
                                    break;
                                }
                                break;
                            case 37:
                                lVar.f432648f = o13.n.f(str2, e07.t0());
                                lVar.f432649g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icz);
                                break;
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f432648f)) {
                            if (lVar.f432648f.contains(vVar.f432692d.f432662a)) {
                                lVar.f432650h += 10;
                            }
                            if (hashSet.add(str2)) {
                                arrayList.add(lVar);
                            }
                        }
                    }
                }
            }
        }
        java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.p0(this));
        ((p13.y) vVar.f432693e.get(0)).f432729n = arrayList;
    }
}
