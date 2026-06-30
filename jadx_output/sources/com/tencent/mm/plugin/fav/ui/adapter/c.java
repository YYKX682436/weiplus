package com.tencent.mm.plugin.fav.ui.adapter;

/* loaded from: classes12.dex */
public class c extends com.tencent.mm.plugin.fav.ui.adapter.b {
    public static final boolean L = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_click_xml_null_batch_get, true);
    public static final boolean M;
    public boolean A;
    public boolean B;
    public o72.j2 C;
    public java.lang.Integer D;
    public boolean E;
    public int F;
    public int G;
    public java.lang.String H;
    public android.widget.ListView I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.fav.ui.adapter.FavoriteNormalAdapter$MusicPlayerListener f100478J;
    public s82.i K;

    /* renamed from: i, reason: collision with root package name */
    public boolean f100479i = false;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f100480m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f100481n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f100482o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f100483p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public boolean f100484q = false;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f100485r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f100486s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f100487t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f100488u;

    /* renamed from: v, reason: collision with root package name */
    public final android.util.SparseArray f100489v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f100490w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f100491x;

    /* renamed from: y, reason: collision with root package name */
    public s82.h f100492y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.a4 f100493z;

    static {
        M = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_collection_fav_switch, 1) == 1;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.fav.ui.adapter.FavoriteNormalAdapter$MusicPlayerListener] */
    public c(android.content.Context context, com.tencent.mm.plugin.fav.ui.ra raVar, boolean z17) {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        this.f100485r = treeMap;
        this.f100486s = new java.util.ArrayList();
        this.f100487t = new java.util.LinkedList();
        this.f100488u = new java.util.LinkedList();
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f100489v = sparseArray;
        this.f100490w = false;
        this.f100491x = false;
        this.A = false;
        this.B = false;
        this.C = null;
        this.D = 0;
        this.E = false;
        this.H = "";
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        ?? r57 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(weakReference) { // from class: com.tencent.mm.plugin.fav.ui.adapter.FavoriteNormalAdapter$MusicPlayerListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f100472d;

            {
                super(com.tencent.mm.app.a0.f53288d);
                this.f100472d = weakReference;
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent2 = musicPlayerEvent;
                com.tencent.mm.plugin.fav.ui.adapter.c cVar = (com.tencent.mm.plugin.fav.ui.adapter.c) this.f100472d.get();
                if (cVar == null || musicPlayerEvent2 == null) {
                    return false;
                }
                int i17 = musicPlayerEvent2.f54512g.f7036b;
                if (i17 != 0 && i17 != 1 && i17 != 2 && i17 != 3) {
                    if (i17 == 4) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteAdapter", "musicPlayerListener error");
                        if (cVar.f100490w) {
                            cVar.f100491x = true;
                            return false;
                        }
                        il4.l lVar = il4.l.f292142a;
                        cVar.notifyDataSetChanged();
                        return false;
                    }
                    if (i17 != 7) {
                        return false;
                    }
                }
                if (cVar.f100490w) {
                    cVar.f100491x = true;
                    return false;
                }
                cVar.notifyDataSetChanged();
                return false;
            }
        };
        this.f100478J = r57;
        this.K = null;
        this.f100474e = -1;
        sparseArray.put(1, new s82.p0(raVar));
        sparseArray.put(2, new s82.s(raVar));
        sparseArray.put(3, new s82.z0(raVar));
        sparseArray.put(4, new s82.x0(raVar));
        sparseArray.put(5, new s82.v0(raVar));
        sparseArray.put(6, new s82.u(raVar));
        sparseArray.put(7, new s82.z(raVar));
        sparseArray.put(21, new s82.c0(raVar));
        sparseArray.put(8, new s82.m(raVar));
        sparseArray.put(10, new s82.g0(raVar));
        sparseArray.put(12, new s82.n0(raVar));
        sparseArray.put(15, new s82.n0(raVar));
        sparseArray.put(11, new s82.w(raVar));
        sparseArray.put(14, new s82.i0(raVar));
        sparseArray.put(16, new s82.l0(raVar));
        sparseArray.put(17, new s82.k(raVar));
        sparseArray.put(18, new s82.e0(raVar));
        sparseArray.put(20, new s82.q(raVar));
        sparseArray.put(19, new s82.b(raVar));
        sparseArray.put(-2, new s82.t0(raVar));
        sparseArray.put(33, new s82.v0(raVar));
        sparseArray.put(32, new s82.s0(raVar));
        sparseArray.put(24, new s82.v0(raVar));
        if (M) {
            sparseArray.put(34, new s82.o(raVar));
        }
        if (z17 != this.A) {
            this.A = z17;
            if (z17) {
                treeMap.clear();
            }
        }
        if (!this.A) {
            a();
        }
        c();
        notifyDataSetChanged();
        r57.alive();
    }

    public static java.util.List h(java.util.List list, int i17, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list2 == null) {
            return arrayList;
        }
        int i18 = 0;
        if (list != null && list.size() > 0) {
            arrayList.addAll(list);
            java.lang.Long valueOf = java.lang.Long.valueOf(((o72.r2) list.get(list.size() - 1)).field_localId);
            int i19 = 0;
            while (true) {
                if (i19 >= list2.size()) {
                    break;
                }
                if (valueOf.equals(list2.get(i19))) {
                    i18 = i19 + 1;
                    break;
                }
                i19++;
            }
        }
        for (int i27 = i18; i27 < i18 + i17 && i27 < list2.size(); i27++) {
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(((java.lang.Long) list2.get(i27)).longValue());
            if (F != null) {
                arrayList.add(F);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.fav.ui.adapter.b
    public void a() {
        if (com.tencent.mars.xlog.Log.isDebug()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        }
        if (o()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteAdapter", "searching, do not load more data");
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = o72.j5.f343371m;
        if (atomicInteger.get() > 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteAdapter", "want to load more data, but now doing batchget:%s", java.lang.Integer.valueOf(atomicInteger.get()));
            return;
        }
        if (this.A) {
            s(h(this.f100480m, 20, this.f100483p));
            this.f100479i = true;
            return;
        }
        try {
            com.tencent.mars.xlog.Log.isDebug();
            this.f100473d = o72.x1.O0(this.f100473d, this.f100474e, 20);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavoriteAdapter", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x03fe A[LOOP:0: B:84:0x0262->B:159:0x03fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040e A[EDGE_INSN: B:160:0x040e->B:161:0x040e BREAK  A[LOOP:0: B:84:0x0262->B:159:0x03fe], SYNTHETIC] */
    @Override // com.tencent.mm.plugin.fav.ui.adapter.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.adapter.c.c():void");
    }

    public void d(java.util.List list) {
        boolean z17;
        if (this.f100480m != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f100480m.iterator();
            while (true) {
                boolean z18 = true;
                if (!it.hasNext()) {
                    break;
                }
                o72.r2 r2Var = (o72.r2) it.next();
                if (r2Var != null) {
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z18 = false;
                            break;
                        }
                        o72.r2 r2Var2 = (o72.r2) it6.next();
                        if (r2Var2 != null && r2Var.field_localId == r2Var2.field_localId) {
                            break;
                        }
                    }
                    if (!z18) {
                        arrayList.add(r2Var);
                    }
                }
            }
            this.f100480m = arrayList;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Long l17 : this.f100483p) {
                java.util.Iterator it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        z17 = false;
                        break;
                    }
                    o72.r2 r2Var3 = (o72.r2) it7.next();
                    if (r2Var3 != null && l17.equals(java.lang.Long.valueOf(r2Var3.field_localId))) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    arrayList2.add(l17);
                }
            }
            this.f100483p = arrayList2;
        }
    }

    public void f(java.util.List list, java.util.List list2, java.util.List list3) {
        r(0);
        java.util.List list4 = this.f100486s;
        ((java.util.ArrayList) list4).clear();
        if (list != null) {
            ((java.util.ArrayList) list4).addAll(list);
            if (!list.isEmpty()) {
                r(2);
            }
        }
        java.util.List list5 = this.f100487t;
        ((java.util.LinkedList) list5).clear();
        if (list2 != null) {
            ((java.util.LinkedList) list5).addAll(list2);
            if (!list2.isEmpty()) {
                r(3);
            }
        }
        java.util.List list6 = this.f100488u;
        ((java.util.LinkedList) list6).clear();
        if (list3 != null) {
            ((java.util.LinkedList) list6).addAll(list3);
            if (!list3.isEmpty()) {
                r(1);
            }
        }
        c();
    }

    public void g(boolean z17, o72.r2 r2Var) {
        o72.r2 F;
        if (z17 == this.f100484q) {
            return;
        }
        this.f100484q = z17;
        if (z17) {
            java.util.Map map = this.f100485r;
            ((java.util.TreeMap) map).clear();
            if (r2Var != null && (F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(r2Var.field_localId)) != null) {
                if (r2Var.B1) {
                    ((java.util.TreeMap) map).put(r2Var.D1, r2Var);
                } else {
                    ((java.util.TreeMap) map).put(com.tencent.mm.sdk.platformtools.t8.f1(java.lang.Long.valueOf(F.field_localId)), F);
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return o() ? this.f100480m.size() + 1 : this.f100480m.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[FALL_THROUGH, RETURN] */
    @Override // android.widget.BaseAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getItemViewType(int r4) {
        /*
            r3 = this;
            o72.r2 r4 = r3.getItem(r4)
            int r4 = r4.field_type
            switch(r4) {
                case 1: goto L29;
                case 2: goto L29;
                case 3: goto L29;
                case 4: goto L29;
                case 5: goto L29;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                default: goto L9;
            }
        L9:
            switch(r4) {
                case 10: goto L29;
                case 11: goto L29;
                case 12: goto L29;
                default: goto Lc;
            }
        Lc:
            switch(r4) {
                case 14: goto L29;
                case 15: goto L29;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L29;
                case 19: goto L29;
                case 20: goto L29;
                case 21: goto L29;
                default: goto Lf;
            }
        Lf:
            r0 = -2
            switch(r4) {
                case 32: goto L29;
                case 33: goto L29;
                case 34: goto L23;
                default: goto L13;
            }
        L13:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = "MicroMsg.FavoriteAdapter"
            java.lang.String r2 = "get item view type unknown, %d"
            com.tencent.mars.xlog.Log.w(r1, r2, r4)
            return r0
        L23:
            boolean r1 = com.tencent.mm.plugin.fav.ui.adapter.c.M
            if (r1 == 0) goto L28
            return r4
        L28:
            return r0
        L29:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.adapter.c.getItemViewType(int):int");
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        r45.jq0 jq0Var;
        if (view != null) {
            view.hashCode();
        }
        java.util.List list = this.f100480m;
        if (list != null) {
            list.size();
        }
        if (i17 == getCount() - 1 && o()) {
            return android.view.LayoutInflater.from(com.tencent.mm.sdk.platformtools.x2.f193071a).inflate(com.tencent.mm.R.layout.f488758ab4, (android.view.ViewGroup) null);
        }
        o72.r2 item = getItem(i17);
        long j17 = item.field_localId;
        if (7 == item.field_type) {
            r45.bq0 bq0Var = item.field_favProto;
            if (kotlin.jvm.internal.o.b("wx5aa333606550dfd5", (bq0Var == null || (jq0Var = bq0Var.f370962d) == null) ? "" : jq0Var.f378050w)) {
                item.field_type = 21;
            } else {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_type_flag, bm5.h0.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1) {
                    item.field_type = 5;
                } else {
                    item.field_type = 7;
                }
            }
        }
        android.util.SparseArray sparseArray = this.f100489v;
        s82.c cVar = (s82.c) sparseArray.get(item.field_type);
        if (cVar != null) {
            cVar.f404741e = this.K;
        }
        if (cVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteAdapter", "unknown type %d, use unknown item creator", java.lang.Integer.valueOf(item.field_type));
            s82.c cVar2 = (s82.c) sparseArray.get(-2);
            com.tencent.mm.plugin.fav.ui.adapter.a aVar = this.f100477h;
            if (aVar != null) {
                ((com.tencent.mm.plugin.fav.ui.ta) aVar).f101459a.f100279t.b(true);
            }
            return cVar2.e(view, viewGroup, item);
        }
        cVar.f404740d.f404764b = o();
        long j18 = this.f100473d;
        s82.f fVar = cVar.f404740d;
        fVar.f404763a = j18;
        fVar.f404765c = this.f100484q;
        fVar.f404766d = this.f100485r;
        fVar.f404767e = this.f100492y;
        fVar.f404768f = this.A;
        fVar.f404769g = this.B;
        fVar.f404770h = this.f100493z;
        com.tencent.mars.xlog.Log.isDebug();
        return cVar.e(view, viewGroup, item);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 36;
    }

    @Override // com.tencent.mm.plugin.fav.ui.adapter.b, android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        return this.f100480m.isEmpty();
    }

    @Override // android.widget.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public o72.r2 getItem(int i17) {
        if (i17 >= 0 && i17 < this.f100480m.size()) {
            return (o72.r2) this.f100480m.get(i17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteAdapter", "get item, but position error");
        return new o72.r2();
    }

    public java.util.List k(boolean z17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Map map = this.f100485r;
        for (o72.r2 r2Var : ((java.util.TreeMap) map).values()) {
            if (r2Var != null) {
                linkedList.add(r2Var);
            }
        }
        if (z17) {
            ((java.util.TreeMap) map).clear();
        }
        return linkedList;
    }

    public int l() {
        return ((java.util.TreeMap) this.f100485r).size();
    }

    public long m() {
        long j17 = 0;
        for (o72.r2 r2Var : ((java.util.TreeMap) this.f100485r).values()) {
            if (r2Var != null) {
                j17 += r2Var.field_datatotalsize;
            }
        }
        return j17;
    }

    public void n(android.view.View view, int i17, o72.r2 r2Var) {
        if (r2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteAdapter", "goFavDetail() favItemInfo is null");
            return;
        }
        if (!r2Var.B1 || r2Var.C1 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteAdapter", "goFavDetail() originInfo not exist");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        o72.r2 r2Var2 = r2Var.C1;
        java.lang.String str = r2Var2.field_id + "_" + (java.lang.System.currentTimeMillis() / 1000);
        java.util.LinkedList linkedList = r2Var2.field_tagProto.f385096e;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append(";");
            }
        }
        r45.dq0 dq0Var = new r45.dq0();
        dq0Var.f372653d = this.F;
        dq0Var.f372654e = this.G;
        dq0Var.f372657h = this.H;
        dq0Var.f372656g = str;
        dq0Var.f372658i = sb6.toString();
        android.content.Context context = view != null ? view.getContext() : com.tencent.mm.sdk.platformtools.x2.f193071a;
        r2Var.C1.E1 = r2Var.E1;
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, r2Var.C1, dq0Var);
        int i18 = r2Var.C1.field_type;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (com.tencent.mars.xlog.Log.isDebug()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        }
        if (this.f100479i) {
            java.util.List list = this.f100480m;
            this.f100480m = this.f100481n;
            this.f100481n = list;
            this.f100479i = false;
        }
        java.util.List list2 = this.f100480m;
        if (list2 != null) {
            list2.size();
        }
        super.notifyDataSetChanged();
    }

    public boolean o() {
        return (this.f100487t.isEmpty() && this.f100488u.isEmpty() && this.f100486s.isEmpty()) ? false : true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        s82.g gVar = (s82.g) view.getTag();
        if (gVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteAdapter", "on item click, holder is null");
            return;
        }
        if (gVar.f404774a == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteAdapter", "on item click, info is null");
            return;
        }
        if (this.f100484q || (this.A && !o72.x1.g0())) {
            if (gVar.f404781h.isChecked() || ((java.util.TreeMap) this.f100485r).size() < 30) {
                gVar.f404781h.setChecked(!r9.isChecked());
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", 30);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.e1.T(context, context.getResources().getString(com.tencent.mm.R.string.cbh, 30));
                return;
            }
        }
        s82.c cVar = (s82.c) this.f100489v.get(gVar.f404774a.field_type);
        if (cVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            o72.r2 r2Var = gVar.f404774a;
            java.lang.String str2 = r2Var.field_id + "_" + (java.lang.System.currentTimeMillis() / 1000);
            java.util.LinkedList linkedList = r2Var.field_tagProto.f385096e;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    sb6.append((java.lang.String) it.next());
                    sb6.append(";");
                }
            }
            r45.dq0 dq0Var = new r45.dq0();
            dq0Var.f372653d = this.F;
            dq0Var.f372654e = this.G;
            android.widget.ListView listView = this.I;
            if (listView != null) {
                dq0Var.f372655f = i17 - listView.getHeaderViewsCount();
            } else {
                dq0Var.f372655f = i17;
            }
            dq0Var.f372657h = this.H;
            dq0Var.f372656g = str2;
            dq0Var.f372658i = sb6.toString();
            dq0Var.f372660n = o() ? 1 : 0;
            int i18 = r2Var.field_type;
            r45.bq0 bq0Var = r2Var.field_favProto;
            dq0Var.f372663q = i18 != 5 ? i18 != 8 ? 0 : 1 : (bq0Var == null || bq0Var.K == null) ? 3 : 2;
            if (o()) {
                dq0Var.f372661o = i17 - this.I.getHeaderViewsCount();
            }
            dq0Var.f372662p = o72.x1.u().indexOf(java.lang.Long.valueOf(r2Var.field_localId)) + 1;
            cVar.f(view, dq0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteAdapter", "[onItemClick] info id = " + r2Var.field_id + ", info type = " + r2Var.field_type);
            if (L && ((str = r2Var.field_xml) == null || com.tencent.mm.sdk.platformtools.t8.K0(str))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteAdapter", "do click retry fav xml");
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                linkedList2.add(java.lang.Integer.valueOf(r2Var.field_id));
                s72.j0 j0Var = (s72.j0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj();
                v65.i.b(j0Var.X6(), null, new s72.e0(linkedList2, j0Var, new com.tencent.mm.plugin.fav.ui.adapter.c$$a(), null), 1, null);
            }
            int i19 = gVar.f404774a.field_type;
        }
        if (o()) {
            android.content.Context context2 = this.I.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.fav.ui.da) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.fav.ui.da.class)).V6(gVar.f404774a);
        }
    }

    public final void p() {
        java.util.List V1;
        long j17 = this.f100473d;
        int i17 = this.f100474e;
        java.util.List list = this.f100482o;
        java.util.Set set = this.f100475f;
        o72.i4 i4Var = this.f100476g;
        com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
        if (com.tencent.mars.xlog.Log.isDebug()) {
            java.util.Objects.toString(list);
            java.util.Objects.toString(set);
            java.util.Objects.toString(i4Var);
        }
        if (((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavApiLogic", "getItemList error, getFavItemInfoStorage null.");
            V1 = null;
        } else {
            V1 = j17 == 0 ? ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().V1(i17, 20, list, set, i4Var) : ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().z4(j17, i17, list, set, i4Var);
        }
        s(V1);
    }

    public int q(long j17, java.lang.String str) {
        boolean z17;
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        if (F == null) {
            return -1;
        }
        java.util.Map map = this.f100485r;
        if (((java.util.TreeMap) map).size() >= 30) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", 30);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.e1.T(context, context.getResources().getString(com.tencent.mm.R.string.cbh, 30));
            return -1;
        }
        int i17 = 0;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            for (o72.r2 r2Var : this.f100480m) {
                if (com.tencent.mm.sdk.platformtools.t8.D0(r2Var.D1, str)) {
                    r2Var.C1 = F;
                    z17 = true;
                    break;
                }
            }
        }
        r2Var = F;
        z17 = false;
        if (z17) {
            ((java.util.TreeMap) map).put(str, r2Var);
        } else {
            ((java.util.TreeMap) map).put(com.tencent.mm.sdk.platformtools.t8.f1(java.lang.Long.valueOf(j17)), r2Var);
        }
        long j18 = r2Var.field_updateTime;
        if (j18 < this.f100473d) {
            this.f100473d = j18;
            c();
            for (o72.r2 r2Var2 : this.f100481n) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    if (r2Var2.field_localId == j17) {
                        notifyDataSetChanged();
                        return i17;
                    }
                } else if (r2Var2.field_localId == j17 && com.tencent.mm.sdk.platformtools.t8.D0(str, r2Var2.D1)) {
                    notifyDataSetChanged();
                    return i17;
                }
                i17++;
            }
            notifyDataSetChanged();
        } else {
            for (o72.r2 r2Var3 : this.f100480m) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    if (r2Var3.field_localId == j17) {
                        notifyDataSetChanged();
                        return i17;
                    }
                } else if (r2Var3.field_localId == j17 && com.tencent.mm.sdk.platformtools.t8.D0(str, r2Var3.D1)) {
                    notifyDataSetChanged();
                    return i17;
                }
                i17++;
            }
        }
        return -1;
    }

    public void r(int i17) {
        int i18 = this.G;
        if (i17 == 0) {
            this.G = 0;
        } else if (i18 == 0) {
            this.G = i17;
        } else if (i18 != i17) {
            this.G = 4;
        }
    }

    public final void s(java.util.List list) {
        if (com.tencent.mars.xlog.Log.isDebug()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
            list.size();
        }
        if (!M) {
            try {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((o72.r2) it.next()).field_type == 34) {
                        it.remove();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteAdapter", e17.getMessage());
            }
        }
        this.f100481n = list;
    }
}
