package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI */
/* loaded from: classes.dex */
public final class ActivityC14063x9a4df5f3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {

    /* renamed from: t, reason: collision with root package name */
    public android.widget.CheckBox f191010t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f191011u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.Button f191012v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f191013w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f191014x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f191015y;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570593b52;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.bdi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f191010t = (android.widget.CheckBox) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.oot);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f191011u = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f565034b14);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f191012v = (android.widget.Button) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.ihy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f191013w = (android.widget.LinearLayout) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f566963hn5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f191014x = (android.widget.ImageView) findViewById5;
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j();
        if (z17) {
            android.widget.ImageView imageView = this.f191014x;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiGuide");
                throw null;
            }
            imageView.setImageDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c5h));
        } else {
            android.widget.ImageView imageView2 = this.f191014x;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiGuide");
                throw null;
            }
            imageView2.setImageDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c5g));
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            if (z17) {
                android.widget.ImageView imageView3 = this.f191014x;
                if (imageView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiGuide");
                    throw null;
                }
                imageView3.setImageDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c5j));
            } else {
                android.widget.ImageView imageView4 = this.f191014x;
                if (imageView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("poiGuide");
                    throw null;
                }
                imageView4.setImageDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c5i));
            }
        }
        android.widget.LinearLayout linearLayout = this.f191013w;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkContainer");
            throw null;
        }
        linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ih(this));
        android.widget.TextView textView = this.f191011u;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("licenseContent");
            throw null;
        }
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.jh(this));
        android.widget.Button button = this.f191012v;
        if (button != null) {
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kh(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addButton");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lh(this));
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo43517x10010bd5();
    }
}
