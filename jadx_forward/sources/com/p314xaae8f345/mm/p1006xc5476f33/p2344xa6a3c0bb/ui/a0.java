package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e f257764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18844x9df91d1e activityC18844x9df91d1e) {
        super(0);
        this.f257764d = activityC18844x9df91d1e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f257764d.m78510xe15784dd().findViewById(com.p314xaae8f345.mm.R.id.p68);
        int i17 = com.p314xaae8f345.mm.R.id.p66;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.p66);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.p67;
            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.p67);
            if (textView2 != null) {
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById;
                i17 = com.p314xaae8f345.mm.R.id.p6_;
                android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.p6_);
                if (button != null) {
                    i17 = com.p314xaae8f345.mm.R.id.p6g;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.p6g);
                    if (imageView != null) {
                        return new fq.e(c1073x7e08a787, textView, textView2, c1073x7e08a787, button, imageView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
