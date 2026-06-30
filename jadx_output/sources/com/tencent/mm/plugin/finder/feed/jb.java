package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jb extends com.tencent.mm.plugin.finder.feed.id {
    public com.tencent.mm.sdk.event.IListener I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(android.content.Context context, boolean z17) {
        super(context, z17);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.feed.id, com.tencent.mm.plugin.finder.feed.w20
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new com.tencent.mm.plugin.finder.feed.FinderFriendLikeListDrawerPresenter$getItemConvertFactory$1(this), this.f107007m, false);
    }

    @Override // com.tencent.mm.plugin.finder.feed.id, com.tencent.mm.plugin.finder.feed.w20
    public androidx.recyclerview.widget.p2 b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.finder.feed.gb();
    }

    @Override // com.tencent.mm.plugin.finder.feed.id, com.tencent.mm.plugin.finder.feed.w20
    public void e(android.content.Context context, android.widget.FrameLayout headerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        cq.k1.a();
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.k1().r()).booleanValue()) {
            android.view.View findViewById = headerLayout.findViewById(com.tencent.mm.R.id.d4y);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = headerLayout.findViewById(com.tencent.mm.R.id.d4y);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderFriendLikeListDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        headerLayout.findViewById(com.tencent.mm.R.id.d4y).setOnClickListener(new com.tencent.mm.plugin.finder.feed.fb(context));
    }

    @Override // com.tencent.mm.plugin.finder.feed.id, com.tencent.mm.plugin.finder.feed.w20
    public void g(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // com.tencent.mm.plugin.finder.feed.id, com.tencent.mm.plugin.finder.feed.w20
    public int getScene() {
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        return 1;
    }

    @Override // com.tencent.mm.plugin.finder.feed.id, com.tencent.mm.plugin.finder.feed.w20
    public void h(yw2.n builder, final com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.protobuf.g gVar, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(builder, "builder");
        super.h(builder, finderItem, gVar, linkedList);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedLikeEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedLikeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderFriendLikeListDrawerPresenter$onAttach$1
            {
                this.__eventId = -213301995;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedLikeEvent feedLikeEvent) {
                com.tencent.mm.autogen.events.FeedLikeEvent event = feedLikeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = com.tencent.mm.plugin.finder.storage.FinderItem.this;
                if (finderItem2 == null) {
                    return true;
                }
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.ib(this, finderItem2));
                return true;
            }
        };
        this.I = iListener;
        iListener.alive();
        bu2.d dVar = bu2.g.f24508b;
        dVar.a().getClass();
        dVar.a().a();
    }

    @Override // com.tencent.mm.plugin.finder.feed.id, com.tencent.mm.plugin.finder.feed.w20
    public androidx.recyclerview.widget.RecyclerView.LayoutManager i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false);
    }

    @Override // com.tencent.mm.plugin.finder.feed.id
    public in5.s l() {
        return new com.tencent.mm.plugin.finder.feed.FinderFriendLikeListDrawerPresenter$getItemConvertFactory$1(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.id
    public void o() {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        yw2.n nVar = this.f107010p;
        if (nVar != null) {
            android.widget.TextView h17 = nVar.h();
            zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
            zy2.l6 l6Var = new zy2.l6();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f107003f;
            l6Var.f477451b = finderItem != null ? finderItem.getFeedObject() : null;
            l6Var.f477452c = this.f107013s;
            l6Var.f477454e = this.f107014t;
            int i17 = 0;
            l6Var.f477453d = false;
            cu2.f0 f0Var = cu2.f0.f222391a;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = this.f107003f;
            if (finderItem2 != null && (feedObject = finderItem2.getFeedObject()) != null) {
                i17 = feedObject.getObjectType();
            }
            l6Var.f477450a = f0Var.e(i17);
            ((ht2.y0) s6Var).Ni(h17, l6Var);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.id, com.tencent.mm.plugin.finder.feed.w20
    public void onDetach() {
        if (!this.f107017w) {
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        java.util.ArrayList arrayList = this.f107007m;
        java.util.ArrayList<so2.f1> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((so2.f1) obj).f410336d.getInteger(4) == 1) {
                arrayList2.add(obj);
            }
        }
        for (so2.f1 f1Var : arrayList2) {
            com.tencent.mm.autogen.events.FinderUninterestEvent finderUninterestEvent = new com.tencent.mm.autogen.events.FinderUninterestEvent();
            java.lang.String string = f1Var.f410336d.getString(5);
            am.pd pdVar = finderUninterestEvent.f54336g;
            pdVar.f7613a = string;
            pdVar.getClass();
            finderUninterestEvent.e();
        }
        super.onDetach();
        bu2.g.f24508b.a().getClass();
        com.tencent.mm.sdk.event.IListener iListener = this.I;
        if (iListener != null) {
            iListener.dead();
        }
    }
}
