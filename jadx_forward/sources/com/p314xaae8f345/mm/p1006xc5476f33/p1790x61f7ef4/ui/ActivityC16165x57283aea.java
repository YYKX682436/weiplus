package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/label/ui/ContactEditLabel;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/ui/contact/l4;", "Ll75/z0;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "f93/y", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.label.ui.ContactEditLabel */
/* loaded from: classes11.dex */
public final class ActivityC16165x57283aea extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.ui.p2690x38b72420.l4, l75.z0, com.p314xaae8f345.mm.p944x882e457a.u0 {
    public f93.y A;
    public int B;
    public int C;
    public android.widget.EditText D;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f224727g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f224728h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f224729i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.d4 f224730m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f224731n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f224732o;

    /* renamed from: v, reason: collision with root package name */
    public android.app.ProgressDialog f224739v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f224740w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f224741x;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ListView f224743z;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f224724d = "MicroMsg.Label.ContactEditLabel";

    /* renamed from: e, reason: collision with root package name */
    public final int f224725e = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14480xb9cc8658;

    /* renamed from: f, reason: collision with root package name */
    public final int f224726f = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4;

    /* renamed from: p, reason: collision with root package name */
    public boolean f224733p = true;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f224734q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f224735r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f224736s = new java.util.HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashSet f224737t = new java.util.HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f224738u = new java.util.HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f224742y = "intent_status_mgr";
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 E = new f93.l0(this, android.os.Looper.getMainLooper());

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16165x57283aea.f224724d, "cpan[saveLabelChange]");
        java.lang.String string = activityC16165x57283aea.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        activityC16165x57283aea.f224739v = db5.e1.Q(activityC16165x57283aea, activityC16165x57283aea.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), string, true, true, f93.n0.f341927d);
        java.lang.String str = activityC16165x57283aea.f224728h;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        activityC16165x57283aea.f224728h = str;
        int length = str.length() - 1;
        int i17 = 0;
        boolean z18 = false;
        while (i17 <= length) {
            boolean z19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str.charAt(!z18 ? i17 : length), 32) <= 0;
            if (z18) {
                if (!z19) {
                    break;
                } else {
                    length--;
                }
            } else if (z19) {
                i17++;
            } else {
                z18 = true;
            }
        }
        java.lang.String obj = str.subSequence(i17, length + 1).toString();
        activityC16165x57283aea.f224728h = obj;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj);
        f93.m0 m0Var = f93.m0.f341917d;
        if (K0) {
            activityC16165x57283aea.m65193xce38d9a();
            db5.e1.t(activityC16165x57283aea, activityC16165x57283aea.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g96), "", m0Var);
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(activityC16165x57283aea.f224728h) > 36) {
            activityC16165x57283aea.m65193xce38d9a();
            java.lang.String string2 = activityC16165x57283aea.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571363cy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(36, ""))}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            db5.e1.t(activityC16165x57283aea, format, "", m0Var);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activityC16165x57283aea.f224728h);
        if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b93.r.wi().p1(r0))) || !activityC16165x57283aea.f224733p) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activityC16165x57283aea.f224728h);
            if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b93.r.wi().p1(r0))) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16165x57283aea.f224727g) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityC16165x57283aea.f224727g, activityC16165x57283aea.f224728h)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 n17 = b93.r.wi().n1(activityC16165x57283aea.f224729i);
                if (activityC16165x57283aea.f224733p || n17.f66584x284d1882) {
                    java.lang.String str2 = activityC16165x57283aea.f224728h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    c01.d9.e().g(new e93.a(str2));
                    return;
                } else {
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(activityC16165x57283aea.f224729i, 0);
                    java.lang.String str3 = activityC16165x57283aea.f224728h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    c01.d9.e().g(new e93.f(P, str3));
                    return;
                }
            }
        }
        activityC16165x57283aea.m65193xce38d9a();
        db5.e1.t(activityC16165x57283aea, activityC16165x57283aea.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571359cu), "", m0Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public android.widget.ListView O3() {
        android.widget.ListView listView = this.f224743z;
        if (listView != null) {
            return listView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
        throw null;
    }

    public final void U6() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.util.HashSet hashSet = this.f224736s;
        objArr[0] = java.lang.Integer.valueOf(hashSet != null ? hashSet.size() : 0);
        java.util.HashSet hashSet2 = this.f224738u;
        objArr[1] = java.lang.Integer.valueOf(hashSet2 != null ? hashSet2.size() : 0);
        java.lang.String str = this.f224724d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cpan[doUpdateContactList] addcount:%d,delcount:%d", objArr);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (hashSet != null && hashSet.size() > 0) {
            hashSet.size();
            java.util.Iterator it = hashSet.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(next, "null cannot be cast to non-null type kotlin.String");
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n((java.lang.String) next, true);
                java.lang.String D0 = n17.D0();
                java.lang.String b17 = b93.n.b(D0, this.f224729i);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "labels:%s mixLabelIds:%s", D0, b17);
                if (!r26.i0.p(b17, D0, true)) {
                    r45.gw6 gw6Var = new r45.gw6();
                    gw6Var.f457114d = n17.d1();
                    gw6Var.f457115e = b17;
                    linkedList.add(gw6Var);
                }
            }
        }
        if (hashSet2 != null && hashSet2.size() > 0) {
            hashSet2.size();
            java.util.Iterator it6 = hashSet2.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(next2, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str2 = (java.lang.String) next2;
                java.lang.String D02 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str2, true).D0();
                java.lang.String c17 = b93.n.c(D02, this.f224729i);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "username:%s labels:%s mixLabelIds:%s", str2, D02, c17);
                if (!r26.i0.p(c17, D02, true)) {
                    r45.gw6 gw6Var2 = new r45.gw6();
                    gw6Var2.f457114d = str2;
                    gw6Var2.f457115e = c17;
                    linkedList.add(gw6Var2);
                }
            }
        }
        if (linkedList.size() > 0) {
            c01.d9.e().g(new e93.e(linkedList));
        } else {
            V6();
        }
    }

    public final void V6() {
        java.lang.String str = this.f224724d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cpan[savaSuccess]");
        m65193xce38d9a();
        java.util.HashSet hashSet = this.f224736s;
        int size = hashSet != null ? hashSet.size() : 0;
        java.util.HashSet hashSet2 = this.f224738u;
        int size2 = hashSet2 != null ? hashSet2.size() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cpan[doUpdateContactList]addnum:%d", java.lang.Integer.valueOf(size));
        if (size > 0) {
            int size3 = this.f224737t.size();
            int max = java.lang.Math.max(0, size - size3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = c01.z1.r();
            objArr[1] = 0;
            objArr[2] = 0;
            objArr[3] = java.lang.Integer.valueOf(size);
            objArr[4] = java.lang.Integer.valueOf(this.f224731n ? 1 : 2);
            objArr[5] = java.lang.Integer.valueOf(size3);
            objArr[6] = java.lang.Integer.valueOf(max);
            g0Var.d(11220, objArr);
        }
        if (this.f224733p) {
            android.content.Intent intent = getIntent();
            intent.putExtra("k_sns_label_add_label", this.f224728h);
            intent.putStringArrayListExtra("k_sns_label_add_label_usernames", new java.util.ArrayList<>(hashSet));
            setResult(0, intent);
            if (this.f224741x) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 1, 1, 2);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 1, 1, 3);
            }
        } else {
            if (size > 0) {
                if (this.f224741x) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 1, 3, 2);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 1, 3, 3);
                }
            }
            if (size2 > 0) {
                if (this.f224741x) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 1, 4, 2);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 1, 4, 3);
                }
            }
            setResult(0);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public java.lang.String W5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return null;
    }

    public final void W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f224724d, "cpan[saveFailed]");
        m65193xce38d9a();
        db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571360cv), "", f93.m0.f341917d);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        f93.y yVar = this.A;
        if (yVar != null) {
            yVar.s();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    /* renamed from: getActivity */
    public android.app.Activity mo8774x19263085() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c8j;
    }

    /* renamed from: hideLoading */
    public final void m65193xce38d9a() {
        android.app.ProgressDialog progressDialog = this.f224739v;
        if (progressDialog != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(progressDialog);
            if (progressDialog.isShowing()) {
                android.app.ProgressDialog progressDialog2 = this.f224739v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(progressDialog2);
                progressDialog2.dismiss();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
        java.lang.String str = this.f224724d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cpan[onActivityResult] requestCode:%d resultCode:%d", objArr);
        if (i18 == -1 && i17 == this.f224725e) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(intent);
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cpan[onActivityResult] %s", stringExtra + "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
            if (P1 != null && P1.size() > 0) {
                int size = P1.size();
                for (int i19 = 0; i19 < size; i19++) {
                    java.lang.String str2 = (java.lang.String) P1.get(i19);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        if (!c01.e2.J(str2) || this.f224734q.contains(str2) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, this.f224740w)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "dz[getIntent] %s is no friend or is user self and just filter", str2);
                        } else {
                            this.f224734q.add(str2);
                            java.util.ArrayList arrayList = this.f224735r;
                            if (arrayList != null && !arrayList.contains(P1.get(i19))) {
                                this.f224736s.add(str2);
                            }
                            if (booleanExtra) {
                                this.f224737t.add(str2);
                            }
                            java.util.HashSet hashSet = this.f224738u;
                            if (hashSet != null && hashSet.contains(str2)) {
                                hashSet.remove(str2);
                            }
                        }
                    }
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224728h)) {
                    m78501x43e00957(true);
                }
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.E;
            if (n3Var != null) {
                n3Var.mo50305x3d8a09a2(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224728h) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f224728h, this.f224727g)) || (((hashSet = this.f224736s) != null && hashSet.size() > 0) || ((hashSet2 = this.f224738u) != null && hashSet2.size() > 0))) {
            db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8_), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.apf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.api), new f93.o0(this), new f93.p0(this));
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f224740w = c01.z1.r();
        this.f224729i = getIntent().getStringExtra("label_id");
        java.lang.String stringExtra = getIntent().getStringExtra("label_name");
        this.f224727g = stringExtra;
        if (stringExtra == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "")) {
            this.f224727g = " ";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("label_name");
        this.f224728h = stringExtra2;
        if (stringExtra2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra2, "")) {
            this.f224728h = " ";
        }
        this.f224731n = getIntent().getBooleanExtra("Is_Chatroom", false);
        java.lang.String stringExtra3 = getIntent().getStringExtra("label_source");
        this.f224741x = stringExtra3 != null && r26.i0.q(stringExtra3, "label_source_Address", false, 2, null);
        getIntent().getBooleanExtra("is_show_delete", true);
        java.lang.String stringExtra4 = getIntent().getStringExtra("Select_Contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra4)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra4);
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) r26.n0.f0(stringExtra4, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
            this.f224734q = new java.util.ArrayList();
            if (P1 != null && P1.size() > 0) {
                int size = P1.size();
                for (int i17 = 0; i17 < size; i17++) {
                    java.lang.String str = (java.lang.String) P1.get(i17);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        if (!c01.e2.J(str) || this.f224734q.contains(str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f224740w)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f224724d, "dz[getIntent] %s is no friend or is user self and just filter", str);
                        } else {
                            this.f224734q.add(str);
                            this.f224736s.add(str);
                            if (this.f224731n) {
                                this.f224737t.add(str);
                            }
                        }
                    }
                }
            }
        }
        c01.d9.e().a(kd1.c.f72435x366c91de, this);
        c01.d9.e().a(637, this);
        c01.d9.e().a(638, this);
        gm0.j1.e().j(new f93.k0(this));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224729i)) {
            this.f224733p = true;
            this.f224732o = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574252hl2);
        } else {
            this.f224733p = false;
            this.f224730m = b93.r.wi().n1(this.f224729i);
            this.f224732o = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574251hl1);
        }
        mo54450xbf7c1df6(this.f224732o);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f567413jf5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f224743z = (android.widget.ListView) findViewById;
        m78597x53c22598(new f93.z(this));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dfx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        ((android.widget.TextView) findViewById2).setVisibility(8);
        this.A = new f93.y(this, this);
        if (getIntent().getBooleanExtra(this.f224742y, false)) {
            f93.y yVar = this.A;
            if (yVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            yVar.f288611f = true;
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.jiq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById3).setVisibility(8);
        android.widget.ListView listView = this.f224743z;
        if (listView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView.setOnItemClickListener(new f93.a0(this));
        android.widget.ListView listView2 = this.f224743z;
        if (listView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView2.setOnItemLongClickListener(new f93.d0(this));
        android.widget.ListView listView3 = this.f224743z;
        if (listView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView3.setOnTouchListener(new f93.e0(this));
        android.widget.ListView listView4 = this.f224743z;
        if (listView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        f93.y yVar2 = this.A;
        if (yVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        listView4.setAdapter((android.widget.ListAdapter) yVar2);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.jft);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        ((com.p314xaae8f345.mm.p648x55baa833.ui.C10371xec3c2bd0) findViewById4).m79298x40d747ee(new f93.f0(this));
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.mjh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.EditText editText = (android.widget.EditText) findViewById5;
        this.D = editText;
        editText.addTextChangedListener(new f93.h0(this));
        mo54448x9c8c0d33(new f93.i0(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572553bm0), new f93.j0(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        c01.d9.e().q(kd1.c.f72435x366c91de, this);
        c01.d9.e().q(637, this);
        c01.d9.e().q(638, this);
        f93.y yVar = this.A;
        if (yVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        yVar.k();
        this.E.mo50302x6b17ad39(null);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c01.d9.e().q(636, this);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        c01.d9.e().a(636, this);
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str};
        java.lang.String str2 = this.f224724d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var);
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.E;
        switch (mo808xfb85f7b0) {
            case kd1.c.f72435x366c91de /* 635 */:
                if (i17 != 0 || i18 != 0) {
                    W6();
                    return;
                }
                r45.c4 c4Var = (r45.c4) ((e93.a) m1Var).f331881d.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4Var, "getResponse(...)");
                java.util.LinkedList LabelPairList = c4Var.f452793e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(LabelPairList, "LabelPairList");
                if (LabelPairList.size() <= 0) {
                    W6();
                    return;
                }
                java.lang.Object obj = LabelPairList.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                r45.f54 f54Var = (r45.f54) obj;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "cpan[onSceneEnd] add label pair.LabelID:%s pair.LabelName:%s", f54Var.f455555e + "", f54Var.f455554d);
                this.f224729i = f54Var.f455555e + "";
                U6();
                return;
            case 636:
                f93.m0 m0Var = f93.m0.f341917d;
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "cpan[onSceneEnd] delete fail.");
                    db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572576bo5), "", m0Var);
                    return;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = this.f224730m;
                com.p314xaae8f345.mm.p2621x8fb0427b.h4 wi6 = b93.r.wi();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d4Var);
                if (wi6.mo9951xb06685ab(d4Var, "labelID")) {
                    setResult(-1);
                    finish();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "cpan[doDeleteContactLabel] fail.");
                    db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572576bo5), "", m0Var);
                }
                if (n3Var != null) {
                    n3Var.mo50307xb9e94560(6002, 300L);
                    return;
                }
                return;
            case 637:
                if (i17 != 0 || i18 != 0) {
                    W6();
                    return;
                }
                java.lang.String str3 = this.f224729i;
                java.lang.String str4 = this.f224728h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "cpan[doInsertOrUpdateLable]");
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(str3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf, "valueOf(...)");
                    i19 = valueOf.intValue();
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "id is not integer type:%s", str3 + "");
                    i19 = -1;
                }
                if (i19 != -1) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.d4 n17 = b93.r.wi().n1(str3);
                    if (n17 == null) {
                        n17 = new com.p314xaae8f345.mm.p2621x8fb0427b.d4();
                    }
                    n17.f66585x70ce48ca = i19;
                    n17.f66586x7661fe9a = str4;
                    n17.f66587x68c44467 = x51.k.a(str4);
                    n17.f66588xb0759da4 = x51.k.b(str4);
                    b93.r.wi().mo9952xce0038c9(n17, "labelID");
                } else {
                    W6();
                }
                U6();
                return;
            case 638:
                if (i17 != 0 || i18 != 0) {
                    W6();
                    return;
                }
                V6();
                if (n3Var != null) {
                    n3Var.mo50307xb9e94560(6002, 300L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        if (!(dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return false;
        }
        f93.y yVar = this.A;
        if (yVar != null) {
            return yVar.f342047r.contains(((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) dVar).f288352z);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
        throw null;
    }
}
