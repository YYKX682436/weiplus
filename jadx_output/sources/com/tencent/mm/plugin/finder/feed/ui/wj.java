package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class wj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI f110704d;

    public wj(com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI finderRingtoneTimelineUI) {
        this.f110704d = finderRingtoneTimelineUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI context = this.f110704d;
        if (context.F) {
            com.tencent.mm.plugin.finder.feed.ps psVar = context.f109535y;
            if (psVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            if (psVar.getRecyclerView().getLayoutManager() instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) {
                com.tencent.mm.plugin.finder.feed.ps psVar2 = context.f109535y;
                if (psVar2 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = psVar2.getRecyclerView().getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                int w17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).w();
                if (w17 >= 0) {
                    com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader finderRingtoneTimelineLoader = context.f109536z;
                    if (finderRingtoneTimelineLoader == null) {
                        kotlin.jvm.internal.o.o("feedLoader");
                        throw null;
                    }
                    if (w17 < finderRingtoneTimelineLoader.getDataList().size()) {
                        com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader finderRingtoneTimelineLoader2 = context.f109536z;
                        if (finderRingtoneTimelineLoader2 == null) {
                            kotlin.jvm.internal.o.o("feedLoader");
                            throw null;
                        }
                        java.lang.Object obj = finderRingtoneTimelineLoader2.getDataList().get(w17);
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        ed0.t0 t0Var = (ed0.t0) i95.n0.c(ed0.t0.class);
                        long itemId = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj).getItemId();
                        ((dd0.k0) t0Var).getClass();
                        vx3.i a17 = qx3.d.a(itemId);
                        if (a17 == null) {
                            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                        ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).getClass();
                        kotlin.jvm.internal.o.g(context, "context");
                        com.tencent.mm.plugin.ringtone.uic.v vVar = (com.tencent.mm.plugin.ringtone.uic.v) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.ringtone.uic.v.class);
                        vVar.getClass();
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("exclusvie_name", vVar.f158500f);
                        t45.n0 n0Var = a17.f441289f;
                        if (n0Var != null) {
                            t45.l0 l0Var = new t45.l0();
                            l0Var.f415602e = 0;
                            int i17 = n0Var.f415615d;
                            int i18 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
                            if (i17 == 1) {
                                t45.f0 f0Var = n0Var.f415616e;
                                if (f0Var != null) {
                                    i18 = (int) f0Var.f415556i;
                                }
                                l0Var.f415603f = i18;
                            } else {
                                l0Var.f415603f = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
                            }
                            t45.g gVar = n0Var.f415617f;
                            l0Var.f415605h = gVar != null ? gVar.f415560d : null;
                            t45.f0 f0Var2 = n0Var.f415616e;
                            l0Var.f415604g = f0Var2 != null ? f0Var2.f415551d : null;
                            l0Var.f415601d = i17;
                            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(vVar.getContext(), vVar.getContext().getResources().getString(com.tencent.mm.R.string.f492985ik1), false, 3, null);
                            f17.show();
                            kotlinx.coroutines.l.d(vVar.getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.s(l0Var, vVar, a17, f17, intent, null), 3, null);
                        }
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select invalid position:");
                sb6.append(w17);
                sb6.append(", size:");
                com.tencent.mm.plugin.finder.feed.model.FinderRingtoneTimelineLoader finderRingtoneTimelineLoader3 = context.f109536z;
                if (finderRingtoneTimelineLoader3 == null) {
                    kotlin.jvm.internal.o.o("feedLoader");
                    throw null;
                }
                sb6.append(finderRingtoneTimelineLoader3.getDataList().size());
                com.tencent.mars.xlog.Log.w("Finder.FinderRingtoneTimelineUI", sb6.toString());
            }
        } else {
            ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.ringtone.uic.v vVar2 = (com.tencent.mm.plugin.ringtone.uic.v) zVar.a(context).a(com.tencent.mm.plugin.ringtone.uic.v.class);
            mx3.s.a(mx3.u.f332620f, vVar2.getActivity(), vVar2.f158498d, vVar2.f158500f, vVar2.f158499e, true, null, 32, null);
            ed0.v0 v0Var = (ed0.v0) i95.n0.c(ed0.v0.class);
            java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(context.H);
            kotlin.jvm.internal.o.f(r07, "getUnsignedLongString(...)");
            java.lang.String str = context.K;
            if (str == null) {
                str = "";
            }
            ((dd0.o0) v0Var).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            ((com.tencent.mm.plugin.ringtone.uic.d3) zVar.a(context).a(com.tencent.mm.plugin.ringtone.uic.d3.class)).getClass();
            wx3.a.c(5L, r07, 2, str, false, false, 48, null);
            context.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
