package cb0;

/* loaded from: classes10.dex */
public final class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.e0 f40200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cb0.d f40201e;

    public c(l41.e0 e0Var, cb0.d dVar) {
        this.f40200d = e0Var;
        this.f40201e = dVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        l41.e0 e0Var = this.f40200d;
        if (kotlin.jvm.internal.o.b(m1Var, e0Var)) {
            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
            e0Var.getClass();
            d17.q(vb1.e.CTRL_INDEX, this);
            java.lang.Object d18 = bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.openim.RepairerConfigOpenIMSearchStrategy());
            if (kotlin.jvm.internal.o.b(d18, 1)) {
                i18 = -1;
            } else if (kotlin.jvm.internal.o.b(d18, 2)) {
                r45.ex5 ex5Var = e0Var != null ? e0Var.f315805i : null;
                if (ex5Var != null) {
                    ex5Var.f373789f = "测试测试测试测试测试测试测试";
                }
            }
            java.util.Objects.toString(e0Var);
            if (e0Var != null) {
                r45.ex5 ex5Var2 = e0Var.f315805i;
            }
            java.util.Objects.toString(d18);
            cb0.d dVar = this.f40201e;
            if (i17 == 0 && i18 == 0) {
                r45.ex5 ex5Var3 = e0Var.f315805i;
                if (ex5Var3 != null) {
                    r45.cx5 cx5Var = e0Var.f315803g;
                    java.lang.String str3 = ex5Var3.f373789f;
                    java.lang.String str4 = cx5Var.f371900d;
                    if (str4 == null || r26.n0.N(str4)) {
                        str2 = "openImSearchItem.UserName is null";
                    } else {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("Contact_User", cx5Var.f371900d);
                        intent.putExtra("AntispamTicket", cx5Var.f371910q);
                        intent.putExtra("key_add_contact_openim_appid", cx5Var.f371907n);
                        intent.putExtra("key_add_contact_openim_finder_username", cx5Var.f371911r);
                        intent.putExtra("Contact_Nick", cx5Var.f371901e);
                        intent.putExtra("Contact_PyInitial", cx5Var.f371902f);
                        intent.putExtra("Contact_QuanPin", cx5Var.f371903g);
                        intent.putExtra("Contact_Sex", cx5Var.f371904h);
                        intent.putExtra("key_add_contact_custom_detail_visible", cx5Var.f371909p.f370395d);
                        intent.putExtra("key_add_contact_custom_detail", cx5Var.f371909p.f370396e);
                        cb0.a.a(2, str3 == null || r26.n0.N(str3) ? 1 : 3, dVar.f40203b);
                        intent.putExtra("KSpamInfo", new com.tencent.mm.feature.openim.impl.SpamInfo(dVar.f40203b, str3, dVar.f40204c));
                        if (dVar.f40206e) {
                            bh5.c cVar = new bh5.c();
                            cVar.d(intent);
                            cVar.f20922a.f20924a = dVar.f40202a;
                            cVar.a("com.tencent.mm.plugin.profile.ui.ContactInfoUI");
                            cVar.c(true);
                            cVar.g();
                        } else {
                            j45.l.j(dVar.f40202a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                            android.content.Context context = dVar.f40202a;
                            if (context instanceof android.app.Activity) {
                                ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
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
                cb0.a.a(2, 2, dVar.f40203b);
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
