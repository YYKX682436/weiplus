package f93;

/* loaded from: classes11.dex */
public class k1 implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 f341903a;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12) {
        this.f341903a = activityC16168xac76ee12;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12 = this.f341903a;
        activityC16168xac76ee12.G.f137274i = 1;
        java.lang.String c17 = lz.a.c(activityC16168xac76ee12.f224764r, i17);
        activityC16168xac76ee12.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[dealRemoveContact]");
        java.util.ArrayList arrayList = activityC16168xac76ee12.f224770x;
        if (arrayList != null && arrayList.contains(c17)) {
            activityC16168xac76ee12.f224770x.remove(c17);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6380x9b776c73 c6380x9b776c73 = activityC16168xac76ee12.G;
            c6380x9b776c73.f137275j++;
            c6380x9b776c73.f137276k = c6380x9b776c73.b("DeleteUinlist", c6380x9b776c73.f137276k + ";" + c17, true);
        }
        java.util.ArrayList arrayList2 = activityC16168xac76ee12.f224771y;
        if (arrayList2 != null && arrayList2.contains(c17)) {
            activityC16168xac76ee12.B.add(c17);
        }
        java.util.HashSet hashSet = activityC16168xac76ee12.f224772z;
        if (hashSet != null && hashSet.contains(c17)) {
            hashSet.remove(c17);
            activityC16168xac76ee12.A.remove(c17);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC16168xac76ee12.H;
        if (n3Var != null) {
            n3Var.mo50305x3d8a09a2(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4);
        }
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12 = this.f341903a;
        activityC16168xac76ee12.G.f137274i = 1;
        activityC16168xac76ee12.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[dealAddContact]");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b, 1024));
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", activityC16168xac76ee12.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8s));
        intent.putExtra("show_too_many_member", false);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 6);
        java.util.ArrayList arrayList = activityC16168xac76ee12.f224770x;
        if (arrayList != null) {
            intent.putExtra("always_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
        }
        j45.l.v(activityC16168xac76ee12, ".ui.contact.SelectContactUI", intent, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14480xb9cc8658);
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f341903a.f224764r;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.N();
        }
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12 = this.f341903a;
        lz.f fVar = activityC16168xac76ee12.f224764r.M;
        if (fVar != null ? ((r35.u1) fVar).f450807f.g(i17) : false) {
            activityC16168xac76ee12.G.f137273h++;
            java.lang.String c17 = lz.a.c(activityC16168xac76ee12.f224764r, i17);
            java.lang.String a17 = lz.a.a(activityC16168xac76ee12.f224764r, i17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", c17);
            intent.putExtra("Contact_RoomNickname", a17);
            if ((java.util.Objects.equals(activityC16168xac76ee12.E, "label_source_Address") ? (char) 1 : java.util.Objects.equals(activityC16168xac76ee12.E, "label_source_SNS") ? (char) 2 : (char) 65535) == 1) {
                intent.putExtra("CONTACT_INFO_UI_SOURCE", 108);
            } else {
                intent.putExtra("CONTACT_INFO_UI_SOURCE", activityC16168xac76ee12.F ? 17 : 15);
            }
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, activityC16168xac76ee12);
        }
    }
}
