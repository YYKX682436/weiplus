package com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui;

/* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomVolumeMeter */
/* loaded from: classes15.dex */
public class C18552xddf7b248 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public fh4.d0 f254009d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f254010e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f254011f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f254012g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f254013h;

    public C18552xddf7b248(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }

    /* renamed from: setShowErr */
    private void m71578x2c768266(boolean z17) {
        this.f254012g.setVisibility(z17 ? 0 : 8);
    }

    /* renamed from: setShowRed */
    private void m71579x2c76b192(boolean z17) {
        this.f254009d.f344221w = z17;
    }

    public final void a() {
        this.f254009d = new fh4.d0(this, getContext());
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f254010e = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        this.f254010e.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bo6);
        this.f254010e.setVisibility(0);
        android.widget.ImageView imageView2 = new android.widget.ImageView(getContext());
        this.f254011f = imageView2;
        imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.f254011f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563691bo5);
        this.f254011f.setVisibility(8);
        android.widget.ImageView imageView3 = new android.widget.ImageView(getContext());
        this.f254012g = imageView3;
        imageView3.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.f254012g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563688bo2);
        this.f254012g.setVisibility(8);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.f254013h = frameLayout;
        frameLayout.addView(this.f254009d);
        this.f254013h.addView(this.f254011f);
        this.f254013h.setVisibility(8);
        addView(this.f254013h);
        addView(this.f254012g);
        addView(this.f254010e);
        setBackgroundColor(-16777216);
        bringChildToFront(this.f254010e);
    }

    /* renamed from: setMax */
    public void m71580xca027da2(int i17) {
        this.f254009d.f344205d = i17;
    }

    /* renamed from: setMaxPos */
    public void m71581x17db4152(int i17) {
        this.f254009d.f344207f = i17;
    }

    /* renamed from: setMinPos */
    public void m71582x184771a4(int i17) {
        this.f254009d.f344206e = i17;
    }

    /* renamed from: setShowFlame */
    public void m71583xe8eaabf4(boolean z17) {
        android.graphics.Canvas lockCanvas;
        this.f254013h.setVisibility(z17 ? 0 : 8);
        if (z17) {
            fh4.d0 d0Var = this.f254009d;
            if (d0Var.f344222x) {
                return;
            }
            d0Var.f344222x = true;
            d0Var.f344216r.c(100L, 100L);
            return;
        }
        fh4.d0 d0Var2 = this.f254009d;
        if (d0Var2.f344222x) {
            d0Var2.f344222x = false;
            float f17 = d0Var2.f344219u;
            if (f17 >= d0Var2.f344206e && f17 <= d0Var2.f344207f && d0Var2.f344210i != null && d0Var2.f344209h != null && (lockCanvas = d0Var2.f344208g.lockCanvas()) != null && d0Var2.f344213o != null) {
                lockCanvas.setDrawFilter(d0Var2.f344220v);
                int i17 = (int) 0.0f;
                d0Var2.f344213o.set(0, i17, d0Var2.f344215q, d0Var2.f344214p + i17);
                lockCanvas.drawBitmap(d0Var2.f344221w ? d0Var2.f344210i : d0Var2.f344209h, (android.graphics.Rect) null, d0Var2.f344213o, d0Var2.f344212n);
                d0Var2.f344208g.unlockCanvasAndPost(lockCanvas);
            }
            d0Var2.f344216r.d();
        }
    }

    /* renamed from: setValue */
    public void m71584x53d8522f(int i17) {
        fh4.d0 d0Var = this.f254009d;
        if (i17 < 0) {
            i17 = 0;
        } else {
            int i18 = d0Var.f344205d;
            if (i17 > i18) {
                i17 = i18;
            }
        }
        d0Var.getClass();
        float f17 = d0Var.f344207f;
        d0Var.f344219u = f17 - ((f17 - d0Var.f344206e) * ((i17 * 1.0f) / d0Var.f344205d));
    }

    public C18552xddf7b248(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
