package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI */
/* loaded from: classes9.dex */
public class ActivityC17154xd9fc4dfa extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public static final /* synthetic */ int I = 0;
    public java.util.List C;
    public java.util.List D;
    public java.util.List E;
    public java.lang.String F;
    public android.view.View G;
    public int H;

    public static void w7(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6641xe68217f2 c6641xe68217f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6641xe68217f2();
        c6641xe68217f2.f139928d = i17;
        c6641xe68217f2.k();
    }

    public final void A7() {
        w7(16);
        db5.e1.E(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzb), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.y8(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.f2(this, this.D, this.C, this.H, true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.f5(this, this.C, false, this.A);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        int i17 = this.H;
        return (i17 == 1 || i17 == 3) ? new int[]{131072, 131075} : new int[]{131072};
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        int i17 = this.H;
        return (i17 == 1 || i17 == 3) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.kze) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.i1h);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        int i18;
        boolean z17 = false;
        if (i17 < this.f287979d.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
            android.content.Intent intent = new android.content.Intent();
            int i19 = this.H;
            if (i19 == 1 || i19 == 3) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
                intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288313a, 16384, 64, 4096, 262144));
                intent.putExtra("min_limit_num", 1);
                intent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
                intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzg));
                intent.putExtra("without_openim", true);
            } else {
                int g17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(16, 1, 2, 4, 16384);
                intent.putExtra("list_type", 0);
                intent.putExtra("list_attr", g17);
                intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.i1e));
                intent.putExtra("sub_title", getString(com.p314xaae8f345.mm.R.C30867xcad56011.l18));
            }
            j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd);
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d) this.f287979d.getAdapter().getItem(i17);
        if (dVar == null || (str = dVar.f288383s) == null) {
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[0] = str == null ? "null" : str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "username[%s] is openime || oepnimechatroom", objArr);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.e1.E(this, com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(str) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzd) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzc), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.u8(this));
            return;
        }
        x7(dVar.f288383s);
        if (b7() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.f2) {
            int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.f2) b7();
            int i27 = f2Var.f239235o;
            if (i27 >= 0 && ((i18 = f2Var.f239236p) < 0 || (headerViewsCount > i27 && headerViewsCount < i18))) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 6, 1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.H = getIntent().getIntExtra("key_from_scene", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("recent_remittance_contact_list");
        this.D = new java.util.ArrayList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.D = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
        }
        if (this.H == 3) {
            this.F = getIntent().getStringExtra("key_title");
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_include_username_list");
            this.E = new java.util.ArrayList();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                this.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(","));
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b());
        hashSet.addAll(c01.e2.i());
        java.lang.String stringExtra3 = getIntent().getStringExtra("Select_block_List");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
            hashSet.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra3.split(",")));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.C = arrayList;
        arrayList.addAll(hashSet);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent.toString());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = null");
        }
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectRemittanceContactUI", "onActivityResult, unknown requestCode = " + i17);
        } else if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "getIntent = " + getIntent());
            if (!(this.H == 3)) {
                setResult(-1, intent);
                finish();
            } else {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    return;
                }
                x7(stringExtra);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78513xc2a54588().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.t8(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            p7();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void p7() {
        super.p7();
        mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void r7(android.widget.ListView listView, int i17) {
        if (this.G == null) {
            android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.cjm, null);
            this.G = inflate.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_q);
            int i18 = this.H;
            if (i18 == 1 || i18 == 3) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kz8);
            } else {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i0e);
            }
            inflate.setAccessibilityDelegate(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.v8(this));
            listView.addHeaderView(inflate);
        }
        android.view.View view = this.G;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/SelectRemittanceContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/remittance/ui/SelectRemittanceContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(h61.b.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    public final void x7(java.lang.String str) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", str);
        boolean z17 = true;
        if (!(this.H == 3)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", str);
            setResult(-1, intent);
            finish();
            mo48674x36654fab();
            return;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            if (!((java.util.ArrayList) this.E).contains(str)) {
                A7();
                return;
            }
            if (((java.util.ArrayList) this.E).size() != 1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(str);
                z7(str, arrayList2, 1);
                return;
            } else {
                java.lang.String str2 = this.F;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(str);
                y7(str, arrayList3, str2);
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "illegal chatroomName");
            arrayList = new java.util.ArrayList();
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            try {
                ?? L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(str);
                arrayList = L0;
                if (L0 == 0) {
                    arrayList = new java.util.ArrayList();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectRemittanceContactUI", "getChatroomMemberList error! %s", e17.getMessage());
                arrayList = new java.util.ArrayList();
            }
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(c01.z1.r());
            arrayList4.add(str);
            arrayList = arrayList4;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0((java.lang.String) it.next(), c01.z1.r())) {
                break;
            }
        }
        if (!z17) {
            A7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectRemittanceContactUI", "self no in chatroom(%s)", str);
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it6 = ((java.util.ArrayList) this.E).iterator();
        while (it6.hasNext()) {
            java.lang.String str3 = (java.lang.String) it6.next();
            if (arrayList.contains(str3)) {
                arrayList5.add(str3);
            }
        }
        if (arrayList5.size() == 0) {
            A7();
        } else if (arrayList5.size() == ((java.util.ArrayList) this.E).size()) {
            y7(str, arrayList5, this.F);
        } else {
            z7(str, arrayList5, arrayList5.size());
        }
    }

    public void y7(java.lang.String str, java.util.ArrayList arrayList, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectRemittanceContactUI", "showLaunchComfirmDialog()");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_x);
        }
        o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
        ((r35.k1) q1Var).Ai(mo78514x143f1b92(), str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571261a1) + str2, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571260a0), new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.z8(this, str, arrayList));
        w7(11);
    }

    public final void z7(java.lang.String str, java.util.ArrayList arrayList, int i17) {
        w7(17);
        db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kza, java.lang.Integer.valueOf(i17)), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.kz_), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.w8(this, str, arrayList), new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.x8(this));
    }
}
