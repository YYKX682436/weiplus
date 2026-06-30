package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRelatedFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/fs;", "Lcom/tencent/mm/plugin/finder/feed/es;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRelatedFeedUI */
/* loaded from: classes2.dex */
public final class ActivityC14080xcc10ea17 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fs, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.es> {

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.es f191056t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fs f191057u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 f191058v;

    /* renamed from: x, reason: collision with root package name */
    public r45.z91 f191060x;

    /* renamed from: y, reason: collision with root package name */
    public r45.aa1 f191061y;

    /* renamed from: w, reason: collision with root package name */
    public final int f191059w = 2;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f191062z = "";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        int intExtra = getIntent().getIntExtra("KEY_MORE_ACTION_TYPE", 0);
        if (intExtra != 1) {
            return intExtra != 2 ? 0 : 28;
        }
        return 30;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        int intExtra = getIntent().getIntExtra("KEY_MORE_ACTION_TYPE", 0);
        return (intExtra == 1 || intExtra == 2) ? 3 : 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k0 c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.es esVar = this.f191056t;
        if (esVar != null) {
            return esVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fs fsVar = this.f191057u;
        if (fsVar != null) {
            return fsVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    public void e7() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d A[ADDED_TO_REGION] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13938x39dfb2f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f7() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14080xcc10ea17.f7():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b86;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa;
        if (i17 == 501 && i18 == -1 && intent != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.es esVar = this.f191056t;
            if (esVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = esVar.f188690f;
            if (a1Var == null || (m56022x4905e9fa = a1Var.m56022x4905e9fa()) == null) {
                return;
            }
            hc2.f1.v(m56022x4905e9fa, intent, esVar.f188689e, true, null);
        }
    }
}
