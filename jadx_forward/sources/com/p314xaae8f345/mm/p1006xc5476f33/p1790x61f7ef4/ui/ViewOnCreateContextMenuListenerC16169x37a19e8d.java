package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui;

/* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI */
/* loaded from: classes11.dex */
public class ViewOnCreateContextMenuListenerC16169x37a19e8d extends com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119 implements com.p314xaae8f345.mm.p944x882e457a.u0, android.view.View.OnCreateContextMenuListener, db5.t4 {
    public static final /* synthetic */ int X = 0;
    public k93.j A;

    /* renamed from: J, reason: collision with root package name */
    public rl5.r f224773J;
    public android.widget.TextView K;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f224775f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f224776g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f224777h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f224778i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f224779m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f224780n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f224781o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f224782p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f224783q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f224784r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f224785s;

    /* renamed from: t, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f224786t;

    /* renamed from: u, reason: collision with root package name */
    public k93.c f224787u;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f224789w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f224791y;

    /* renamed from: e, reason: collision with root package name */
    public f93.m2 f224774e = f93.m2.Normal;

    /* renamed from: v, reason: collision with root package name */
    public boolean f224788v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f224790x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f224792z = false;
    public java.util.ArrayList B = new java.util.ArrayList();
    public final java.util.ArrayList C = new java.util.ArrayList();
    public final java.util.HashMap D = new java.util.HashMap();
    public final java.util.HashMap E = new java.util.HashMap();
    public final java.util.HashMap F = new java.util.HashMap();
    public final java.util.HashSet G = new java.util.HashSet();
    public boolean H = true;
    public boolean I = false;
    public int L = 0;
    public int M = 0;
    public boolean N = true;
    public int P = -1;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 Q = new f93.c2(this);
    public final k93.a R = new f93.e2(this);
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 S = null;
    public final android.view.View.OnClickListener T = new f93.g2(this);
    public final l75.q0 U = new f93.h2(this);
    public final l75.z0 V = new f93.i2(this);
    public final android.view.MenuItem.OnMenuItemClickListener W = new f93.j2(this);

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var) {
        viewOnCreateContextMenuListenerC16169x37a19e8d.getClass();
        if (!(view.getTag() instanceof f93.d5) || ((f93.d5) view.getTag()).f341850h == null) {
            return;
        }
        android.widget.CheckBox checkBox = ((f93.d5) view.getTag()).f341850h;
        if (!viewOnCreateContextMenuListenerC16169x37a19e8d.f224790x && !checkBox.isChecked() && viewOnCreateContextMenuListenerC16169x37a19e8d.A.f387427f.size() >= 50) {
            k93.j jVar = viewOnCreateContextMenuListenerC16169x37a19e8d.A;
            boolean z17 = !jVar.f387441w;
            jVar.f387441w = true;
            if (z17) {
                jVar.m8146xced61ae5();
            }
            android.widget.Toast.makeText(viewOnCreateContextMenuListenerC16169x37a19e8d, viewOnCreateContextMenuListenerC16169x37a19e8d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9x), 0).show();
            return;
        }
        k93.j jVar2 = viewOnCreateContextMenuListenerC16169x37a19e8d.A;
        boolean z18 = jVar2.f387441w;
        jVar2.f387441w = false;
        if (z18) {
            jVar2.m8146xced61ae5();
        }
        checkBox.setChecked(!checkBox.isChecked());
        if (checkBox.isChecked()) {
            viewOnCreateContextMenuListenerC16169x37a19e8d.A.f387427f.add(java.lang.String.valueOf(d4Var.f66585x70ce48ca));
        } else {
            viewOnCreateContextMenuListenerC16169x37a19e8d.A.f387427f.remove(java.lang.String.valueOf(d4Var.f66585x70ce48ca));
        }
        if (viewOnCreateContextMenuListenerC16169x37a19e8d.f224790x) {
            viewOnCreateContextMenuListenerC16169x37a19e8d.g7();
        }
        viewOnCreateContextMenuListenerC16169x37a19e8d.e7();
    }

    public static void W6(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d) {
        if (viewOnCreateContextMenuListenerC16169x37a19e8d.f224790x || viewOnCreateContextMenuListenerC16169x37a19e8d.f224788v) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = viewOnCreateContextMenuListenerC16169x37a19e8d.G;
        if (hashSet != null && hashSet.size() > 0) {
            arrayList.addAll(hashSet);
        }
        k93.r y17 = k93.j.y(arrayList, 10);
        int i17 = y17.f387460a;
        if (i17 <= 0) {
            viewOnCreateContextMenuListenerC16169x37a19e8d.A.f387432n = null;
            return;
        }
        k93.q qVar = new k93.q();
        qVar.f66586x7661fe9a = viewOnCreateContextMenuListenerC16169x37a19e8d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9c);
        qVar.f66585x70ce48ca = -1000000;
        qVar.f66584x284d1882 = true;
        qVar.G = i17;
        qVar.F = y17.f387461b;
        viewOnCreateContextMenuListenerC16169x37a19e8d.A.f387432n = qVar;
    }

    public static void X6(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d) {
        viewOnCreateContextMenuListenerC16169x37a19e8d.h7(f93.m2.Normal);
        viewOnCreateContextMenuListenerC16169x37a19e8d.d7(viewOnCreateContextMenuListenerC16169x37a19e8d.B);
        java.util.ArrayList arrayList = viewOnCreateContextMenuListenerC16169x37a19e8d.C;
        arrayList.clear();
        arrayList.addAll(viewOnCreateContextMenuListenerC16169x37a19e8d.B);
        java.util.HashMap hashMap = viewOnCreateContextMenuListenerC16169x37a19e8d.D;
        hashMap.clear();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) it.next();
            if (!d4Var.f66584x284d1882) {
                hashMap.put(java.lang.Integer.valueOf(d4Var.f66585x70ce48ca), java.lang.Long.valueOf(d4Var.f66583xac3be4e));
            }
        }
        viewOnCreateContextMenuListenerC16169x37a19e8d.A.m8146xced61ae5();
        k93.j jVar = viewOnCreateContextMenuListenerC16169x37a19e8d.A;
        if (jVar.B) {
            viewOnCreateContextMenuListenerC16169x37a19e8d.f224784r.setEnabled(jVar.mo1894x7e414b06() > 1);
        } else {
            viewOnCreateContextMenuListenerC16169x37a19e8d.f224784r.setEnabled(jVar.mo1894x7e414b06() > 0);
        }
        viewOnCreateContextMenuListenerC16169x37a19e8d.f224784r.setTextColor(viewOnCreateContextMenuListenerC16169x37a19e8d.getResources().getColor(viewOnCreateContextMenuListenerC16169x37a19e8d.f224784r.isEnabled() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560845vs : com.p314xaae8f345.mm.R.C30859x5a72f63.f560253fb));
        viewOnCreateContextMenuListenerC16169x37a19e8d.e7();
    }

    public static void Y6(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        viewOnCreateContextMenuListenerC16169x37a19e8d.getClass();
        if (arrayList == null || arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[doDeleteScene] can not do scene. lable is null");
            return;
        }
        viewOnCreateContextMenuListenerC16169x37a19e8d.U6(viewOnCreateContextMenuListenerC16169x37a19e8d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8w));
        e93.c cVar = new e93.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
        cVar.f331891g = arrayList2;
        c01.d9.e().g(cVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518217m, vg3.b.f518178e, vg3.c.f518202x, 0, null, 24, null));
    }

    public final void Z6(java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, true);
        k0Var.f293405n = new f93.a2(this);
        k0Var.r(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9v), 17, i65.a.b(this, 14), null);
        k0Var.f293414s = new f93.b2(this, arrayList);
        k0Var.v();
    }

    public final void a7() {
        m78548x39037dd1();
        this.f224788v = true;
        this.A.f387434p = 1;
        d7(this.B);
        android.view.View view = this.f224776g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f224779m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f224781o;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f224783q.setEnabled(false);
        this.K.setText("");
        this.K.setVisibility(4);
        this.f224783q.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560253fb));
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573902g91));
        if (!this.f224790x) {
            android.view.View view4 = this.f224789w;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo74406x9c8c0d33(this.W, com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0);
        b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 3L, 0L, 0L, 0L);
    }

    public final void b7() {
        m78548x39037dd1();
        this.f224788v = false;
        if (this.A.f387436r > 0) {
            b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 8L, this.A.f387436r, 0L, 0L);
        }
        k93.j jVar = this.A;
        jVar.f387434p = 0;
        jVar.E();
        d7(this.B);
        this.f224787u.I.f387418b = false;
        android.view.View view = this.f224776g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f224779m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f224781o;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8t));
        mo74406x9c8c0d33(this.W, com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        android.view.View view4 = this.f224789w;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c7() {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.c7():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
    
        if (r8.A.mo1894x7e414b06() > (r8.A.A ? 2 : 0)) goto L54;
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7(java.util.ArrayList r9) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.d7(java.util.ArrayList):void");
    }

    public void e7() {
        if (this.f224788v) {
            this.f224783q.setEnabled(this.A.f387427f.size() > 0);
            if (this.A.f387427f.size() > 0) {
                this.K.setVisibility(8);
                this.f224783q.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560824v7));
            } else {
                this.K.setVisibility(8);
                this.f224783q.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560253fb));
            }
            if (this.A.f387427f.size() <= 0) {
                this.f224783q.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bod));
                return;
            }
            this.f224783q.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bod) + " (" + this.A.f387427f.size() + ")");
        }
    }

    public final synchronized void f7(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17);
        sb6.append("");
        if (z17 && (n3Var = this.Q) != null) {
            n3Var.mo50307xb9e94560(5002, 400L);
        }
        gm0.j1.e().j(new f93.z1(this, z17));
    }

    public final void g7() {
        if (this.f224792z) {
            k93.j jVar = this.A;
            if (jVar == null || jVar.f387427f.size() <= 0) {
                m78500x43e00957(1, false);
            } else {
                m78500x43e00957(1, true);
            }
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + "(" + this.A.f387427f.size() + ")");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getCustomBounceId */
    public int mo56571xc86d394a() {
        return com.p314xaae8f345.mm.R.id.hsa;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a2g;
    }

    public final void h7(f93.m2 m2Var) {
        this.f224774e = m2Var;
        int ordinal = m2Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelManagerUI", "unkonw mode:%s", this.f224774e + "");
                return;
            }
            android.view.View view = this.f224775f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f224785s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f224779m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.f224775f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f224785s;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f224790x) {
            android.view.View view6 = this.f224779m;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = this.f224779m;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f224790x = getIntent().getBooleanExtra("select_label", false);
        this.f224791y = getIntent().getStringExtra("privacy_source_type");
        this.f224792z = getIntent().getBooleanExtra("intent_status_from_privacy_setting", false);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8t));
        mo74406x9c8c0d33(this.W, com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        this.A = new k93.j(this);
        this.f224775f = findViewById(com.p314xaae8f345.mm.R.id.hsc);
        this.f224785s = findViewById(com.p314xaae8f345.mm.R.id.f567002hs4);
        this.f224786t = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.hsa);
        this.f224786t.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        this.f224786t.m7963x830bc99d(true);
        k93.c cVar = new k93.c(new k93.b(this.R));
        this.f224787u = cVar;
        cVar.d(this.f224786t);
        k93.c cVar2 = this.f224787u;
        cVar2.I.f387418b = false;
        this.A.f387433o = cVar2;
        this.f224779m = findViewById(com.p314xaae8f345.mm.R.id.jiq);
        this.f224781o = findViewById(com.p314xaae8f345.mm.R.id.f565684d61);
        this.f224782p = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567520js4);
        this.f224783q = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ctd);
        this.f224776g = findViewById(com.p314xaae8f345.mm.R.id.auk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k9k);
        android.view.View.OnClickListener onClickListener = this.T;
        textView.setOnClickListener(onClickListener);
        this.f224784r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.d5y);
        this.K = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566742gx0);
        this.f224782p.setOnClickListener(new f93.k2(this));
        this.f224783q.setOnClickListener(new f93.l2(this));
        this.f224784r.setOnClickListener(new f93.p1(this));
        this.f224773J = new rl5.r(this);
        k93.j jVar = this.A;
        jVar.f387444z = new f93.q1(this);
        this.f224786t.mo7960x6cab2c8d(jVar);
        boolean z17 = this.f224792z;
        if (z17 && this.f224790x) {
            this.A.f387434p = 2;
        }
        k93.j jVar2 = this.A;
        jVar2.f387439u = this.F;
        jVar2.E = new f93.r1(this);
        if (z17 && this.f224790x) {
            m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww), new f93.s1(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
            g7();
        }
        android.view.View view = this.f224779m;
        int i17 = !this.f224790x ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.k9l);
        this.f224777h = findViewById;
        findViewById.setOnClickListener(onClickListener);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.k9m);
        this.f224778i = c22699x3dcdb352;
        c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this, com.p314xaae8f345.mm.R.raw.f79995xde511849, i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5)));
        this.f224778i.m82040x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5));
        this.f224783q.setEnabled(false);
        b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 1L, 0L, 0L, 0L);
        this.A.D = !this.f224790x;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.hsq);
        this.f224789w = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new f93.t1(this));
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.i3c);
        this.f224780n = findViewById3;
        if (this.f224790x && (findViewById3.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f224780n.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f224780n.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] requestCode:%d resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            return;
        }
        if (i17 != 7001) {
            if (i17 == 8001) {
                java.lang.String stringExtra = intent.getStringExtra("contact_choose_label_list");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] %s", stringExtra + "");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    try {
                        for (java.lang.String str : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(stringExtra, ",")) {
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !this.A.f387427f.contains(str)) {
                                this.A.f387427f.add(str);
                            }
                        }
                        b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 11L, r0.size(), 0L, 0L);
                        this.A.m8146xced61ae5();
                        e7();
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        } else if (this.f224790x && this.f224792z) {
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] %s", stringExtra2 + "");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Select_Contact", stringExtra2);
            setResult(-1, intent2);
            finish();
        } else {
            java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] %s", stringExtra3 + "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                android.content.Intent intent3 = new android.content.Intent(intent);
                intent3.putExtra("label_source", "label_source_Address");
                intent3.putExtra("last_page_source_type", 1);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactEditLabel ");
                    intent3.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea.class);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactLabelEditUI ");
                    intent3.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12.class);
                }
                intent3.putExtra("Select_Contact", stringExtra3);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent3);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        gm0.j1.e().j(new f93.u1(this));
        b93.r.wi().add(this.U);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 2, 0, 2);
        if (getIntent().getBooleanExtra("label_edit_mode", false)) {
            a7();
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ContactLabelManagerUI)).Rj(this, iy1.a.Tags);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 z17;
        int i17 = ((android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo).position;
        k93.j jVar = this.A;
        if (jVar != null && i17 >= 0 && (z17 = jVar.z(i17)) != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = view.getContext();
            java.lang.String str = z17.f66586x7661fe9a;
            ((ke0.e) xVar).getClass();
            contextMenu.setHeaderTitle(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
            contextMenu.add(0, 0, 0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        b93.r.wi().mo49775xc84af884(this.U);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 0 || !this.f224788v) {
            return super.onKeyDown(i17, keyEvent);
        }
        c7();
        return true;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18 = ((android.widget.AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position;
        k93.j jVar = this.A;
        if (jVar == null || i18 < 0) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 z17 = jVar.z(i18);
        if (i17 != 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(z17);
        Z6(arrayList);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c01.d9.e().q(636, this);
        c01.d9.e().q(5882, this);
        ((l75.a1) c01.d9.b().q()).e(this.V);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        c01.d9.e().a(636, this);
        c01.d9.e().a(5882, this);
        ((l75.a1) c01.d9.b().q()).a(this.V);
        if (this.N) {
            f7(true);
        } else {
            this.N = true;
        }
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 != 636) {
            if (mo808xfb85f7b0 != 5882) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelManagerUI", "unknow type.");
                return;
            }
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelManagerUI", "[onSceneEnd] sort fail.");
                return;
            } else if (((r45.bh) ((e93.b) m1Var).f331885d.f152244b.f152233a).f452289d == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "[onSceneEnd] sort success is this type.");
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "[onSceneEnd] sort success no this type.");
                return;
            }
        }
        if (i17 == 0 && i18 == 0) {
            java.util.ArrayList arrayList = ((e93.c) m1Var).f331891g;
            if (b93.r.wi().P0(arrayList)) {
                m65194xce38d9a();
                f7(false);
                if (arrayList != null && arrayList.size() > 0) {
                    if (this.A != null) {
                        java.util.Iterator it = arrayList.iterator();
                        i19 = 0;
                        while (it.hasNext()) {
                            i19 += ((java.lang.Integer) this.A.f387439u.get(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.d4) it.next()).f66585x70ce48ca))).intValue();
                        }
                    } else {
                        i19 = 0;
                    }
                    b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), this.P == 2 ? 7L : 12L, arrayList.size(), 0L, i19);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[doDeleteContactLabel] fail.");
                m65194xce38d9a();
                db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572576bo5), "", new f93.w0(this));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd] delete fail.");
            m65194xce38d9a();
            db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572576bo5), "", new f93.w0(this));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518217m, vg3.b.f518179f, vg3.c.f518202x, i18, null, 16, null));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(j93.w.class);
    }
}
