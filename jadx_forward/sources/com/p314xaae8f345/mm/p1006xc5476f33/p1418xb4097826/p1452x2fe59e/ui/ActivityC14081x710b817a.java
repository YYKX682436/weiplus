package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderRelatedLoader;", "Lcom/tencent/mm/plugin/finder/feed/js;", "Lcom/tencent/mm/plugin/finder/feed/is;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI */
/* loaded from: classes2.dex */
public final class ActivityC14081x710b817a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13913xd6d91978, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.js, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.is> {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13913xd6d91978 A;
    public r45.z91 C;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.is f191064y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.js f191065z;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f191063x = "Finder.FinderRelatedTimelineUI";
    public final int B = 2;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        int intExtra = getIntent().getIntExtra("KEY_MORE_ACTION_TYPE", 0);
        if (intExtra != 1) {
            return intExtra != 2 ? 0 : 29;
        }
        return 31;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13913xd6d91978 c13913xd6d91978 = this.A;
        if (c13913xd6d91978 != null) {
            return c13913xd6d91978;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.is isVar = this.f191064y;
        if (isVar != null) {
            return isVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.js jsVar = this.f191065z;
        if (jsVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = jsVar.m56068x4905e9fa().getLayoutManager();
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13913xd6d91978 c13913xd6d91978 = this.A;
            if (c13913xd6d91978 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            setResult(-1, c13913xd6d91978.m56098x5161b284((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager));
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.js jsVar = this.f191065z;
        if (jsVar != null) {
            return jsVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b87;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h7() {
        /*
            r11 = this;
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = "KEY_TITLE"
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r1 = ""
            if (r0 != 0) goto Lf
            r0 = r1
        Lf:
            r11.mo54450xbf7c1df6(r0)
            r45.z91 r0 = new r45.z91
            r0.<init>()
            android.content.Intent r2 = r11.getIntent()
            java.lang.String r3 = "KEY_REQUEST_PB"
            byte[] r2 = r2.getByteArrayExtra(r3)
            if (r2 != 0) goto L24
            goto L32
        L24:
            r0.mo11468x92b714fd(r2)     // Catch: java.lang.Exception -> L28
            goto L33
        L28:
            r0 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r2, r1, r0)
        L32:
            r0 = 0
        L33:
            r11.C = r0
            if (r0 != 0) goto L48
            java.lang.String r0 = r11.f191063x
            java.lang.String r1 = "req is null, finish"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            r11.finish()
            r45.z91 r0 = new r45.z91
            r0.<init>()
            r11.C = r0
        L48:
            com.tencent.mm.plugin.finder.feed.is r0 = new com.tencent.mm.plugin.finder.feed.is
            int r1 = r11.B
            r0.<init>(r11, r1)
            r11.f191064y = r0
            com.tencent.mm.plugin.finder.feed.js r2 = new com.tencent.mm.plugin.finder.feed.js
            int r3 = r11.getD()
            r2.<init>(r11, r0, r1, r3)
            r11.f191065z = r2
            com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader r0 = new com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader
            r45.z91 r1 = r11.C
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r2 = 4
            int r5 = r1.m75939xb282bd08(r2)
            int r6 = r11.getD()
            r45.z91 r1 = r11.C
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r2 = 5
            float r7 = r1.m75938x746dc8a6(r2)
            r45.z91 r1 = r11.C
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r2 = 6
            float r8 = r1.m75938x746dc8a6(r2)
            r45.z91 r1 = r11.C
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r2 = 11
            com.tencent.mm.protobuf.f r1 = r1.m75936x14adae67(r2)
            r45.xu2 r1 = (r45.xu2) r1
            if (r1 != 0) goto L94
            r45.xu2 r1 = new r45.xu2
            r1.<init>()
        L94:
            r9 = r1
            pf5.z r1 = pf5.z.f435481a
            pf5.v r1 = r1.a(r11)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r1
            r45.qt2 r10 = r1.V6()
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            android.content.Intent r1 = r11.getIntent()
            r0.m56361x5fd54ec8(r1)
            com.tencent.mm.plugin.finder.feed.ui.oj r1 = new com.tencent.mm.plugin.finder.feed.ui.oj
            r1.<init>(r11, r0)
            r0.m56375x868b9334(r1)
            com.tencent.mm.plugin.finder.feed.ui.pj r1 = new com.tencent.mm.plugin.finder.feed.ui.pj
            r1.<init>(r11)
            r0.f189171i = r1
            r11.A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14081x710b817a.h7():void");
    }
}
