package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.profile.ui.AddDescriptionUI */
/* loaded from: classes11.dex */
public class ActivityC16833xebe5488f extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {
    public static final /* synthetic */ int B = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f235161d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f235162e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f235163f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f235164g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f235165h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f235166i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f235167m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f235168n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f235170p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f235171q;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235175u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.ya f235176v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f235177w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f235178x;

    /* renamed from: o, reason: collision with root package name */
    public int f235169o = 0;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f235172r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f235173s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f235174t = new java.util.ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final int[] f235179y = new int[3];

    /* renamed from: z, reason: collision with root package name */
    public final hr3.u f235180z = new hr3.u(this, null);
    public boolean A = true;

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f, boolean z17) {
        activityC16833xebe5488f.A = true;
        ck5.f b17 = ck5.f.b(activityC16833xebe5488f.f235162e.getEditText());
        b17.f124094f = 0;
        b17.f124093e = 400;
        b17.d(new hr3.g(activityC16833xebe5488f));
        if (activityC16833xebe5488f.A) {
            boolean c76 = activityC16833xebe5488f.c7();
            java.util.ArrayList arrayList = activityC16833xebe5488f.f235174t;
            if (c76) {
                if (z17) {
                    java.util.ArrayList arrayList2 = activityC16833xebe5488f.f235172r;
                    int size = arrayList2 != null ? arrayList2.size() : 0;
                    if (size > 0) {
                        for (int i17 = 0; i17 < size; i17++) {
                            java.lang.String c17 = i21.q.h().c(activityC16833xebe5488f.f235177w, i17);
                            if (!c17.equals(arrayList2.get(i17))) {
                                com.p314xaae8f345.mm.vfs.w6.c((java.lang.String) arrayList2.get(i17), c17);
                                com.p314xaae8f345.mm.vfs.w6.h((java.lang.String) arrayList2.get(i17));
                            }
                            arrayList.add(c17);
                        }
                    }
                } else {
                    arrayList.clear();
                    arrayList.addAll(activityC16833xebe5488f.f235173s);
                }
                activityC16833xebe5488f.Z6();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.AddDescriptionUI", "[dealModRemarkDesc] :%s", activityC16833xebe5488f.f235177w);
            if (activityC16833xebe5488f.b7()) {
                java.lang.String charSequence = activityC16833xebe5488f.f235162e.m79028xfb85ada3().toString();
                activityC16833xebe5488f.f235170p = charSequence;
                r45.wn4 wn4Var = new r45.wn4();
                wn4Var.f470844d = activityC16833xebe5488f.f235177w;
                wn4Var.f470845e = charSequence;
                ((e21.z0) c01.d9.b().w()).c(new xg3.p0(54, wn4Var));
            }
            java.lang.String str = activityC16833xebe5488f.f235170p;
            java.lang.String b18 = com.p314xaae8f345.mm.p670x38b72420.b.b(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.AddDescriptionUI", "[saveStrangerRemarkInfo] :%s ", activityC16833xebe5488f.f235177w);
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(activityC16833xebe5488f.f235177w, true) != null) {
                activityC16833xebe5488f.f235175u.d3(str);
                activityC16833xebe5488f.f235175u.e3(b18);
                activityC16833xebe5488f.f235175u.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.AddDescriptionUI", "saveStrangerRemarkInfo ret %s, remarkImgUrl:%s", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).l0(activityC16833xebe5488f.f235175u)), b18);
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.valueOf(str == null);
                objArr[1] = java.lang.Integer.valueOf(str != null ? str.length() : 0);
                objArr[2] = str == null ? "" : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.AddDescriptionUI", "remarkDesc (%s, %s, %s)", objArr);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(activityC16833xebe5488f.f235177w);
            if (z07 != null) {
                z07.f66694xdd77ad16 = activityC16833xebe5488f.f235177w;
                z07.f66690xbe857eff = str;
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).mo11260x413cb2b4(z07);
            }
            activityC16833xebe5488f.finish();
        }
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f, int i17) {
        activityC16833xebe5488f.getClass();
        android.content.Intent intent = new android.content.Intent(activityC16833xebe5488f, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901.class);
        intent.putExtra("Contact_User", activityC16833xebe5488f.f235177w);
        intent.putExtra("remark_image_path", activityC16833xebe5488f.f235172r);
        intent.putExtra("selected_item", i17);
        intent.putExtra("view_only", false);
        activityC16833xebe5488f.startActivityForResult(intent, 400);
    }

    public static void W6(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f activityC16833xebe5488f, int i17) {
        activityC16833xebe5488f.f235169o--;
        java.util.ArrayList arrayList = activityC16833xebe5488f.f235172r;
        arrayList.remove(i17);
        if (i17 == 0) {
            activityC16833xebe5488f.f235163f.setVisibility(8);
        } else if (i17 == 1) {
            activityC16833xebe5488f.f235164g.setVisibility(8);
        } else if (i17 == 2) {
            activityC16833xebe5488f.f235165h.setVisibility(8);
        }
        activityC16833xebe5488f.f235161d.setVisibility(0);
        activityC16833xebe5488f.f235168n.setVisibility(8);
        activityC16833xebe5488f.d7(arrayList, 0);
        activityC16833xebe5488f.X6();
    }

    public final void X6() {
        if (!b7() && !c7()) {
            m78501x43e00957(false);
        } else if (this.f235162e.c()) {
            m78501x43e00957(false);
        } else {
            m78501x43e00957(true);
        }
    }

    public final java.lang.String Y6(java.lang.String str, int i17) {
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return null;
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
        java.lang.String str2 = i21.q.h().c(this.f235177w, i17) + ".tmp";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x.v(str, 1080, 1080, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.AddDescriptionUI", "createThumbNail big pic fail");
            return null;
        }
        if (a17 == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.x.y0(str2, a17, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            return str2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.AddDescriptionUI", "rotate big pic fail");
        return null;
    }

    public final void Z6() {
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17;
        java.lang.String a17 = i21.q.h().a(this.f235177w);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(a17);
        if (r6Var.m() && r6Var.y() && (s17 = com.p314xaae8f345.mm.vfs.w6.s(a17, true)) != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                if (x1Var != null) {
                    if (!this.f235174t.contains(a17 + x1Var.f294765b)) {
                        x1Var.a();
                    }
                }
            }
        }
    }

    public final void a7() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_get_desc_report_data", this.f235179y);
        setResult(-1, intent);
        if (b7() || c7()) {
            db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgj), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgl), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgk), new hr3.e(this), new hr3.f(this));
        } else {
            mo48674x36654fab();
            finish();
        }
    }

    public final boolean b7() {
        java.lang.String charSequence = this.f235162e.m79028xfb85ada3().toString();
        java.lang.String str = this.f235170p;
        return (str == null || !str.equals(charSequence)) && !(x51.t1.b(this.f235170p) && x51.t1.b(charSequence));
    }

    public final boolean c7() {
        java.util.ArrayList arrayList = this.f235173s;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = this.f235172r;
        return (size == arrayList2.size() && arrayList.containsAll(arrayList2)) ? false : true;
    }

    public final void d7(java.util.ArrayList arrayList, int i17) {
        android.graphics.Bitmap a17;
        this.f235168n.setVisibility(8);
        this.f235161d.setVisibility(0);
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            float g17 = i65.a.g(this);
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a18.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
            if ((!m17.a() ? false : m17.f294799a.F(m17.f294800b)) && (a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(str, g17)) != null) {
                if (i17 == 0) {
                    this.f235169o = 1;
                    this.f235163f.setVisibility(0);
                    this.f235163f.setImageBitmap(a17);
                    this.f235164g.setVisibility(8);
                    this.f235165h.setVisibility(8);
                } else if (i17 == 1) {
                    this.f235169o = 2;
                    this.f235164g.setVisibility(0);
                    this.f235164g.setImageBitmap(a17);
                    this.f235165h.setVisibility(8);
                } else if (i17 == 2) {
                    this.f235169o = 3;
                    this.f235165h.setVisibility(0);
                    this.f235165h.setImageBitmap(a17);
                    this.f235161d.setVisibility(8);
                    this.f235168n.setVisibility(0);
                }
                i17++;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569514d6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0219 A[EDGE_INSN: B:34:0x0219->B:35:0x0219 BREAK  A[LOOP:0: B:17:0x01c8->B:31:0x01c8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bc  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.AddDescriptionUI", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.util.ArrayList arrayList = this.f235172r;
        if (i17 == 100) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(applicationContext, intent, a17);
            if (b17 == null) {
                return;
            }
            arrayList.add(Y6(b17, arrayList.size()));
            d7(arrayList, 0);
            X6();
            return;
        }
        if (i17 == 200) {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.AddDescriptionUI", "data shouldnot be null");
                return;
            }
            java.util.Iterator<java.lang.String> it = intent.getStringArrayListExtra("CropImage_OutputPath_List").iterator();
            while (it.hasNext()) {
                arrayList.add(Y6(it.next(), arrayList.size()));
            }
            d7(arrayList, 0);
            X6();
            return;
        }
        if (i17 != 400) {
            return;
        }
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.AddDescriptionUI", "data shouldnot be null");
            return;
        }
        if (intent.getBooleanExtra("response_delete", false)) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("remark_image_path");
            if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                this.f235169o = 0;
                this.f235163f.setVisibility(8);
                this.f235164g.setVisibility(8);
                this.f235165h.setVisibility(8);
            }
            d7(stringArrayListExtra, 0);
            arrayList.clear();
            arrayList.addAll(stringArrayListExtra);
            X6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo55426xe0085496() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.AddDescriptionUI", "onClickDialogSpaceOnHalfScreenMode");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.o_k);
        mo78530x8b45058f();
        this.f235177w = getIntent().getStringExtra("Contact_User");
        this.f235178x = getIntent().getStringExtra("Contact_verify_string");
        this.f235175u = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f235177w, true);
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(this.f235177w);
        this.f235176v = z07;
        if (z07 == null || x51.t1.b(z07.f66690xbe857eff)) {
            this.f235170p = this.f235175u.f318122y1;
        } else {
            this.f235170p = this.f235176v.f66690xbe857eff;
        }
        java.lang.String str = this.f235175u.f318124z1;
        this.f235171q = str;
        if (x51.t1.b(str) || this.f235171q.startsWith("http://")) {
            java.lang.String b17 = i21.q.h().b(this.f235177w);
            if (i21.q.h().i(this.f235177w)) {
                this.f235171q = b17;
            } else {
                this.f235171q = "";
            }
        }
        mo43517x10010bd5();
        X6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        a7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
    }
}
