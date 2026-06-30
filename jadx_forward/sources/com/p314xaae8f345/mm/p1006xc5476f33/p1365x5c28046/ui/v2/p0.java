package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes15.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f179923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.s0 f179924e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13357x9e535daf c13357x9e535daf, int i17) {
        this.f179924e = s0Var;
        this.f179923d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.s0 s0Var;
        r45.ri0 item;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/PreViewListGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.q0 q0Var = this.f179924e.f179936n;
        if (q0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13350x2639a724 activityC13350x2639a724 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.a0) q0Var).f179883a;
            if (activityC13350x2639a724.f179828u != null && (s0Var = activityC13350x2639a724.f179830w) != null && (item = s0Var.getItem(this.f179923d)) != null) {
                try {
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 i17 = n22.m.i(item);
                    n22.f fVar = n22.f.f415823a;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = activityC13350x2639a724.mo55332x76847179();
                    int i18 = activityC13350x2639a724.f179826s;
                    long j17 = activityC13350x2639a724.f179827t;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    n22.f.d(fVar, context, i17, false, null, null, "", i18, j17, 29, 5, 0L, null, null, null, null, 28672, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12787, java.lang.Integer.valueOf(activityC13350x2639a724.f179826s), 0, item.f466419d, java.lang.Long.valueOf(activityC13350x2639a724.f179827t), item.f466422g, item.f466425m, 29);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiStoreV2SingleProductUI", e17, "single product click error", new java.lang.Object[0]);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/PreViewListGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
