package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class j1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f171632e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f171633f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f171634g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f171635h;

    /* renamed from: i, reason: collision with root package name */
    public final int f171636i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v6 f171637m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.i1 f171638n;

    public j1(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, android.view.ViewGroup viewGroup, boolean z17, boolean z18) {
        super(activityC1102x9ee2d9f, viewGroup);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.i1 i1Var;
        this.f171633f = new java.util.LinkedList();
        this.f171636i = 2;
        if (activityC1102x9ee2d9f == null || viewGroup == null) {
            throw new java.lang.IllegalStateException("Unexpected parameters");
        }
        this.f171638n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.i1(this, activityC1102x9ee2d9f, null);
        this.f171635h = z18;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        this.f171634g = linearLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.e(activityC1102x9ee2d9f, linearLayout);
        eVar.f171575d = this;
        arrayList.add(eVar);
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandLauncherRecentsListHeaderController", "isTeenMode: %s", java.lang.Boolean.valueOf(mo168058x74219ae7));
        if (!mo168058x74219ae7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.l1 l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.l1(activityC1102x9ee2d9f, linearLayout);
            l1Var.f171575d = this;
            arrayList.add(l1Var);
        }
        java.lang.Integer num = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x2.f158178d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.d(activityC1102x9ee2d9f, linearLayout);
        dVar.f171575d = this;
        arrayList.add(dVar);
        this.f171632e = arrayList;
        if (arrayList.size() != 0) {
            int i17 = 0;
            while (true) {
                int size = arrayList.size();
                boolean z19 = this.f171635h;
                i1Var = this.f171638n;
                if (i17 >= size) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) arrayList.get(i17);
                linearLayout.addView(cVar.c());
                if (i17 == this.f171636i && arrayList.size() > 3) {
                    linearLayout.addView(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.h1(linearLayout.getContext()), -1, i1Var.f171627c);
                } else if (i17 != arrayList.size() - 1) {
                    if (i17 != 0) {
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c cVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) arrayList.get(i17 + 1);
                    java.lang.Class<?> cls = cVar.getClass();
                    java.util.LinkedList linkedList = (java.util.LinkedList) this.f171633f;
                    if (linkedList.contains(cls) || linkedList.contains(cVar2.getClass())) {
                        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
                        linearLayout2.setOrientation(1);
                        m(linearLayout2);
                        linearLayout.addView(linearLayout2, -1, -2);
                    } else if (z19) {
                        int dimensionPixelOffset = linearLayout.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561619nt);
                        int dimensionPixelOffset2 = linearLayout.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561617no);
                        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(linearLayout.getContext());
                        linearLayout3.setOrientation(0);
                        linearLayout.addView(linearLayout3, -1, -2);
                        android.content.Context context = linearLayout.getContext();
                        android.view.View view = new android.view.View(context);
                        view.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
                        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset);
                        layoutParams.gravity = 3;
                        linearLayout3.addView(view, layoutParams);
                        android.view.View view2 = new android.view.View(context);
                        view2.setBackgroundColor(linearLayout.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560199dj));
                        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, dimensionPixelOffset, 1.0f);
                        layoutParams2.gravity = 17;
                        linearLayout3.addView(view2, layoutParams2);
                        android.view.View view3 = new android.view.View(context);
                        view3.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
                        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset);
                        layoutParams3.gravity = 5;
                        linearLayout3.addView(view3, layoutParams3);
                    } else {
                        android.content.Context context2 = linearLayout.getContext();
                        android.view.View view4 = new android.view.View(context2);
                        android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(context2);
                        linearLayout4.setPadding(i1Var.f171626b, 0, 0, 0);
                        linearLayout4.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
                        int i18 = i1Var.f171625a;
                        linearLayout4.addView(view4, new android.widget.LinearLayout.LayoutParams(-1, i18));
                        view4.setBackgroundColor(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
                        new android.widget.LinearLayout.LayoutParams(i1Var.f171626b, i18).gravity = 3;
                        linearLayout.addView(linearLayout4, new android.widget.LinearLayout.LayoutParams(-1, -2));
                    }
                }
                i17++;
            }
            android.content.Context context3 = linearLayout.getContext();
            new android.graphics.drawable.ColorDrawable(i1Var.f171628d);
            android.view.View imageView = new android.widget.ImageView(context3);
            imageView.setBackgroundColor(0);
            linearLayout.addView(imageView, 0, new android.widget.LinearLayout.LayoutParams(-1, i1Var.f171629e));
            m(linearLayout);
        }
        java.util.List list = this.f171632e;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) it.next()).l(false);
            }
        }
        i(0);
        this.f171637m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v6();
        java.util.Iterator it6 = ((java.util.ArrayList) this.f171632e).iterator();
        while (it6.hasNext()) {
            java.lang.Object obj = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) it6.next();
            if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v6 v6Var = this.f171637m;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r6 receiver = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r6) obj;
                v6Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
                synchronized (v6Var.f158135a) {
                    java.util.List list2 = (java.util.List) ((java.util.LinkedHashMap) v6Var.f158135a).get(receiver.b());
                    if (list2 == null) {
                        list2 = new java.util.ArrayList();
                        v6Var.f158135a.put(receiver.b(), list2);
                    }
                    list2.add(receiver);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v6 v6Var2 = this.f171637m;
        v6Var2.getClass();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3752;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/getwxadesktopentrance";
        r45.us3 us3Var = new r45.us3();
        us3Var.f469144d = 0.0d;
        us3Var.f469145e = 0.0d;
        lVar.f152197a = us3Var;
        lVar.f152198b = new r45.vs3();
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.u6(v6Var2), true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public android.view.View c() {
        return this.f171634g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void e() {
        java.util.Iterator it = ((java.util.ArrayList) this.f171632e).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) it.next()).e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void f() {
        java.util.List list = this.f171632e;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) it.next()).f();
        }
        ((java.util.ArrayList) list).clear();
        ((java.util.LinkedHashMap) this.f171637m.f158135a).clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void g() {
        java.util.Iterator it = ((java.util.ArrayList) this.f171632e).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) it.next()).g();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void h() {
        java.util.Iterator it = ((java.util.ArrayList) this.f171632e).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) it.next()).h();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void i(int i17) {
        java.util.Iterator it = this.f171632e.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) it.next()).i(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void k(int i17) {
        n();
    }

    public final void m(android.view.ViewGroup viewGroup) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(viewGroup.getContext());
        android.content.Context context = frameLayout.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.i1 i1Var = this.f171638n;
        new android.graphics.drawable.ColorDrawable(i1Var.f171628d);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        boolean z17 = this.f171635h;
        imageView.setBackgroundColor(0);
        int i17 = i1Var.f171629e;
        frameLayout.addView(imageView, -1, i17);
        frameLayout.addView(new android.view.View(context), -1, i1Var.f171627c);
        android.widget.ImageView imageView2 = new android.widget.ImageView(context);
        imageView2.setBackgroundColor(0);
        frameLayout.addView(imageView2, -1, i17);
        frameLayout.setId(com.p314xaae8f345.mm.R.id.f564696ya);
        viewGroup.addView(frameLayout, -1, -2);
    }

    public void n() {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c> list = this.f171632e;
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        int i18 = 0;
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c) it.next()).d()) {
                i18++;
            }
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c cVar : list) {
            if (cVar.d()) {
                if (i17 == 0) {
                    cVar.k(com.p314xaae8f345.mm.R.C30861xcebc809e.f562353di);
                } else if (i17 == list.size() - 1 || i17 == i18 - 1) {
                    cVar.k(com.p314xaae8f345.mm.R.C30861xcebc809e.f562351dg);
                } else {
                    cVar.k(com.p314xaae8f345.mm.R.C30861xcebc809e.f562352dh);
                }
                i17++;
            }
        }
    }
}
