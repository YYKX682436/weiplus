package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFollowAggregationUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f109245y = 0;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f109246t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f109247u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f109248v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f109249w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f109250x;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e7i;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1) {
            recreate();
            setResult(-1);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        findViewById(com.tencent.mm.R.id.backBtn).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.t2(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.tf7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f109246t = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.vbz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f109247u = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.txz);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f109248v = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.txy);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f109249w = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f485031l5);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f109250x = (android.widget.TextView) findViewById5;
        android.view.View view = this.f109246t;
        if (view == null) {
            kotlin.jvm.internal.o.o("searchIcon");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.u2(this));
        android.view.View view2 = this.f109246t;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("searchIcon");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        dv2.v vVar = (dv2.v) pf5.z.f353948a.a(this).a(dv2.v.class);
        if (vVar == null) {
            throw new java.lang.IllegalStateException("FinderFollowAggregationTabUIC not registered".toString());
        }
        kotlinx.coroutines.flow.j2 j2Var = vVar.f243962z;
        kotlinx.coroutines.flow.l.p(new kotlinx.coroutines.flow.y1(j2Var, new com.tencent.mm.plugin.finder.feed.ui.v2(this)), v65.m.b(this));
        kotlinx.coroutines.flow.l.p(new kotlinx.coroutines.flow.y1(new kotlinx.coroutines.flow.f2(j2Var, vVar.f243959w, new com.tencent.mm.plugin.finder.feed.ui.w2(null)), new com.tencent.mm.plugin.finder.feed.ui.x2(this, null)), v65.m.b(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.remove(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
        set.addAll(kz5.z.D0(new java.lang.Class[]{dv2.v.class, hy2.f.class, com.tencent.mm.plugin.finder.viewmodel.component.h00.class}));
    }
}
