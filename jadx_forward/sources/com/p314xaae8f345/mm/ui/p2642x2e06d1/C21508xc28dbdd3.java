package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMPageControlView */
/* loaded from: classes12.dex */
public class C21508xc28dbdd3 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f279046d;

    /* renamed from: e, reason: collision with root package name */
    public int f279047e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f279048f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f279049g;

    /* renamed from: h, reason: collision with root package name */
    public int f279050h;

    public C21508xc28dbdd3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279048f = new java.util.HashMap();
        this.f279050h = com.p314xaae8f345.mm.R.C30864xbddafb2a.c1t;
        this.f279046d = context;
    }

    public void a(int i17) {
        removeAllViews();
        int i18 = this.f279047e;
        if (i17 >= i18) {
            return;
        }
        for (int i19 = 0; i19 < i18; i19++) {
            this.f279049g = null;
            java.util.Map map = this.f279048f;
            if (i17 == i19) {
                if (((java.util.HashMap) map).size() > i19) {
                    this.f279049g = (android.widget.ImageView) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i19));
                }
                if (this.f279049g == null) {
                    this.f279049g = (android.widget.ImageView) android.view.View.inflate(this.f279046d, this.f279050h, null).findViewById(com.p314xaae8f345.mm.R.id.jmn);
                    ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i19), this.f279049g);
                }
                this.f279049g.setSelected(true);
            } else {
                if (((java.util.HashMap) map).size() > i19) {
                    this.f279049g = (android.widget.ImageView) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i19));
                }
                if (this.f279049g == null) {
                    this.f279049g = (android.widget.ImageView) android.view.View.inflate(this.f279046d, this.f279050h, null).findViewById(com.p314xaae8f345.mm.R.id.jmn);
                    ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i19), this.f279049g);
                }
                this.f279049g.setSelected(false);
            }
            if (i19 == 0) {
                this.f279049g.setPadding(0, 0, 0, 0);
            }
            addView(this.f279049g);
        }
    }

    /* renamed from: getCount */
    public int m79062x7444f759() {
        return this.f279047e;
    }

    /* renamed from: setIndicatorLayoutRes */
    public void m79063x9da123c9(int i17) {
        this.f279050h = i17;
    }

    /* renamed from: setPage */
    public void m79064x764e9211(int i17) {
        a(i17);
    }
}
