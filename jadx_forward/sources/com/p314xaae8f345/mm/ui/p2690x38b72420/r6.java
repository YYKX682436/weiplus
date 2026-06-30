package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class r6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 f288689d;

    public r6(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd0) {
        this.f288689d = activityC22321x6fa86dd0;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c2201 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd0 = this.f288689d;
        activityC22321x6fa86dd0.f288048t = c6336x745c2201;
        if (i17 == 0) {
            java.util.List L0 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r2) p94.w0.f()).L0(5L);
            android.content.Intent intent = new android.content.Intent(activityC22321x6fa86dd0, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478.class);
            intent.putExtra("list_type", 1);
            intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
            intent.putExtra("already_select_contact", (java.lang.String[]) ((java.util.ArrayList) L0).toArray(new java.lang.String[0]));
            intent.putExtra("max_limit_num", activityC22321x6fa86dd0.f288045q);
            activityC22321x6fa86dd0.startActivityForResult(intent, 1);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c22012 = activityC22321x6fa86dd0.f288048t;
            c6336x745c22012.f136905d = 1L;
            c6336x745c22012.f136914m = java.lang.System.currentTimeMillis();
            return;
        }
        if (i17 == 1) {
            android.content.Intent intent2 = new android.content.Intent(activityC22321x6fa86dd0, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478.class);
            intent2.putExtra("list_type", 1);
            intent2.putExtra("filter_type", "@all.contact.android");
            intent2.putExtra("already_select_contact", (java.lang.String[]) ((java.util.ArrayList) k35.c.b()).toArray(new java.lang.String[0]));
            intent2.putExtra("max_limit_num", activityC22321x6fa86dd0.f288045q);
            activityC22321x6fa86dd0.startActivityForResult(intent2, 1);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c22013 = activityC22321x6fa86dd0.f288048t;
            c6336x745c22013.f136905d = 2L;
            c6336x745c22013.f136914m = java.lang.System.currentTimeMillis();
            return;
        }
        if (i17 == 2) {
            android.content.Intent intent3 = new android.content.Intent(activityC22321x6fa86dd0, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.class);
            intent3.putExtra("select_label", true);
            activityC22321x6fa86dd0.startActivityForResult(intent3, 3);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c22014 = activityC22321x6fa86dd0.f288048t;
            c6336x745c22014.f136905d = 3L;
            c6336x745c22014.f136914m = java.lang.System.currentTimeMillis();
            return;
        }
        android.content.Intent intent4 = new android.content.Intent();
        intent4.putExtra("titile", activityC22321x6fa86dd0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
        intent4.putExtra("list_type", 1);
        intent4.putExtra("KBlockOpenImFav", true);
        intent4.putExtra("without_openim", true);
        intent4.putExtra("show_too_many_member", false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        int g17 = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965, 64, 262144), 131072);
        intent4.putExtra("max_limit_num", activityC22321x6fa86dd0.f288045q);
        intent4.putExtra("list_attr", g17);
        intent4.putExtra("always_select_contact", "");
        j45.l.v(activityC22321x6fa86dd0, ".ui.contact.SelectContactUI", intent4, 1);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c22015 = activityC22321x6fa86dd0.f288048t;
        c6336x745c22015.f136905d = 4L;
        c6336x745c22015.f136914m = java.lang.System.currentTimeMillis();
    }
}
