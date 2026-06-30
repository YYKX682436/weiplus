package h22;

/* loaded from: classes15.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h22.c f359810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f359811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b f359812f;

    public a(h22.c cVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b bVar) {
        this.f359810d = cVar;
        this.f359811e = i17;
        this.f359812f = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h22.c cVar = this.f359810d;
        java.lang.String str = cVar.f359816f;
        java.util.LinkedList linkedList = cVar.f359815e;
        int i17 = this.f359811e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b) linkedList.get(i17);
        cVar.getClass();
        if (bVar != null) {
            if (bVar.f179072c) {
                y12.m.a(cVar.f359814d, bVar.f179070a, true);
            } else {
                r45.zj0 BannerSummary = bVar.f179071b.f457743d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(BannerSummary, "BannerSummary");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11929, 0);
                y12.m.e(cVar.f359814d, BannerSummary, false, 15, -1, -1, "", 8, false);
            }
        }
        boolean z17 = cVar.f359822o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b bVar2 = this.f359812f;
        if (z17) {
            int i18 = cVar.f359821n;
            if (bVar2 != null) {
                java.lang.String a17 = j22.a.a(bVar2);
                r45.kj0 kj0Var = bVar2.f179070a;
                java.lang.String str2 = kj0Var != null ? kj0Var.f460260e : null;
                if (str2 == null) {
                    str2 = "null";
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.b();
                b17.p(java.lang.String.valueOf(i17));
                b17.f137609j = i18;
                b17.f137603d = j22.a.f378782a;
                b17.f137604e = 1;
                b17.f137605f = 3;
                b17.u(a17);
                b17.q(str2);
                b17.k();
            }
        }
        j22.a.b(bVar2, i17 + 1, cVar.f359819i == 0 ? 1 : 2, "view_clk");
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
