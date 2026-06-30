package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba f210940d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba) {
        this.f210940d = activityC15007xc74afeba;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862> m75941xfb821914;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba = this.f210940d;
        if (activityC15007xc74afeba.F != 0) {
            activityC15007xc74afeba.getIntent().putExtra("key_activity_end_time", activityC15007xc74afeba.F);
        }
        r45.e21 e21Var = activityC15007xc74afeba.L;
        if (e21Var != null && (m75941xfb821914 = e21Var.m75941xfb821914(22)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 : m75941xfb821914) {
                if (c19786x6a1e2862 != null) {
                    arrayList2.add(c19786x6a1e2862.mo14344x5f01b1f6());
                }
            }
            activityC15007xc74afeba.getIntent().putExtra("key_activity_jump_info_list", arrayList2);
        }
        r45.e21 e21Var2 = activityC15007xc74afeba.L;
        if (e21Var2 != null && (m75945x2fec8307 = e21Var2.m75945x2fec8307(23)) != null) {
            activityC15007xc74afeba.getIntent().putExtra("key_activity_post_wording", m75945x2fec8307);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e3 e3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e3.f206542a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15007xc74afeba.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        e3Var.a("5", xy2.c.e(mo55332x76847179), new org.json.JSONObject().put("vst_id", activityC15007xc74afeba.f210025p1));
        activityC15007xc74afeba.setResult(-1, activityC15007xc74afeba.getIntent());
        activityC15007xc74afeba.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
