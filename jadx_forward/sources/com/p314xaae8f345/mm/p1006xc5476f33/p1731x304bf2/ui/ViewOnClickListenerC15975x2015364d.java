package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameInstalledView */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC15975x2015364d extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: t, reason: collision with root package name */
    public static java.util.Map f222410t = new java.util.HashMap();

    /* renamed from: u, reason: collision with root package name */
    public static int f222411u = 6;

    /* renamed from: v, reason: collision with root package name */
    public static int f222412v = 7;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f222413d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f222414e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f222415f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f222416g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f222417h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f222418i;

    /* renamed from: m, reason: collision with root package name */
    public final android.util.DisplayMetrics f222419m;

    /* renamed from: n, reason: collision with root package name */
    public int f222420n;

    /* renamed from: o, reason: collision with root package name */
    public int f222421o;

    /* renamed from: p, reason: collision with root package name */
    public final int f222422p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f222423q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.LinearLayout.LayoutParams f222424r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z f222425s;

    public ViewOnClickListenerC15975x2015364d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222418i = new java.util.LinkedList();
        this.f222419m = new android.util.DisplayMetrics();
        this.f222420n = 4;
        this.f222421o = 0;
        this.f222422p = 1;
        this.f222424r = new android.widget.LinearLayout.LayoutParams(-1, -2);
        this.f222425s = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.z3(this);
        this.f222417h = context;
    }

    public final void a(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        java.lang.String str = mVar.f319901J;
        java.lang.String str2 = mVar.P;
        java.lang.String str3 = mVar.f67370x28d45f97;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.f221757a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.f221759c.put(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a0(str2, 1002, str3, "", ""));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
        t0Var.f178683a = mVar.f319901J;
        t0Var.f178686d = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(this.f222417h, mVar);
        t0Var.f178689g = mVar.f67370x28d45f97;
        t0Var.f178687e = mVar.P;
        t0Var.f178691i = true;
        t0Var.f178688f = 1;
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
    }

    public void b(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f222423q)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        android.content.Context context = this.f222417h;
        if (z17) {
            this.f222418i = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.h(context);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f222423q) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f222418i)) {
                java.util.Iterator it = this.f222423q.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) it.next();
                    if (this.f222418i.contains(bVar)) {
                        this.f222418i.remove(bVar);
                        this.f222418i.addFirst(bVar);
                    }
                }
            }
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f222418i);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.h(context));
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) it6.next();
                if (!linkedList2.contains(mVar) && !linkedList3.contains(mVar)) {
                    linkedList3.add(mVar);
                }
            }
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar2 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) it7.next();
                if (linkedList2.contains(mVar2)) {
                    linkedList2.remove(mVar2);
                } else {
                    ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                    if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.q(context, mVar2)) {
                        linkedList3.add(mVar2);
                    }
                }
            }
            if (linkedList2.size() > 0) {
                java.util.Iterator it8 = linkedList2.iterator();
                while (it8.hasNext()) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar3 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) it8.next();
                    if (!linkedList.contains(mVar3)) {
                        linkedList.addFirst(mVar3);
                    }
                }
            }
            if (linkedList3.size() > 0) {
                linkedList.removeAll(linkedList3);
            }
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            java.util.Iterator it9 = linkedList.iterator();
            while (it9.hasNext()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar4 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) it9.next();
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str = mVar4.f67370x28d45f97;
                ((kt.c) i0Var).getClass();
                linkedList4.add(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str));
            }
            this.f222418i = linkedList4;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f222418i)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f222413d.removeAllViews();
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        if (this.f222418i.size() >= this.f222420n - 1) {
            f222412v = 7;
            f222411u = 6;
            int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 96);
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            android.util.DisplayMetrics displayMetrics = this.f222419m;
            defaultDisplay.getMetrics(displayMetrics);
            int i17 = displayMetrics.widthPixels;
            int i18 = (int) ((i17 * 160) / displayMetrics.densityDpi);
            int i19 = ((i17 - 1) / d17) + 1;
            this.f222420n = i19;
            if (i19 == 3) {
                f222412v = 3;
            }
            int i27 = f222411u;
            int i28 = (i27 << 1) + 84;
            int i29 = i27 + 6 + f222412v;
            int i37 = (i18 - 16) % i28;
            if (i37 < i29) {
                f222411u = i27 - 2;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, (r1 << 1) + 84);
            } else if (i37 > i28 - i29) {
                f222411u = i27 + ((i37 - (i28 >> 1)) / i19);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, (r1 << 1) + 84);
            }
        }
        android.widget.LinearLayout.LayoutParams layoutParams = this.f222424r;
        layoutParams.setMargins(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, f222411u), 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, f222411u), 0);
        java.util.Iterator it10 = this.f222418i.iterator();
        while (it10.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar5 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) it10.next();
            android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bla, (android.view.ViewGroup) null);
            this.f222414e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.glm);
            this.f222415f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gnr);
            this.f222416g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gou);
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(mVar5.f67370x28d45f97, 1, i65.a.g(context));
            if (Di != null) {
                this.f222414e.setImageBitmap(Di);
            } else {
                this.f222414e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562382bg4);
            }
            this.f222415f.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(context, mVar5));
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.q(context, mVar5)) {
                int j17 = r53.f.j(mVar5.f67386xa1e9e82c);
                if (f222410t.containsKey(mVar5.f67370x28d45f97) && ((java.lang.Integer) f222410t.get(mVar5.f67370x28d45f97)).intValue() > j17) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(mVar5.f67370x28d45f97);
                    this.f222416g.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560728sj));
                    if (q17.f178496f == 1) {
                        this.f222416g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fkc);
                    } else {
                        this.f222416g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fkb);
                    }
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar5.N)) {
                    this.f222416g.setText("");
                } else {
                    this.f222416g.setText(mVar5.N);
                    this.f222416g.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560736sr));
                }
            } else {
                this.f222416g.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560728sj));
                this.f222416g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573751fn5);
            }
            inflate.setTag(mVar5);
            inflate.setOnClickListener(this);
            this.f222413d.addView(inflate, layoutParams);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getTag() instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) view.getTag();
            if (mVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67370x28d45f97)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameInstalledView", "appinfo is null or appid is null");
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            android.content.Context context = this.f222417h;
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.q(context, mVar)) {
                int j17 = r53.f.j(mVar.f67386xa1e9e82c);
                if (!f222410t.containsKey(mVar.f67370x28d45f97) || ((java.lang.Integer) f222410t.get(mVar.f67370x28d45f97)).intValue() <= j17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.j(context, mVar.f67370x28d45f97);
                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(this.f222417h, 10, 1002, this.f222422p, 3, 0, mVar.f67370x28d45f97, this.f222421o, 0, null, null, null);
                    this.f222418i.remove(mVar);
                    this.f222418i.addFirst(mVar);
                } else {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(mVar.f67370x28d45f97);
                    int i17 = q17.f178496f;
                    if (i17 == 1) {
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(q17.f178494d);
                    } else if (i17 != 3) {
                        a(mVar);
                    } else if (!com.p314xaae8f345.mm.vfs.w6.j(q17.f178497g) || r53.f.i(q17.f178497g) <= j17) {
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(q17.f178494d);
                        a(mVar);
                    } else {
                        zb0.y yVar = (zb0.y) i95.n0.c(zb0.y.class);
                        java.lang.String str = q17.f178497g;
                        ((yb0.c) yVar).getClass();
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(context, str, null, false);
                    }
                }
                b(false);
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(mVar.f67370x28d45f97);
            if (q18 != null && q18.f178496f == 3) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q18.f178497g) || !com.p314xaae8f345.mm.vfs.w6.j(q18.f178497g)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameInstalledView", "file status is success, while the download file not exsit:[%s]", q18.f178497g);
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(q18.f178494d);
                    b(false);
                } else {
                    zb0.y yVar2 = (zb0.y) i95.n0.c(zb0.y.class);
                    java.lang.String str2 = q18.f178497g;
                    ((yb0.c) yVar2).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(context, str2, null, false);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameInstalledView", "app not installed or download sucess : [%s]", mVar.f67372x453d1e07);
            b(false);
        } else {
            view.getTag();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameInstalledView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222413d = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f566656gm5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z zVar = this.f222425s;
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b0.f221758b;
        synchronized (set) {
            set.add(zVar);
        }
    }

    /* renamed from: setInstalledGameInfo */
    public void m64763x3c5df118(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b> linkedList) {
        this.f222423q = linkedList;
    }

    /* renamed from: setMoreGameInfo */
    public void m64764x4f1ee3b7(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a4 a4Var) {
    }

    /* renamed from: setSourceScene */
    public void m64765x6a7f536f(int i17) {
        this.f222421o = i17;
    }

    /* renamed from: setVersionCodes */
    public void m64766x8f92d7b0(java.util.Map<java.lang.String, java.lang.Integer> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        f222410t = map;
    }
}
