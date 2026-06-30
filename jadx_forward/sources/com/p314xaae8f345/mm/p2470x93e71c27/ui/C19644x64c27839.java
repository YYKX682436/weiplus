package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.ProfileDescribeView */
/* loaded from: classes8.dex */
public class C19644x64c27839 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501 {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f271334e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f271335f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f271336g;

    public C19644x64c27839(android.content.Context context) {
        super(context, null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501
    public void a() {
        this.f271334e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ccr);
        this.f271335f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cct);
        this.f271336g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cul);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501
    /* renamed from: getLayout */
    public int mo67643x22f21e20() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cav;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public C19644x64c27839(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C19644x64c27839(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
