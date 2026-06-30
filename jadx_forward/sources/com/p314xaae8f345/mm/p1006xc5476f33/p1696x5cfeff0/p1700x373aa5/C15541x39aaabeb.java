package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5;

/* renamed from: com.tencent.mm.plugin.flash.view.FaceNumberView */
/* loaded from: classes14.dex */
public class C15541x39aaabeb extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f218806d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f218807e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.animation.Animation f218808f;

    public C15541x39aaabeb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: setNumber */
    public void m63493x1aa5324b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumberView", "setNumber :%s", str);
        this.f218807e.setText(str);
    }

    public C15541x39aaabeb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f218808f = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aa7, (android.view.ViewGroup) this, true);
        setGravity(17);
        this.f218806d = findViewById(com.p314xaae8f345.mm.R.id.dny);
        this.f218807e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dnu);
    }
}
