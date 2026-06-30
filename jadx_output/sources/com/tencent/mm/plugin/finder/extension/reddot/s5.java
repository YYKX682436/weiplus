package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class s5 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Map f105844o = kz5.c1.k(new jz5.l("find_friends_by_finder", "FinderEntrance"), new jz5.l("find_friends_by_finder_live", "FinderLiveEntrance"), new jz5.l("find_friends_by_finder_live_above_look", "FinderLiveEntrance"), new jz5.l("find_friends_by_ting", "Listen.Entrance"), new jz5.l("find_friends_by_ting_play_state", "Listen.Entrance"), new jz5.l("find_friends_by_look", "NewLife.Entrance"), new jz5.l("find_friends_by_search", "Search.Entrance"), new jz5.l("more_tab_game_recommend", "Game.Entrance"));

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f105845a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.wa f105846b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f105847c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f105848d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f105849e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f105850f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f105851g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f105852h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f105853i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.HashSet f105854j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.ref.WeakReference f105855k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f105856l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.AbsListView.OnScrollListener f105857m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f105858n;

    public s5(zy2.fa redDotManager, com.tencent.mm.plugin.finder.extension.reddot.wa waVar) {
        boolean z17;
        boolean z18;
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        this.f105845a = redDotManager;
        this.f105846b = waVar;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        this.f105847c = z18;
        this.f105848d = com.tencent.mm.plugin.finder.storage.aj0.f126440a.u() == 1;
    }

    public static final void a(com.tencent.mm.plugin.finder.extension.reddot.s5 s5Var) {
        java.lang.String str;
        s5Var.getClass();
        java.util.Set keySet = f105844o.keySet();
        java.lang.String str2 = (java.lang.String) kz5.n0.Y(keySet);
        if (str2 == null || (str = (java.lang.String) kz5.n0.j0(keySet)) == null) {
            return;
        }
        java.util.HashSet hashSet = s5Var.f105854j;
        if (hashSet != null && hashSet.contains(str2)) {
            java.util.HashSet hashSet2 = s5Var.f105854j;
            if (hashSet2 != null && hashSet2.contains(str)) {
                java.util.HashSet hashSet3 = s5Var.f105854j;
                if ((hashSet3 != null ? hashSet3.size() : 0) >= com.tencent.mm.plugin.finder.extension.reddot.l5.H.e().size()) {
                    s5Var.f105858n = true;
                }
            }
        }
    }

    public final void b(java.lang.String str) {
        if (f105844o.keySet().contains(str)) {
            java.util.HashSet hashSet = this.f105854j;
            if (hashSet == null) {
                hashSet = new java.util.HashSet();
            }
            this.f105854j = hashSet;
            hashSet.add(str);
        }
    }

    public final void c(com.tencent.mm.ui.base.preference.h0 h0Var) {
        com.tencent.mm.ui.base.preference.h0 h0Var2;
        com.tencent.mm.ui.base.preference.h0 h0Var3;
        if (this.f105856l) {
            return;
        }
        if (h0Var != null) {
            java.lang.ref.WeakReference weakReference = this.f105855k;
            if (!kotlin.jvm.internal.o.b(h0Var, weakReference != null ? (com.tencent.mm.ui.base.preference.h0) weakReference.get() : null)) {
                java.lang.ref.WeakReference weakReference2 = this.f105855k;
                if (weakReference2 != null && (h0Var3 = (com.tencent.mm.ui.base.preference.h0) weakReference2.get()) != null) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.extension.reddot.r5(h0Var3, this));
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach adapter=");
                sb6.append(h0Var);
                sb6.append(",origin=");
                java.lang.ref.WeakReference weakReference3 = this.f105855k;
                sb6.append(weakReference3 != null ? (com.tencent.mm.ui.base.preference.h0) weakReference3.get() : null);
                sb6.append(",origin onScrollListener=");
                sb6.append(this.f105857m);
                sb6.append('!');
                com.tencent.mars.xlog.Log.i("Finder.RedDotFreqCtrlExposeHelper", sb6.toString());
                this.f105857m = null;
                this.f105855k = new java.lang.ref.WeakReference(h0Var);
            }
        }
        java.lang.ref.WeakReference weakReference4 = this.f105855k;
        if (weakReference4 == null || (h0Var2 = (com.tencent.mm.ui.base.preference.h0) weakReference4.get()) == null) {
            return;
        }
        this.f105856l = true;
        this.f105858n = false;
        android.widget.ListView listView = h0Var2.f197819u;
        kotlin.jvm.internal.o.f(listView, "getListView(...)");
        pm0.v.b(listView, new com.tencent.mm.plugin.finder.extension.reddot.q5(h0Var2, this));
        android.widget.AbsListView.OnScrollListener onScrollListener = this.f105857m;
        if (onScrollListener == null) {
            onScrollListener = new com.tencent.mm.plugin.finder.extension.reddot.p5(new java.lang.ref.WeakReference(this));
        }
        this.f105857m = onScrollListener;
        h0Var2.u(onScrollListener);
        h0Var2.c(this.f105857m);
    }

    public final void d() {
        java.util.List list = this.f105850f;
        if (list != null) {
            list.clear();
        }
        java.util.List list2 = this.f105851g;
        if (list2 != null) {
            list2.clear();
        }
        java.util.List list3 = this.f105852h;
        if (list3 != null) {
            list3.clear();
        }
        java.util.List list4 = this.f105853i;
        if (list4 != null) {
            list4.clear();
        }
        java.util.HashSet hashSet = this.f105854j;
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    public final java.util.List e() {
        java.util.LinkedList linkedList;
        java.util.List list = this.f105852h;
        if (list == null) {
            return null;
        }
        synchronized (list) {
            linkedList = new java.util.LinkedList(list);
        }
        return linkedList;
    }

    public final boolean f(java.lang.String str, int i17) {
        java.util.List list;
        com.tencent.mm.plugin.finder.extension.reddot.g4 g4Var = com.tencent.mm.plugin.finder.extension.reddot.l5.H;
        if (g4Var.e().contains(str)) {
            return !com.tencent.mm.plugin.finder.extension.reddot.l5.L.contains(str) || ((list = (java.util.List) g4Var.d().get(str)) != null && list.contains(java.lang.Integer.valueOf(i17)));
        }
        return false;
    }

    public final java.util.List g() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.List[] listArr = new java.util.List[3];
        java.util.List list = this.f105850f;
        java.util.LinkedList linkedList3 = null;
        if (list != null) {
            synchronized (list) {
                linkedList = new java.util.LinkedList(list);
            }
        } else {
            linkedList = null;
        }
        listArr[0] = linkedList;
        java.util.List list2 = this.f105851g;
        if (list2 != null) {
            synchronized (list2) {
                linkedList2 = new java.util.LinkedList(list2);
            }
        } else {
            linkedList2 = null;
        }
        listArr[1] = linkedList2;
        java.util.List list3 = this.f105853i;
        if (list3 != null) {
            synchronized (list3) {
                linkedList3 = new java.util.LinkedList(list3);
            }
        }
        listArr[2] = linkedList3;
        return kz5.d0.r(kz5.z.I(listArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[LOOP:0: B:8:0x0010->B:27:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(r45.rc4 r10) {
        /*
            r9 = this;
            boolean r0 = r9.f105848d
            r1 = 0
            if (r0 == 0) goto L5b
            java.util.List r0 = r9.f105849e
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L58
            monitor-enter(r0)
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L55
        L10:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L55
            r6 = r5
            r45.rc4 r6 = (r45.rc4) r6     // Catch: java.lang.Throwable -> L55
            r7 = 2
            java.lang.String r8 = r6.getString(r7)     // Catch: java.lang.Throwable -> L55
            java.lang.String r7 = r10.getString(r7)     // Catch: java.lang.Throwable -> L55
            boolean r7 = kotlin.jvm.internal.o.b(r8, r7)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L4d
            r7 = 3
            com.tencent.mm.protobuf.f r6 = r6.getCustom(r7)     // Catch: java.lang.Throwable -> L55
            r45.vs2 r6 = (r45.vs2) r6     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L38
            java.lang.String r6 = r6.f388503x     // Catch: java.lang.Throwable -> L55
            goto L39
        L38:
            r6 = r3
        L39:
            com.tencent.mm.protobuf.f r7 = r10.getCustom(r7)     // Catch: java.lang.Throwable -> L55
            r45.vs2 r7 = (r45.vs2) r7     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L44
            java.lang.String r7 = r7.f388503x     // Catch: java.lang.Throwable -> L55
            goto L45
        L44:
            r7 = r3
        L45:
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L4d
            r6 = r2
            goto L4e
        L4d:
            r6 = r1
        L4e:
            if (r6 == 0) goto L10
            r3 = r5
        L51:
            monitor-exit(r0)
            r45.rc4 r3 = (r45.rc4) r3
            goto L58
        L55:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L58:
            if (r3 == 0) goto L5b
            r1 = r2
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.s5.h(r45.rc4):boolean");
    }
}
