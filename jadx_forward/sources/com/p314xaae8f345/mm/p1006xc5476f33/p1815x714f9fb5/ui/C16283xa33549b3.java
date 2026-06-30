package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui;

/* renamed from: com.tencent.mm.plugin.location.ui.NewMyLocationButton */
/* loaded from: classes13.dex */
public class C16283xa33549b3 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f226152d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f226153e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f226154f;

    /* renamed from: g, reason: collision with root package name */
    public ab3.h f226155g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f226156h;

    /* renamed from: i, reason: collision with root package name */
    public final i11.c f226157i;

    public C16283xa33549b3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f226156h = true;
        this.f226157i = new za3.j(this);
        this.f226152d = context;
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(this.f226152d, com.p314xaae8f345.mm.R.C30864xbddafb2a.c7p, this);
        this.f226153e = (android.widget.ImageButton) inflate.findViewById(com.p314xaae8f345.mm.R.id.k9o);
        this.f226154f = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.k9x);
    }

    /* renamed from: setAnimToSelf */
    public void m65939x189dbfda(boolean z17) {
        this.f226156h = z17;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f226153e.setOnClickListener(onClickListener);
    }

    /* renamed from: setProgressBar */
    public void m65940xb3ad30e4(ab3.h hVar) {
        this.f226155g = hVar;
        this.f226154f.setVisibility(0);
        this.f226153e.setVisibility(8);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().j(this.f226157i, true);
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        if (z17 != this.f226153e.isSelected()) {
            this.f226153e.setSelected(z17);
        }
    }

    public C16283xa33549b3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226156h = true;
        this.f226157i = new za3.j(this);
        this.f226152d = context;
        a();
    }
}
