package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes8.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee f257780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee activityC18845xae54c8ee) {
        super(0);
        this.f257780d = activityC18845xae54c8ee;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f257780d.m78510xe15784dd().findViewById(com.p314xaae8f345.mm.R.id.p6e);
        int i17 = com.p314xaae8f345.mm.R.id.cm8;
        android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.cm8);
        if (button != null) {
            i17 = com.p314xaae8f345.mm.R.id.kj9;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.kj9);
            if (viewOnClickListenerC22631x1cc07cc8 != null) {
                i17 = com.p314xaae8f345.mm.R.id.f569148p65;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f569148p65);
                if (linearLayout != null) {
                    i17 = com.p314xaae8f345.mm.R.id.p6a;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.p6a);
                    if (imageView != null) {
                        i17 = com.p314xaae8f345.mm.R.id.p6d;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.p6d);
                        if (linearLayout2 != null) {
                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById;
                            i17 = com.p314xaae8f345.mm.R.id.p6f;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.p6f);
                            if (textView != null) {
                                i17 = com.p314xaae8f345.mm.R.id.p6h;
                                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.p6h);
                                if (linearLayout3 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.p6i;
                                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.p6i);
                                    if (textView2 != null) {
                                        return new fq.f(c1073x7e08a787, button, viewOnClickListenerC22631x1cc07cc8, linearLayout, imageView, linearLayout2, c1073x7e08a787, textView, linearLayout3, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
