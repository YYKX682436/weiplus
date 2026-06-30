package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class wj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14083xc91522bd f192237d;

    public wj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14083xc91522bd activityC14083xc91522bd) {
        this.f192237d = activityC14083xc91522bd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14083xc91522bd context = this.f192237d;
        if (context.F) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ps psVar = context.f191068y;
            if (psVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            if (psVar.m56068x4905e9fa().getLayoutManager() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ps psVar2 = context.f191068y;
                if (psVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = psVar2.m56068x4905e9fa().getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                int w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager).w();
                if (w17 >= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13914x1304f7dc c13914x1304f7dc = context.f191069z;
                    if (c13914x1304f7dc == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                        throw null;
                    }
                    if (w17 < c13914x1304f7dc.m56387xe6796cde().size()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13914x1304f7dc c13914x1304f7dc2 = context.f191069z;
                        if (c13914x1304f7dc2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                            throw null;
                        }
                        java.lang.Object obj = c13914x1304f7dc2.m56387xe6796cde().get(w17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        ed0.t0 t0Var = (ed0.t0) i95.n0.c(ed0.t0.class);
                        long mo2128x1ed62e84 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj).mo2128x1ed62e84();
                        ((dd0.k0) t0Var).getClass();
                        vx3.i a17 = qx3.d.a(mo2128x1ed62e84);
                        if (a17 == null) {
                            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                        ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).getClass();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class);
                        vVar.getClass();
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("exclusvie_name", vVar.f240033f);
                        t45.n0 n0Var = a17.f522822f;
                        if (n0Var != null) {
                            t45.l0 l0Var = new t45.l0();
                            l0Var.f497135e = 0;
                            int i17 = n0Var.f497148d;
                            int i18 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
                            if (i17 == 1) {
                                t45.f0 f0Var = n0Var.f497149e;
                                if (f0Var != null) {
                                    i18 = (int) f0Var.f497089i;
                                }
                                l0Var.f497136f = i18;
                            } else {
                                l0Var.f497136f = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
                            }
                            t45.g gVar = n0Var.f497150f;
                            l0Var.f497138h = gVar != null ? gVar.f497093d : null;
                            t45.f0 f0Var2 = n0Var.f497149e;
                            l0Var.f497137g = f0Var2 != null ? f0Var2.f497084d : null;
                            l0Var.f497134d = i17;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(vVar.m80379x76847179(), vVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574518ik1), false, 3, null);
                            f17.show();
                            p3325xe03a0797.p3326xc267989b.l.d(vVar.mo144225x95f74600(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.s(l0Var, vVar, a17, f17, intent, null), 3, null);
                        }
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select invalid position:");
                sb6.append(w17);
                sb6.append(", size:");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13914x1304f7dc c13914x1304f7dc3 = context.f191069z;
                if (c13914x1304f7dc3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                    throw null;
                }
                sb6.append(c13914x1304f7dc3.m56387xe6796cde().size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderRingtoneTimelineUI", sb6.toString());
            }
        } else {
            ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v vVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v) zVar.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class);
            mx3.s.a(mx3.u.f414153f, vVar2.m158354x19263085(), vVar2.f240031d, vVar2.f240033f, vVar2.f240032e, true, null, 32, null);
            ed0.v0 v0Var = (ed0.v0) i95.n0.c(ed0.v0.class);
            java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(context.H);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r07, "getUnsignedLongString(...)");
            java.lang.String str = context.K;
            if (str == null) {
                str = "";
            }
            ((dd0.o0) v0Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3) zVar.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3.class)).getClass();
            wx3.a.c(5L, r07, 2, str, false, false, 48, null);
            context.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
