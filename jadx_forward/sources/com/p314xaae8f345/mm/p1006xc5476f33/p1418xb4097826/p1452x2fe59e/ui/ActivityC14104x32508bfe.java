package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTopicTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedSupportSlideUI;", "Lcom/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$TopicLoader;", "Lcom/tencent/mm/plugin/finder/feed/v20;", "Lcom/tencent/mm/plugin/finder/feed/j20;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI */
/* loaded from: classes2.dex */
public final class ActivityC14104x32508bfe extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.AbstractC13819x84acce8e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v20, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20> {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20 D;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v20 E;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.AbstractC13819x84acce8e F;
    public int H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f191114J;
    public r45.vx0 K;
    public r45.ze2 L;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g M;
    public r45.xu2 Q;
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5523x3ee720c9 R;
    public java.lang.String S;
    public boolean T;
    public boolean U;
    public final java.lang.String C = "Finder.FinderTopicTimelineUI";
    public java.lang.String G = "";
    public final int N = 9;
    public final int P = 2;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sn V = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sn(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
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
            return intExtra != 15 ? intExtra != 16 ? 27 : 172 : bd1.f.f4202x366c91de;
        }
        return 64;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b_s;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 m7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.AbstractC13819x84acce8e abstractC13819x84acce8e = this.F;
        if (abstractC13819x84acce8e != null) {
            return abstractC13819x84acce8e;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj n7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20 j20Var = this.D;
        if (j20Var != null) {
            return j20Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1643x4b88b2d8.AbstractActivityC15139x91efb0f1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v20 v20Var = this.E;
        if (v20Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        v20Var.m56068x4905e9fa().V0(this.V);
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
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
            ml2.x1 r2 = ml2.x1.f409735f
            p52.c r3 = p52.h.f433549a
            r3 = 1
            p52.h.f433557i = r3
            r4 = 0
            r5 = 2
            if (r5 != r1) goto L15
            p52.h.f433557i = r3
            goto L1e
        L15:
            if (r3 != r1) goto L1e
            ml2.x1 r2 = ml2.x1.f409736g
            p52.h.f433557i = r4
            java.lang.String r1 = "9"
            goto L20
        L1e:
            java.lang.String r1 = "27"
        L20:
            nm5.b r1 = nm5.j.c(r2, r1)
            java.lang.Class<zy2.zb> r2 = zy2.zb.class
            i95.m r2 = i95.n0.c(r2)
            java.lang.String r5 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r5)
            r6 = r2
            zy2.zb r6 = (zy2.zb) r6
            com.tencent.mm.plugin.finder.feed.v20 r2 = r0.E
            if (r2 == 0) goto L60
            androidx.recyclerview.widget.RecyclerView r7 = r2.m56068x4905e9fa()
            java.lang.Object r2 = r1.a(r4)
            java.lang.String r4 = "$1(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            r8 = r2
            ml2.x1 r8 = (ml2.x1) r8
            java.lang.Object r1 = r1.a(r3)
            java.lang.String r2 = "$2(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            ml2.y r10 = ml2.y.f409774f
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 112(0x70, float:1.57E-43)
            r16 = 0
            zy2.zb.Kh(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            return
        L60:
            java.lang.String r1 = "viewCallback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
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
            ml2.x1 r2 = ml2.x1.f409735f
            p52.c r3 = p52.h.f433549a
            r3 = 1
            p52.h.f433557i = r3
            r4 = 0
            r5 = 2
            if (r5 != r1) goto L15
            p52.h.f433557i = r3
            goto L1e
        L15:
            if (r3 != r1) goto L1e
            ml2.x1 r2 = ml2.x1.f409736g
            p52.h.f433557i = r4
            java.lang.String r1 = "9"
            goto L20
        L1e:
            java.lang.String r1 = "27"
        L20:
            nm5.b r1 = nm5.j.c(r2, r1)
            java.lang.Class<zy2.zb> r2 = zy2.zb.class
            i95.m r2 = i95.n0.c(r2)
            java.lang.String r5 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r5)
            r6 = r2
            zy2.zb r6 = (zy2.zb) r6
            com.tencent.mm.plugin.finder.feed.v20 r2 = r0.E
            if (r2 == 0) goto L60
            androidx.recyclerview.widget.RecyclerView r7 = r2.m56068x4905e9fa()
            java.lang.Object r2 = r1.a(r4)
            java.lang.String r4 = "$1(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            r8 = r2
            ml2.x1 r8 = (ml2.x1) r8
            java.lang.Object r1 = r1.a(r3)
            java.lang.String r2 = "$2(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            ml2.y r10 = ml2.y.f409773e
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 112(0x70, float:1.57E-43)
            r16 = 0
            zy2.zb.Kh(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            return
        L60:
            java.lang.String r1 = "viewCallback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe.onResume():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.T && this.U) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5523x3ee720c9 c5523x3ee720c9 = this.R;
            if (c5523x3ee720c9 != null) {
                c5523x3ee720c9.e();
            }
            this.R = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj p7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v20 v20Var = this.E;
        if (v20Var != null) {
            return v20Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
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
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14049xc2d06a4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q7() {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe.q7():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15086x1d5b7f69, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        if (getIntent().getBooleanExtra("key_enable_ringtone_bubble", false)) {
            set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.h7.class)));
        }
        if (getIntent().getBooleanExtra("KEY_FROM_PAID_COLLECTION", false)) {
            set.add(nr2.l.class);
        }
        set.add(nr2.u0.class);
    }
}
