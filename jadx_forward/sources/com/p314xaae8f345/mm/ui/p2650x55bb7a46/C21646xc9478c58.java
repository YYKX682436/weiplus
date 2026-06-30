package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.ToolsBar */
/* loaded from: classes5.dex */
public class C21646xc9478c58 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f279881d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f279882e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f279883f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f279884g;

    public C21646xc9478c58(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setGravity(16);
        setBackground(com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559856gq));
        this.f279884g = new android.widget.LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561456j2), 1.0f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f(getContext());
        this.f279881d = c22698xdfbd289f;
        c22698xdfbd289f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562692m4);
        this.f279881d.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f279881d.setBackgroundResource(0);
        this.f279881d.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4q));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f(getContext());
        this.f279882e = c22698xdfbd289f2;
        c22698xdfbd289f2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562688m1);
        this.f279882e.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f279882e.setBackgroundResource(0);
        this.f279882e.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4o));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f(getContext());
        this.f279883f = c22698xdfbd289f3;
        c22698xdfbd289f3.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562690m3);
        this.f279883f.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.f279883f.setBackgroundResource(0);
        this.f279883f.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b4p));
        removeAllViews();
        addView(this.f279881d, this.f279884g);
        addView(this.f279882e, this.f279884g);
        addView(this.f279883f, this.f279884g);
    }

    public void a(int i17, android.view.View.OnClickListener onClickListener) {
        if (i17 == 0) {
            this.f279881d.setOnClickListener(onClickListener);
            return;
        }
        if (i17 == 1) {
            this.f279882e.setOnClickListener(onClickListener);
        } else if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ToolsBar", "set button listener error button index %d", java.lang.Integer.valueOf(i17));
        } else {
            this.f279883f.setOnClickListener(onClickListener);
        }
    }
}
