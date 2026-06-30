package pg;

/* loaded from: classes5.dex */
public final class a extends mg.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p468x373aa5.C4054x2fa0d546 f435485a;

    public a(com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p468x373aa5.C4054x2fa0d546 c4054x2fa0d546) {
        this.f435485a = c4054x2fa0d546;
    }

    @Override // mg.d
    public void a(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae curRect, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e scale, float f17) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curRect, "curRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scale, "scale");
        com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p468x373aa5.C4054x2fa0d546 c4054x2fa0d546 = this.f435485a;
        c4054x2fa0d546.getClass();
        mg.e.a("RenderViewContainer", "showBorder rect origin: " + curRect.m32426x28f8d21c() + ", size:" + curRect.m32427xfb854877() + ", scale:" + scale + ", rotation:" + f17);
        android.widget.ImageView imageView = c4054x2fa0d546.f129583e;
        if (imageView == null) {
            f0Var = null;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = (int) curRect.m32427xfb854877().f129332x;
            layoutParams2.height = (int) curRect.m32427xfb854877().f129333y;
            layoutParams2.setMargins((int) curRect.m32426x28f8d21c().f129332x, (int) curRect.m32426x28f8d21c().f129333y, 0, 0);
            imageView.setLayoutParams(layoutParams2);
            android.widget.ImageView imageView2 = c4054x2fa0d546.f129583e;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{8.0f, 8.0f, 8.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            gradientDrawable.setStroke(3, -16711936);
            android.widget.ImageView imageView3 = new android.widget.ImageView(c4054x2fa0d546.getContext());
            c4054x2fa0d546.f129583e = imageView3;
            imageView3.setImageDrawable(gradientDrawable);
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams((int) curRect.m32427xfb854877().f129332x, (int) curRect.m32427xfb854877().f129333y);
            layoutParams3.setMargins((int) curRect.m32426x28f8d21c().f129332x, (int) curRect.m32426x28f8d21c().f129333y, 0, 0);
            c4054x2fa0d546.addView(c4054x2fa0d546.f129583e, layoutParams3);
            android.widget.ImageView imageView4 = c4054x2fa0d546.f129583e;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
        }
        android.widget.ImageView imageView5 = c4054x2fa0d546.f129583e;
        if (imageView5 == null) {
            return;
        }
        imageView5.setRotation(-((float) java.lang.Math.toDegrees(f17)));
    }
}
