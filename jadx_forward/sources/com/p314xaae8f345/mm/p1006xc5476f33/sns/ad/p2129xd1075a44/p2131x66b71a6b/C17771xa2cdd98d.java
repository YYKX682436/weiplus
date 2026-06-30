package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2131x66b71a6b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdTopicPressMaskLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdTopicPressMaskLayout */
/* loaded from: classes2.dex */
public final class C17771xa2cdd98d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f244795d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f244796e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.PorterDuffColorFilter f244797f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17771xa2cdd98d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdTopicPressMaskLayout");
        super.onFinishInflate();
        this.f244795d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.vgh);
        this.f244796e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.skt);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdTopicPressMaskLayout");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdTopicPressMaskLayout");
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        boolean z17 = true;
        if (valueOf != null && valueOf.intValue() == 0) {
            android.widget.ImageView imageView = this.f244795d;
            if (imageView != null) {
                imageView.setPressed(true);
            }
            android.widget.ImageView imageView2 = this.f244796e;
            if (imageView2 != null) {
                imageView2.setColorFilter(this.f244797f);
            }
        } else {
            if ((valueOf == null || valueOf.intValue() != 3) && (valueOf == null || valueOf.intValue() != 1)) {
                z17 = false;
            }
            if (z17) {
                android.widget.ImageView imageView3 = this.f244795d;
                if (imageView3 != null) {
                    imageView3.setPressed(false);
                }
                android.widget.ImageView imageView4 = this.f244796e;
                if (imageView4 != null) {
                    imageView4.clearColorFilter();
                }
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdTopicPressMaskLayout");
        return onTouchEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17771xa2cdd98d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f244797f = new android.graphics.PorterDuffColorFilter(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.ahd), android.graphics.PorterDuff.Mode.SRC_ATOP);
    }
}
