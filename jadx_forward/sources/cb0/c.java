package cb0;

/* loaded from: classes10.dex */
public final class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.e0 f121733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cb0.d f121734e;

    public c(l41.e0 e0Var, cb0.d dVar) {
        this.f121733d = e0Var;
        this.f121734e = dVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        l41.e0 e0Var = this.f121733d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, e0Var)) {
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            e0Var.getClass();
            d17.q(vb1.e.f77260x366c91de, this);
            java.lang.Object d18 = bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2557xc3c3c8ee.C20595x893410e5());
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d18, 1)) {
                i18 = -1;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d18, 2)) {
                r45.ex5 ex5Var = e0Var != null ? e0Var.f397338i : null;
                if (ex5Var != null) {
                    ex5Var.f455322f = "测试测试测试测试测试测试测试";
                }
            }
            java.util.Objects.toString(e0Var);
            if (e0Var != null) {
                r45.ex5 ex5Var2 = e0Var.f397338i;
            }
            java.util.Objects.toString(d18);
            cb0.d dVar = this.f121734e;
            if (i17 == 0 && i18 == 0) {
                r45.ex5 ex5Var3 = e0Var.f397338i;
                if (ex5Var3 != null) {
                    r45.cx5 cx5Var = e0Var.f397336g;
                    java.lang.String str3 = ex5Var3.f455322f;
                    java.lang.String str4 = cx5Var.f453433d;
                    if (str4 == null || r26.n0.N(str4)) {
                        str2 = "openImSearchItem.UserName is null";
                    } else {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("Contact_User", cx5Var.f453433d);
                        intent.putExtra("AntispamTicket", cx5Var.f453443q);
                        intent.putExtra("key_add_contact_openim_appid", cx5Var.f453440n);
                        intent.putExtra("key_add_contact_openim_finder_username", cx5Var.f453444r);
                        intent.putExtra("Contact_Nick", cx5Var.f453434e);
                        intent.putExtra("Contact_PyInitial", cx5Var.f453435f);
                        intent.putExtra("Contact_QuanPin", cx5Var.f453436g);
                        intent.putExtra("Contact_Sex", cx5Var.f453437h);
                        intent.putExtra("key_add_contact_custom_detail_visible", cx5Var.f453442p.f451928d);
                        intent.putExtra("key_add_contact_custom_detail", cx5Var.f453442p.f451929e);
                        cb0.a.a(2, str3 == null || r26.n0.N(str3) ? 1 : 3, dVar.f121736b);
                        intent.putExtra("KSpamInfo", new com.p314xaae8f345.mm.p689xc5a27af6.p755xc3c3c8ee.p756x316220.C10636x7e6467b7(dVar.f121736b, str3, dVar.f121737c));
                        if (dVar.f121739e) {
                            bh5.c cVar = new bh5.c();
                            cVar.d(intent);
                            cVar.f102455a.f102457a = dVar.f121735a;
                            cVar.a("com.tencent.mm.plugin.profile.ui.ContactInfoUI");
                            cVar.c(true);
                            cVar.g();
                        } else {
                            j45.l.j(dVar.f121735a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
                            android.content.Context context = dVar.f121735a;
                            if (context instanceof android.app.Activity) {
                                ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
                            }
                        }
                        str2 = null;
                        str = null;
                    }
                } else {
                    str2 = "rsp is null";
                }
                str = null;
            } else {
                cb0.a.a(2, 2, dVar.f121736b);
                java.lang.String str5 = "errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str;
                if (i17 == 4) {
                    if (!(str == null || r26.n0.N(str))) {
                        str2 = str5;
                    }
                }
                str2 = str5;
                str = null;
            }
            if (str2 == null) {
                dVar.c(true, null, str);
            } else {
                dVar.c(false, str2, str);
            }
        }
    }
}
