package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/drama/timeline/FinderNativeDramaTimelineFeedLoader;", "Lac2/y;", "Lac2/t;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineUI */
/* loaded from: classes2.dex */
public final class ActivityC13722xc5bc5e9f extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c, ac2.y, ac2.t> {
    public final int A = 2;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c f186833x;

    /* renamed from: y, reason: collision with root package name */
    public ac2.t f186834y;

    /* renamed from: z, reason: collision with root package name */
    public ac2.y f186835z;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 356;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c c13721x95edc87c = this.f186833x;
        if (c13721x95edc87c != null) {
            return c13721x95edc87c;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj e7() {
        ac2.t tVar = this.f186834y;
        if (tVar != null) {
            return tVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj g7() {
        ac2.y yVar = this.f186835z;
        if (yVar != null) {
            return yVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570580ed1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b
    public void h7() {
        long longExtra = getIntent().getLongExtra("native_drama_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("native_drama_export_id");
        long longExtra2 = getIntent().getLongExtra("native_drama_object_id", 0L);
        if (ep1.m.g(getIntent())) {
            longExtra2 = getIntent().getLongExtra("KEY_ENTER_PLAYING_FEED_ID", longExtra2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaTimelineUI", "fromFloatBall");
        }
        long j17 = longExtra2;
        java.lang.String stringExtra2 = getIntent().getStringExtra("native_drama_export_object_id");
        java.lang.String stringExtra3 = getIntent().getStringExtra("native_drama_title");
        int intExtra = getIntent().getIntExtra("KEY_JSAPI_SOURCE_TYPE", 0);
        long longExtra3 = getIntent().getLongExtra("native_drama_enter_object_id", 0L);
        int intExtra2 = getIntent().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
        java.lang.String stringExtra4 = getIntent().getStringExtra("native_drama_enter_dupflag");
        java.lang.String stringExtra5 = getIntent().getStringExtra("native_drama_session_buffer");
        ac2.t tVar = new ac2.t(this, longExtra, j17, stringExtra5);
        this.f186834y = tVar;
        this.f186835z = new ac2.y(this, tVar, this.A, 356);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ac2.z zVar = new ac2.z(longExtra, null, null, true, true, j17);
        zVar.f84609f = stringExtra;
        zVar.f84610g = stringExtra2;
        arrayList.add(zVar);
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        r45.tj2 tj2Var = new r45.tj2();
        tj2Var.set(0, java.lang.Long.valueOf(longExtra));
        tj2Var.set(1, stringExtra5);
        this.f186833x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.C13721x95edc87c(V6, longExtra3, stringExtra4, intExtra2, intExtra, arrayList, zVar, zVar, tj2Var);
        ac2.y yVar = this.f186835z;
        if (yVar != null) {
            yVar.A(stringExtra3);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC14050x88d1020b, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.q1.j(super.mo43419xa59964ef(), ac2.g.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k7(zb2.b r29, long r30) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f.k7(zb2.b, long):void");
    }
}
