package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandActionHeaderLayout */
/* loaded from: classes2.dex */
public class C12491x46091613 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f167866d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.HorizontalScrollView f167867e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12493xb500f536 f167868f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12492x70346dfe f167869g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12492x70346dfe f167870h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12492x70346dfe f167871i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12492x70346dfe f167872m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f167873n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Context f167874o;

    /* renamed from: p, reason: collision with root package name */
    public int f167875p;

    public C12491x46091613(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f167875p = -1;
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f167874o = context;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569665i1, this);
        this.f167866d = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.a29);
        this.f167867e = (android.widget.HorizontalScrollView) findViewById(com.p314xaae8f345.mm.R.id.a27);
        this.f167868f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12493xb500f536) findViewById(com.p314xaae8f345.mm.R.id.a2i);
        this.f167869g = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12492x70346dfe) findViewById(com.p314xaae8f345.mm.R.id.a2c);
        this.f167870h = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12492x70346dfe) findViewById(com.p314xaae8f345.mm.R.id.a2d);
        this.f167871i = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12492x70346dfe) findViewById(com.p314xaae8f345.mm.R.id.a2e);
        this.f167872m = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12492x70346dfe) findViewById(com.p314xaae8f345.mm.R.id.a2f);
        this.f167873n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a2_);
        this.f167869g.setVisibility(8);
        this.f167870h.setVisibility(8);
        this.f167871i.setVisibility(8);
        this.f167872m.setVisibility(8);
        this.f167873n.setVisibility(8);
    }

    /* renamed from: getStatusTextView */
    public android.widget.TextView m52103xe2e0847a() {
        return this.f167873n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i17 = this.f167875p;
        if (i17 > 0) {
            m52106x4133a630(i17);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f167875p;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
        if (this.f167875p <= 0 || getMeasuredHeight() <= this.f167875p) {
            return;
        }
        super.setMeasuredDimension(getMeasuredWidth(), this.f167875p);
    }

    /* renamed from: setActionHeaderStyle */
    public void m52104xb86ebacc(boolean z17) {
        if (z17) {
            this.f167868f.m52121xfdf54ca2(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            this.f167869g.m52116xfdf54ca2(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            this.f167870h.m52116xfdf54ca2(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            this.f167871i.m52116xfdf54ca2(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            this.f167872m.m52116xfdf54ca2(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            this.f167873n.setTextColor(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            return;
        }
        this.f167868f.m52121xfdf54ca2(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560260fi));
        this.f167869g.m52116xfdf54ca2(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560260fi));
        this.f167870h.m52116xfdf54ca2(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560260fi));
        this.f167871i.m52116xfdf54ca2(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560260fi));
        this.f167872m.m52116xfdf54ca2(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560260fi));
        this.f167873n.setTextColor(this.f167874o.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560260fi));
    }

    @java.lang.Deprecated
    /* renamed from: setAppId */
    public void m52105x52b73fda(java.lang.String str) {
    }

    /* renamed from: setForceHeight */
    public void m52106x4133a630(int i17) {
        this.f167875p = java.lang.Math.max(i17, -1);
        if (getParent() instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
            int i18 = this.f167875p;
            if (i18 > 0) {
                viewGroup.setMinimumHeight(i18);
            }
            requestLayout();
        }
    }

    /* renamed from: setStatusDescription */
    public void m52107x7922e468(java.lang.CharSequence charSequence) {
        this.f167873n.setText(charSequence);
        this.f167873n.setVisibility(0);
        this.f167866d.setVisibility(8);
        this.f167867e.setVisibility(8);
    }

    public C12491x46091613(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f167875p = -1;
        a(context);
    }
}
