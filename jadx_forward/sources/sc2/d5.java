package sc2;

/* loaded from: classes2.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.e5 f487364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f487365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487367g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487368h;

    public d5(sc2.e5 e5Var, android.content.Context context, xc2.p0 p0Var, android.view.View view, java.lang.String str) {
        this.f487364d = e5Var;
        this.f487365e = context;
        this.f487366f = p0Var;
        this.f487367g = view;
        this.f487368h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        r45.dm2 m76806xdef68064;
        r45.mt4 m77227x8a3325d8;
        java.lang.String m77225xe7ed3fec;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FeedJumperSubtitleBubbleObserver$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f487365e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        sc2.e5 e5Var = this.f487364d;
        e5Var.getClass();
        xc2.p0 p0Var = this.f487366f;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = p0Var.f534767a.m76506x42318aa0();
        byte[] bArr = null;
        bArr = null;
        java.lang.Integer valueOf = m76506x42318aa0 != null ? java.lang.Integer.valueOf(m76506x42318aa0.m77224x4236b52c()) : null;
        str = "";
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = p0Var.f534767a;
        if (valueOf != null && valueOf.intValue() == 55) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa02 = c19786x6a1e2862.m76506x42318aa0();
            if (m76506x42318aa02 != null && (m77225xe7ed3fec = m76506x42318aa02.m77225xe7ed3fec()) != null) {
                str = m77225xe7ed3fec;
            }
            r45.qj2 qj2Var = new r45.qj2();
            qj2Var.mo75930xb5cb93b2(str);
            z7.l a17 = z7.a.a(str);
            if (a17 instanceof z7.i) {
                qj2Var.set(0, java.lang.Long.valueOf(pm0.v.Z(((z7.i) a17).j(dm.i4.f66865x76d1ec5a).mo178488x9616526c())));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            int i18 = nyVar != null ? nyVar.f216913n : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            long m75942xfb822ef2 = qj2Var.m75942xfb822ef2(0);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa03 = c19786x6a1e2862.m76506x42318aa0();
            i0Var.ak(context, null, m75942xfb822ef2, (m76506x42318aa03 == null || (m77227x8a3325d8 = m76506x42318aa03.m77227x8a3325d8()) == null) ? 0L : m77227x8a3325d8.m75942xfb822ef2(0), null, qj2Var.m75945x2fec8307(1), e5Var.f84678f, e5Var.f84679g, i18, qj2Var.m75945x2fec8307(9));
            i17 = 1;
        } else {
            i17 = 1;
            r45.vx0 vx0Var = new r45.vx0();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa04 = c19786x6a1e2862.m76506x42318aa0();
            if (m76506x42318aa04 == null || (str2 = m76506x42318aa04.m77225xe7ed3fec()) == null) {
                str2 = "";
            }
            vx0Var.mo75930xb5cb93b2(str2);
            java.lang.String m75945x2fec8307 = vx0Var.m75945x2fec8307(20);
            if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) != false) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = p0Var.f534777f;
                vx0Var = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (m76806xdef68064 = feedObject2.m76806xdef68064()) == null) ? null : (r45.vx0) m76806xdef68064.m75936x14adae67(0);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_topic_type", 16);
            java.lang.String m75945x2fec83072 = vx0Var.m75945x2fec8307(1);
            str = m75945x2fec83072 != null ? m75945x2fec83072 : "";
            long Z = pm0.v.Z(vx0Var.m75945x2fec8307(20));
            r45.mk2 mk2Var = (r45.mk2) vx0Var.m75936x14adae67(19);
            long Z2 = pm0.v.Z(mk2Var != null ? mk2Var.m75945x2fec8307(2) : null);
            intent.putExtra("key_topic_title", str);
            intent.putExtra("KEY_TOPIC_ID", Z);
            intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
            intent.putExtra("key_ref_object_id", Z2);
            intent.putExtra("key_topic_type", vx0Var.m75939xb282bd08(21));
            r45.mk2 mk2Var2 = (r45.mk2) vx0Var.m75936x14adae67(19);
            if (mk2Var2 != null && (m75934xbce7f2f = mk2Var2.m75934xbce7f2f(1)) != null) {
                bArr = m75934xbce7f2f.f273689a;
            }
            intent.putExtra("KEY_NEXT_OBJECT_BUFFER", bArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).il(context, intent);
        }
        xc2.n nVar = xc2.n.f534745a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        android.view.View view2 = this.f487367g;
        xc2.p0 p0Var2 = this.f487366f;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("click_control_str", this.f487368h);
        jSONObject.put("phase", i17);
        xc2.n.b(nVar, context, view2, p0Var2, 0, null, null, jSONObject, null, 184, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FeedJumperSubtitleBubbleObserver$onBindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
