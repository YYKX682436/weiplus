package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.MMEmojiView */
/* loaded from: classes10.dex */
public class C19691x1ed8864b extends com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 {

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f272345n;

    /* renamed from: o, reason: collision with root package name */
    public int f272346o;

    /* renamed from: p, reason: collision with root package name */
    public int f272347p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f272348q;

    public C19691x1ed8864b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        z(context);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        float f17;
        super.setImageDrawable(drawable);
        if (drawable == null || this.f272345n == null) {
            return;
        }
        if (drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.k) {
            f17 = ((com.p314xaae8f345.mm.p1006xc5476f33.gif.k) drawable).e();
        } else if (drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.u) {
            f17 = ((com.p314xaae8f345.mm.p1006xc5476f33.gif.u) drawable).e();
        } else if (!(drawable instanceof android.graphics.drawable.BitmapDrawable)) {
            return;
        } else {
            f17 = 1.0f;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth() / f17;
        float intrinsicHeight = drawable.getIntrinsicHeight() / f17;
        if (this.f272348q) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f272345n;
            if (c21053xdbf1e5f4.f68690x2a070e41 == 0 || c21053xdbf1e5f4.f68664xfd0bc00c == 0) {
                c21053xdbf1e5f4.f68690x2a070e41 = (int) intrinsicWidth;
                c21053xdbf1e5f4.f68664xfd0bc00c = (int) intrinsicHeight;
                ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(this.f272345n);
            }
        }
    }

    /* renamed from: setIsMaxSizeLimit */
    public void m75575x50e2c682(boolean z17) {
        if (!z17) {
            setMaxHeight(Integer.MAX_VALUE);
            setMaxHeight(Integer.MAX_VALUE);
        } else {
            setAdjustViewBounds(true);
            setMaxWidth(this.f272346o);
            setMaxHeight(this.f272346o);
        }
    }

    /* renamed from: setMaxSize */
    public void m75576xe38e30c3(int i17) {
        this.f272346o = i17;
    }

    /* renamed from: setUpdateEmojiSize */
    public void m75577xc79765dc(boolean z17) {
        this.f272348q = z17;
    }

    public final void z(android.content.Context context) {
        this.f272346o = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561924wm);
        this.f272347p = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561923wl);
        i65.a.B(context);
        setAdjustViewBounds(true);
        setMaxWidth(this.f272346o);
        setMaxHeight(this.f272346o);
        setMinimumWidth(this.f272347p);
        setMinimumHeight(this.f272347p);
    }

    public C19691x1ed8864b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f272348q = false;
        z(context);
    }
}
