package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes11.dex */
public class o1 implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18743x7cb33d67 f256597a;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18743x7cb33d67 activityC18743x7cb33d67) {
        this.f256597a = activityC18743x7cb33d67;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18743x7cb33d67 activityC18743x7cb33d67 = this.f256597a;
        java.lang.String c17 = lz.a.c(activityC18743x7cb33d67.f256434d, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "roomPref del " + i17 + " userName : " + c17);
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.equals(c17)) {
            db5.e1.s(activityC18743x7cb33d67.mo55332x76847179(), activityC18743x7cb33d67.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4t), "");
            return;
        }
        activityC18743x7cb33d67.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "dealDelChatRoomMember");
        if (c17 != null && !c17.equals("")) {
            java.util.List list = activityC18743x7cb33d67.f256438h;
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            arrayList.remove(c17);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = activityC18743x7cb33d67.f256434d;
            if (c19662x4f7a67f32 != null) {
                c19662x4f7a67f32.S(list);
                activityC18743x7cb33d67.f256434d.s();
            }
            if (arrayList.size() != 0 || (c19662x4f7a67f3 = activityC18743x7cb33d67.f256434d) == null) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f33 = activityC18743x7cb33d67.f256434d;
                if (c19662x4f7a67f33 != null) {
                    c19662x4f7a67f33.T(true);
                    c19662x4f7a67f33.V(true);
                }
            } else {
                c19662x4f7a67f3.N();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f34 = activityC18743x7cb33d67.f256434d;
                c19662x4f7a67f34.T(true);
                c19662x4f7a67f34.V(false);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC18743x7cb33d67.f256437g).notifyDataSetChanged();
            }
            ((java.util.ArrayList) activityC18743x7cb33d67.f256440m).clear();
            activityC18743x7cb33d67.X6();
            activityC18743x7cb33d67.Y6();
        }
        if (!(((java.lang.Object) activityC18743x7cb33d67.f256442o) + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18743x7cb33d67.f256438h, ",")).equals(activityC18743x7cb33d67.f256443p) || activityC18743x7cb33d67.f256441n == 0) {
            activityC18743x7cb33d67.m78501x43e00957(true);
        } else {
            activityC18743x7cb33d67.m78501x43e00957(false);
        }
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18743x7cb33d67 activityC18743x7cb33d67 = this.f256597a;
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18743x7cb33d67.f256438h, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", activityC18743x7cb33d67.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("show_too_many_member", false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288315c, 1024), 524288) & (-16777217));
        intent.putExtra("always_select_contact", c17);
        intent.putExtra("topstory_import_type", activityC18743x7cb33d67.f256441n == 1 ? 1 : 2);
        j45.l.v(activityC18743x7cb33d67, ".ui.contact.SelectContactUI", intent, 1);
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f256597a.f256434d;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.N();
        }
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18743x7cb33d67 activityC18743x7cb33d67 = this.f256597a;
        java.lang.String c17 = lz.a.c(activityC18743x7cb33d67.f256434d, i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", c17);
        j45.l.j(activityC18743x7cb33d67, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }
}
