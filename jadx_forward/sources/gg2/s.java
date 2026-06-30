package gg2;

/* loaded from: classes2.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg2.t f353247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.pl5 f353248e;

    public s(gg2.t tVar, r45.pl5 pl5Var) {
        this.f353247d = tVar;
        this.f353248e = pl5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var;
        r45.bc2 bc2Var;
        r45.iq iqVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/exp/LiveExpTwentyFiveItem$onPollingResult$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        gg2.t tVar = this.f353247d;
        bg2.h4 h4Var = (bg2.h4) tVar.f353197a.a(bg2.h4.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (h4Var == null || (j2Var = h4Var.f101672i) == null || (bc2Var = (r45.bc2) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) == null || (iqVar = (r45.iq) bc2Var.m75936x14adae67(2)) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) iqVar.m75936x14adae67(0);
        if (c19786x6a1e2862 != null) {
            intent.putExtra("KEY_PARAMS_DO_ACTION", 19);
            intent.putExtra("KEY_PARAMS_AUTO_OPEN_JUMP_INFO", c19786x6a1e2862.m75960xfb7e5820());
        }
        tVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = tVar.f353197a.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        hashMap.put("liveid", str);
        hashMap.put("guide_bar_type", "4");
        java.lang.String m75945x2fec8307 = this.f353248e.m75945x2fec8307(1);
        hashMap.put("guide_bar_txt", m75945x2fec8307 != null ? m75945x2fec8307 : "");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.S2, hashMap, null, null, null, null, false, 124, null);
        tc2.g gVar = tVar.f353197a;
        in5.s0 s0Var = gVar.f498682i;
        if (s0Var == null || (view2 = s0Var.f3639x46306858) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpTwentyFiveItem$onPollingResult$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        uc2.i iVar = (uc2.i) gVar.b(uc2.i.class);
        if (iVar != null) {
            ((sb2.o) iVar).Y6(view2, intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpTwentyFiveItem$onPollingResult$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
