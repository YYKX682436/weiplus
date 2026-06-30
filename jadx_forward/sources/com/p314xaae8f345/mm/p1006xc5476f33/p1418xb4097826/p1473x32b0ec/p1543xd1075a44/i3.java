package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f200162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 f200163e;

    public i3(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b4 b4Var) {
        this.f200162d = c19792x256d2725;
        this.f200163e = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        r45.gw0 gw0Var;
        r45.gw0 gw0Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$bindNewLiveV1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f200162d;
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        if (pm0.v.z(m76794xd0557130 != null ? m76794xd0557130.m75939xb282bd08(37) : 0, 64)) {
            r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
            if (m76794xd05571302 == null || (gw0Var2 = (r45.gw0) m76794xd05571302.m75936x14adae67(40)) == null || (str = gw0Var2.m75945x2fec8307(1)) == null) {
                str = "";
            }
            r45.nw1 m76794xd05571303 = c19792x256d2725.m76794xd0557130();
            if (m76794xd05571303 == null || (gw0Var = (r45.gw0) m76794xd05571303.m75936x14adae67(40)) == null || (str2 = gw0Var.m75945x2fec8307(0)) == null) {
                str2 = "";
            }
            intent.putExtra("key_enter_live_param_bind_type", 4);
            intent.putExtra("key_enter_live_param_by_biz_username", str);
            intent.putExtra("key_enter_live_param_by_biz_nickname", str2);
        }
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        ((m30.m) rVar).Bi(b52.b.b());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(c19792x256d2725);
        r45.wk0 wk0Var = new r45.wk0();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        wk0Var.set(0, b52.b.b());
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, 0);
        y74Var.set(5, c19792x256d2725);
        wk0Var.set(6, y74Var);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Context context = this.f200163e.f199353a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((vd2.f1) e0Var).Ni(context, intent, arrayList2, 0, wk0Var, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$bindNewLiveV1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
