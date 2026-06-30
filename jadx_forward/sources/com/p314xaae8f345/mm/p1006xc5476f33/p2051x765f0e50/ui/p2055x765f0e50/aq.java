package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class aq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bq f242380d;

    public aq(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bq bqVar, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7) {
        this.f242380d = bqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bq bqVar = this.f242380d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yp x17 = bqVar.f242425p.f242309q.x(intValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactUI", "position:%s", java.lang.Integer.valueOf(intValue), x17.f243332b);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = bqVar.f242425p;
        if (activityC17486x3b418ac7.f242318z) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242583e++;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242584f++;
        }
        java.lang.String str = x17.f243332b;
        java.lang.String d17 = x17.f243333c.d1();
        java.lang.String P0 = x17.f243333c.P0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(d17)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
            str = z07.f66692x4854b29d;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", d17);
            intent.putExtra("Contact_RemarkName", str);
            intent.putExtra("Contact_Nick", P0);
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).l(intent, activityC17486x3b418ac7);
            activityC17486x3b418ac7.f242315w = intValue;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
