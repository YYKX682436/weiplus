package com.p314xaae8f345.mm.ui.p2690x38b72420;

@db5.a(m123858x6ac9171 = 19)
@gm0.a2
/* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationUI */
/* loaded from: classes11.dex */
public class ActivityC22335xd5b6c7eb extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public static final int N = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(1, 2);
    public android.widget.RelativeLayout C;
    public android.widget.RelativeLayout D;
    public android.widget.LinearLayout E;
    public android.widget.ImageView F;
    public android.widget.TextView G;

    /* renamed from: J, reason: collision with root package name */
    public int f288102J;
    public com.p314xaae8f345.mm.ui.p2690x38b72420.pb K;
    public java.util.List L;
    public final boolean H = true;
    public java.util.List I = new java.util.LinkedList();
    public final android.view.MenuItem.OnMenuItemClickListener M = new com.p314xaae8f345.mm.ui.p2690x38b72420.dc(this);

    public void A7(java.util.List list) {
        z7();
        com.p314xaae8f345.mm.ui.p2690x38b72420.pb pbVar = this.K;
        if (pbVar != null) {
            pbVar.w(list);
        }
        b7().notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            ((java.util.LinkedList) this.I).remove(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.k(str);
            A7(this.I);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public java.lang.String W5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str = dVar.f288383s;
        if (str == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.N3(str)) {
            return null;
        }
        java.util.List<java.lang.String> list = this.I;
        int i17 = 0;
        if (list != null) {
            for (java.lang.String str2 : list) {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                if (c01.v1.y(str2)) {
                    i17++;
                }
            }
        }
        if (i17 != 0) {
            return getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574493ig2, java.lang.Integer.valueOf(i17));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.pb pbVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.pb(this, this.L, true, this.H, false, this.f288102J);
        this.K = pbVar;
        return pbVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.f5((com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47) this, this.L, true, this.A, false, true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        int[] intArrayExtra = getIntent().getIntArrayExtra("search_range");
        return intArrayExtra != null ? intArrayExtra : super.d7();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(-1, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        java.lang.String stringExtra = getIntent().getStringExtra("Select_Conv_ui_title");
        return (stringExtra == null || stringExtra.length() <= 0) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.jgi) : stringExtra;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        boolean z17;
        int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationUI", "Click HeaderView position=%d", java.lang.Integer.valueOf(i17));
            x7();
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(headerViewsCount);
        if (item == null || (str = item.f288383s) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationUI", "ClickUser=%s", str);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this, com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22334x657dae5.class);
            intent.putExtra("no_result_tip", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhp));
            intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.I, ","));
            intent.putExtra("select_chatroom_name", str);
            startActivityForResult(intent, 6);
        } else {
            if ("conversationboxservice".equals(str)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(this, com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22337x72d122d.class);
                intent2.putExtras(getIntent().getExtras());
                intent2.putExtra("KIsMultiSelect", true);
                intent2.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.I, ","));
                startActivityForResult(intent2, 7);
                db5.f.a(mo55332x76847179(), intent2);
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
            if (!((java.util.LinkedList) this.I).contains(str) && y7(((java.util.LinkedList) this.I).size() + 1)) {
                Y6();
                return;
            }
            Y6();
            if (android.text.TextUtils.isEmpty(str) || !str.contains("openim")) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
                if (c19642xb279030 != null) {
                    c19642xb279030.d(str);
                }
                if (((java.util.LinkedList) this.I).contains(str)) {
                    ((java.util.LinkedList) this.I).remove(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.k(str);
                } else {
                    ((java.util.LinkedList) this.I).add(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.a(str, 1);
                }
            } else {
                db5.e1.t(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhm), "", new com.p314xaae8f345.mm.ui.p2690x38b72420.DialogInterfaceOnClickListenerC22336x216b3816());
            }
        }
        A7(this.I);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        this.C = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.lls);
        this.D = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.gzk);
        this.E = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.chj);
        this.F = (android.widget.ImageView) this.C.findViewById(com.p314xaae8f345.mm.R.id.h6y);
        android.widget.TextView textView = (android.widget.TextView) this.C.findViewById(com.p314xaae8f345.mm.R.id.gze);
        this.G = textView;
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        this.G.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.iex));
        ((android.widget.TextView) this.C.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifk));
        android.widget.ImageView imageView = this.F;
        if (imageView != null) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79688xb16c076b);
        }
        this.E.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.bc(this));
        java.util.List list = this.I;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
        if (c19642xb279030 != null) {
            c19642xb279030.e(list);
        }
        A7(list);
        this.f287979d.setOnScrollListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.ac(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.f288102J = getIntent().getIntExtra("Select_Conv_Type", N);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b());
        hashSet.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.c());
        java.lang.String stringExtra = getIntent().getStringExtra("Select_block_List");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            hashSet.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")));
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.f288102J, 2)) {
            java.util.HashSet i17 = c01.e2.i();
            i17.remove("filehelper");
            hashSet.addAll(i17);
        }
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(this.f288102J, 4)) {
            hashSet.remove("conversationboxservice");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.L = arrayList;
        arrayList.addAll(hashSet);
        java.util.List list = this.L;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int size = list.size();
        list.addAll(k35.c.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationUI", "[fillBlockList] cost:%sms size:%s block size:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(list.size() - size));
        w7();
        this.I = new java.util.LinkedList();
        java.lang.String stringExtra2 = getIntent().getStringExtra("Select_Contact");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            return;
        }
        this.I.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(",")));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return !(this instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22337x72d122d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = null");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            ((java.util.LinkedList) this.I).clear();
            ((java.util.LinkedList) this.I).addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")));
            java.util.List list = this.I;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
            if (c19642xb279030 != null) {
                c19642xb279030.e(list);
            }
            A7(list);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.p7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        o25.n1.c(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m78548x39037dd1();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void p7() {
        super.p7();
        mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f288383s) == null) {
            return false;
        }
        return this.I.contains(str);
    }

    public void w7() {
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbc), this.M, null, com.p314xaae8f345.mm.ui.fb.GREEN);
        z7();
    }

    public final void x7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelectConversationUI", "selectContactFromAddressUI");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22333xa8c37c31.class);
        intent.putExtra("Contact_Compose", true);
        intent.putExtra("List_Type", 1);
        intent.putExtra("Add_address_titile", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jgi));
        intent.putExtra("footer_tip", mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhf));
        intent.putExtra("Contact_GroupFilter_Type", "@micromsg.qq.com");
        intent.putExtra("Block_list", c01.z1.r());
        intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.I, ","));
        intent.putExtra("sns_address_count", this.I.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(6);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(this, arrayList.toArray(), "com/tencent/mm/ui/contact/SnsSelectConversationUI", "selectContactFromAddressUI", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final boolean y7(int i17) {
        if (i17 <= 10) {
            return false;
        }
        db5.e1.t(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.jhs, java.lang.Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10))), "", new com.p314xaae8f345.mm.ui.p2690x38b72420.ec(this));
        return true;
    }

    public void z7() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f287983h;
        if (c19642xb279030 != null) {
            c19642xb279030.setVisibility(0);
        }
        java.util.List list = this.I;
        if (list != null && list.size() > 0) {
            mo60878xf6b21fea(1, java.lang.String.format("%s(%d/%d)", getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbc), java.lang.Integer.valueOf(this.I.size()), 10));
            m78615xdf8a9a94(1, com.p314xaae8f345.mm.ui.fb.GREEN);
            m78500x43e00957(1, true);
        } else {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.jbc));
            m78500x43e00957(1, false);
            if (!(this instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22337x72d122d)) {
                i7();
            }
        }
    }
}
