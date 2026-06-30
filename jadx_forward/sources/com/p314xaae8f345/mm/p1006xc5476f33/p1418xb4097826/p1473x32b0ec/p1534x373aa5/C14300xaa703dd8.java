package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016R6\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveAnchorDataPanelView;", "Lcom/tencent/mm/ui/widget/RoundCornerRelativeLayout;", "Lcom/tencent/mm/plugin/finder/live/widget/zl;", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54550x6704fffd, "Ljz5/f0;", "setFlutterTextureViewOpaque", "Landroid/graphics/Bitmap;", "getBitmap", "getSnapshot", "Lkotlin/Function2;", "", "g", "Lyz5/p;", "getOnExpandListener", "()Lyz5/p;", "setOnExpandListener", "(Lyz5/p;)V", "onExpandListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView */
/* loaded from: classes3.dex */
public final class C14300xaa703dd8 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zl {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f197337f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.p onExpandListener;

    /* renamed from: h, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 f197339h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14300xaa703dd8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void d(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, boolean z17) {
        if (!c0Var.f391645d) {
            c0Var.f391645d = true;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorDataPanelView", "doResume result:" + z17 + ",but hasResume!");
        }
    }

    public final android.view.TextureView e(android.view.View view) {
        if (view instanceof android.view.TextureView) {
            return (android.view.TextureView) view;
        }
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return null;
        }
        android.view.View childAt = viewGroup.getChildAt(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
        return e(childAt);
    }

    public final void f(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorDataPanelView", "release: source=" + source + ", liteAppView=" + this.f197337f);
        setTag(null);
        android.view.View view = this.f197337f;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            if (view instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) {
                ((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view).g();
            }
        }
        this.f197337f = null;
    }

    public final java.lang.Object g(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorDataPanelView", "updateLiteApp: fail,appId=" + str + '!');
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new java.lang.Integer(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorDataPanelView", "updateLiteApp: appId=" + str + ", query=" + str2);
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(str)) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new java.lang.Integer(((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(str, "dataPanelStore/updateDataPanelStr", str2))));
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).qj(str, 10, false, 10L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1(nVar, str, str2));
            }
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    /* renamed from: getBitmap */
    public final android.graphics.Bitmap m57238x12501425() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df mo137192x385aa5fd;
        android.graphics.Bitmap m138025x12501425;
        if (this.f197339h == null) {
            android.view.View view = this.f197337f;
            com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329 = view instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 ? (com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view : null;
            if (c3717xac6c2329 != null) {
                com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42328x90544e91(c3717xac6c2329, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n1(this));
            }
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f197339h;
        if (interfaceC28648x8c0b9e17 == null || (mo137192x385aa5fd = interfaceC28648x8c0b9e17.mo137192x385aa5fd()) == null || (m138025x12501425 = mo137192x385aa5fd.m138025x12501425()) == null) {
            return null;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(m138025x12501425, false, i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
    }

    public final yz5.p getOnExpandListener() {
        return this.onExpandListener;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zl
    /* renamed from: getSnapshot */
    public android.graphics.Bitmap mo57240x8cd5133a() {
        return m57238x12501425();
    }

    /* renamed from: setFlutterTextureViewOpaque */
    public final void m57241x83f24467(boolean z17) {
        android.view.TextureView e17;
        android.view.View view = this.f197337f;
        if (view == null || (e17 = e(view)) == null) {
            return;
        }
        e17.setOpaque(z17);
    }

    /* renamed from: setOnExpandListener */
    public final void m57242x634f71af(yz5.p pVar) {
        this.onExpandListener = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14300xaa703dd8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
