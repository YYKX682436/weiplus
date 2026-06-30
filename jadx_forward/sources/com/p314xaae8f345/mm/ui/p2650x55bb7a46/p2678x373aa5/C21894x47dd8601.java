package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* renamed from: com.tencent.mm.ui.chatting.view.ChattingAvatarImageView */
/* loaded from: classes5.dex */
public class C21894x47dd8601 extends com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f284352p = 0;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f284353m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f284354n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f284355o;

    public C21894x47dd8601(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf
    /* renamed from: getTipTextSize */
    public float mo67516x298edb53() {
        try {
            return ((android.widget.TextView) this.f234428i.getContentView().findViewById(com.p314xaae8f345.mm.R.id.kpx)).getTextSize();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingAvatarImageView", th6, "getTipTextSize err", new java.lang.Object[0]);
            return 0.0f;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf, mp3.m
    public void m(java.lang.CharSequence charSequence) {
        android.view.View contentView = this.f234428i.getContentView();
        android.widget.TextView textView = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.kpx);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, charSequence));
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.f567802qn1);
        com.p314xaae8f345.mm.ui.bk.s0(textView2.getPaint());
        textView2.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e(this));
        postDelayed(this.f284355o, 200L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf, com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16783xd8f83d56, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f284355o);
        this.f284353m.mo48814x2efc64();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(com.p314xaae8f345.mm.R.id.f567801qn0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574216hg2)));
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f284353m;
        if (abstractC20980x9b9ad01d != null) {
            if (i17 == 8) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
            } else if (i17 == 0) {
                abstractC20980x9b9ad01d.mo48813x58998cd();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf, android.view.View
    public void onWindowVisibilityChanged(int i17) {
        super.onWindowVisibilityChanged(i17);
        if (i17 == 8) {
            this.f234428i.dismiss();
            ((pp3.j) this.f234427h).a();
            ((pp3.j) this.f234427h).b();
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i17, android.os.Bundle bundle) {
        pp3.b bVar;
        if (i17 == com.p314xaae8f345.mm.R.id.f567801qn0) {
            if (!(mo67507xa8abf2d5() != null ? mo67507xa8abf2d5().a(this) : false) && (bVar = this.f234427h) != null) {
                ((pp3.j) bVar).d();
            }
        }
        return super.performAccessibilityAction(i17, bundle);
    }

    public C21894x47dd8601(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f284353m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5832xc2fc331e>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.ui.chatting.view.ChattingAvatarImageView.1
            {
                this.f39173x3fe91575 = 447918382;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5832xc2fc331e c5832xc2fc331e) {
                int i18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601.f284352p;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd8601 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601.this;
                c21894x47dd8601.f234428i.dismiss();
                ((pp3.j) c21894x47dd8601.f234427h).a();
                ((pp3.j) c21894x47dd8601.f234427h).b();
                if (!c5832xc2fc331e.f136139g.f90127a) {
                    return false;
                }
                c21894x47dd8601.f284353m.mo48814x2efc64();
                return false;
            }
        };
        this.f284354n = false;
        this.f284355o = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.d(this);
    }
}
