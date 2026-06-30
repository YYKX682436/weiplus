package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class s6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f292253d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f292254e;

    /* renamed from: f, reason: collision with root package name */
    public db5.o4 f292255f;

    /* renamed from: g, reason: collision with root package name */
    public db5.t4 f292256g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 f292257h;

    /* renamed from: i, reason: collision with root package name */
    public db5.g4 f292258i;

    /* renamed from: m, reason: collision with root package name */
    public final db5.g4 f292259m;

    /* renamed from: n, reason: collision with root package name */
    public db5.l4 f292260n;

    public s6(android.content.Context context) {
        this.f292253d = context;
        android.view.LayoutInflater.from(context);
        this.f292254e = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        this.f292258i = new db5.g4(context);
        this.f292259m = new db5.g4(context);
    }

    public void a(android.view.View view, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 c1Var) {
        android.content.Context context = this.f292253d;
        if ((context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) && ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).m78736x71eabced()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "is swiping, PASS openContextMenu");
            return;
        }
        this.f292257h = c1Var;
        this.f292256g = t4Var;
        db5.g4 g4Var = this.f292259m;
        g4Var.clear();
        onCreateContextMenuListener.onCreateContextMenu(g4Var, view, null);
        this.f292255f = new com.p314xaae8f345.mm.ui.p2740x696c9db.r6(this);
        this.f292254e.V1 = true;
        d();
    }

    public void b(android.view.View view, int i17, long j17, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var) {
        android.content.Context context = this.f292253d;
        if ((context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) && ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).m78736x71eabced()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "is swiping, PASS openContextMenuForAdapterView");
            return;
        }
        this.f292256g = t4Var;
        db5.g4 g4Var = this.f292259m;
        g4Var.clear();
        android.view.ContextMenu.ContextMenuInfo adapterContextMenuInfo = new android.widget.AdapterView.AdapterContextMenuInfo(view, i17, j17);
        onCreateContextMenuListener.onCreateContextMenu(g4Var, view, adapterContextMenuInfo);
        java.util.Iterator it = ((java.util.ArrayList) g4Var.f309877d).iterator();
        while (it.hasNext()) {
            ((db5.h4) ((android.view.MenuItem) it.next())).f309914y = adapterContextMenuInfo;
        }
        this.f292255f = new com.p314xaae8f345.mm.ui.p2740x696c9db.q6(this);
        this.f292254e.V1 = true;
        d();
    }

    public void c(android.view.View view, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener, db5.t4 t4Var) {
        this.f292256g = t4Var;
        if (view instanceof android.widget.AbsListView) {
            ((android.widget.AbsListView) view).setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.l6(this, onCreateContextMenuListener));
        } else if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) {
            view.setOnLongClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.n6(this, onCreateContextMenuListener));
        } else {
            view.setOnLongClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.p6(this, onCreateContextMenuListener));
        }
    }

    public android.app.Dialog d() {
        if (this.f292255f != null) {
            this.f292258i.clear();
            db5.g4 g4Var = new db5.g4(this.f292253d);
            this.f292258i = g4Var;
            this.f292255f.mo887xc459429a(g4Var);
        }
        if (this.f292258i.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f292254e;
        k0Var.f293405n = this.f292255f;
        k0Var.f293414s = this.f292256g;
        k0Var.f293387d = this.f292257h;
        k0Var.G = this.f292260n;
        k0Var.v();
        return null;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/MMListMenuHelper", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) this.f292258i.f309877d).get(i17);
        boolean c17 = h4Var.c();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f292254e;
        if (c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSubMenuHelper", "onItemClick menu item has listener");
            if (k0Var.i()) {
                k0Var.u();
            }
            yj0.a.h(this, "com/tencent/mm/ui/tools/MMListMenuHelper", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        db5.t4 t4Var = this.f292256g;
        if (t4Var != null) {
            t4Var.mo888x34063ac(h4Var, i17);
        }
        if (k0Var.i()) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/MMListMenuHelper", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
