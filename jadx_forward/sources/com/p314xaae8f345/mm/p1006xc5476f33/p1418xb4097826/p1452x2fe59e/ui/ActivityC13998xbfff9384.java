package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveFansListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/o9", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveFansListUI */
/* loaded from: classes3.dex */
public final class ActivityC13998xbfff9384 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g B;
    public long C;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ListView f190901w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f190902x;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f190900v = "Finder.LiveFansListUI";

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.o9 f190903y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.o9();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f190904z = new java.util.ArrayList();

    public final void d7() {
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.B;
        long j17 = this.C;
        ((c61.p2) ybVar).getClass();
        gm0.j1.d().g(new db2.n5(gVar, j17, 1, null));
    }

    public final void e7() {
        java.util.ArrayList arrayList = this.f190904z;
        int size = arrayList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190900v, "update title fans count %s", java.lang.Integer.valueOf(size));
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2x, java.lang.Integer.valueOf(arrayList.size())));
        if (size != 0) {
            android.widget.TextView textView = this.f190902x;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
        }
        android.widget.TextView textView2 = this.f190902x;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
            throw null;
        }
        textView2.setVisibility(0);
        android.widget.TextView textView3 = this.f190902x;
        if (textView3 != null) {
            textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2y));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.afn;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ceg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f190901w = (android.widget.ListView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dft);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f190902x = (android.widget.TextView) findViewById2;
        e7();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p9(this));
        android.widget.ListView listView = this.f190901w;
        if (listView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView.setAdapter((android.widget.ListAdapter) this.f190903y);
        android.widget.ListView listView2 = this.f190901w;
        if (listView2 != null) {
            listView2.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.q9(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(3531, this);
        this.C = getIntent().getLongExtra("PARAM_FINDER_LIVE_ID", 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f190900v, "init intent liveId:" + this.C);
        mo43517x10010bd5();
        d7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(3531, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2 = this.f190900v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        if (i17 == 0 && i18 == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.INetSceneFinderGetFansList");
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((db2.n5) ((zy2.kc) m1Var)).f309633g;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListRequest");
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.B, ((r45.u51) fVar).m75934xbce7f2f(3))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "not my buf, ignore!");
                return;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListResponse");
            this.A = ((r45.v51) fVar2).m75939xb282bd08(2) != 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListResponse");
            this.B = ((r45.v51) fVar3).m75934xbce7f2f(4);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.r9(this, m1Var));
        }
    }
}
