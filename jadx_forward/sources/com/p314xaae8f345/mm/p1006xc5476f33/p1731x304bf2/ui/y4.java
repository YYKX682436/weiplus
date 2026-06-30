package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public abstract class y4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d {

    /* renamed from: m, reason: collision with root package name */
    public int f223410m;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.Context f223411n;

    /* renamed from: o, reason: collision with root package name */
    public final int f223412o;

    /* renamed from: p, reason: collision with root package name */
    public int f223413p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f223414q;

    /* renamed from: r, reason: collision with root package name */
    public android.util.SparseArray f223415r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s f223416s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w4 f223417t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z f223418u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f223419v;

    public y4(android.content.Context context) {
        super(context);
        this.f223412o = 14;
        this.f223413p = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t4 t4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t4(this);
        this.f223418u = t4Var;
        this.f223419v = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u4(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v4 v4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v4(this);
        this.f223411n = context;
        this.f223414q = new java.util.concurrent.ConcurrentHashMap();
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.f221758b;
        synchronized (set) {
            set.add(t4Var);
        }
        this.f223415r = new android.util.SparseArray();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s(context);
        this.f223416s = sVar;
        sVar.f223278f = v4Var;
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y4 y4Var, java.util.LinkedList linkedList) {
        y4Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) it.next();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = y4Var.f223414q;
            if (!concurrentHashMap.containsKey(bVar.f67370x28d45f97) && bVar.f221738h2 != 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0) concurrentHashMap.get(bVar.f67370x28d45f97);
                if (c0Var == null) {
                    c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0(bVar);
                    concurrentHashMap.put(bVar.f67370x28d45f97, c0Var);
                }
                c0Var.a(y4Var.f223411n);
                c0Var.b();
            }
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) getItem(i17)).f221738h2;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x4 x4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) getItem(i17);
        android.graphics.Bitmap bitmap = null;
        if (view == null) {
            int i18 = bVar.f221738h2;
            view = android.view.View.inflate(this.f223411n, i18 != 0 ? i18 != 1 ? 0 : com.p314xaae8f345.mm.R.C30864xbddafb2a.bdq : this.f223410m, null);
            x4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x4();
            x4Var.f223380a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gnz);
            x4Var.f223381b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.glm);
            x4Var.f223382c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gnr);
            x4Var.f223383d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.k9i);
            x4Var.f223384e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.glt);
            x4Var.f223385f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gjd);
            x4Var.f223386g = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.gkz);
            x4Var.f223387h = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16038x89448319) view.findViewById(com.p314xaae8f345.mm.R.id.f566646gl1);
            x4Var.f223390k = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.gin);
            x4Var.f223388i = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15978x69222ba2) view.findViewById(com.p314xaae8f345.mm.R.id.gov);
            x4Var.f223389j = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.cpm);
            view.setTag(x4Var);
        } else {
            x4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x4) view.getTag();
        }
        int i19 = bVar.f221738h2;
        if (i19 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4 d4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4) this;
            android.content.Context context = d4Var.f223411n;
            x4Var.f223380a.setText(bVar.f221747q2 + "");
            x4Var.f223380a.setVisibility(8);
            java.lang.String str = bVar.f67370x28d45f97;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (!((lt0.f) d4Var.f222887f).k(str) || (bitmap = (android.graphics.Bitmap) ((jt0.i) d4Var.f222887f).get(str)) == null || bitmap.isRecycled())) {
                bitmap = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(str, 1, i65.a.g(d4Var.f222885d));
                if (bitmap != null && !bitmap.isRecycled()) {
                    ((jt0.i) d4Var.f222887f).j(str, bitmap);
                }
            }
            if (bitmap == null || bitmap.isRecycled()) {
                x4Var.f223381b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bij);
            } else {
                x4Var.f223381b.setImageBitmap(bitmap);
            }
            x4Var.f223382c.setText(bVar.f67372x453d1e07);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f221739i2)) {
                x4Var.f223384e.setVisibility(8);
            } else {
                x4Var.f223384e.setVisibility(0);
                x4Var.f223384e.setText(bVar.f221739i2);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f221740j2)) {
                x4Var.f223385f.setVisibility(8);
            } else {
                x4Var.f223385f.setVisibility(0);
                x4Var.f223385f.setText(bVar.f221740j2);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(bVar.f221750t2)) {
                java.lang.String str2 = bVar.f221752v2;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    x4Var.f223383d.setVisibility(8);
                } else {
                    x4Var.f223383d.setVisibility(0);
                    x4Var.f223383d.setText(str2);
                    try {
                        x4Var.f223383d.setBackgroundDrawable(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.f(context, android.graphics.Color.parseColor(bVar.f221753w2), i65.a.b(context, 10)));
                    } catch (java.lang.IllegalArgumentException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLibraryListAdapter", e17.getMessage());
                        x4Var.f223383d.setVisibility(8);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLibraryListAdapter", e18.getMessage());
                        x4Var.f223383d.setVisibility(8);
                    }
                }
            } else {
                x4Var.f223383d.setVisibility(0);
                x4Var.f223383d.setText((java.lang.CharSequence) bVar.f221750t2.get(0));
            }
            x4Var.f223387h.m64852x3abfd950(d4Var.f223412o);
            android.widget.Button button = x4Var.f223386g;
            android.view.View.OnClickListener onClickListener = d4Var.f223419v;
            button.setOnClickListener(onClickListener);
            x4Var.f223387h.setOnClickListener(onClickListener);
            x4Var.f223386g.setTag(bVar);
            x4Var.f223387h.setTag(bVar);
            d4Var.f223416s.b(x4Var.f223387h, x4Var.f223386g, bVar, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0) d4Var.f223414q.get(bVar.f67370x28d45f97));
            x4Var.f223388i.m64769x76491f2c(bVar.f221749s2);
            x4Var.f223389j.removeAllViews();
            android.view.View view2 = (android.view.View) d4Var.f223415r.get(i17);
            if (view2 != null) {
                if (view2.getParent() instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) view2.getParent()).removeAllViews();
                }
                x4Var.f223389j.addView(view2);
            }
        } else if (i19 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4 d4Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d4) this;
            x4Var.f223390k.removeAllViews();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f221742l2)) {
                android.content.Context context2 = d4Var2.f223411n;
                android.view.View inflate = android.view.View.inflate(context2, com.p314xaae8f345.mm.R.C30864xbddafb2a.bgd, null);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gll);
                n11.a b17 = n11.a.b();
                java.lang.String str3 = bVar.f221742l2;
                o11.f fVar = new o11.f();
                fVar.f423612c = true;
                b17.h(str3, imageView, fVar.a());
                x4Var.f223390k.addView(inflate, new android.view.ViewGroup.LayoutParams(-1, i65.a.b(context2, 100)));
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    public void h() {
        java.util.LinkedList linkedList = this.f222886e;
        if (linkedList != null) {
            linkedList.clear();
        }
        kk.j jVar = this.f222887f;
        if (jVar != null) {
            ((lt0.f) jVar).c(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a(this));
        }
        this.f222887f = null;
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        zo3.p.Ri().mo49775xc84af884(this.f222889h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z zVar = this.f223418u;
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.f221758b;
        synchronized (set) {
            set.remove(zVar);
            set.size();
        }
    }

    public void j(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x4 x4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x4) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) this.f222886e.get(i17);
        if (x4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameListAdapter", "holder should not be null, %d", java.lang.Integer.valueOf(i17));
            return;
        }
        this.f223416s.b(x4Var.f223387h, x4Var.f223386g, bVar, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0) this.f223414q.get(bVar.f67370x28d45f97));
    }
}
