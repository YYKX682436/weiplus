package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvSliderSeekBar;", "Lcom/tencent/mm/plugin/mv/ui/view/SliderSeekBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvSliderSeekBar */
/* loaded from: classes15.dex */
public final class C16696x18533e6c extends com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a {
    public C16696x18533e6c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a
    public void c() {
        int b17 = i65.a.b(getContext(), 16);
        this.f233274m = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j4(this, g(com.p314xaae8f345.mm.R.raw.f80689xf42f9e97, b17), g(com.p314xaae8f345.mm.R.raw.f80689xf42f9e97, b17));
        this.f233275n = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j4(this, g(com.p314xaae8f345.mm.R.raw.f80690xcc762834, b17), g(com.p314xaae8f345.mm.R.raw.f80690xcc762834, b17));
        this.C = true;
        postInvalidate();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a
    public void d() {
        super.d();
        this.f233276o = i65.a.b(getContext(), 16);
        this.f233287z = i65.a.b(getContext(), 16);
        this.f233269e = true;
    }

    public final android.graphics.drawable.Drawable g(int i17, int i18) {
        android.graphics.drawable.Drawable e17 = m95.a.e(getContext().getResources(), i17, (i18 * 1.0f) / getContext().getResources().getDrawable(i17).getIntrinsicWidth());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getSVGDrawable(...)");
        return e17;
    }

    public C16696x18533e6c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
