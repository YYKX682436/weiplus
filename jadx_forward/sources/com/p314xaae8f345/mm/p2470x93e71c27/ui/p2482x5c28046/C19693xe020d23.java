package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.PreViewEmojiView */
/* loaded from: classes10.dex */
public class C19693xe020d23 extends com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d {

    /* renamed from: r, reason: collision with root package name */
    public int f272351r;

    public C19693xe020d23(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f272351r = 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int i19 = this.f272351r;
        if (i19 > 0) {
            setMeasuredDimension(i19, i19);
        }
    }

    /* renamed from: setSize */
    public void m75581x76500f83(int i17) {
        this.f272351r = i17;
    }

    public C19693xe020d23(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f272351r = 0;
    }
}
