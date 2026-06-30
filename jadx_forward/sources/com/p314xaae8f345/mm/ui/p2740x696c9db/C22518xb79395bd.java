package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.PressImageView */
/* loaded from: classes14.dex */
public class C22518xb79395bd extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f291672d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f291673e;

    /* renamed from: f, reason: collision with root package name */
    public final int f291674f;

    public C22518xb79395bd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291674f = 90;
        this.f291672d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f291673e = new com.p314xaae8f345.mm.ui.p2740x696c9db.e8(this);
        super.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.f8(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (isPressed()) {
            canvas.drawARGB(this.f291674f, 0, 0, 0);
        }
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        iz5.a.g(null, false);
    }
}
