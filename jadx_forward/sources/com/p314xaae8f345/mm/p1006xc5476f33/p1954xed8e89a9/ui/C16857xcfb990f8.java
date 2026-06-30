package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.IconWidgetPreference */
/* loaded from: classes4.dex */
public class C16857xcfb990f8 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.ImageView L;
    public final int M;
    public android.graphics.Bitmap N;

    public C16857xcfb990f8(android.content.Context context) {
        this(context, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.l2u);
        this.L = imageView;
        if (imageView != null) {
            imageView.setVisibility(8);
            int i17 = this.M;
            if (i17 != -1) {
                this.L.setImageResource(i17);
                this.L.setVisibility(0);
                return;
            }
            android.graphics.Bitmap bitmap = this.N;
            if (bitmap != null) {
                this.L.setImageBitmap(bitmap);
                this.L.setVisibility(0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.c18, viewGroup2);
        return u17;
    }

    public C16857xcfb990f8(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C16857xcfb990f8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        this.M = -1;
        this.N = null;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
        this.H = 0;
    }
}
