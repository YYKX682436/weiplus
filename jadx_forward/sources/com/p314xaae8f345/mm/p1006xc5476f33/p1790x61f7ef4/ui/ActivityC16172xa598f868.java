package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui;

/* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelUI */
/* loaded from: classes11.dex */
public class ActivityC16172xa598f868 extends com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119 implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {
    public static final /* synthetic */ int L = 0;
    public final java.util.HashSet F;
    public final java.util.HashSet G;
    public final java.util.HashSet H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f224829J;
    public android.animation.ObjectAnimator K;

    /* renamed from: e, reason: collision with root package name */
    public db5.f3 f224830e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f224831f;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21517xd417c6fc f224834i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 f224835m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f224836n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f224837o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f224838p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f224839q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 f224840r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ListView f224841s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ScrollView f224842t;

    /* renamed from: u, reason: collision with root package name */
    public f93.x2 f224843u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f224844v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f224845w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f224846x;

    /* renamed from: g, reason: collision with root package name */
    public boolean f224832g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f224833h = false;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.HashSet f224847y = new java.util.HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f224848z = new java.util.HashSet();
    public final java.util.ArrayList A = new java.util.ArrayList();
    public final java.util.HashSet B = new java.util.HashSet();
    public java.util.ArrayList C = new java.util.ArrayList();
    public java.util.ArrayList D = new java.util.ArrayList();
    public boolean E = false;

    public ActivityC16172xa598f868() {
        new java.util.HashSet();
        this.F = new java.util.HashSet();
        this.G = new java.util.HashSet();
        this.H = new java.util.HashSet();
        this.I = true;
        this.f224829J = false;
        this.K = null;
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868, java.lang.String str) {
        java.util.ArrayList arrayList = activityC16172xa598f868.f224846x;
        if (arrayList != null && arrayList.contains(str)) {
            activityC16172xa598f868.f224847y.add(str);
        }
        java.util.ArrayList arrayList2 = activityC16172xa598f868.A;
        if (arrayList2 != null && arrayList2.contains(str)) {
            arrayList2.remove(str);
        }
        java.util.HashSet hashSet = activityC16172xa598f868.f224848z;
        if (hashSet != null && hashSet.contains(str)) {
            hashSet.remove(str);
        }
        if (activityC16172xa598f868.Z6()) {
            activityC16172xa598f868.m78501x43e00957(true);
        }
    }

    public static void W6(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = activityC16172xa598f868.f224835m;
        if (c16180x2cdd3130 != null) {
            c16180x2cdd3130.f();
        }
        android.content.Intent intent = new android.content.Intent();
        if (activityC16172xa598f868.Z6()) {
            intent.putExtra("hasLableChange", true);
        } else {
            intent.putExtra("hasLableChange", false);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = activityC16172xa598f868.getIntent().getStringArrayListExtra("label_str_list");
        java.util.ArrayList k17 = b93.r.wi().k1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (!k17.contains(next)) {
                arrayList.add(next);
            }
        }
        stringArrayListExtra.removeAll(arrayList);
        intent.putExtra("result_label_id_list", stringArrayListExtra);
        intent.putExtra("contact_search_label_new_list", new java.util.ArrayList());
        intent.putExtra("contact_search_label_add_list", new java.util.ArrayList());
        intent.putExtra("contact_select_label_add_list", new java.util.ArrayList());
        intent.putExtra("contact_select_label_new_list", new java.util.ArrayList());
        activityC16172xa598f868.setResult(-1, intent);
        super.finish();
    }

