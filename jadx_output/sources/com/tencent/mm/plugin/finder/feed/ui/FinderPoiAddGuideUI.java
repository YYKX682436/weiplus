package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderPoiAddGuideUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: t, reason: collision with root package name */
    public android.widget.CheckBox f109477t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f109478u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.Button f109479v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f109480w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f109481x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f109482y;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489060b52;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.bdi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f109477t = (android.widget.CheckBox) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.oot);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f109478u = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f483501b14);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f109479v = (android.widget.Button) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ihy);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f109480w = (android.widget.LinearLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f485430hn5);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f109481x = (android.widget.ImageView) findViewById5;
        boolean z17 = !com.tencent.mm.sdk.platformtools.m2.j();
        if (z17) {
            android.widget.ImageView imageView = this.f109481x;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("poiGuide");
                throw null;
            }
            imageView.setImageDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.c5h));
        } else {
            android.widget.ImageView imageView2 = this.f109481x;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("poiGuide");
                throw null;
            }
            imageView2.setImageDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.c5g));
        }
        if (com.tencent.mm.ui.bk.C()) {
            if (z17) {
                android.widget.ImageView imageView3 = this.f109481x;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o("poiGuide");
                    throw null;
                }
                imageView3.setImageDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.c5j));
            } else {
                android.widget.ImageView imageView4 = this.f109481x;
                if (imageView4 == null) {
                    kotlin.jvm.internal.o.o("poiGuide");
                    throw null;
                }
                imageView4.setImageDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.c5i));
            }
        }
        android.widget.LinearLayout linearLayout = this.f109480w;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("checkContainer");
            throw null;
        }
        linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.ih(this));
        android.widget.TextView textView = this.f109478u;
        if (textView == null) {
            kotlin.jvm.internal.o.o("licenseContent");
            throw null;
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.jh(this));
        android.widget.Button button = this.f109479v;
        if (button != null) {
            button.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.kh(this));
        } else {
            kotlin.jvm.internal.o.o("addButton");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.lh(this));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        setMMTitle("");
        hideActionbarLine();
        initView();
    }
}
