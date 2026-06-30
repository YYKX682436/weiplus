package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/RoundCornerScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/teenmode/ui/d3", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.RoundCornerScrollView */
/* loaded from: classes3.dex */
public final class C18577x5227f8d5 extends android.widget.ScrollView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18577x5227f8d5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18577x5227f8d5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
        new android.graphics.Path();
        new android.graphics.RectF();
        setClipToOutline(true);
        setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.d3(b17));
        setBackground(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.azp));
    }
}
