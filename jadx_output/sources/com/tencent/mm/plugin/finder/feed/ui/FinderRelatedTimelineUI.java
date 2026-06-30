package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderRelatedLoader;", "Lcom/tencent/mm/plugin/finder/feed/js;", "Lcom/tencent/mm/plugin/finder/feed/is;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderRelatedTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader, com.tencent.mm.plugin.finder.feed.js, com.tencent.mm.plugin.finder.feed.is> {
    public com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader A;
    public r45.z91 C;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.is f109531y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.js f109532z;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f109530x = "Finder.FinderRelatedTimelineUI";
    public final int B = 2;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        int intExtra = getIntent().getIntExtra("KEY_MORE_ACTION_TYPE", 0);
        if (intExtra != 1) {
            return intExtra != 2 ? 0 : 29;
        }
        return 31;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader finderRelatedLoader = this.A;
        if (finderRelatedLoader != null) {
            return finderRelatedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.is isVar = this.f109531y;
        if (isVar != null) {
            return isVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.finder.feed.js jsVar = this.f109532z;
        if (jsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = jsVar.getRecyclerView().getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader finderRelatedLoader = this.A;
            if (finderRelatedLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            setResult(-1, finderRelatedLoader.createIntentWithCache((androidx.recyclerview.widget.LinearLayoutManager) layoutManager));
        }
        super.finish();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.js jsVar = this.f109532z;
        if (jsVar != null) {
            return jsVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b87;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
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
            r11.setMMTitle(r0)
            r45.z91 r0 = new r45.z91
            r0.<init>()
            android.content.Intent r2 = r11.getIntent()
            java.lang.String r3 = "KEY_REQUEST_PB"
            byte[] r2 = r2.getByteArrayExtra(r3)
            if (r2 != 0) goto L24
            goto L32
        L24:
            r0.parseFrom(r2)     // Catch: java.lang.Exception -> L28
            goto L33
        L28:
            r0 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.mm.sdk.platformtools.Log.a(r2, r1, r0)
        L32:
            r0 = 0
        L33:
            r11.C = r0
            if (r0 != 0) goto L48
            java.lang.String r0 = r11.f109530x
            java.lang.String r1 = "req is null, finish"
            com.tencent.mars.xlog.Log.i(r0, r1)
            r11.finish()
            r45.z91 r0 = new r45.z91
            r0.<init>()
            r11.C = r0
        L48:
            com.tencent.mm.plugin.finder.feed.is r0 = new com.tencent.mm.plugin.finder.feed.is
            int r1 = r11.B
            r0.<init>(r11, r1)
            r11.f109531y = r0
            com.tencent.mm.plugin.finder.feed.js r2 = new com.tencent.mm.plugin.finder.feed.js
            int r3 = r11.getD()
            r2.<init>(r11, r0, r1, r3)
            r11.f109532z = r2
            com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader r0 = new com.tencent.mm.plugin.finder.feed.model.FinderRelatedLoader
            r45.z91 r1 = r11.C
            kotlin.jvm.internal.o.d(r1)
            r2 = 4
            int r5 = r1.getInteger(r2)
            int r6 = r11.getD()
            r45.z91 r1 = r11.C
            kotlin.jvm.internal.o.d(r1)
            r2 = 5
            float r7 = r1.getFloat(r2)
            r45.z91 r1 = r11.C
            kotlin.jvm.internal.o.d(r1)
            r2 = 6
            float r8 = r1.getFloat(r2)
            r45.z91 r1 = r11.C
            kotlin.jvm.internal.o.d(r1)
            r2 = 11
            com.tencent.mm.protobuf.f r1 = r1.getCustom(r2)
            r45.xu2 r1 = (r45.xu2) r1
            if (r1 != 0) goto L94
            r45.xu2 r1 = new r45.xu2
            r1.<init>()
        L94:
            r9 = r1
            pf5.z r1 = pf5.z.f353948a
            pf5.v r1 = r1.a(r11)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r2 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r1 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r1
            r45.qt2 r10 = r1.V6()
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            android.content.Intent r1 = r11.getIntent()
            r0.initFromCache(r1)
            com.tencent.mm.plugin.finder.feed.ui.oj r1 = new com.tencent.mm.plugin.finder.feed.ui.oj
            r1.<init>(r11, r0)
            r0.setInitDone(r1)
            com.tencent.mm.plugin.finder.feed.ui.pj r1 = new com.tencent.mm.plugin.finder.feed.ui.pj
            r1.<init>(r11)
            r0.f107638i = r1
            r11.A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI.h7():void");
    }
}
