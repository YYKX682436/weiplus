package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002 \u0007B\u001d\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveColiveAnchorListAvatars;", "Landroid/widget/FrameLayout;", "", "", "avatars", "Ljz5/f0;", "setAvatars", "Lcom/tencent/mm/plugin/finder/live/widget/ac;", "value", "d", "Lcom/tencent/mm/plugin/finder/live/widget/ac;", "getScene", "()Lcom/tencent/mm/plugin/finder/live/widget/ac;", "setScene", "(Lcom/tencent/mm/plugin/finder/live/widget/ac;)V", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "", "e", "I", "getMaxCount", "()I", "setMaxCount", "(I)V", "maxCount", "getAvatarCount", "avatarCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/finder/live/widget/zb", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars */
/* loaded from: classes3.dex */
public final class C14393xabbdae9d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ac scene;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int maxCount;

    /* renamed from: f, reason: collision with root package name */
    public float f199118f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f199119g;

    public /* synthetic */ C14393xabbdae9d(android.content.Context context, android.util.AttributeSet attributeSet, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet);
    }

    public final void a() {
        removeAllViews();
        java.util.List list = this.f199119g;
        if (((java.util.ArrayList) list).isEmpty()) {
            setContentDescription(null);
            return;
        }
        int a17 = i65.a.a(getContext(), this.f199118f);
        float f17 = 2.0f;
        int a18 = i65.a.a(getContext(), (this.f199118f / 2.0f) * 1.8571428f);
        float a19 = i65.a.a(getContext(), 2.0f);
        boolean z17 = true;
        int size = ((java.util.ArrayList) list).size() - 1;
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj;
            boolean z18 = i17 != size ? z17 : false;
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zb zbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zb(context);
            zbVar.setId(android.view.View.generateViewId());
            zbVar.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            zbVar.setBackground(null);
            zbVar.setOutlineProvider(null);
            zbVar.f202089d = z18;
            zbVar.f202090e = a17 / f17;
            zbVar.f202091f = a18;
            zbVar.f202092g = a19;
            z17 = true;
            zbVar.f202094i = true;
            zbVar.invalidate();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(a17, a17);
            layoutParams.setMarginStart(i17 * a18);
            layoutParams.gravity = 8388627;
            addView(zbVar, layoutParams);
            if (!r26.n0.N(str)) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                g1Var.a().c(new mn2.n(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.X), zbVar, g1Var.h(mn2.f1.f411490h));
            }
            i17 = i18;
            f17 = 2.0f;
        }
        setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oma, java.lang.Integer.valueOf(((java.util.ArrayList) list).size())));
    }

    /* renamed from: getAvatarCount */
    public final int m57876xeff7d600() {
        return ((java.util.ArrayList) this.f199119g).size();
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ac getScene() {
        return this.scene;
    }

    /* renamed from: setAvatars */
    public final void m57879x8b63f378(java.util.List<java.lang.String> avatars) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatars, "avatars");
        java.util.List K0 = kz5.n0.K0(avatars, this.maxCount);
        java.util.List list = this.f199119g;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(K0, list)) {
            return;
        }
        ((java.util.ArrayList) list).clear();
        kz5.h0.u(list, K0);
        a();
    }

    /* renamed from: setMaxCount */
    public final void m57880x8d59188d(int i17) {
        if (this.maxCount == i17) {
            return;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        this.maxCount = i17;
        a();
    }

    /* renamed from: setScene */
    public final void m57881x53aed94a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ac acVar) {
        float f17;
        if (this.scene == acVar) {
            return;
        }
        this.scene = acVar;
        int i17 = acVar == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bc.f199394a[acVar.ordinal()];
        if (i17 == -1) {
            f17 = 32.0f;
        } else if (i17 == 1) {
            f17 = 28.0f;
        } else {
            if (i17 != 2) {
                throw new jz5.j();
            }
            f17 = 18.0f;
        }
        this.f199118f = f17;
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14393xabbdae9d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.maxCount = 5;
        this.f199118f = 32.0f;
        this.f199119g = new java.util.ArrayList();
        setClipChildren(false);
        setClipToPadding(false);
    }
}
