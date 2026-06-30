package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveFansListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/o9", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveFansListUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public com.tencent.mm.protobuf.g B;
    public long C;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ListView f109368w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f109369x;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109367v = "Finder.LiveFansListUI";

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ui.o9 f109370y = new com.tencent.mm.plugin.finder.feed.ui.o9();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f109371z = new java.util.ArrayList();

    public final void d7() {
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.tencent.mm.protobuf.g gVar = this.B;
        long j17 = this.C;
        ((c61.p2) ybVar).getClass();
        gm0.j1.d().g(new db2.n5(gVar, j17, 1, null));
    }

    public final void e7() {
        java.util.ArrayList arrayList = this.f109371z;
        int size = arrayList.size();
        com.tencent.mars.xlog.Log.i(this.f109367v, "update title fans count %s", java.lang.Integer.valueOf(size));
        setMMTitle(getString(com.tencent.mm.R.string.d2x, java.lang.Integer.valueOf(arrayList.size())));
        if (size != 0) {
            android.widget.TextView textView = this.f109369x;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
        }
        android.widget.TextView textView2 = this.f109369x;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("emptyTip");
            throw null;
        }
        textView2.setVisibility(0);
        android.widget.TextView textView3 = this.f109369x;
        if (textView3 != null) {
            textView3.setText(getString(com.tencent.mm.R.string.d2y));
        } else {
            kotlin.jvm.internal.o.o("emptyTip");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.afn;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ceg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f109368w = (android.widget.ListView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dft);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f109369x = (android.widget.TextView) findViewById2;
        e7();
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.p9(this));
        android.widget.ListView listView = this.f109368w;
        if (listView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView.setAdapter((android.widget.ListAdapter) this.f109370y);
        android.widget.ListView listView2 = this.f109368w;
        if (listView2 != null) {
            listView2.setOnScrollListener(new com.tencent.mm.plugin.finder.feed.ui.q9(this));
        } else {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(3531, this);
        this.C = getIntent().getLongExtra("PARAM_FINDER_LIVE_ID", 0L);
        com.tencent.mars.xlog.Log.i(this.f109367v, "init intent liveId:" + this.C);
        initView();
        d7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(3531, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2 = this.f109367v;
        com.tencent.mars.xlog.Log.i(str2, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        if (i17 == 0 && i18 == 0) {
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.INetSceneFinderGetFansList");
            com.tencent.mm.modelbase.o oVar = ((db2.n5) ((zy2.kc) m1Var)).f228100g;
            com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListRequest");
            if (!kotlin.jvm.internal.o.b(this.B, ((r45.u51) fVar).getByteString(3))) {
                com.tencent.mars.xlog.Log.i(str2, "not my buf, ignore!");
                return;
            }
            com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListResponse");
            this.A = ((r45.v51) fVar2).getInteger(2) != 0;
            com.tencent.mm.protobuf.f fVar3 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFansListResponse");
            this.B = ((r45.v51) fVar3).getByteString(4);
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.r9(this, m1Var));
        }
    }
}
