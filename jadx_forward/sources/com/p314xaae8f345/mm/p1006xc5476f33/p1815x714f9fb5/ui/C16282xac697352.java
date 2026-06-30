package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui;

/* renamed from: com.tencent.mm.plugin.location.ui.MyPoiPoint */
/* loaded from: classes13.dex */
public class C16282xac697352 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public ab3.h f226147d;

    /* renamed from: e, reason: collision with root package name */
    public i11.e f226148e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f226149f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4395x7851a8f0 f226150g;

    /* renamed from: h, reason: collision with root package name */
    public final i11.c f226151h;

    public C16282xac697352(android.content.Context context, ab3.h hVar) {
        super(context);
        this.f226149f = false;
        this.f226151h = new za3.g(this);
        a(context);
        this.f226147d = hVar;
    }

    public final void a(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c_3, (android.view.ViewGroup) this, true);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        this.f226148e = e17;
        e17.j(this.f226151h, true);
    }

    /* renamed from: setIMapView */
    public void m65938xa706e3fa(ab3.h hVar) {
        this.f226147d = hVar;
    }

    public C16282xac697352(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226149f = false;
        this.f226151h = new za3.g(this);
        a(context);
    }

    public C16282xac697352(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f226149f = false;
        this.f226151h = new za3.g(this);
        a(context);
    }
}
