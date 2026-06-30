package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/mmsight/segment/FinderSliderSeekBar;", "Lcom/tencent/mm/plugin/mmsight/segment/SliderSeekBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar */
/* loaded from: classes10.dex */
public final class C16534x56a8ffb4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a {
    public C16534x56a8ffb4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a
    public void e() {
        if (!this.D) {
            android.graphics.drawable.Drawable drawable = this.f230479n;
            int i17 = this.f230491z;
            drawable.setBounds(i17 - this.f230481p, 0, i17, getHeight());
            android.graphics.drawable.Drawable drawable2 = this.f230480o;
            int i18 = this.f230491z;
            int i19 = this.f230475g;
            drawable2.setBounds(i18 + i19, 0, i19 + i18 + this.f230481p, getHeight());
            return;
        }
        android.graphics.drawable.Drawable drawable3 = this.f230479n;
        int i27 = this.f230491z;
        drawable3.setBounds(i27, 0, this.f230481p + i27, getHeight());
        android.graphics.drawable.Drawable drawable4 = this.f230480o;
        int i28 = this.f230491z;
        int i29 = this.f230475g;
        int i37 = this.f230481p;
        drawable4.setBounds(i28 + i29 + i37, 0, i28 + i29 + (i37 * 2), getHeight());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a
    public boolean f(boolean z17, float f17) {
        android.graphics.drawable.Drawable drawable;
        float f18;
        float f19;
        if (!this.f230473e || (drawable = this.f230479n) == null || this.f230480o == null || drawable.getBounds().width() <= 0 || this.f230480o.getBounds().width() <= 0) {
            return false;
        }
        if (z17) {
            f19 = this.f230480o.getBounds().left - this.f230476h;
            int i17 = this.f230491z + this.f230481p;
            int i18 = this.f230480o.getBounds().left - this.f230475g;
            if (i17 < i18) {
                i17 = i18;
            }
            f18 = i17;
        } else {
            f18 = this.f230479n.getBounds().right + this.f230476h;
            int width = (getWidth() - this.f230491z) - this.f230481p;
            int i19 = this.f230479n.getBounds().right + this.f230475g;
            if (width > i19) {
                width = i19;
            }
            f19 = width;
        }
        if (f17 > f19) {
            f17 = f19;
        }
        if (f18 >= f17) {
            f17 = f18;
        }
        boolean z18 = true;
        if (!(f17 == f18)) {
            if (!(f17 == f19)) {
                z18 = false;
            }
        }
        if (z17) {
            android.graphics.Rect bounds = this.f230479n.getBounds();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds, "getBounds(...)");
            bounds.offsetTo((int) (f17 - this.f230481p), 0);
            this.f230479n.setBounds(bounds);
        } else {
            android.graphics.Rect bounds2 = this.f230480o.getBounds();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds2, "getBounds(...)");
            bounds2.offsetTo((int) f17, 0);
            this.f230480o.setBounds(bounds2);
        }
        postInvalidate();
        return z18;
    }

    public C16534x56a8ffb4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    public C16534x56a8ffb4(android.content.Context context) {
        super(context, null);
    }
}
