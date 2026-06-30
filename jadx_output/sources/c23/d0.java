package c23;

/* loaded from: classes12.dex */
public final class d0 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.f0 f38021d;

    public d0(c23.f0 f0Var) {
        this.f38021d = f0Var;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        fi0.k kVar;
        j75.e eVar;
        b23.a state = (b23.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        c23.f0 f0Var = this.f38021d;
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof fi0.k) && (eVar = (kVar = (fi0.k) dVar).f298067a) != null && (eVar instanceof fi0.l)) {
            java.lang.String str = kVar.f262764b;
            long j17 = kVar.f262765c;
            boolean z17 = kVar.f262766d;
            boolean z18 = ((fi0.l) eVar).f262768a;
            f0Var.getClass();
            int a17 = com.tencent.mm.plugin.websearch.l2.a(5);
            r45.g55 g55Var = new r45.g55();
            f0Var.f38030e = 0L;
            f0Var.f38032g = false;
            g55Var.f374889d = str;
            g55Var.f374892g = java.lang.String.valueOf(j17);
            g55Var.f374891f = java.lang.String.valueOf(o13.p.f342250c);
            g55Var.f374894i = 1;
            g55Var.f374895m = a17;
            g55Var.f374900r = com.tencent.mm.plugin.websearch.l2.a(0);
            g55Var.f374901s = z18 ? 5 : 6;
            g55Var.f374899q = su4.r2.g();
            if (((s50.k0) ((u50.w) i95.n0.c(u50.w.class))).Zi()) {
                java.util.List list = com.tencent.mm.plugin.fts.ui.y2.f138380a;
                if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSearchPrefixUserInfo", "SearchClickHistory isNullOrNil, haveInitClickHistory=" + com.tencent.mm.plugin.fts.ui.y2.f138381b);
                }
                g55Var.f374904v = (java.util.LinkedList) list;
                g55Var.f374905w = com.tencent.mm.plugin.fts.ui.y2.f138382c;
                g55Var.f374906x = (java.util.LinkedList) com.tencent.mm.plugin.fts.ui.y2.f138383d;
            }
            f0Var.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
            float b17 = j65.c.b(f0Var.getContext());
            java.util.LinkedList linkedList = g55Var.f374903u;
            r45.x50 x50Var = new r45.x50();
            x50Var.f389788d = "fontSize";
            x50Var.f389790f = java.lang.String.valueOf(b17);
            linkedList.add(x50Var);
            java.util.LinkedList linkedList2 = g55Var.f374903u;
            r45.x50 x50Var2 = new r45.x50();
            x50Var2.f389788d = "screenHeight";
            x50Var2.f389789e = com.tencent.mm.ui.zk.b(f0Var.getContext(), com.tencent.mm.ui.bl.b(f0Var.getContext()).y);
            linkedList2.add(x50Var2);
            java.util.LinkedList linkedList3 = g55Var.f374903u;
            r45.x50 x50Var3 = new r45.x50();
            x50Var3.f389788d = "extInfo";
            android.app.Activity context = f0Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a18 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z13.f.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            x50Var3.f389790f = ((z13.f) a18).b7();
            linkedList3.add(x50Var3);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 1076;
            lVar.f70666c = "/cgi-bin/mmsearch-bin/pardussearch";
            lVar.f70664a = g55Var;
            lVar.f70665b = new r45.h55();
            com.tencent.mm.modelbase.o a19 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a19);
            f0Var.f38033h = iVar;
            pq5.g l17 = iVar.l();
            if (l17 != null) {
                android.view.LayoutInflater.Factory activity = f0Var.getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.vending.lifecycle.ILifeCycleKeeper<*>");
                l17.f((im5.b) activity);
                l17.q(new c23.e0(f0Var, j17, str, z18, z17));
            }
        }
        c23.f0 f0Var2 = this.f38021d;
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof fi0.m)) {
            fi0.m mVar = (fi0.m) dVar2;
            com.tencent.mm.modelbase.i iVar2 = f0Var2.f38033h;
            if (iVar2 != null) {
                com.tencent.mm.protobuf.f fVar = iVar2.f70646f.f70710a.f70684a;
                if (!(fVar instanceof r45.g55)) {
                    fVar = null;
                }
                if (fVar != null) {
                    r45.g55 g55Var2 = (r45.g55) fVar;
                    if (g55Var2.f374892g.equals(java.lang.String.valueOf(mVar.f262769b))) {
                        iVar2.j();
                        com.tencent.mars.xlog.Log.i(f0Var2.f38029d, "[fts][sug] cancel cgi " + g55Var2.f374889d + ' ' + g55Var2.f374892g + ' ' + g55Var2.f374891f);
                    }
                }
            }
        }
        c23.f0 f0Var3 = this.f38021d;
        j75.d dVar3 = state.f298066d;
        if (dVar3 == null || !(dVar3 instanceof fi0.j)) {
            return;
        }
        fi0.j jVar = (fi0.j) dVar3;
        f0Var3.f38030e = jVar.f262761b;
        f0Var3.f38031f = jVar.f262762c;
        f0Var3.f38032g = jVar.f262763d;
    }
}
