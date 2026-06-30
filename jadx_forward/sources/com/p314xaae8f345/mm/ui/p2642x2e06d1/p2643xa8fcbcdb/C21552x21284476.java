package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.ImagePreference */
/* loaded from: classes4.dex */
public final class C21552x21284476 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.ImageView L;
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.l M;

    public C21552x21284476(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        this.L = imageView;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.l lVar = this.M;
        if (imageView == null) {
            lVar.getClass();
        } else if (lVar.f279372a != -1) {
            imageView.setImageDrawable(i65.a.i(imageView.getContext(), lVar.f279372a));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.chj);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.c0b, viewGroup2);
        return u17;
    }

    public C21552x21284476(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.l lVar = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.l();
        this.M = lVar;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0b;
        this.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570827c10;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528725j);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            lVar.f279372a = resourceId;
            android.widget.ImageView imageView = this.L;
            if (imageView != null && resourceId != -1) {
                imageView.setImageDrawable(i65.a.i(imageView.getContext(), lVar.f279372a));
            }
        }
        obtainStyledAttributes.recycle();
    }
}
