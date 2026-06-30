package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/o9;", "Lcom/tencent/mm/plugin/finder/feed/n9;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/l", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderAlbumTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader, com.tencent.mm.plugin.finder.feed.o9, com.tencent.mm.plugin.finder.feed.n9> {
    public static final /* synthetic */ int L = 0;
    public java.lang.String A;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f109205x = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.z(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f109206y = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.e0(this));

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f109207z = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.q(this));
    public final jz5.g B = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.t(this));
    public final jz5.g C = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.c0(this));
    public final jz5.g D = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.d0(this));
    public final jz5.g E = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.m(this));
    public final jz5.g F = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.s(this));
    public final jz5.g G = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.b0(this));
    public final jz5.g H = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.a0(this));
    public final jz5.g I = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.r(this));

    /* renamed from: J, reason: collision with root package name */
    public final int f109204J = 101;
    public final int K = 102;

    public static final r45.qt2 k7(com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI) {
        return (r45.qt2) ((jz5.n) finderAlbumTimelineUI.f109207z).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 51;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        return (com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1) ((jz5.n) this.I).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        return (com.tencent.mm.plugin.finder.feed.n9) ((jz5.n) this.f109205x).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        return p7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ai8;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        java.lang.String stringExtra = getIntent().getStringExtra("TITLE_WORDING");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.A = stringExtra;
        setMMTitle(stringExtra);
        boolean z17 = false;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.P2).getValue()).r()).intValue() == 1) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.finder.feed.ui.u(this));
        }
        r45.ww2 o76 = o7();
        if (o76 != null) {
            bu2.j jVar = bu2.j.f24534a;
            java.util.LinkedList list = o76.getList(4);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            jVar.a(51, list);
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list2 = o76.getList(4);
            kotlin.jvm.internal.o.f(list2, "getObject(...)");
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list2) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                kotlin.jvm.internal.o.d(finderObject);
                ((com.tencent.mm.plugin.finder.report.o3) c17).rk(finderObject, 51, null);
            }
        }
        com.tencent.mm.plugin.finder.feed.ui.l n76 = n7();
        if (n76 != null && n76.f110249a == 3) {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            int intValue = ((java.lang.Number) ((jz5.n) this.F).getValue()).intValue();
            java.lang.String str = (java.lang.String) ((jz5.n) this.G).getValue();
            kotlin.jvm.internal.o.d(str);
            long l76 = l7();
            o3Var.getClass();
            com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct finderEnterSharedCardStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderEnterSharedCardStruct();
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            finderEnterSharedCardStruct.f56705d = finderEnterSharedCardStruct.b("SessionId", Ri != null ? Ri : "", true);
            finderEnterSharedCardStruct.f56706e = intValue;
            finderEnterSharedCardStruct.f56707f = 5L;
            finderEnterSharedCardStruct.f56708g = finderEnterSharedCardStruct.b("SourceUsr", str, true);
            finderEnterSharedCardStruct.f56718q = finderEnterSharedCardStruct.b("ColumnId", pm0.v.u(l76), true);
            finderEnterSharedCardStruct.k();
            o3Var.Zk(finderEnterSharedCardStruct);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initOnCreate] relatedRequest=");
        com.tencent.mm.plugin.finder.feed.ui.l n77 = n7();
        sb6.append(n77 != null ? java.lang.Integer.valueOf(n77.f110249a) : null);
        sb6.append(" getRelatedScene=");
        sb6.append(m7());
        sb6.append(" title=");
        java.lang.String str2 = this.A;
        if (str2 == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            throw null;
        }
        sb6.append(str2);
        sb6.append(" streamCardId=");
        r45.ww2 o77 = o7();
        sb6.append(pm0.v.u(o77 != null ? o77.getLong(14) : 0L));
        sb6.append(" cardId=");
        sb6.append(pm0.v.u(l7()));
        sb6.append(" continueAtTheEnd=");
        r45.ww2 o78 = o7();
        sb6.append(o78 != null ? java.lang.Boolean.valueOf(o78.getBoolean(10)) : null);
        sb6.append(" streamCard cardBuffer=");
        r45.ww2 o79 = o7();
        sb6.append((o79 != null ? o79.getByteString(6) : null) != null);
        com.tencent.mars.xlog.Log.i("Finder.AlbumTimelineUI", sb6.toString());
        jz5.g gVar = this.I;
        com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1 finderAlbumTimelineUI$feedLoader$2$1 = (com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1) ((jz5.n) gVar).getValue();
        finderAlbumTimelineUI$feedLoader$2$1.initFromCache(getIntent());
        finderAlbumTimelineUI$feedLoader$2$1.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.v(this, finderAlbumTimelineUI$feedLoader$2$1));
        finderAlbumTimelineUI$feedLoader$2$1.f107429t = new com.tencent.mm.plugin.finder.feed.ui.w(this);
        finderAlbumTimelineUI$feedLoader$2$1.f107430u = new com.tencent.mm.plugin.finder.feed.ui.x(finderAlbumTimelineUI$feedLoader$2$1, this);
        finderAlbumTimelineUI$feedLoader$2$1.f107431v = new com.tencent.mm.plugin.finder.feed.ui.y(finderAlbumTimelineUI$feedLoader$2$1, this);
        com.tencent.mm.plugin.finder.feed.ui.l n78 = n7();
        if (n78 != null && n78.f110249a == 3) {
            z17 = true;
        }
        if (z17) {
            ((com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1) ((jz5.n) gVar).getValue()).requestRefresh();
        }
        com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1 finderAlbumTimelineUI$feedLoader$2$12 = (com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1) ((jz5.n) gVar).getValue();
        r45.ww2 o710 = o7();
        finderAlbumTimelineUI$feedLoader$2$12.f107421i = o710 != null ? o710.getBoolean(10) : true;
    }

    public final long l7() {
        return ((java.lang.Number) ((jz5.n) this.E).getValue()).longValue();
    }

    public final int m7() {
        return ((java.lang.Number) ((jz5.n) this.B).getValue()).intValue();
    }

    public final com.tencent.mm.plugin.finder.feed.ui.l n7() {
        return (com.tencent.mm.plugin.finder.feed.ui.l) ((jz5.n) this.H).getValue();
    }

    public final r45.ww2 o7() {
        return (r45.ww2) ((jz5.n) this.C).getValue();
    }

    public final com.tencent.mm.plugin.finder.feed.o9 p7() {
        return (com.tencent.mm.plugin.finder.feed.o9) ((jz5.n) this.f109206y).getValue();
    }
}