    public static void X6(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
        activityC16172xa598f868.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[save]");
        if (activityC16172xa598f868.f224835m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelUI", "save fail. input view is null.");
            return;
        }
        activityC16172xa598f868.U6(activityC16172xa598f868.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9k));
        boolean z17 = activityC16172xa598f868.E;
        java.util.HashSet hashSet = activityC16172xa598f868.B;
        java.util.HashSet hashSet2 = activityC16172xa598f868.f224848z;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabel]");
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = activityC16172xa598f868.f224835m;
            if (c16180x2cdd3130 != null) {
                java.lang.String m79118xdb574fcd = c16180x2cdd3130.m79118xdb574fcd();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m79118xdb574fcd)) {
                    java.lang.String trim = m79118xdb574fcd.trim();
                    activityC16172xa598f868.f224835m.d(trim, true);
                    activityC16172xa598f868.f224835m.g();
                    activityC16172xa598f868.Y6(trim, activityC16172xa598f868.E);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (hashSet2 != null) {
                java.util.Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!hashSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                if (hashSet2 != null && !hashSet2.isEmpty()) {
                    if (activityC16172xa598f868.C == null || hashSet2.isEmpty()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11347, 0, 0);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11347, 0, 1);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLable] doSaveContact");
                activityC16172xa598f868.b7();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLable] doScene: %s", arrayList.toString());
            c01.d9.e().g(new e93.a(arrayList));
            if (activityC16172xa598f868.C == null || hashSet2.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11347, 0, 0);
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11347, 0, 1);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabelStranger]");
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd31302 = activityC16172xa598f868.f224835m;
        if (c16180x2cdd31302 != null) {
            java.lang.String m79118xdb574fcd2 = c16180x2cdd31302.m79118xdb574fcd();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m79118xdb574fcd2)) {
                activityC16172xa598f868.f224835m.d(m79118xdb574fcd2, true);
                activityC16172xa598f868.f224835m.g();
                activityC16172xa598f868.Y6(m79118xdb574fcd2, activityC16172xa598f868.E);
            }
        }
        if (hashSet2 != null && hashSet2.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabelStranger] save local");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!hashSet.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (int i17 = 0; i17 < size; i17++) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.d4();
                    java.lang.String str3 = (java.lang.String) arrayList2.get(i17);
                    d4Var.f66584x284d1882 = true;
                    d4Var.f66586x7661fe9a = str3;
                    d4Var.f66587x68c44467 = x51.k.a(str3);
                    d4Var.f66588xb0759da4 = x51.k.b(str3);
                    int i18 = -((int) java.lang.System.nanoTime());
                    d4Var.f66585x70ce48ca = i18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabelStranger]field_labelID:%s field_labelName:%s", java.lang.Integer.valueOf(i18), d4Var.f66586x7661fe9a);
                    arrayList3.add(d4Var);
                }
                b93.r.wi().T1(arrayList3);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveStranger]");
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(activityC16172xa598f868.f224844v);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd31303 = activityC16172xa598f868.f224835m;
        if (c16180x2cdd31303 != null) {
            java.lang.String h17 = ((b93.b) c93.a.a()).h(c16180x2cdd31303.m79122xe175c322());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
                z07.f66693x91130dba = "";
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).mo11260x413cb2b4(z07);
            } else {
                z07.f66693x91130dba = h17;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
                    z07.f66694xdd77ad16 = activityC16172xa598f868.f224844v;
                }
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).mo11260x413cb2b4(z07);
            }
        }
        activityC16172xa598f868.c7();
    }

    public final void Y6(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelUI", "tag is empty");
            return;
        }
        java.lang.String trim = str.trim();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelUI", "new tag is empty");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 o17 = b93.r.wi().o1(trim);
        java.util.HashSet hashSet = this.f224848z;
        if (z17) {
            java.util.ArrayList arrayList = this.C;
            if (arrayList == null || !arrayList.contains(trim) || o17 == null) {
                hashSet.add(trim);
            }
        } else {
            java.util.ArrayList arrayList2 = this.C;
            if (arrayList2 == null || !arrayList2.contains(trim) || (o17 != null && o17.f66584x284d1882)) {
                hashSet.add(trim);
            }
        }
        java.util.ArrayList arrayList3 = this.A;
        if (arrayList3 != null && !arrayList3.contains(trim)) {
            arrayList3.add(trim);
        }
        java.util.HashSet hashSet2 = this.f224847y;
        if (hashSet2 != null && hashSet2.contains(trim)) {
            hashSet2.remove(trim);
        }
        if (Z6()) {
            m78501x43e00957(true);
        }
    }

    public final boolean Z6() {
        if (this.f224835m == null) {
            return false;
        }
        java.util.ArrayList arrayList = this.f224846x;
        if (arrayList == null || arrayList.size() <= 0) {
            return this.f224835m.m79122xe175c322() != null && this.f224835m.m79122xe175c322().size() > 0;
        }
        if (this.f224835m.m79122xe175c322() == null && this.f224835m.m79122xe175c322().size() <= 0) {
            return true;
        }
        java.util.ArrayList<java.lang.String> m79122xe175c322 = this.f224835m.m79122xe175c322();
        java.util.Collections.sort(this.f224846x);
        java.util.Collections.sort(m79122xe175c322);
        return !this.f224846x.equals(m79122xe175c322);
    }

    public final void a7(java.util.HashSet hashSet, java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        hashSet.removeAll(arrayList2);
    }

    public final void b7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]");
        if (this.f224835m != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact] doScene");
            java.util.ArrayList<java.lang.String> m79122xe175c322 = this.f224835m.m79122xe175c322();
            java.lang.String u17 = (m79122xe175c322 == null || m79122xe175c322.size() <= 0) ? "" : b93.r.wi().u1(m79122xe175c322);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.gw6 gw6Var = new r45.gw6();
            gw6Var.f457115e = u17;
            gw6Var.f457114d = this.f224844v;
            linkedList.add(gw6Var);
            c01.d9.e().g(new e93.e(linkedList));
            java.util.HashSet hashSet = this.f224848z;
            int size = hashSet != null ? hashSet.size() : 0;
            java.util.ArrayList arrayList = this.f224846x;
            int size2 = arrayList != null ? arrayList.size() : 0;
            java.util.HashSet hashSet2 = this.f224847y;
            int size3 = ((this.f224835m.m79122xe175c322().size() + (hashSet2 != null ? hashSet2.size() : 0)) - size2) - size;
            if (size > 0 || size3 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11220, c01.z1.r(), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size3), 0, 0);
            }
            if (size > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 2, 1, 1);
            }
        }
    }

    public final void c7() {
        m65194xce38d9a();
        this.f224848z.clear();
        this.f224847y.clear();
        finish();
    }

    public final void d7(f93.n4 n4Var) {
        int ordinal = n4Var.ordinal();
        if (ordinal == 0) {
            this.f224841s.setVisibility(8);
            android.view.View view = this.f224837o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f224842t.setVisibility(0);
            this.f224836n.setVisibility(8);
            return;
        }
        if (ordinal == 1) {
            this.f224842t.setVisibility(8);
            this.f224841s.setVisibility(0);
            android.view.View view2 = this.f224837o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f224836n.setVisibility(8);
            return;
        }
        if (ordinal == 2) {
            this.f224841s.setVisibility(8);
            this.f224842t.setVisibility(8);
            android.view.View view3 = this.f224837o;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f224836n.setVisibility(0);
            this.f224836n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g9g);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        this.f224841s.setVisibility(8);
        this.f224842t.setVisibility(8);
        android.view.View view4 = this.f224837o;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f224836n.setVisibility(0);
        this.f224836n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g9g);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = this.f224835m;
        if (c16180x2cdd3130 != null) {
            c16180x2cdd3130.f();
        }
        android.content.Intent intent = new android.content.Intent();
        if (Z6()) {
            intent.putExtra("hasLableChange", true);
        } else {
            intent.putExtra("hasLableChange", false);
        }
        intent.putExtra("result_label_id_list", this.f224835m.mo65204x8c275306());
        java.util.ArrayList<java.lang.String> mo65204x8c275306 = this.f224835m.mo65204x8c275306();
        java.util.ArrayList<java.lang.String> mo65204x8c2753062 = this.f224840r.mo65204x8c275306();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = mo65204x8c275306.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (!mo65204x8c2753062.contains(next)) {
                arrayList.add(next);
            }
        }
        if (getIntent().getStringArrayExtra("contact_search_label_new_list") != null) {
            for (java.lang.String str : getIntent().getStringArrayExtra("contact_search_label_new_list")) {
                arrayList.add(str);
            }
        }
        intent.putExtra("contact_search_label_new_list", arrayList);
        java.util.ArrayList k17 = b93.r.wi().k1();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashSet hashSet = this.F;
        a7(hashSet, k17);
        arrayList2.addAll(hashSet);
        intent.putExtra("contact_search_label_add_list", arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.HashSet hashSet2 = this.H;
        a7(hashSet2, k17);
        arrayList3.addAll(hashSet2);
        intent.putExtra("contact_select_label_add_list", arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.HashSet hashSet3 = this.G;
        a7(hashSet3, k17);
        arrayList4.addAll(hashSet3);
        intent.putExtra("contact_select_label_new_list", arrayList4);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a2j;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571364cz));
        mo78514x143f1b92().x0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new java.lang.Runnable() { // from class: f93.x3$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868.this.onBackPressed();
            }
        });
        m78560xe21cbbf(false);
        m78494xd9193382(0, getString(this.f224832g ? com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1 : com.p314xaae8f345.mm.R.C30867xcad56011.f572080y6), new f93.e4(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21517xd417c6fc c21517xd417c6fc = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21517xd417c6fc) findViewById(com.p314xaae8f345.mm.R.id.hsj);
        this.f224834i = c21517xd417c6fc;
        c21517xd417c6fc.m79146xe38b00b6(3);
        this.f224835m = (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130) findViewById(com.p314xaae8f345.mm.R.id.hsh);
        this.f224836n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hsl);
        this.f224834i.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f224837o = findViewById(com.p314xaae8f345.mm.R.id.hsg);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.hsf);
        this.f224838p = findViewById;
        findViewById.setBackgroundDrawable(null);
        ((android.widget.TextView) this.f224838p.findViewById(android.R.id.title)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.g9j);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f224838p.findViewById(com.p314xaae8f345.mm.R.id.d6e);
        this.f224839q = linearLayout;
        linearLayout.setVisibility(0);
        this.f224839q.setOnClickListener(new f93.f4(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130) findViewById(com.p314xaae8f345.mm.R.id.hsd);
        this.f224840r = c16180x2cdd3130;
        c16180x2cdd3130.m65210x44603e6c(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd31302 = this.f224840r;
        int a17 = i65.a.a(c16180x2cdd31302.M, 12.0f);
        int a18 = i65.a.a(c16180x2cdd31302.M, 5.0f);
        int a19 = i65.a.a(c16180x2cdd31302.M, 12.0f);
        int a27 = i65.a.a(c16180x2cdd31302.M, 6.0f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c16180x2cdd31302.F;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setPadding(a17, a18, a19, a27);
        }
        this.f224840r.m65207xa356bd1f(new f93.g4(this));
        this.f224841s = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.hsk);
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.hso);
        this.f224842t = scrollView;
        if (scrollView != null) {
            scrollView.setOnTouchListener(new f93.k4(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd31303 = this.f224835m;
        c16180x2cdd31303.f279118q = true;
        c16180x2cdd31303.k(true);
        this.f224835m.m79132x19e7f08c(36);
        this.f224835m.m79124x6c4032e7(new f93.m4(this));
        if (getIntent().getStringArrayExtra("contact_search_label_add_list") != null) {
            for (java.lang.String str : getIntent().getStringArrayExtra("contact_search_label_add_list")) {
                this.F.add(str);
            }
        }
        if (getIntent().getStringArrayExtra("contact_select_label_add_list") != null) {
            for (java.lang.String str2 : getIntent().getStringArrayExtra("contact_select_label_add_list")) {
                this.H.add(str2);
            }
        }
        if (getIntent().getStringArrayExtra("contact_select_label_new_list") != null) {
            for (java.lang.String str3 : getIntent().getStringArrayExtra("contact_select_label_new_list")) {
                this.G.add(str3);
            }
        }
        this.f224840r.k(false);
        this.f224840r.m65210x44603e6c(true);
        this.f224840r.m79124x6c4032e7(new f93.y3(this));
        this.f224841s.setAdapter((android.widget.ListAdapter) this.f224843u);
        this.f224841s.setOnItemClickListener(new f93.z3(this));
        m78501x43e00957(false);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (Z6()) {
            db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8_), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.apf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.api), new f93.b4(this), new f93.c4(this));
            return;
        }
        try {
            super.onBackPressed();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Label.ContactLabelUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        super.onCreate(bundle);
        this.f224845w = getIntent().getStringExtra("label_id_list");
        this.f224846x = getIntent().getStringArrayListExtra("label_str_list");
        this.f224844v = getIntent().getStringExtra("label_username");
        this.E = getIntent().getBooleanExtra("is_stranger", false);
        this.f224832g = getIntent().getBooleanExtra("save_label_to_contact_on_prepage", false);
        this.f224843u = new f93.x2(this);
        mo43517x10010bd5();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224845w) && (arrayList = this.f224846x) != null && arrayList.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = this.f224835m;
            java.util.ArrayList arrayList2 = this.f224846x;
            c16180x2cdd3130.r(arrayList2, arrayList2);
        }
        if (this.E) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("label_str_list");
            this.f224835m.r(stringArrayListExtra, stringArrayListExtra);
        }
        this.D = b93.r.wi().k1();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 1, 0, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c01.d9.e().q(kd1.c.f72435x366c91de, this);
        c01.d9.e().q(638, this);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f224831f;
        if (f5Var != null) {
            f5Var.d();
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16166xa7327119, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        c01.d9.e().a(kd1.c.f72435x366c91de, this);
        c01.d9.e().a(638, this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new f93.d4(this));
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f224831f;
        if (f5Var != null) {
            f5Var.f();
        }
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 != 635) {
            if (mo808xfb85f7b0 != 638) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelUI", "unknow type.");
                return;
            }
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd] success.");
                c7();
                return;
            } else {
                m65194xce38d9a();
                db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571360cv), "", new f93.w0(this));
                return;
            }
        }
        if (i17 != 0 || i18 != 0) {
            m65194xce38d9a();
            db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571360cv), "", new f93.w0(this));
            return;
        }
        if (!this.f224833h || !(m1Var instanceof e93.a)) {
            if (this.f224832g) {
                c7();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd] success.asd");
                b7();
                return;
            }
        }
        this.f224833h = false;
        m65194xce38d9a();
        java.util.LinkedList linkedList = ((r45.c4) ((e93.a) m1Var).f331881d.f152244b.f152233a).f452793e;
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        for (int i19 = 0; i19 < linkedList.size(); i19++) {
            if (linkedList.get(i19) != null) {
                java.lang.String str2 = ((r45.f54) linkedList.get(i19)).f455554d;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = this.f224835m;
                c16180x2cdd3130.w(str2, true, c16180x2cdd3130.getChildCount() - 1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd31302 = this.f224840r;
                c16180x2cdd31302.w(str2, true, c16180x2cdd31302.getChildCount() - 1);
                Y6(str2, this.E);
                this.G.add(str2);
                this.B.add(str2);
                this.D.add(str2);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f224831f;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        android.view.View view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "onKeyboardHeightChanged, height:%s", java.lang.Integer.valueOf(i17));
        if (fp.h.c(30)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "onKeyboardHeightChanged: return");
            return;
        }
        android.animation.ObjectAnimator objectAnimator = this.K;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.K.cancel();
        }
        db5.f3 f3Var = this.f224830e;
        if (f3Var == null || (view = f3Var.f293591g) == null || view.getParent() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "onKeyboardHeightChanged, mAddLebalTipsDialog: isNull");
            return;
        }
        android.view.View view2 = this.f224830e.f293591g.getParent() instanceof android.view.View ? (android.view.View) this.f224830e.f293591g.getParent() : null;
        if (view2 == null) {
            return;
        }
        if (i17 > 0) {
            if (view2.getTranslationY() != 0.0f) {
                view2.setTranslationY(0.0f);
            }
            this.K = android.animation.ObjectAnimator.ofFloat(view2, "translationY", 0.0f, -i17);
        } else {
            this.K = android.animation.ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), 0.0f);
        }
        this.K.setDuration(200L);
        this.K.setInterpolator(new y3.b());
        this.K.addUpdateListener(new f93.l4(this));
        this.K.start();
    }
}
