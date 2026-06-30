package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes13.dex */
public class l1 implements kn.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r.a f285914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f285915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285916c;

    public l1(r.a aVar, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f285914a = aVar;
        this.f285915b = z17;
        this.f285916c = f9Var;
    }

    @Override // kn.i0
    public void a() {
        android.util.Pair pair;
        android.util.Pair pair2;
        this.f285914a.mo1850x58b836e(java.lang.Boolean.valueOf(!this.f285915b));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f285916c;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "msginfo is null");
            pair2 = new android.util.Pair(java.lang.Boolean.FALSE, "");
        } else {
            if (f9Var.y2()) {
                r45.vt5 vt5Var = new r45.vt5();
                vt5Var.f470056d = "related_msgid_" + f9Var.I0();
                vt5Var.f470057e = "roomannouncement@app.origin";
                vt5Var.f470058f = "";
                vt5Var.f470059g = c01.id.e();
                vt5Var.f470061i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ayn);
                vt5Var.f470062m = bm5.d1.c(f9Var);
                vt5Var.f470063n = f9Var.I0();
                vt5Var.f470064o = c01.z1.r();
                ((nn.j) i95.n0.c(nn.j.class)).Ri().a(f9Var.Q0(), 0, vt5Var);
                pair = new android.util.Pair(java.lang.Boolean.TRUE, vt5Var.f470056d);
            } else {
                ot0.q v17 = ot0.q.v(f9Var.j());
                if (v17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "content is null");
                    pair2 = new android.util.Pair(java.lang.Boolean.FALSE, "");
                } else {
                    r45.vt5 vt5Var2 = new r45.vt5();
                    ot0.a aVar = (ot0.a) v17.y(ot0.a.class);
                    if (aVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f429897t)) {
                        vt5Var2.f470056d = "related_msgid_" + f9Var.I0();
                    } else {
                        vt5Var2.f470056d = aVar.f429897t;
                    }
                    vt5Var2.f470057e = v17.f430206j2;
                    vt5Var2.f470058f = v17.f430202i2;
                    vt5Var2.f470059g = c01.id.e();
                    java.lang.String n17 = v17.n();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                        k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(v17.f430206j2);
                        if (Bi != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Bi.f68913x21f9b213)) {
                            n17 = Bi.f68913x21f9b213;
                        }
                    }
                    vt5Var2.f470061i = n17;
                    vt5Var2.f470062m = bm5.d1.c(f9Var);
                    vt5Var2.f470063n = f9Var.I0();
                    vt5Var2.f470064o = c01.z1.r();
                    vt5Var2.f470065p = v17.f430226o2;
                    vt5Var2.f470066q = f9Var.Q0();
                    ((nn.j) i95.n0.c(nn.j.class)).Ri().a(f9Var.Q0(), 0, vt5Var2);
                    pair = new android.util.Pair(java.lang.Boolean.TRUE, vt5Var2.f470056d);
                }
            }
            pair2 = pair;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsg", "handleTodoClickImp addtodo msgId(%s) result:%s", java.lang.Long.valueOf(f9Var.I0()), pair2);
    }

    @Override // kn.i0
    public void b() {
        r45.vt5 vt5Var;
        this.f285914a.mo1850x58b836e(java.lang.Boolean.valueOf(!this.f285915b));
        rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f285916c;
        rn.c z07 = Bi.z0(f9Var.Q0(), f9Var.X1());
        if (z07 != null) {
            java.util.Iterator it = ((java.util.ArrayList) z07.S).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(f9Var.Q0(), ((java.lang.Long) it.next()).longValue());
                o27.s3("");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.m124847x74d37ac6(), o27, true);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe c5759x7ac701fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5759x7ac701fe();
            am.ql qlVar = c5759x7ac701fe.f136078g;
            qlVar.f89248a = 1;
            qlVar.f89250c = f9Var.X1();
            qlVar.f89249b = f9Var.Q0();
            c5759x7ac701fe.b(android.os.Looper.getMainLooper());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByClickMsg todoId:%s result:%s", f9Var.X1(), java.lang.Boolean.valueOf(kn.j0.i(z07)));
            vt5Var = kn.j0.b(z07);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o28 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(f9Var.Q0(), f9Var.I0());
            o28.s3("");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o28.m124847x74d37ac6(), o28, true);
            vt5Var = new r45.vt5();
            vt5Var.f470056d = f9Var.X1();
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null) {
                vt5Var.f470057e = "";
                vt5Var.f470058f = "";
                vt5Var.f470061i = "";
            } else {
                vt5Var.f470057e = v17.f430206j2;
                vt5Var.f470058f = v17.f430202i2;
                vt5Var.f470061i = v17.n();
            }
            vt5Var.f470059g = (int) (f9Var.mo78012x3fdd41df() / com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            vt5Var.f470062m = bm5.d1.c(f9Var);
            vt5Var.f470063n = f9Var.I0();
            vt5Var.f470064o = "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByClickMsg todoId:%s", f9Var.X1());
        }
        ((nn.j) i95.n0.c(nn.j.class)).Ri().a(f9Var.Q0(), 1, vt5Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsg", "handleTodoClickImp recall msgId(%s) result:%s", java.lang.Long.valueOf(f9Var.I0()), new android.util.Pair(java.lang.Boolean.TRUE, f9Var.X1()));
    }
}
