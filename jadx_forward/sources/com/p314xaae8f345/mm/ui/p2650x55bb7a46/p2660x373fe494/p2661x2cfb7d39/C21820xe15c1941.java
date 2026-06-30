package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryToolBarView;", "Lcom/tencent/mm/ui/immersive/ImmersiveBaseChromeView;", "", "enabled", "Ljz5/f0;", "setButtonsEnabled", "Leh5/a;", "g", "Leh5/a;", "getImmersiveType", "()Leh5/a;", "immersiveType", "", "h", "I", "getDefaultVisibility", "()I", "defaultVisibility", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView */
/* loaded from: classes10.dex */
public final class C21820xe15c1941 extends com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b {

    /* renamed from: f, reason: collision with root package name */
    public em.g2 f283273f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final eh5.a immersiveType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int defaultVisibility;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21820xe15c1941(android.content.Context context) {
        this(context, null, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b
    public android.view.View a() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ekt, (android.view.ViewGroup) this, false);
        this.f283273f = new em.g2(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    public final void b(ad5.l0[] operationList, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operationList, "operationList");
        if (!isAttachedToWindow()) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(this)) {
                b((ad5.l0[]) java.util.Arrays.copyOf(operationList, operationList.length), lVar);
                return;
            } else {
                addOnAttachStateChangeListener(new vc5.x(this, this, operationList, lVar));
                return;
            }
        }
        em.g2 g2Var = this.f283273f;
        if (g2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        for (int childCount = g2Var.a().getChildCount() - 1; -1 < childCount; childCount--) {
            em.g2 g2Var2 = this.f283273f;
            if (g2Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            g2Var2.a().getChildAt(childCount).setOnClickListener(null);
            em.g2 g2Var3 = this.f283273f;
            if (g2Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            g2Var3.a().removeViewAt(childCount);
        }
        int h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        for (ad5.l0 l0Var : operationList) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
            c22699x3dcdb352.s(l0Var.c(), com.p314xaae8f345.mm.R.C30859x5a72f63.ahu);
            c22699x3dcdb352.setOnClickListener(new vc5.y(this, l0Var, lVar));
            int i17 = h17 * 3;
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams layoutParams = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams(i17, i17);
            int i18 = h17 * 2;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = i18;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i18;
            layoutParams.f125723e = 0.0f;
            layoutParams.f125724f = 0.0f;
            c22699x3dcdb352.setLayoutParams(layoutParams);
            em.g2 g2Var4 = this.f283273f;
            if (g2Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            g2Var4.a().addView(c22699x3dcdb352);
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            if (!n3.x0.c(c22699x3dcdb352) || c22699x3dcdb352.isLayoutRequested()) {
                c22699x3dcdb352.addOnLayoutChangeListener(new vc5.z(c22699x3dcdb352, h17));
            } else {
                com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.Companion.m42550x8c53ca37(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.INSTANCE, c22699x3dcdb352, i18, i18, i18, i18, false, 32, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b
    public int getDefaultVisibility() {
        return this.defaultVisibility;
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b
    public eh5.a getImmersiveType() {
        return this.immersiveType;
    }

    /* renamed from: setButtonsEnabled */
    public final void m79685x72265582(boolean z17) {
        em.g2 g2Var = this.f283273f;
        if (g2Var == null) {
            return;
        }
        if (g2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc a17 = g2Var.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMsgHistoryGalleryToolBarView(...)");
        int childCount = a17.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = a17.getChildAt(i17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = childAt instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) childAt : null;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setEnabled(z17);
                c22699x3dcdb352.setClickable(z17);
                c22699x3dcdb352.m82039x7369a23(z17 ? 1.0f : 0.3f);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21820xe15c1941(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public /* synthetic */ C21820xe15c1941(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21820xe15c1941(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.immersiveType = eh5.a.f334485e;
        this.defaultVisibility = 8;
    }
}
