package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13959xc919d7e1 f191274d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13959xc919d7e1 activityC13959xc919d7e1) {
        this.f191274d = activityC13959xc919d7e1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13959xc919d7e1 activityC13959xc919d7e1 = this.f191274d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.t0 t0Var = activityC13959xc919d7e1.f190803y;
        if (t0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        if (t0Var.m56068x4905e9fa().getLayoutManager() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.t0 t0Var2 = activityC13959xc919d7e1.f190803y;
            if (t0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = t0Var2.m56068x4905e9fa().getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
            int w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager).w();
            android.content.Intent intent2 = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14152xe4e8bb5f c14152xe4e8bb5f = activityC13959xc919d7e1.B;
            if (c14152xe4e8bb5f == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            java.lang.Object obj = c14152xe4e8bb5f.m56387xe6796cde().get(w17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
            long intExtra = activityC13959xc919d7e1.getIntent().getIntExtra("MINI_DURATION", -1) * 1000;
            long intExtra2 = activityC13959xc919d7e1.getIntent().getIntExtra("MAX_DURATION", -1) * 1000;
            if (intExtra < 0 && intExtra2 <= 0) {
                intent = intent2;
            } else {
                if (abstractC14490x69736cb5.h() != 4) {
                    db5.t7.m123882x26a183b(activityC13959xc919d7e1, com.p314xaae8f345.mm.R.C30867xcad56011.eq8, 0).show();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec());
                long m75942xfb822ef2 = mb4Var != null ? mb4Var.m75942xfb822ef2(24) : 0L;
                intent = intent2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GalleryTimelineUI", "onItemClick: videoDurationMs=" + m75942xfb822ef2 + ", miniVideoDurationMs=" + intExtra + ", maxVideoDurationMs=" + intExtra2 + ", position=" + w17);
                if (m75942xfb822ef2 < intExtra) {
                    db5.t7.m123883x26a183b(activityC13959xc919d7e1, activityC13959xc919d7e1.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eq6, java.lang.Long.valueOf(intExtra / 1000)), 0).show();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (m75942xfb822ef2 > intExtra2) {
                    db5.t7.m123883x26a183b(activityC13959xc919d7e1, activityC13959xc919d7e1.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573478lk2, java.lang.Long.valueOf(intExtra2 / 1000)), 0).show();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            android.content.Intent intent3 = intent;
            intent3.putExtra("SELECT_OBJECT", abstractC14490x69736cb5.getFeedObject().getFeedObject().mo14344x5f01b1f6());
            intent3.putExtra("TAB_TYPE", activityC13959xc919d7e1.D);
            activityC13959xc919d7e1.setResult(-1, intent3);
            super/*com.tencent.mm.plugin.finder.ui.MMFinderUI*/.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
