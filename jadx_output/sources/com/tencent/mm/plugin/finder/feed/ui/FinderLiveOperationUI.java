package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveOperationUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderLiveOperationUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name */
    public boolean f109388v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.live.square.operation.FinderLiveOperationFragment f109389w = new com.tencent.mm.plugin.finder.nearby.live.square.operation.FinderLiveOperationFragment();

    /* renamed from: x, reason: collision with root package name */
    public boolean f109390x;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109420v() {
        return "FinderLiveOperationUI";
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        this.f109390x = true;
        rq2.x.f398914a.a();
        super.finish();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return this.f109388v ? com.tencent.mm.R.layout.ass : com.tencent.mm.R.layout.asr;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.o1.c(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.rb.class)));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f109388v = getIntent().getIntExtra("key_use_dark_style", 1) == 1;
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        if (this.f109388v) {
            getController().p0(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
            setBackGroundColorResource(com.tencent.mm.R.color.f478512u);
        }
        findViewById(com.tencent.mm.R.id.aae).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.za(this));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.fnn)).setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479559b) * i65.a.m(getContext()));
        java.lang.String stringExtra = getIntent().getStringExtra("key_page_title");
        if (!android.text.TextUtils.isEmpty(stringExtra)) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.fnn)).setText(stringExtra);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.md6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOperationUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOperationUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Intent intent = getIntent();
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        com.tencent.mm.plugin.finder.nearby.live.square.operation.FinderLiveOperationFragment finderLiveOperationFragment = this.f109389w;
        finderLiveOperationFragment.setArguments(extras);
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.h(com.tencent.mm.R.id.g7m, finderLiveOperationFragment, null, 1);
        beginTransaction.n(finderLiveOperationFragment);
        beginTransaction.e();
        this.f109390x = false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f109389w.setArguments(intent != null ? intent.getExtras() : null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f109390x) {
            p52.c cVar = p52.h.f352016a;
            p52.h.f352017b = false;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        p52.c cVar = p52.h.f352016a;
        p52.h.f352017b = true;
        super.onResume();
    }
}
