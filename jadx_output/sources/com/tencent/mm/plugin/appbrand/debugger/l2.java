package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class l2 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.debugger.a1 f77783d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f77784e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView f77785f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f77786g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f77787h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f77788i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f77789m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f77790n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f77791o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f77792p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f77793q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f77794r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f77795s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f77796t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f77797u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.debugger.k2 f77798v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f77799w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View.OnClickListener f77800x;

    public l2(android.content.Context context, com.tencent.mm.plugin.appbrand.debugger.a1 a1Var, com.tencent.mm.plugin.appbrand.debugger.k2 k2Var) {
        super(context);
        this.f77786g = new java.util.LinkedList();
        this.f77797u = false;
        this.f77800x = new com.tencent.mm.plugin.appbrand.debugger.d2(this);
        this.f77783d = a1Var;
        this.f77798v = k2Var;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
        setId(com.tencent.mm.R.id.f483096wh);
    }

    public static void a(com.tencent.mm.plugin.appbrand.debugger.l2 l2Var, java.lang.String str) {
        java.util.LinkedList linkedList = l2Var.f77786g;
        linkedList.add(0, str);
        while (linkedList.size() > 10) {
            linkedList.removeLast();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            sb6.append("\n");
        }
        l2Var.f77793q.setText(sb6.toString());
        if (l2Var.f77797u) {
            l2Var.f77793q.setVisibility(0);
        } else {
            l2Var.f77793q.setVisibility(8);
        }
    }

    public static void b(com.tencent.mm.plugin.appbrand.debugger.l2 l2Var) {
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = l2Var.f77783d;
        if (a1Var.c() || !a1Var.d()) {
            l2Var.f77794r.setImageResource(com.tencent.mm.R.drawable.f480821dj);
            l2Var.f77787h.setText(l2Var.getContext().getString(com.tencent.mm.R.string.f490274qe));
        } else {
            l2Var.f77794r.setImageResource(com.tencent.mm.R.drawable.f480822dk);
            l2Var.f77787h.setText(l2Var.getContext().getString(com.tencent.mm.R.string.f490275qf));
        }
    }

    @Override // android.view.View
    public void bringToFront() {
        if (this.f77784e == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugView", "bringToFront mContentView is null");
        }
    }

    public final boolean c() {
        boolean z17;
        int i17;
        int i18;
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = this.f77783d;
        synchronized (a1Var) {
            z17 = a1Var.f77613o;
        }
        if (z17) {
            return true;
        }
        synchronized (a1Var) {
            i17 = a1Var.f77604f;
        }
        if (i17 == 4) {
            return true;
        }
        synchronized (a1Var) {
            i18 = a1Var.f77604f;
        }
        return i18 == 5;
    }

    public void d() {
        if (this.f77797u) {
            android.view.View view = this.f77796t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f77786g.size() > 0) {
                this.f77793q.setVisibility(0);
            } else {
                this.f77793q.setVisibility(8);
            }
            this.f77791o.setVisibility(8);
        } else {
            android.view.View view2 = this.f77796t;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f77793q.setVisibility(8);
            this.f77791o.setVisibility(0);
        }
        invalidate();
    }

    public final void e() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f77799w;
        if (j0Var == null || !j0Var.isShowing()) {
            android.content.Context context = getContext();
            if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
                return;
            }
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211709a = context.getString(com.tencent.mm.R.string.f490273qd);
            aVar.f211729s = "";
            aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.apu);
            aVar.E = new com.tencent.mm.plugin.appbrand.debugger.e2(this);
            aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.apj);
            com.tencent.mm.ui.widget.dialog.j0 j0Var2 = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
            j0Var2.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var2.f211837r);
            }
            this.f77799w = j0Var2;
            j0Var2.show();
        }
    }

    public void onClick(android.view.View view) {
        if (view.getId() == com.tencent.mm.R.id.f483215a01) {
            this.f77797u = true;
            d();
            com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView remoteDebugMoveView = this.f77785f;
            remoteDebugMoveView.getClass();
            remoteDebugMoveView.postDelayed(new com.tencent.mm.plugin.appbrand.debugger.m1(remoteDebugMoveView), 50L);
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.f483210zw) {
            this.f77797u = false;
            d();
        } else if (view.getId() == com.tencent.mm.R.id.f483218a04) {
            e();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (c()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
