package mi5;

/* loaded from: classes4.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.k f408393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc5.c f408395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mv2 f408396g;

    public j(mi5.k kVar, android.content.Context context, fc5.c cVar, r45.mv2 mv2Var) {
        this.f408393d = kVar;
        this.f408394e = context;
        this.f408395f = cVar;
        this.f408396g = mv2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingFinderActivityView$onUpdateViewModel$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f408394e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        fc5.c cVar = this.f408395f;
        java.lang.String m75945x2fec8307 = cVar.m75945x2fec8307(cVar.f125235d + 1);
        this.f408393d.getClass();
        android.content.Intent intent = new android.content.Intent();
        r45.mv2 mv2Var = this.f408396g;
        intent.putExtra("key_feed_id", pm0.v.Z(mv2Var.m75945x2fec8307(7)));
        intent.putExtra("key_topic_title", mv2Var.m75945x2fec8307(0));
        intent.putExtra("key_topic_type", mv2Var.m75939xb282bd08(1));
        if (((r45.ub4) mv2Var.m75936x14adae67(8)) != null) {
            r45.ub4 ub4Var = (r45.ub4) mv2Var.m75936x14adae67(8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ub4Var);
            intent.putExtra("key_activity_id", pm0.v.Z(ub4Var.m75945x2fec8307(0)));
            intent.putExtra("key_activity_name", mv2Var.m75945x2fec8307(0));
        }
        r45.ze2 ze2Var = new r45.ze2();
        if (((r45.hv2) mv2Var.m75936x14adae67(4)) != null) {
            r45.hv2 hv2Var = (r45.hv2) mv2Var.m75936x14adae67(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hv2Var);
            ze2Var.set(5, hv2Var.m75945x2fec8307(0));
            r45.hv2 hv2Var2 = (r45.hv2) mv2Var.m75936x14adae67(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hv2Var2);
            ze2Var.set(0, java.lang.Float.valueOf(hv2Var2.m75938x746dc8a6(1)));
            r45.hv2 hv2Var3 = (r45.hv2) mv2Var.m75936x14adae67(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hv2Var3);
            ze2Var.set(1, java.lang.Float.valueOf(hv2Var3.m75938x746dc8a6(2)));
            try {
                intent.putExtra("key_topic_poi_location", ze2Var.mo14344x5f01b1f6());
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingFinderActivityView", "location toByteArray exception");
            }
        }
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_from_user", m75945x2fec8307);
        intent.putExtra("key_report_scene", com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(m75945x2fec8307) ? 2 : 1);
        intent.putExtra("KEY_TAB_TYPE", 6);
        intent.putExtra("key_finder_teen_mode_user_name", "");
        intent.putExtra("key_finder_teen_mode_user_id", "");
        intent.putExtra("key_entrance_type", 0);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).fl(context, intent);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingFinderActivityView$onUpdateViewModel$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
