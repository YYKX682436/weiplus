package ea2;

/* loaded from: classes2.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 f332097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f332098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f332099g;

    public k(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f332096d = list;
        this.f332097e = c13650x1bf60d72;
        this.f332098f = i17;
        this.f332099g = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = this.f332096d;
        int m75939xb282bd08 = ((r45.iw2) list.get(0)).m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72 = this.f332097e;
        if (m75939xb282bd08 == 1) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.iw2) list.get(0)).m75936x14adae67(0);
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            boolean z17 = str2.length() > 0;
            ea2.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72.f183291w;
            if (z17) {
                ea2.g.b(gVar, c13650x1bf60d72.m158354x19263085(), str2, null, 4, null);
            } else {
                gVar.a(c13650x1bf60d72.m80379x76847179(), (r45.iw2) list.get(0));
            }
        }
        fa2.a aVar = fa2.a.f342239a;
        android.app.Activity m80379x76847179 = c13650x1bf60d72.m80379x76847179();
        r45.r03 r03Var = (r45.r03) c13650x1bf60d72.f534252d;
        aVar.b(m80379x76847179, 1, r03Var != null ? (r45.hj2) r03Var.m75936x14adae67(19) : null, this.f332098f, (java.lang.String) this.f332099g.f391656d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
