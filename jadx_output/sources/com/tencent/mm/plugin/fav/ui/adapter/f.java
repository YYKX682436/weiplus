package com.tencent.mm.plugin.fav.ui.adapter;

/* loaded from: classes11.dex */
public abstract class f extends android.widget.BaseAdapter implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f100497d;

    /* renamed from: e, reason: collision with root package name */
    public final int f100498e = com.tencent.mm.R.color.a0c;

    /* renamed from: f, reason: collision with root package name */
    public final int f100499f = com.tencent.mm.R.drawable.f481484u7;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f100500g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f100501h;

    /* renamed from: i, reason: collision with root package name */
    public w82.m0 f100502i;

    public f(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f100501h = arrayList;
        this.f100497d = context;
        arrayList.clear();
        if (o72.x1.G()) {
            java.util.ArrayList d17 = t72.b.f416040a.d();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteTagPanelAdapter", "[FavoriteTagPanelAdapter()] new tags size = " + d17.size());
            arrayList.addAll(d17);
            jx3.f.INSTANCE.d(29434, 2, 1);
            return;
        }
        java.util.List a17 = new com.tencent.mm.plugin.fav.ui.v6().a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r45.oq0) it.next()).f382438d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteTagPanelAdapter", "[FavoriteTagPanelAdapter()] new tags empty, use old tags, old tags size = " + arrayList2.size());
        this.f100501h.addAll(arrayList2);
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
        ((java.util.HashSet) this.f100500g).remove(str);
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
        return (java.lang.String) ((java.util.ArrayList) this.f100501h).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.fav.ui.adapter.e eVar;
        if (view == null) {
            view = android.view.View.inflate(this.f100497d, com.tencent.mm.R.layout.f488763ac0, null);
            eVar = new com.tencent.mm.plugin.fav.ui.adapter.e();
            com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel = (com.tencent.mm.plugin.fav.ui.widget.FavTagPanel) view.findViewById(com.tencent.mm.R.id.dwm);
            eVar.f100496a = favTagPanel;
            favTagPanel.setCallBack(this);
            eVar.f100496a.setTagNormalBG(this.f100499f);
            eVar.f100496a.setTagNormalTextColorRes(this.f100498e);
            view.setTag(eVar);
        } else {
            eVar = (com.tencent.mm.plugin.fav.ui.adapter.e) view.getTag();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (o72.x1.G()) {
            arrayList.addAll(t72.b.f416040a.d());
        } else {
            java.util.List a17 = new com.tencent.mm.plugin.fav.ui.v6().a();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                arrayList2.add(((r45.oq0) it.next()).f382438d);
            }
            arrayList.addAll(arrayList2);
        }
        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel2 = eVar.f100496a;
        java.util.Set set = this.f100500g;
        favTagPanel2.getClass();
        int i18 = 0;
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavTagPanel", "setTagListByTagInfo,null == tags ?%B,", false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTagPanel", "setTagListByTagInfo,tags.size = %d", java.lang.Integer.valueOf(arrayList.size()));
            favTagPanel2.r(set, arrayList);
        }
        if (this.f100502i != null) {
            final com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel3 = eVar.f100496a;
            final com.tencent.mm.plugin.fav.ui.adapter.d dVar = new com.tencent.mm.plugin.fav.ui.adapter.d(this, eVar);
            while (true) {
                java.util.LinkedList linkedList = favTagPanel3.A;
                if (i18 >= linkedList.size()) {
                    break;
                }
                final db5.b7 b7Var = (db5.b7) linkedList.get(i18);
                b7Var.f228296b.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: w82.g0$$a
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view2) {
                        final w82.m0 m0Var = dVar;
                        int i19 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.Q;
                        final com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel4 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.this;
                        favTagPanel4.getClass();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        final db5.b7 b7Var2 = b7Var;
                        arrayList3.add(b7Var2);
                        arrayList3.add(m0Var);
                        arrayList3.add(view2);
                        java.lang.Object[] array = arrayList3.toArray();
                        arrayList3.clear();
                        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", favTagPanel4, array);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(b7Var2);
                        arrayList4.add(m0Var);
                        arrayList4.add(view2);
                        java.lang.Object[] array2 = arrayList4.toArray();
                        arrayList4.clear();
                        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", favTagPanel4, array2);
                        if (o72.x1.G()) {
                            final t72.a f17 = t72.b.f416040a.f(b7Var2.f228295a);
                            if (f17 == null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FavTagPanel", "favTagInfo == null, return;");
                                yj0.a.i(true, favTagPanel4, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                                yj0.a.i(true, favTagPanel4, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FavTagPanel", "on long click, tag = " + b7Var2.f228295a);
                                final rl5.r rVar = new rl5.r(favTagPanel4.getContext(), b7Var2.f228296b);
                                rVar.C = true;
                                rVar.f397355y = new db5.n4() { // from class: w82.g0$$b
                                    @Override // db5.n4
                                    public final void a(db5.g4 g4Var, android.view.View view3, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
                                        int i27 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.Q;
                                        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel5 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.this;
                                        favTagPanel5.getClass();
                                        g4Var.clear();
                                        g4Var.c(0, 1, 0, favTagPanel5.getContext().getResources().getString(com.tencent.mm.R.string.c9e), com.tencent.mm.R.raw.icons_outlined_quote_pencil);
                                        g4Var.c(0, 2, 0, favTagPanel5.getContext().getResources().getString(com.tencent.mm.R.string.c9d), com.tencent.mm.R.raw.icons_filled_delete);
                                    }
                                };
                                final java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                arrayList5.add(b7Var2.f228295a);
                                rVar.f397354x = new db5.t4() { // from class: w82.g0$$c
                                    @Override // db5.t4
                                    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i27) {
                                        final db5.b7 b7Var3 = b7Var2;
                                        final t72.a aVar = f17;
                                        final w82.m0 m0Var2 = m0Var;
                                        final rl5.r rVar2 = rVar;
                                        java.util.List list = arrayList5;
                                        int i28 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.Q;
                                        final com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel5 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.this;
                                        favTagPanel5.getClass();
                                        int itemId = menuItem.getItemId();
                                        if (itemId != 1) {
                                            if (itemId != 2) {
                                                return;
                                            }
                                            db5.e1.B(favTagPanel5.getContext(), favTagPanel5.getContext().getString(com.tencent.mm.R.string.f490369t2), "", favTagPanel5.getContext().getString(com.tencent.mm.R.string.f490367t0), favTagPanel5.getContext().getString(com.tencent.mm.R.string.baz), new w82.h0(favTagPanel5, list, b7Var3, m0Var2, rVar2), null, com.tencent.mm.R.color.f479482a31);
                                        } else {
                                            com.tencent.mm.plugin.fav.ui.FavChangeTagUI.f100297e.a((com.tencent.mm.ui.MMActivity) favTagPanel5.getContext(), b7Var3.f228295a, new com.tencent.mm.ui.xc() { // from class: w82.g0$$d
                                                @Override // com.tencent.mm.ui.xc
                                                public final void mmOnActivityResult(int i29, int i37, android.content.Intent intent) {
                                                    final db5.b7 b7Var4 = b7Var3;
                                                    final w82.m0 m0Var3 = m0Var2;
                                                    final rl5.r rVar3 = rVar2;
                                                    int i38 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.Q;
                                                    final com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel6 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.this;
                                                    favTagPanel6.getClass();
                                                    if (i37 == -1 && i29 == 52428) {
                                                        final java.lang.String stringExtra = intent.getStringExtra("change_name");
                                                        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                                                            return;
                                                        }
                                                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                                        r45.xo5 xo5Var = new r45.xo5();
                                                        xo5Var.f390296e = stringExtra;
                                                        xo5Var.f390295d = aVar.field_id;
                                                        arrayList6.add(xo5Var);
                                                        o72.z4 uj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
                                                        t72.l lVar = (t72.l) uj6;
                                                        v65.i.b(lVar.Y6(), null, new t72.h(lVar, arrayList6, new yz5.l() { // from class: w82.g0$$e
                                                            @Override // yz5.l
                                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                                final java.lang.String str = stringExtra;
                                                                final db5.b7 b7Var5 = b7Var4;
                                                                final w82.m0 m0Var4 = m0Var3;
                                                                final rl5.r rVar4 = rVar3;
                                                                final java.lang.Boolean bool = (java.lang.Boolean) obj;
                                                                int i39 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.Q;
                                                                final com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel7 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.this;
                                                                favTagPanel7.getClass();
                                                                com.tencent.mars.xlog.Log.i("MicroMsg.FavTagPanel", "edit tag result = " + bool);
                                                                ik1.h0.b(new java.lang.Runnable() { // from class: w82.g0$$f
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        int i47 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.Q;
                                                                        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel8 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.this;
                                                                        favTagPanel8.getClass();
                                                                        if (!bool.booleanValue()) {
                                                                            return;
                                                                        }
                                                                        java.lang.String str2 = str;
                                                                        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                                                            return;
                                                                        }
                                                                        int i48 = 0;
                                                                        while (true) {
                                                                            java.util.LinkedList linkedList2 = favTagPanel8.A;
                                                                            int size = linkedList2.size();
                                                                            db5.b7 b7Var6 = b7Var5;
                                                                            w82.m0 m0Var5 = m0Var4;
                                                                            if (i48 >= size) {
                                                                                b7Var6.f228296b.setText(str2);
                                                                                b7Var6.f228296b.invalidate();
                                                                                m0Var5.a(b7Var6.f228295a, str2);
                                                                                rVar4.a();
                                                                                return;
                                                                            }
                                                                            if (((db5.b7) linkedList2.get(i48)).f228295a.equals(str2)) {
                                                                                com.tencent.mars.xlog.Log.i("MicroMsg.FavTagPanel", "already has change name tag, just remove");
                                                                                favTagPanel8.removeView(b7Var6.f228296b);
                                                                                m0Var5.a(b7Var6.f228295a, str2);
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
                                b7Var2.f228296b.getLocationInWindow(iArr);
                                int i27 = iArr[0];
                                int i28 = iArr[1];
                                int measuredHeight = b7Var2.f228296b.getMeasuredHeight();
                                int measuredWidth = b7Var2.f228296b.getMeasuredWidth();
                                if (measuredHeight == 0 || measuredWidth == 0) {
                                    b7Var2.f228296b.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                    b7Var2.f228296b.getMeasuredHeight();
                                    measuredWidth = b7Var2.f228296b.getMeasuredWidth();
                                }
                                rVar.n((measuredWidth / 2) + i27, i28);
                                yj0.a.i(true, favTagPanel4, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                                yj0.a.i(true, favTagPanel4, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.FavTagPanel", "use new tag ");
                            yj0.a.i(true, favTagPanel4, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                            yj0.a.i(true, favTagPanel4, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
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
        ((java.util.HashSet) this.f100500g).add(str);
        notifyDataSetChanged();
        k(str);
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }

    public abstract void k(java.lang.String str);

    public abstract void l(java.lang.String str);
}
