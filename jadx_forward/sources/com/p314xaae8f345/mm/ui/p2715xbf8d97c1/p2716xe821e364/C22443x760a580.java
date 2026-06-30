package com.p314xaae8f345.mm.ui.p2715xbf8d97c1.p2716xe821e364;

/* renamed from: com.tencent.mm.ui.matrix.recyclerview.JsonItemView */
/* loaded from: classes.dex */
public class C22443x760a580 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f290647d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f290648e;

    public C22443x760a580(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getRightText */
    public java.lang.CharSequence m80775xa1e67eb3() {
        return this.f290647d.getText();
    }

    /* renamed from: setIconClickListener */
    public void m80776x5713a21(android.view.View.OnClickListener onClickListener) {
        this.f290648e.setOnClickListener(onClickListener);
    }

    /* renamed from: setRightColor */
    public void m80777xc82274a9(int i17) {
        this.f290647d.setTextColor(i17);
    }

    /* renamed from: setTextSize */
    public void m80778x3abfd950(float f17) {
    }

    public C22443x760a580(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmn, (android.view.ViewGroup) this, true);
        this.f290647d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.opg);
        this.f290648e = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hlr);
    }
}
