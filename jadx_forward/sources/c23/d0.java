package c23;

/* loaded from: classes12.dex */
public final class d0 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.f0 f119554d;

    public d0(c23.f0 f0Var) {
        this.f119554d = f0Var;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        fi0.k kVar;
        j75.e eVar;
        b23.a state = (b23.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        c23.f0 f0Var = this.f119554d;
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof fi0.k) && (eVar = (kVar = (fi0.k) dVar).f379600a) != null && (eVar instanceof fi0.l)) {
            java.lang.String str = kVar.f344297b;
            long j17 = kVar.f344298c;
            boolean z17 = kVar.f344299d;
            boolean z18 = ((fi0.l) eVar).f344301a;
            f0Var.getClass();
            int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(5);
            r45.g55 g55Var = new r45.g55();
            f0Var.f119563e = 0L;
            f0Var.f119565g = false;
            g55Var.f456422d = str;
            g55Var.f456425g = java.lang.String.valueOf(j17);
            g55Var.f456424f = java.lang.String.valueOf(o13.p.f423783c);
            g55Var.f456427i = 1;
            g55Var.f456428m = a17;
            g55Var.f456433r = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0);
            g55Var.f456434s = z18 ? 5 : 6;
            g55Var.f456432q = su4.r2.g();
            if (((s50.k0) ((u50.w) i95.n0.c(u50.w.class))).Zi()) {
                java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219913a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSSearchPrefixUserInfo", "SearchClickHistory isNullOrNil, haveInitClickHistory=" + com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219914b);
                }
                g55Var.f456437v = (java.util.LinkedList) list;
                g55Var.f456438w = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219915c;
                g55Var.f456439x = (java.util.LinkedList) com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219916d;
            }
            f0Var.m80379x76847179().getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
            float b17 = j65.c.b(f0Var.m80379x76847179());
            java.util.LinkedList linkedList = g55Var.f456436u;
            r45.x50 x50Var = new r45.x50();
            x50Var.f471321d = "fontSize";
            x50Var.f471323f = java.lang.String.valueOf(b17);
            linkedList.add(x50Var);
            java.util.LinkedList linkedList2 = g55Var.f456436u;
            r45.x50 x50Var2 = new r45.x50();
            x50Var2.f471321d = "screenHeight";
            x50Var2.f471322e = com.p314xaae8f345.mm.ui.zk.b(f0Var.m80379x76847179(), com.p314xaae8f345.mm.ui.bl.b(f0Var.m80379x76847179()).y);
            linkedList2.add(x50Var2);
            java.util.LinkedList linkedList3 = g55Var.f456436u;
            r45.x50 x50Var3 = new r45.x50();
            x50Var3.f471321d = "extInfo";
            android.app.Activity context = f0Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(z13.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            x50Var3.f471323f = ((z13.f) a18).b7();
            linkedList3.add(x50Var3);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 1076;
            lVar.f152199c = "/cgi-bin/mmsearch-bin/pardussearch";
            lVar.f152197a = g55Var;
            lVar.f152198b = new r45.h55();
            com.p314xaae8f345.mm.p944x882e457a.o a19 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a19);
            f0Var.f119566h = iVar;
            pq5.g l17 = iVar.l();
            if (l17 != null) {
                android.view.LayoutInflater.Factory m158354x19263085 = f0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.vending.lifecycle.ILifeCycleKeeper<*>");
                l17.f((im5.b) m158354x19263085);
                l17.q(new c23.e0(f0Var, j17, str, z18, z17));
            }
        }
        c23.f0 f0Var2 = this.f119554d;
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof fi0.m)) {
            fi0.m mVar = (fi0.m) dVar2;
            com.p314xaae8f345.mm.p944x882e457a.i iVar2 = f0Var2.f119566h;
            if (iVar2 != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = iVar2.f152179f.f152243a.f152217a;
                if (!(fVar instanceof r45.g55)) {
                    fVar = null;
                }
                if (fVar != null) {
                    r45.g55 g55Var2 = (r45.g55) fVar;
                    if (g55Var2.f456425g.equals(java.lang.String.valueOf(mVar.f344302b))) {
                        iVar2.j();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var2.f119562d, "[fts][sug] cancel cgi " + g55Var2.f456422d + ' ' + g55Var2.f456425g + ' ' + g55Var2.f456424f);
                    }
                }
            }
        }
        c23.f0 f0Var3 = this.f119554d;
        j75.d dVar3 = state.f379599d;
        if (dVar3 == null || !(dVar3 instanceof fi0.j)) {
            return;
        }
        fi0.j jVar = (fi0.j) dVar3;
        f0Var3.f119563e = jVar.f344294b;
        f0Var3.f119564f = jVar.f344295c;
        f0Var3.f119565g = jVar.f344296d;
    }
}
