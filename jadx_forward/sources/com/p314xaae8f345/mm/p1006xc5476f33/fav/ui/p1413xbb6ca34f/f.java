package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f;

/* loaded from: classes11.dex */
public abstract class f extends android.widget.BaseAdapter implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f182030d;

    /* renamed from: e, reason: collision with root package name */
    public final int f182031e = com.p314xaae8f345.mm.R.C30859x5a72f63.a0c;

    /* renamed from: f, reason: collision with root package name */
    public final int f182032f = com.p314xaae8f345.mm.R.C30861xcebc809e.f563017u7;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f182033g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f182034h;

    /* renamed from: i, reason: collision with root package name */
    public w82.m0 f182035i;

    public f(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f182034h = arrayList;
        this.f182030d = context;
        arrayList.clear();
        if (o72.x1.G()) {
            java.util.ArrayList d17 = t72.b.f497573a.d();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteTagPanelAdapter", "[FavoriteTagPanelAdapter()] new tags size = " + d17.size());
            arrayList.addAll(d17);
            jx3.f.INSTANCE.d(29434, 2, 1);
            return;
        }
        java.util.List a17 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v6().a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r45.oq0) it.next()).f463971d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteTagPanelAdapter", "[FavoriteTagPanelAdapter()] new tags empty, use old tags, old tags size = " + arrayList2.size());
        this.f182034h.addAll(arrayList2);
        jx3.f.INSTANCE.d(29434, 2, 0);
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
    }

    @Override // db5.t6
    public final void f(java.lang.String str) {
        ((java.util.HashSet) this.f182033g).remove(str);
        notifyDataSetChanged();
        l(str);
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) ((java.util.ArrayList) this.f182034h).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.e eVar;
        if (view == null) {
            view = android.view.View.inflate(this.f182030d, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570296ac0, null);
            eVar = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.e();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a5 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5) view.findViewById(com.p314xaae8f345.mm.R.id.dwm);
            eVar.f182029a = c13623x735f56a5;
            c13623x735f56a5.m79124x6c4032e7(this);
            eVar.f182029a.m79138x7e5ecb64(this.f182032f);
            eVar.f182029a.m79139xb10bdb09(this.f182031e);
            view.setTag(eVar);
        } else {
            eVar = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.e) view.getTag();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (o72.x1.G()) {
            arrayList.addAll(t72.b.f497573a.d());
        } else {
            java.util.List a17 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v6().a();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                arrayList2.add(((r45.oq0) it.next()).f463971d);
            }
            arrayList.addAll(arrayList2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a52 = eVar.f182029a;
        java.util.Set set = this.f182033g;
        c13623x735f56a52.getClass();
        int i18 = 0;
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavTagPanel", "setTagListByTagInfo,null == tags ?%B,", false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagPanel", "setTagListByTagInfo,tags.size = %d", java.lang.Integer.valueOf(arrayList.size()));
            c13623x735f56a52.r(set, arrayList);
        }
        if (this.f182035i != null) {
            final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a53 = eVar.f182029a;
            final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.d(this, eVar);
            while (true) {
                java.util.LinkedList linkedList = c13623x735f56a53.A;
                if (i18 >= linkedList.size()) {
                    break;
                }
                final db5.b7 b7Var = (db5.b7) linkedList.get(i18);
                b7Var.f309829b.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: w82.g0$$a
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view2) {
                        final w82.m0 m0Var = dVar;
                        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.Q;
                        final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a54 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.this;
                        c13623x735f56a54.getClass();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        final db5.b7 b7Var2 = b7Var;
                        arrayList3.add(b7Var2);
                        arrayList3.add(m0Var);
                        arrayList3.add(view2);
                        java.lang.Object[] array = arrayList3.toArray();
                        arrayList3.clear();
                        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", c13623x735f56a54, array);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(b7Var2);
                        arrayList4.add(m0Var);
                        arrayList4.add(view2);
                        java.lang.Object[] array2 = arrayList4.toArray();
                        arrayList4.clear();
                        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", c13623x735f56a54, array2);
                        if (o72.x1.G()) {
                            final t72.a f17 = t72.b.f497573a.f(b7Var2.f309828a);
                            if (f17 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagPanel", "favTagInfo == null, return;");
                                yj0.a.i(true, c13623x735f56a54, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                                yj0.a.i(true, c13623x735f56a54, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagPanel", "on long click, tag = " + b7Var2.f309828a);
                                final rl5.r rVar = new rl5.r(c13623x735f56a54.getContext(), b7Var2.f309829b);
                                rVar.C = true;
                                rVar.f478888y = new db5.n4() { // from class: w82.g0$$b
                                    @Override // db5.n4
                                    public final void a(db5.g4 g4Var, android.view.View view3, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
                                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.Q;
                                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a55 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.this;
                                        c13623x735f56a55.getClass();
                                        g4Var.clear();
                                        g4Var.c(0, 1, 0, c13623x735f56a55.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9e), com.p314xaae8f345.mm.R.raw.f80280xa6f7c588);
                                        g4Var.c(0, 2, 0, c13623x735f56a55.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9d), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
                                    }
                                };
                                final java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                arrayList5.add(b7Var2.f309828a);
                                rVar.f478887x = new db5.t4() { // from class: w82.g0$$c
                                    @Override // db5.t4
                                    /* renamed from: onMMMenuItemSelected */
                                    public final void mo888x34063ac(android.view.MenuItem menuItem, int i27) {
                                        final db5.b7 b7Var3 = b7Var2;
                                        final t72.a aVar = f17;
                                        final w82.m0 m0Var2 = m0Var;
                                        final rl5.r rVar2 = rVar;
                                        java.util.List list = arrayList5;
                                        int i28 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.Q;
                                        final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a55 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.this;
                                        c13623x735f56a55.getClass();
                                        int itemId = menuItem.getItemId();
                                        if (itemId != 1) {
                                            if (itemId != 2) {
                                                return;
                                            }
                                            db5.e1.B(c13623x735f56a55.getContext(), c13623x735f56a55.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2), "", c13623x735f56a55.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), c13623x735f56a55.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), new w82.h0(c13623x735f56a55, list, b7Var3, m0Var2, rVar2), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31);
                                        } else {
                                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13561xae558fe3.f181830e.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) c13623x735f56a55.getContext(), b7Var3.f309828a, new com.p314xaae8f345.mm.ui.xc() { // from class: w82.g0$$d
                                                @Override // com.p314xaae8f345.mm.ui.xc
                                                /* renamed from: mmOnActivityResult */
                                                public final void mo9729x757c998b(int i29, int i37, android.content.Intent intent) {
                                                    final db5.b7 b7Var4 = b7Var3;
                                                    final w82.m0 m0Var3 = m0Var2;
                                                    final rl5.r rVar3 = rVar2;
                                                    int i38 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.Q;
                                                    final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a56 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.this;
                                                    c13623x735f56a56.getClass();
                                                    if (i37 == -1 && i29 == 52428) {
                                                        final java.lang.String stringExtra = intent.getStringExtra("change_name");
                                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                                                            return;
                                                        }
                                                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                                        r45.xo5 xo5Var = new r45.xo5();
                                                        xo5Var.f471829e = stringExtra;
                                                        xo5Var.f471828d = aVar.f68043xc8a07680;
                                                        arrayList6.add(xo5Var);
                                                        o72.z4 uj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
                                                        t72.l lVar = (t72.l) uj6;
                                                        v65.i.b(lVar.Y6(), null, new t72.h(lVar, arrayList6, new yz5.l() { // from class: w82.g0$$e
                                                            @Override // yz5.l
                                                            /* renamed from: invoke */
                                                            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                                                                final java.lang.String str = stringExtra;
                                                                final db5.b7 b7Var5 = b7Var4;
                                                                final w82.m0 m0Var4 = m0Var3;
                                                                final rl5.r rVar4 = rVar3;
                                                                final java.lang.Boolean bool = (java.lang.Boolean) obj;
                                                                int i39 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.Q;
                                                                final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a57 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.this;
                                                                c13623x735f56a57.getClass();
                                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagPanel", "edit tag result = " + bool);
                                                                ik1.h0.b(new java.lang.Runnable() { // from class: w82.g0$$f
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        int i47 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.Q;
                                                                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a58 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5.this;
                                                                        c13623x735f56a58.getClass();
                                                                        if (!bool.booleanValue()) {
                                                                            return;
                                                                        }
                                                                        java.lang.String str2 = str;
                                                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                                                            return;
                                                                        }
                                                                        int i48 = 0;
                                                                        while (true) {
                                                                            java.util.LinkedList linkedList2 = c13623x735f56a58.A;
                                                                            int size = linkedList2.size();
                                                                            db5.b7 b7Var6 = b7Var5;
                                                                            w82.m0 m0Var5 = m0Var4;
                                                                            if (i48 >= size) {
                                                                                b7Var6.f309829b.setText(str2);
                                                                                b7Var6.f309829b.invalidate();
                                                                                m0Var5.a(b7Var6.f309828a, str2);
                                                                                rVar4.a();
                                                                                return;
                                                                            }
                                                                            if (((db5.b7) linkedList2.get(i48)).f309828a.equals(str2)) {
                                                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagPanel", "already has change name tag, just remove");
                                                                                c13623x735f56a58.removeView(b7Var6.f309829b);
                                                                                m0Var5.a(b7Var6.f309828a, str2);
                                                                                return;
                                                                            }
                                                                            i48++;
                                                                        }
                                                                    }
                                                                });
                                                                return null;
                                                            }
                                                        }, null), 1, null);
                                                        jx3.f.INSTANCE.d(29434, 5);
                                                    }
                                                }
                                            });
                                        }
                                    }
                                };
                                int[] iArr = new int[2];
                                b7Var2.f309829b.getLocationInWindow(iArr);
                                int i27 = iArr[0];
                                int i28 = iArr[1];
                                int measuredHeight = b7Var2.f309829b.getMeasuredHeight();
                                int measuredWidth = b7Var2.f309829b.getMeasuredWidth();
                                if (measuredHeight == 0 || measuredWidth == 0) {
                                    b7Var2.f309829b.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                    b7Var2.f309829b.getMeasuredHeight();
                                    measuredWidth = b7Var2.f309829b.getMeasuredWidth();
                                }
                                rVar.n((measuredWidth / 2) + i27, i28);
                                yj0.a.i(true, c13623x735f56a54, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                                yj0.a.i(true, c13623x735f56a54, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavTagPanel", "use new tag ");
                            yj0.a.i(true, c13623x735f56a54, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                            yj0.a.i(true, c13623x735f56a54, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                        }
                        return true;
                    }
                });
                i18++;
            }
        }
        return view;
    }

    @Override // db5.t6
    public final void h(java.lang.String str) {
        ((java.util.HashSet) this.f182033g).add(str);
        notifyDataSetChanged();
        k(str);
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }

    public abstract void k(java.lang.String str);

    public abstract void l(java.lang.String str);
}
