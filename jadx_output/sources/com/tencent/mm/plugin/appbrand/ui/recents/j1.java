package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class j1 extends com.tencent.mm.plugin.appbrand.ui.recents.c implements com.tencent.mm.plugin.appbrand.ui.recents.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f90099e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f90100f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f90101g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f90102h;

    /* renamed from: i, reason: collision with root package name */
    public final int f90103i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appusage.v6 f90104m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.recents.i1 f90105n;

    public j1(androidx.fragment.app.FragmentActivity fragmentActivity, android.view.ViewGroup viewGroup, boolean z17, boolean z18) {
        super(fragmentActivity, viewGroup);
        com.tencent.mm.plugin.appbrand.ui.recents.i1 i1Var;
        this.f90100f = new java.util.LinkedList();
        this.f90103i = 2;
        if (fragmentActivity == null || viewGroup == null) {
            throw new java.lang.IllegalStateException("Unexpected parameters");
        }
        this.f90105n = new com.tencent.mm.plugin.appbrand.ui.recents.i1(this, fragmentActivity, null);
        this.f90102h = z18;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        this.f90101g = linearLayout;
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        com.tencent.mm.plugin.appbrand.ui.recents.e eVar = new com.tencent.mm.plugin.appbrand.ui.recents.e(fragmentActivity, linearLayout);
        eVar.f90042d = this;
        arrayList.add(eVar);
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.mars.xlog.Log.i("AppBrandLauncherRecentsListHeaderController", "isTeenMode: %s", java.lang.Boolean.valueOf(isTeenMode));
        if (!isTeenMode) {
            com.tencent.mm.plugin.appbrand.ui.recents.l1 l1Var = new com.tencent.mm.plugin.appbrand.ui.recents.l1(fragmentActivity, linearLayout);
            l1Var.f90042d = this;
            arrayList.add(l1Var);
        }
        java.lang.Integer num = com.tencent.mm.plugin.appbrand.appusage.x2.f76645d;
        com.tencent.mm.plugin.appbrand.ui.recents.d dVar = new com.tencent.mm.plugin.appbrand.ui.recents.d(fragmentActivity, linearLayout);
        dVar.f90042d = this;
        arrayList.add(dVar);
        this.f90099e = arrayList;
        if (arrayList.size() != 0) {
            int i17 = 0;
            while (true) {
                int size = arrayList.size();
                boolean z19 = this.f90102h;
                i1Var = this.f90105n;
                if (i17 >= size) {
                    break;
                }
                com.tencent.mm.plugin.appbrand.ui.recents.c cVar = (com.tencent.mm.plugin.appbrand.ui.recents.c) arrayList.get(i17);
                linearLayout.addView(cVar.c());
                if (i17 == this.f90103i && arrayList.size() > 3) {
                    linearLayout.addView(new com.tencent.mm.plugin.appbrand.ui.recents.h1(linearLayout.getContext()), -1, i1Var.f90094c);
                } else if (i17 != arrayList.size() - 1) {
                    if (i17 != 0) {
                    }
                    com.tencent.mm.plugin.appbrand.ui.recents.c cVar2 = (com.tencent.mm.plugin.appbrand.ui.recents.c) arrayList.get(i17 + 1);
                    java.lang.Class<?> cls = cVar.getClass();
                    java.util.LinkedList linkedList = (java.util.LinkedList) this.f90100f;
                    if (linkedList.contains(cls) || linkedList.contains(cVar2.getClass())) {
                        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
                        linearLayout2.setOrientation(1);
                        m(linearLayout2);
                        linearLayout.addView(linearLayout2, -1, -2);
                    } else if (z19) {
                        int dimensionPixelOffset = linearLayout.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480086nt);
                        int dimensionPixelOffset2 = linearLayout.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480084no);
                        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(linearLayout.getContext());
                        linearLayout3.setOrientation(0);
                        linearLayout.addView(linearLayout3, -1, -2);
                        android.content.Context context = linearLayout.getContext();
                        android.view.View view = new android.view.View(context);
                        view.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478491c));
                        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset);
                        layoutParams.gravity = 3;
                        linearLayout3.addView(view, layoutParams);
                        android.view.View view2 = new android.view.View(context);
                        view2.setBackgroundColor(linearLayout.getResources().getColor(com.tencent.mm.R.color.f478666dj));
                        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, dimensionPixelOffset, 1.0f);
                        layoutParams2.gravity = 17;
                        linearLayout3.addView(view2, layoutParams2);
                        android.view.View view3 = new android.view.View(context);
                        view3.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478491c));
                        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset);
                        layoutParams3.gravity = 5;
                        linearLayout3.addView(view3, layoutParams3);
                    } else {
                        android.content.Context context2 = linearLayout.getContext();
                        android.view.View view4 = new android.view.View(context2);
                        android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(context2);
                        linearLayout4.setPadding(i1Var.f90093b, 0, 0, 0);
                        linearLayout4.setBackgroundResource(com.tencent.mm.R.color.f478491c);
                        int i18 = i1Var.f90092a;
                        linearLayout4.addView(view4, new android.widget.LinearLayout.LayoutParams(-1, i18));
                        view4.setBackgroundColor(context2.getResources().getColor(com.tencent.mm.R.color.FG_3));
                        new android.widget.LinearLayout.LayoutParams(i1Var.f90093b, i18).gravity = 3;
                        linearLayout.addView(linearLayout4, new android.widget.LinearLayout.LayoutParams(-1, -2));
                    }
                }
                i17++;
            }
            android.content.Context context3 = linearLayout.getContext();
            new android.graphics.drawable.ColorDrawable(i1Var.f90095d);
            android.view.View imageView = new android.widget.ImageView(context3);
            imageView.setBackgroundColor(0);
            linearLayout.addView(imageView, 0, new android.widget.LinearLayout.LayoutParams(-1, i1Var.f90096e));
            m(linearLayout);
        }
        java.util.List list = this.f90099e;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.ui.recents.c) it.next()).l(false);
            }
        }
        i(0);
        this.f90104m = new com.tencent.mm.plugin.appbrand.appusage.v6();
        java.util.Iterator it6 = ((java.util.ArrayList) this.f90099e).iterator();
        while (it6.hasNext()) {
            java.lang.Object obj = (com.tencent.mm.plugin.appbrand.ui.recents.c) it6.next();
            if (obj instanceof com.tencent.mm.plugin.appbrand.appusage.r6) {
                com.tencent.mm.plugin.appbrand.appusage.v6 v6Var = this.f90104m;
                com.tencent.mm.plugin.appbrand.appusage.r6 receiver = (com.tencent.mm.plugin.appbrand.appusage.r6) obj;
                v6Var.getClass();
                kotlin.jvm.internal.o.g(receiver, "receiver");
                synchronized (v6Var.f76602a) {
                    java.util.List list2 = (java.util.List) ((java.util.LinkedHashMap) v6Var.f76602a).get(receiver.b());
                    if (list2 == null) {
                        list2 = new java.util.ArrayList();
                        v6Var.f76602a.put(receiver.b(), list2);
                    }
                    list2.add(receiver);
                }
            }
        }
        com.tencent.mm.plugin.appbrand.appusage.v6 v6Var2 = this.f90104m;
        v6Var2.getClass();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3752;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/getwxadesktopentrance";
        r45.us3 us3Var = new r45.us3();
        us3Var.f387611d = 0.0d;
        us3Var.f387612e = 0.0d;
        lVar.f70664a = us3Var;
        lVar.f70665b = new r45.vs3();
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.appbrand.appusage.u6(v6Var2), true);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public android.view.View c() {
        return this.f90101g;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void e() {
        java.util.Iterator it = ((java.util.ArrayList) this.f90099e).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.ui.recents.c) it.next()).e();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void f() {
        java.util.List list = this.f90099e;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.ui.recents.c) it.next()).f();
        }
        ((java.util.ArrayList) list).clear();
        ((java.util.LinkedHashMap) this.f90104m.f76602a).clear();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void g() {
        java.util.Iterator it = ((java.util.ArrayList) this.f90099e).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.ui.recents.c) it.next()).g();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void h() {
        java.util.Iterator it = ((java.util.ArrayList) this.f90099e).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.ui.recents.c) it.next()).h();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void i(int i17) {
        java.util.Iterator it = this.f90099e.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.ui.recents.c) it.next()).i(i17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void k(int i17) {
        n();
    }

    public final void m(android.view.ViewGroup viewGroup) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(viewGroup.getContext());
        android.content.Context context = frameLayout.getContext();
        com.tencent.mm.plugin.appbrand.ui.recents.i1 i1Var = this.f90105n;
        new android.graphics.drawable.ColorDrawable(i1Var.f90095d);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        boolean z17 = this.f90102h;
        imageView.setBackgroundColor(0);
        int i17 = i1Var.f90096e;
        frameLayout.addView(imageView, -1, i17);
        frameLayout.addView(new android.view.View(context), -1, i1Var.f90094c);
        android.widget.ImageView imageView2 = new android.widget.ImageView(context);
        imageView2.setBackgroundColor(0);
        frameLayout.addView(imageView2, -1, i17);
        frameLayout.setId(com.tencent.mm.R.id.f483163ya);
        viewGroup.addView(frameLayout, -1, -2);
    }

    public void n() {
        java.util.List<com.tencent.mm.plugin.appbrand.ui.recents.c> list = this.f90099e;
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        int i18 = 0;
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.appbrand.ui.recents.c) it.next()).d()) {
                i18++;
            }
        }
        for (com.tencent.mm.plugin.appbrand.ui.recents.c cVar : list) {
            if (cVar.d()) {
                if (i17 == 0) {
                    cVar.k(com.tencent.mm.R.drawable.f480820di);
                } else if (i17 == list.size() - 1 || i17 == i18 - 1) {
                    cVar.k(com.tencent.mm.R.drawable.f480818dg);
                } else {
                    cVar.k(com.tencent.mm.R.drawable.f480819dh);
                }
                i17++;
            }
        }
    }
}
