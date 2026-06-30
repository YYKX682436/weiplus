package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBackgroundView;", "Landroid/widget/RelativeLayout;", "", "disable", "Ljz5/f0;", "setDisableAlphaUpdate", "getDisableAlphaUpdate", "getAnimatingHide", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.view.FloatBackgroundView */
/* loaded from: classes14.dex */
public final class C12919x6cd8224f extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f174972d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f174973e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f174974f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12919x6cd8224f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBackgroundView", "showBackgroundView show: " + z17);
        if (z17) {
            if (getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBackgroundView", "float background already show");
                return;
            } else {
                setVisibility(0);
                return;
            }
        }
        if (getVisibility() == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBackgroundView", "float background already hide");
        } else {
            setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if ((event.getKeyCode() != 4 && event.getKeyCode() != 3 && event.getKeyCode() != 82) || event.getAction() != 0) {
            return super.dispatchKeyEvent(event);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f174972d).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.l) ((mp1.a) it.next())).f174841a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = nVar.f174853e;
            if (c12917x19ac03e7 != null) {
                c12917x19ac03e7.h();
            }
            nVar.n();
        }
        return true;
    }

    /* renamed from: getAnimatingHide, reason: from getter */
    public final boolean getF174974f() {
        return this.f174974f;
    }

    /* renamed from: getDisableAlphaUpdate, reason: from getter */
    public final boolean getF174973e() {
        return this.f174973e;
    }

    /* renamed from: setDisableAlphaUpdate */
    public final void m54123x9a37dfc1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBackgroundView", "setDisableAlphaUpdate disable: " + z17);
        this.f174973e = z17;
    }

    public /* synthetic */ C12919x6cd8224f(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12919x6cd8224f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f174972d = new java.util.concurrent.CopyOnWriteArraySet();
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570733ei1, this);
        setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77908xe61cad8f));
        setOnClickListener(new rp1.b0(this));
    }
}
