package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryTimelineOverlayView;", "Lcom/tencent/mm/ui/immersive/ImmersiveBaseChromeView;", "", com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "Ljz5/f0;", "setTimelineText", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "", "g", "I", "getDefaultVisibility", "()I", "defaultVisibility", "Leh5/a;", "h", "Leh5/a;", "getImmersiveType", "()Leh5/a;", "immersiveType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView */
/* loaded from: classes5.dex */
public final class C21819x24b6e7b5 extends com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b {

    /* renamed from: f, reason: collision with root package name */
    public em.f2 f283270f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int defaultVisibility;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final eh5.a immersiveType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21819x24b6e7b5(android.content.Context context) {
        this(context, null, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b
    public android.view.View a() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eks, (android.view.ViewGroup) this, false);
        em.f2 f2Var = new em.f2(inflate);
        this.f283270f = f2Var;
        android.widget.TextView a17 = f2Var.a();
        vc5.t tVar = vc5.t.f516878a;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(a17, tVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b
    public int getDefaultVisibility() {
        return this.defaultVisibility;
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b
    public eh5.a getImmersiveType() {
        return this.immersiveType;
    }

    /* renamed from: setTimelineText */
    public final void m79683xeea61290(long j17) {
        em.f2 f2Var = this.f283270f;
        if (f2Var != null) {
            f2Var.a().setText(k35.m1.f(getContext(), j17, false, false));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21819x24b6e7b5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public /* synthetic */ C21819x24b6e7b5(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21819x24b6e7b5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.defaultVisibility = 8;
        this.immersiveType = eh5.a.f334486f;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        setLayoutParams(layoutParams);
    }

    /* renamed from: setTimelineText */
    public final void m79684xeea61290(java.lang.CharSequence text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        em.f2 f2Var = this.f283270f;
        if (f2Var != null) {
            f2Var.a().setText(text);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
    }
}
