package hr3;

/* loaded from: classes11.dex */
public class z9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.ja f365771d;

    public z9(hr3.ja jaVar) {
        this.f365771d = jaVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String string;
        int itemId = menuItem.getItemId();
        r61.a aVar = null;
        hr3.ja jaVar = this.f365771d;
        switch (itemId) {
            case 1:
                jaVar.f365229d.f365642e.M1.d("hide_btn");
                hr3.va vaVar = jaVar.f365229d;
                vaVar.f365642e.M1.c();
                vaVar.getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = vaVar.f365642e;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).n(c16861xdcf09668.L.d1(), true);
                c16861xdcf09668.L = n17;
                if (!n17.r2()) {
                    vaVar.a(c16861xdcf09668.L.d1());
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_Scene", c16861xdcf09668.N);
                intent.putExtra("Contact_User", c16861xdcf09668.L.d1());
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c16861xdcf09668.K1;
                intent.putExtra("Contact_RoomNickname", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Contact_RoomNickname"));
                intent.putExtra("contact_phone_number_list", c16861xdcf09668.L.E1);
                java.lang.String str = "";
                if (!c16861xdcf09668.L.p2()) {
                    java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Contact_Mobile_MD5");
                    java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Contact_full_Mobile_MD5");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16861xdcf09668.L.d1())) {
                            aVar = m61.k.wi().h(c16861xdcf09668.L.d1());
                        }
                    } else if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) && ((aVar = m61.k.wi().i(stringExtra)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.e()))) {
                        aVar = m61.k.wi().i(stringExtra2);
                    }
                    if (aVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.e())) {
                        java.lang.String f17 = aVar.f();
                        if (f17 == null) {
                            f17 = "";
                        }
                        str = f17.replace(" ", "");
                    }
                }
                intent.putExtra("contact_phone_number_by_md5", str);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.m(intent, c16861xdcf09668.f279303d);
                return;
            case 2:
                boolean t27 = jaVar.f365229d.f365642e.L.t2();
                hr3.va vaVar2 = jaVar.f365229d;
                if (t27) {
                    c01.e2.y0(vaVar2.f365642e.L);
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = vaVar2.f365642e.K1;
                    db5.e1.T(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572540bj5));
                } else {
                    c01.e2.o0(vaVar2.f365642e.L);
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = vaVar2.f365642e.K1;
                    db5.e1.T(abstractActivityC21394xb3d2c0cf3, abstractActivityC21394xb3d2c0cf3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bdk));
                }
                vaVar2.f365642e.L = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(vaVar2.f365642e.L.d1(), true);
                return;
            case 3:
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("sns_permission_userName", jaVar.f365229d.f365642e.L.d1());
                intent2.putExtra("sns_permission_anim", true);
                intent2.putExtra("sns_permission_block_scene", 1);
                j45.l.j(jaVar.f365229d.f365642e.K1, "sns", ".ui.SnsPermissionUI", intent2, null);
                return;
            case 4:
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf096682 = jaVar.f365229d.f365642e;
                java.lang.String d17 = c16861xdcf096682.L.d1();
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("Select_Talker_Name", c16861xdcf096682.L.d1());
                intent3.putExtra("Select_block_List", d17);
                intent3.putExtra("Select_Conv_Type", 3);
                intent3.putExtra("Select_Send_Card", true);
                intent3.putExtra("mutil_select_is_ret", true);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.getClass();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf4 = c16861xdcf096682.K1;
                intent3.setClass(abstractActivityC21394xb3d2c0cf4, com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.class);
                abstractActivityC21394xb3d2c0cf4.startActivityForResult(intent3, 1);
                return;
            case 5:
                boolean o27 = jaVar.f365229d.f365642e.L.o2();
                hr3.va vaVar3 = jaVar.f365229d;
                if (o27) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf096683 = vaVar3.f365642e;
                    c01.e2.F0(c16861xdcf096683.L);
                    c16861xdcf096683.L.r3();
                    if (c16861xdcf096683.X) {
                        c16861xdcf096683.H1.setVisibility(8);
                        vaVar3.f();
                        return;
                    }
                    return;
                }
                android.view.View inflate = android.view.View.inflate(vaVar3.f365642e.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bxs, null);
                inflate.setPadding(0, 0, 0, 0);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jlf);
                textView.setPadding(0, 0, 0, 0);
                textView.setText(com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(vaVar3.f365642e.L.d1()) ? com.p314xaae8f345.mm.R.C30867xcad56011.bfe : com.p314xaae8f345.mm.R.C30867xcad56011.bfd);
                android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.jld);
                checkBox.setChecked(false);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jle);
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bff);
                if (vaVar3.f365642e.L.m43619x2fa78b11() == 18) {
                    checkBox.setVisibility(0);
                    textView2.setVisibility(0);
                } else {
                    checkBox.setVisibility(8);
                    textView2.setVisibility(8);
                }
                android.content.Context context = vaVar3.f365642e.f279303d;
                db5.e1.I(context, true, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfc), inflate, vaVar3.f365642e.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), vaVar3.f365642e.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.x9(this, checkBox), null);
                return;
            case 6:
                android.view.View inflate2 = android.view.View.inflate(jaVar.f365229d.f365642e.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bxs, null);
                inflate2.setPadding(0, 0, 0, 0);
                android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.jlf);
                textView3.setPadding(0, 0, 0, 0);
                hr3.va vaVar4 = jaVar.f365229d;
                if (c01.e2.M(vaVar4.f365642e.L.d1())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf096684 = vaVar4.f365642e;
                    string = c16861xdcf096684.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572575bo4, c16861xdcf096684.L.g2());
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf096685 = vaVar4.f365642e;
                    string = c16861xdcf096685.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572572bo1, c16861xdcf096685.L.g2());
                }
                textView3.setText(string);
                android.widget.CheckBox checkBox2 = (android.widget.CheckBox) inflate2.findViewById(com.p314xaae8f345.mm.R.id.jld);
                checkBox2.setChecked(false);
                android.widget.TextView textView4 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.jle);
                textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bff);
                if (vaVar4.f365642e.L.m43619x2fa78b11() == 18) {
                    checkBox2.setVisibility(0);
                    textView4.setVisibility(0);
                } else {
                    checkBox2.setVisibility(8);
                    textView4.setVisibility(8);
                }
                android.content.Context context2 = vaVar4.f365642e.f279303d;
                db5.e1.J(context2, true, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572494bd5), inflate2, vaVar4.f365642e.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), vaVar4.f365642e.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.y9(this, checkBox2), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
                return;
            case 7:
                hr3.va vaVar5 = jaVar.f365229d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf096686 = vaVar5.f365642e;
                c16861xdcf096686.L.getClass();
                xp1.c.j(c16861xdcf096686.K1, c16861xdcf096686.L.d1());
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new hr3.ka(vaVar5), 1000L);
                return;
            case 8:
            default:
                return;
            case 9:
                hr3.va.b(jaVar.f365229d);
                return;
        }
    }
}
