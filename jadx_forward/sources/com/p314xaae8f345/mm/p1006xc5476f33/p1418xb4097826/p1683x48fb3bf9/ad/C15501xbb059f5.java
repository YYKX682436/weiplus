package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/webview/ad/CenterScrollFrameLayout;", "Lcom/tencent/mm/plugin/finder/webview/ad/ScrollFrameLayout;", "", "y", "I", "getPeekHeight", "()I", "setPeekHeight", "(I)V", "peekHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout */
/* loaded from: classes8.dex */
public final class C15501xbb059f5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public int peekHeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15501xbb059f5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final int getPeekHeight() {
        return this.peekHeight;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca
    public boolean i(float f17, float f18, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CenterScrollFrameLayout", "distanceY:" + f18 + " velocityY:" + i18);
        return f18 >= 10.0f && java.lang.Math.abs(i18) > java.lang.Math.abs(i17) && java.lang.Math.abs(f18) > java.lang.Math.abs(f17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca
    public void j() {
        m();
        h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca
    public void k() {
        m();
        h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca
    public void l(float f17) {
        if (getMPointerTranslateY() + f17 < 0.0f) {
            m63426xc2c0d5fd(0.0f);
        } else {
            m63426xc2c0d5fd(getMPointerTranslateY() + f17);
        }
        setTranslationY(getMPointerTranslateY());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CenterScrollFrameLayout", "translationY :" + getTranslationY() + " offsetY:" + f17);
    }

    public final void m() {
        if (getMPointerTranslateY() > getScrollDownLimit()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca.d(this, this.peekHeight, false, 0, new oy2.b(this), 6, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca.d(this, 0.0f, false, 0, null, 15, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTranslationY(this.peekHeight);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca.d(this, 0.0f, false, 300, null, 8, null);
    }

    /* renamed from: setPeekHeight */
    public final void m63398x14354464(int i17) {
        this.peekHeight = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15501xbb059f5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        m63418x7a8868a5(true);
        m63428x14fc72a(context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo));
    }
}
