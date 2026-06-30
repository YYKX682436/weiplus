package ea2;

/* loaded from: classes2.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 f332120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f332121e;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72, jz5.l lVar) {
        this.f332120d = c13650x1bf60d72;
        this.f332121e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList m75941xfb821914;
        r45.r03 r03Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initRingtone$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72 = this.f332120d;
        c13650x1bf60d72.getClass();
        jz5.l lVar = this.f332121e;
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        if (intValue == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) lVar.f384367e;
            if (abstractC14490x69736cb5 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5.f184249a.d(c13650x1bf60d72.m158354x19263085(), abstractC14490x69736cb5, 6L, (r24 & 8) != 0, (r24 & 16) != 0 ? "" : null, (r24 & 32) != 0 ? "" : null, (r24 & 64) != 0 ? 0 : 0, (r24 & 128) != 0 ? null : null, ea2.h.f332088d);
            }
        } else if (intValue == 2) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c13650x1bf60d72.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.p1427x9da2e250.C13648x75a87560 c13648x75a87560 = ((ea2.k0) zVar.a(activity).a(ea2.k0.class)).I;
            if (c13648x75a87560 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 c76 = ((ea2.j0) zVar.b(c13648x75a87560).a(ea2.j0.class)).c7();
                android.content.Intent Z = c76.Z(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) c76.z().f188689e.m56392xfc5c33e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class).get(0)).getFeedObject(), 0);
                r45.xn5 z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10) c76.z()).z();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = c76.z().f188689e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
                c76.z().f188689e.m56371x9666405(Z, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g30(z17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba) abstractC13919x46aff122).c((z17 == null || (m75941xfb821914 = z17.m75941xfb821914(0)) == null || (r03Var = (r45.r03) m75941xfb821914.get(0)) == null) ? null : r03Var.m75945x2fec8307(0))));
                Z.putExtra("key_enable_ringtone_bubble", true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, c76.f187707d, Z, 0L, null, 0, 0, false, 0, null, 508, null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).il(c76.f187707d, Z);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72.p7(this.f332120d, 105, null, null, 0, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        hc2.v0.d(view, "music_topic_page_set_ringtone", "view_clk", false, c13650x1bf60d72.a7(), null, 20, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initRingtone$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
