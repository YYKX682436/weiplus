package com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388;

@db5.a(m123858x6ac9171 = 32768)
/* renamed from: com.tencent.mm.ui.contact.privacy.FinderBlockListUI */
/* loaded from: classes10.dex */
public class ActivityC22348x7c995a79 extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d {
    public java.lang.CharSequence H;
    public java.util.LinkedList I;
    public android.widget.TextView K;
    public int F = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 G = null;

    /* renamed from: J, reason: collision with root package name */
    public java.util.Set f288653J = new java.util.HashSet();

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public uf5.w0 T6(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var) {
        return new uf5.d1(this, l4Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderBlockListUI", "doCallSelectContactUIForMultiRetransmit");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.ui.contact.SelectContactUI");
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.eol));
        intent.putExtra("always_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f288633d, ","));
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b);
        intent.putExtra("block_contact", c01.z1.r());
        intent.putExtra("max_limit_num", 20);
        intent.putExtra("Forbid_SelectChatRoom", true);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        startActivityForResult(intent, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        int i17 = this.F;
        if (i17 == 2) {
            intent.putExtra("filter_type", "@finder.block.my.liked.android");
        } else if (i17 == 1) {
            intent.putExtra("filter_type", "@finder.block.his.liked.android");
        }
        b7(intent);
        intent.putExtra("titile", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hla));
        startActivityForResult(intent, 2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void X6(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1;
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || (P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        this.f288653J.clear();
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 30);
        int i17 = 0;
        while (i17 < P1.size()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i18 = 0; i17 < P1.size() && i18 < b17; i18++) {
                arrayList.add((java.lang.String) P1.get(i17));
                i17++;
            }
            this.f288653J.add(this.G.b(arrayList));
        }
        this.f288652z = true;
        this.D.a(new uf5.a1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public boolean Y6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void Z6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = this.f288636g.getItem(i17);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return;
        }
        java.lang.String str = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) item).f288352z;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void a7(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1;
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || (P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        this.D.b(new uf5.b1(this, P1), new uf5.c1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderBlockListUI", "onNotifyChange: event = " + i17 + " stg = " + a1Var + " obj = " + obj);
        if (i17 == 4) {
            g7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c_z;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void h7() {
        android.widget.TextView textView;
        uf5.w0 w0Var = this.f288636g;
        if (w0Var == null || w0Var.u() != 0 || (textView = this.K) == null) {
            this.K.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d
    public void i7() {
        java.lang.CharSequence charSequence;
        uf5.w0 w0Var = this.f288636g;
        if (w0Var == null || w0Var.u() <= 0) {
            mo56583xbf7c1df6(this.H);
            return;
        }
        java.lang.CharSequence charSequence2 = this.H;
        int u17 = this.f288636g.u();
        if ((charSequence2 instanceof android.text.SpannableString) || (charSequence2 instanceof android.text.SpannableStringBuilder)) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence2);
            spannableStringBuilder.append('(').append((java.lang.CharSequence) (u17 + "")).append(')');
            charSequence = spannableStringBuilder;
        } else {
            charSequence = ((java.lang.Object) charSequence2) + "(" + this.f288636g.u() + ")";
        }
        mo56583xbf7c1df6(charSequence);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int intExtra = getIntent().getIntExtra("BLOCK_LIST_TYPE", 0);
        this.F = intExtra;
        if (intExtra == 1) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            this.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ua0();
        } else if (intExtra == 2) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            this.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.za0();
        }
        if (this.G == null) {
            finish();
        }
        super.onCreate(bundle);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ogl);
        this.K = textView;
        if (textView != null) {
            textView.setText(this.G.e(this, true));
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.widget.TextView tv6 = this.K;
            ((c61.l7) b6Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c.f212351x.a(tv6);
        }
        int i17 = this.F;
        if (i17 == 1) {
            this.f288645s = this.G.n().toString();
        } else if (i17 == 2) {
            this.f288645s = this.G.m().toString();
        }
        ve4.g.a(39);
        java.lang.CharSequence i18 = this.G.i();
        this.H = i18;
        mo56583xbf7c1df6(i18);
        android.widget.TextView textView2 = this.f288637h;
        if (textView2 != null) {
            textView2.setText(this.G.e(this, true));
            zy2.b6 b6Var2 = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.widget.TextView tv7 = this.f288637h;
            ((c61.l7) b6Var2).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv7, "tv");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c.f212351x.a(tv7);
        }
        mo54448x9c8c0d33(new uf5.z0(this));
        this.I = this.G.g();
        this.f288633d.clear();
        java.util.List a17 = k35.c.a();
        for (int i19 = 0; i19 < this.I.size(); i19++) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.I.get(i19);
            if (c19782x23db1cfa != null) {
                if (!((java.util.ArrayList) a17).contains(c19782x23db1cfa.m76197x6c03c64c())) {
                    this.f288633d.add(c19782x23db1cfa.m76197x6c03c64c());
                }
            }
        }
        f7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.AbstractActivityC22347xd7e8b37d, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        this.D.c();
        w11.h0 h0Var = (w11.h0) m1Var;
        if (i17 == 0 && i18 == 0) {
            int i19 = h0Var.f523574g;
            if (i19 == 1) {
                if (h0Var.H() != null && h0Var.H().f457660e != null) {
                    java.util.Iterator it = h0Var.H().f457660e.iterator();
                    while (it.hasNext()) {
                        r45.vn4 vn4Var = (r45.vn4) it.next();
                        r45.un4 un4Var = vn4Var.f469930e;
                        if (un4Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(un4Var.f469027d) && !this.f288633d.contains(vn4Var.f469930e.f469027d)) {
                            this.f288633d.add(vn4Var.f469930e.f469027d);
                        }
                    }
                }
                g7();
            }
            if (i19 == 2) {
                if (h0Var.H() != null && h0Var.H().f457660e != null) {
                    java.util.Iterator it6 = h0Var.H().f457660e.iterator();
                    while (it6.hasNext()) {
                        r45.vn4 vn4Var2 = (r45.vn4) it6.next();
                        r45.un4 un4Var2 = vn4Var2.f469930e;
                        if (un4Var2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(un4Var2.f469027d) && this.f288633d.contains(vn4Var2.f469930e.f469027d)) {
                            this.f288633d.remove(vn4Var2.f469930e.f469027d);
                        }
                    }
                }
                g7();
            }
            if (this.f288653J.contains(m1Var)) {
                this.f288653J.remove(m1Var);
                if (this.f288653J.isEmpty()) {
                    d7();
                    g7();
                }
            }
        } else if (this.f288653J.contains(m1Var)) {
            this.f288653J.remove(m1Var);
            if (this.f288653J.isEmpty()) {
                c7();
            }
            g7();
        }
        this.f288652z = false;
        this.A = false;
    }
}
