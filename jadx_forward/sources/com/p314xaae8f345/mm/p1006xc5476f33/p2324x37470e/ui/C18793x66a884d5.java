package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000eB!\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/LabelSlider;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "color", "Ljz5/f0;", "setTrackColor", "count", "setLabelCount", "", "", "labelList", "setLabels", ya.b.f77479x42930b2, "setSelection", "Lyo4/b;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, "Lyo4/b;", "getCallback", "()Lyo4/b;", "setCallback", "(Lyo4/b;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.LabelSlider */
/* loaded from: classes10.dex */
public final class C18793x66a884d5 extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 {

    /* renamed from: A, reason: from kotlin metadata */
    public yo4.b callback;

    /* renamed from: v, reason: collision with root package name */
    public int f257367v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18796x6ab8ce8f f257368w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f257369x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f257370y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f257371z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18793x66a884d5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f257367v = 5;
        this.f257369x = new java.util.LinkedList();
        this.f257370y = new java.util.LinkedList();
        this.f257371z = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18796x6ab8ce8f c18796x6ab8ce8f = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18796x6ab8ce8f(context, null);
        this.f257368w = c18796x6ab8ce8f;
        android.graphics.drawable.Drawable drawable = context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563369c60);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, drawable != null ? drawable.getIntrinsicHeight() : 48);
        layoutParams.f92441s = 0;
        layoutParams.f92439q = 0;
        layoutParams.f92426h = 0;
        addView(c18796x6ab8ce8f, layoutParams);
        c18796x6ab8ce8f.m72553x28548352(drawable);
        c18796x6ab8ce8f.m72549x6c4ebec7(new yo4.a(this));
    }

    public final void A() {
        int i17 = this.f257367v;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18796x6ab8ce8f c18796x6ab8ce8f = this.f257368w;
        c18796x6ab8ce8f.m72550x66520b61(i17);
        c18796x6ab8ce8f.m72552xf9627dd3(getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
        java.util.LinkedList linkedList = this.f257370y;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            removeView((android.widget.TextView) it.next());
        }
        linkedList.clear();
        java.util.LinkedList linkedList2 = this.f257369x;
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            removeView((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0) it6.next());
        }
        linkedList2.clear();
        if (getWidth() > 0) {
            int i18 = 0;
            for (java.lang.Object obj : c18796x6ab8ce8f.m72548x328e42fb()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                float floatValue = ((java.lang.Number) obj).floatValue();
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0 c1076xfbb92cd0 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0(getContext());
                c1076xfbb92cd0.setId(android.view.View.generateViewId());
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, 0);
                layoutParams.f92439q = 0;
                layoutParams.f92438p = 0;
                layoutParams.R = 1;
                layoutParams.f92412a = (int) floatValue;
                addView(c1076xfbb92cd0, layoutParams);
                linkedList2.add(c1076xfbb92cd0);
                android.widget.TextView textView = new android.widget.TextView(getContext());
                textView.setText((java.lang.CharSequence) kz5.n0.a0(this.f257371z, i18));
                textView.setTextColor(-855638017);
                textView.setGravity(17);
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
                layoutParams2.f92428i = c18796x6ab8ce8f.getId();
                layoutParams2.f92439q = c1076xfbb92cd0.getId();
                layoutParams2.f92441s = c1076xfbb92cd0.getId();
                layoutParams2.f92432k = 0;
                addView(textView, layoutParams2);
                linkedList.add(textView);
                i18 = i19;
            }
        }
    }

    public final yo4.b getCallback() {
        return this.callback;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        post(new yo4.c(this));
    }

    /* renamed from: setCallback */
    public final void m72530x6c4ebec7(yo4.b bVar) {
        this.callback = bVar;
    }

    /* renamed from: setLabelCount */
    public final void m72531xb887207d(int i17) {
        this.f257367v = i17;
        A();
    }

    /* renamed from: setLabels */
    public final void m72532x161cb701(java.util.List<? extends java.lang.CharSequence> labelList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelList, "labelList");
        java.util.LinkedList linkedList = this.f257371z;
        linkedList.clear();
        linkedList.addAll(labelList);
        int i17 = 0;
        for (java.lang.Object obj : this.f257370y) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((android.widget.TextView) obj).setText((java.lang.CharSequence) kz5.n0.a0(linkedList, i17));
            i17 = i18;
        }
    }

    /* renamed from: setSelection */
    public final void m72533xf579a34a(int i17) {
        this.f257368w.m72551xf579a34a(i17);
    }

    /* renamed from: setTrackColor */
    public final void m72534x5ffb6ada(int i17) {
        this.f257368w.m72554x5ffb6ada(i17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18793x66a884d5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
