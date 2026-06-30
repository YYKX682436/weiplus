package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class l2 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 f159316d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f159317e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 f159318f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f159319g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f159320h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f159321i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f159322m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f159323n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f159324o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f159325p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f159326q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f159327r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f159328s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f159329t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f159330u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.k2 f159331v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f159332w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View.OnClickListener f159333x;

    public l2(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.k2 k2Var) {
        super(context);
        this.f159319g = new java.util.LinkedList();
        this.f159330u = false;
        this.f159333x = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.d2(this);
        this.f159316d = a1Var;
        this.f159331v = k2Var;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        setId(com.p314xaae8f345.mm.R.id.f564629wh);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var, java.lang.String str) {
        java.util.LinkedList linkedList = l2Var.f159319g;
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
        l2Var.f159326q.setText(sb6.toString());
        if (l2Var.f159330u) {
            l2Var.f159326q.setVisibility(0);
        } else {
            l2Var.f159326q.setVisibility(8);
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = l2Var.f159316d;
        if (a1Var.c() || !a1Var.d()) {
            l2Var.f159327r.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562354dj);
            l2Var.f159320h.setText(l2Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571807qe));
        } else {
            l2Var.f159327r.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562355dk);
            l2Var.f159320h.setText(l2Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571808qf));
        }
    }

    @Override // android.view.View
    public void bringToFront() {
        if (this.f159317e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugView", "bringToFront mContentView is null");
        }
    }

    public final boolean c() {
        boolean z17;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = this.f159316d;
        synchronized (a1Var) {
            z17 = a1Var.f159146o;
        }
        if (z17) {
            return true;
        }
        synchronized (a1Var) {
            i17 = a1Var.f159137f;
        }
        if (i17 == 4) {
            return true;
        }
        synchronized (a1Var) {
            i18 = a1Var.f159137f;
        }
        return i18 == 5;
    }

    public void d() {
        if (this.f159330u) {
            android.view.View view = this.f159329t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f159319g.size() > 0) {
                this.f159326q.setVisibility(0);
            } else {
                this.f159326q.setVisibility(8);
            }
            this.f159324o.setVisibility(8);
        } else {
            android.view.View view2 = this.f159329t;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/debugger/RemoteDebugView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f159326q.setVisibility(8);
            this.f159324o.setVisibility(0);
        }
        invalidate();
    }

    public final void e() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f159332w;
        if (j0Var == null || !j0Var.isShowing()) {
            android.content.Context context = getContext();
            if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293242a = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571806qd);
            aVar.f293262s = "";
            aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.apu);
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e2(this);
            aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.apj);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var2.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var2.f293370r);
            }
            this.f159332w = j0Var2;
            j0Var2.show();
        }
    }

    /* renamed from: onClick */
    public void m50197xaf6b9ae9(android.view.View view) {
        if (view.getId() == com.p314xaae8f345.mm.R.id.f564748a01) {
            this.f159330u = true;
            d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11848x16ccb2c3 c11848x16ccb2c3 = this.f159318f;
            c11848x16ccb2c3.getClass();
            c11848x16ccb2c3.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.m1(c11848x16ccb2c3), 50L);
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.f564743zw) {
            this.f159330u = false;
            d();
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.f564751a04) {
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
