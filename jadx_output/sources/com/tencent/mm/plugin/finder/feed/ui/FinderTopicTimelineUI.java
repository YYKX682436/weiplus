package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedSupportSlideUI;", "Lcom/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$TopicLoader;", "Lcom/tencent/mm/plugin/finder/feed/v20;", "Lcom/tencent/mm/plugin/finder/feed/j20;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderTopicTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI<com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader, com.tencent.mm.plugin.finder.feed.v20, com.tencent.mm.plugin.finder.feed.j20> {
    public com.tencent.mm.plugin.finder.feed.j20 D;
    public com.tencent.mm.plugin.finder.feed.v20 E;
    public com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader F;
    public int H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f109581J;
    public r45.vx0 K;
    public r45.ze2 L;
    public com.tencent.mm.protobuf.g M;
    public r45.xu2 Q;
    public com.tencent.mm.autogen.events.FinderProfileChangeFeedEvent R;
    public java.lang.String S;
    public boolean T;
    public boolean U;
    public final java.lang.String C = "Finder.FinderTopicTimelineUI";
    public java.lang.String G = "";
    public final int N = 9;
    public final int P = 2;
    public final com.tencent.mm.plugin.finder.feed.ui.sn V = new com.tencent.mm.plugin.finder.feed.ui.sn(this);

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        int intExtra = getIntent().getIntExtra("key_topic_type", 1);
        if (intExtra == 1) {
            return 9;
        }
        if (intExtra == 7) {
            return 60;
        }
        if (intExtra == 18) {
            return 196;
        }
        if (intExtra == 4) {
            return 52;
        }
        if (intExtra != 5) {
            return intExtra != 15 ? intExtra != 16 ? 27 : 172 : bd1.f.CTRL_INDEX;
        }
        return 64;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_s;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader m7() {
        com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader finderTopicTimelineUIContract$TopicLoader = this.F;
        if (finderTopicTimelineUIContract$TopicLoader != null) {
            return finderTopicTimelineUIContract$TopicLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI
    public com.tencent.mm.plugin.finder.feed.dj n7() {
        com.tencent.mm.plugin.finder.feed.j20 j20Var = this.D;
        if (j20Var != null) {
            return j20Var;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI, com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.v20 v20Var = this.E;
        if (v20Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        v20Var.getRecyclerView().V0(this.V);
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() {
        /*
            r17 = this;
            r0 = r17
            super.onPause()
            int r1 = r0.H
            ml2.x1 r2 = ml2.x1.f328202f
            p52.c r3 = p52.h.f352016a
            r3 = 1
            p52.h.f352024i = r3
            r4 = 0
            r5 = 2
            if (r5 != r1) goto L15
            p52.h.f352024i = r3
            goto L1e
        L15:
            if (r3 != r1) goto L1e
            ml2.x1 r2 = ml2.x1.f328203g
            p52.h.f352024i = r4
            java.lang.String r1 = "9"
            goto L20
        L1e:
            java.lang.String r1 = "27"
        L20:
            nm5.b r1 = nm5.j.c(r2, r1)
            java.lang.Class<zy2.zb> r2 = zy2.zb.class
            i95.m r2 = i95.n0.c(r2)
            java.lang.String r5 = "getService(...)"
            kotlin.jvm.internal.o.f(r2, r5)
            r6 = r2
            zy2.zb r6 = (zy2.zb) r6
            com.tencent.mm.plugin.finder.feed.v20 r2 = r0.E
            if (r2 == 0) goto L60
            androidx.recyclerview.widget.RecyclerView r7 = r2.getRecyclerView()
            java.lang.Object r2 = r1.a(r4)
            java.lang.String r4 = "$1(...)"
            kotlin.jvm.internal.o.f(r2, r4)
            r8 = r2
            ml2.x1 r8 = (ml2.x1) r8
            java.lang.Object r1 = r1.a(r3)
            java.lang.String r2 = "$2(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            ml2.y r10 = ml2.y.f328241f
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 112(0x70, float:1.57E-43)
            r16 = 0
            zy2.zb.Kh(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            return
        L60:
            java.lang.String r1 = "viewCallback"
            kotlin.jvm.internal.o.o(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r17 = this;
            r0 = r17
            super.onResume()
            int r1 = r0.H
            ml2.x1 r2 = ml2.x1.f328202f
            p52.c r3 = p52.h.f352016a
            r3 = 1
            p52.h.f352024i = r3
            r4 = 0
            r5 = 2
            if (r5 != r1) goto L15
            p52.h.f352024i = r3
            goto L1e
        L15:
            if (r3 != r1) goto L1e
            ml2.x1 r2 = ml2.x1.f328203g
            p52.h.f352024i = r4
            java.lang.String r1 = "9"
            goto L20
        L1e:
            java.lang.String r1 = "27"
        L20:
            nm5.b r1 = nm5.j.c(r2, r1)
            java.lang.Class<zy2.zb> r2 = zy2.zb.class
            i95.m r2 = i95.n0.c(r2)
            java.lang.String r5 = "getService(...)"
            kotlin.jvm.internal.o.f(r2, r5)
            r6 = r2
            zy2.zb r6 = (zy2.zb) r6
            com.tencent.mm.plugin.finder.feed.v20 r2 = r0.E
            if (r2 == 0) goto L60
            androidx.recyclerview.widget.RecyclerView r7 = r2.getRecyclerView()
            java.lang.Object r2 = r1.a(r4)
            java.lang.String r4 = "$1(...)"
            kotlin.jvm.internal.o.f(r2, r4)
            r8 = r2
            ml2.x1 r8 = (ml2.x1) r8
            java.lang.Object r1 = r1.a(r3)
            java.lang.String r2 = "$2(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            ml2.y r10 = ml2.y.f328240e
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 112(0x70, float:1.57E-43)
            r16 = 0
            zy2.zb.Kh(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            return
        L60:
            java.lang.String r1 = "viewCallback"
            kotlin.jvm.internal.o.o(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI.onResume():void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.T && this.U) {
            com.tencent.mm.autogen.events.FinderProfileChangeFeedEvent finderProfileChangeFeedEvent = this.R;
            if (finderProfileChangeFeedEvent != null) {
                finderProfileChangeFeedEvent.e();
            }
            this.R = null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI
    public com.tencent.mm.plugin.finder.feed.gj p7() {
        com.tencent.mm.plugin.finder.feed.v20 v20Var = this.E;
        if (v20Var != null) {
            return v20Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d2  */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q7() {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI.q7():void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        if (getIntent().getBooleanExtra("key_enable_ringtone_bubble", false)) {
            set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.h7.class)));
        }
        if (getIntent().getBooleanExtra("KEY_FROM_PAID_COLLECTION", false)) {
            set.add(nr2.l.class);
        }
        set.add(nr2.u0.class);
    }
}
