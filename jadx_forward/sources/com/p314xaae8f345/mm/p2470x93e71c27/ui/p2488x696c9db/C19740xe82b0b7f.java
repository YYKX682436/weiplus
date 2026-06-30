package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0016R8\u0010\u0016\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithSeekbarAnimation;", "Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAlphaAnimation;", "", "newHeight", "Ljz5/f0;", "setSeekBarHeight", "getLayoutId", "", "speedRatio", "setSpeedRatio", "playTime", "setPlayTimeText", "_len", "setVideoTotalTime", "Lkotlin/Function2;", "", "x1", "Lyz5/p;", "getOnPlayTextUpdate", "()Lyz5/p;", "setOnPlayTextUpdate", "(Lyz5/p;)V", "onPlayTextUpdate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-playvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithSeekbarAnimation */
/* loaded from: classes3.dex */
public class C19740xe82b0b7f extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19738x1379dd9c {
    public boolean A1;

    /* renamed from: x1, reason: collision with root package name and from kotlin metadata */
    public yz5.p onPlayTextUpdate;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f272967y1;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f272968z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19740xe82b0b7f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.onPlayTextUpdate = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c7.f273079d;
        this.f272967y1 = "";
        this.f272968z1 = "";
    }

    /* renamed from: setSeekBarHeight */
    private final void m75805xfc2f9a40(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.ViewGroup.LayoutParams layoutParams3;
        android.widget.ImageView imageView = this.f244007g;
        android.view.ViewGroup.LayoutParams layoutParams4 = null;
        if (imageView != null) {
            if (imageView == null || (layoutParams3 = imageView.getLayoutParams()) == null) {
                layoutParams3 = null;
            } else {
                layoutParams3.height = i17;
            }
            imageView.setLayoutParams(layoutParams3);
        }
        android.widget.ImageView imageView2 = this.f244006f;
        if (imageView2 != null) {
            if (imageView2 == null || (layoutParams2 = imageView2.getLayoutParams()) == null) {
                layoutParams2 = null;
            } else {
                layoutParams2.height = i17;
            }
            imageView2.setLayoutParams(layoutParams2);
        }
        android.widget.ImageView imageView3 = this.E;
        if (imageView3 == null) {
            return;
        }
        if (imageView3 != null && (layoutParams = imageView3.getLayoutParams()) != null) {
            layoutParams.height = i17;
            layoutParams4 = layoutParams;
        }
        imageView3.setLayoutParams(layoutParams4);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee
    public void A() {
        this.A1 = false;
        m75805xfc2f9a40(a06.d.b(getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.ais)));
        m75796x63b38b8c().setVisibility(0);
        m75795xcd3e4e7f().setVisibility(0);
        this.onPlayTextUpdate.mo149xb9724478(null, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19738x1379dd9c, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo61294x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.em9;
    }

    public final yz5.p getOnPlayTextUpdate() {
        return this.onPlayTextUpdate;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19738x1379dd9c, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void j() {
        super.j();
        m75796x63b38b8c().setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b7(this, m75796x63b38b8c().getTextSize()));
    }

    /* renamed from: setOnPlayTextUpdate */
    public final void m75807x1db7aeeb(yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<set-?>");
        this.onPlayTextUpdate = pVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf
    /* renamed from: setPlayTimeText */
    public void mo61297xf1a3e670(int i17) {
        super.mo61297xf1a3e670(i17);
        java.lang.String str = java.lang.String.valueOf(i17 / 60) + ':' + k(i17 % 60);
        if (this.A1) {
            this.onPlayTextUpdate.mo149xb9724478(str, this.f272968z1);
        }
        this.f272967y1 = str;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee
    /* renamed from: setSpeedRatio */
    public void mo75801x41557a06(float f17) {
        super.mo75801x41557a06(f17);
        if (f17 > 1.0f) {
            m75796x63b38b8c().setShadowLayer(8.0f, 0.0f, 0.0f, getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        } else {
            m75796x63b38b8c().setShadowLayer(1.0f, 3.0f, 3.0f, getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d, com.p314xaae8f345.mm.p2470x93e71c27.ui.z0
    /* renamed from: setVideoTotalTime */
    public void mo61298xa7077af8(int i17) {
        super.mo61298xa7077af8(i17);
        java.lang.String str = java.lang.String.valueOf(this.f244012o / 60) + ':' + k(this.f244012o % 60);
        if (this.A1) {
            this.onPlayTextUpdate.mo149xb9724478(this.f272967y1, str);
        }
        this.f272968z1 = str;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee
    public void w() {
        this.A1 = true;
        m75805xfc2f9a40(a06.d.b(getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.aih)));
        m75796x63b38b8c().setVisibility(4);
        m75795xcd3e4e7f().setVisibility(4);
        this.onPlayTextUpdate.mo149xb9724478(this.f272967y1, this.f272968z1);
    }
}
