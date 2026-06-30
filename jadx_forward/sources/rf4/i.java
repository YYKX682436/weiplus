package rf4;

/* loaded from: classes4.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 f476599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd f476600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gf4.a f476601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f476602g;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7, com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd, gf4.a aVar, int i17) {
        this.f476599d = c18474x76daa3b7;
        this.f476600e = c18475x542840cd;
        this.f476601f = aVar;
        this.f476602g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7 = this.f476599d;
        android.view.View m71392x8c409d27 = c18474x76daa3b7.m71392x8c409d27();
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd = this.f476600e;
        android.content.Context context = c18475x542840cd.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c18475x542840cd.getClass();
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560055a3);
        int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a7g);
        if (!c18475x542840cd.isUnread) {
            color = color2;
        }
        float b17 = i65.a.b(context, 24);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(b17);
        m71392x8c409d27.setBackground(gradientDrawable);
        c18474x76daa3b7.setVisibility(0);
        int measuredHeight = c18474x76daa3b7.getMeasuredHeight();
        int paddingBottom = c18475x542840cd.getPaddingBottom();
        int i17 = this.f476602g;
        c18475x542840cd.f253430h = i65.a.c(c18475x542840cd.getContext(), i17 - paddingBottom) * 9;
        if (c18475x542840cd.f253430h <= 0) {
            c18475x542840cd.f253430h = 4000L;
        }
        long j17 = c18475x542840cd.f253430h;
        int paddingBottom2 = c18475x542840cd.getPaddingBottom();
        int i18 = i17 - (measuredHeight / 2);
        rf4.g gVar = new rf4.g(c18475x542840cd, this.f476601f, c18474x76daa3b7);
        rf4.h hVar = new rf4.h(c18475x542840cd, c18474x76daa3b7);
        c18474x76daa3b7.f253424p = c18474x76daa3b7.getMeasuredWidth();
        c18474x76daa3b7.f253423o = c18474x76daa3b7.getMeasuredHeight();
        c18474x76daa3b7.m71391x9cf1d94d().setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = c18474x76daa3b7.getLayoutParams();
        int i19 = c18474x76daa3b7.f253422n;
        layoutParams.height = i19;
        layoutParams.width = i19;
        c18474x76daa3b7.setLayoutParams(layoutParams);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommentItemView", "LogStory: animation start " + i19 + ", " + c18474x76daa3b7.f253424p + ' ' + c18474x76daa3b7.f253423o);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = gVar;
        rf4.c cVar = new rf4.c(new android.graphics.PointF(0.05f, 0.1f));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        c18474x76daa3b7.normalAnimator = ofFloat;
        if (ofFloat != null) {
            ofFloat.setInterpolator(cVar);
        }
        android.animation.ValueAnimator valueAnimator = c18474x76daa3b7.normalAnimator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(j17);
        }
        android.animation.ValueAnimator valueAnimator2 = c18474x76daa3b7.normalAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new rf4.e(i18, paddingBottom2, c18474x76daa3b7, 0.1f, h0Var, hVar));
        }
        android.animation.ValueAnimator valueAnimator3 = c18474x76daa3b7.normalAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
        c18475x542840cd.f253429g = (i65.a.c(c18475x542840cd.getContext(), measuredHeight) + 96) * 6;
        if (c18475x542840cd.f253428f == c18475x542840cd.f253427e.size() - 1) {
            long j18 = c18475x542840cd.f253430h;
            c18475x542840cd.f253429g = j18;
            c18475x542840cd.postDelayed(c18475x542840cd.f253436q, j18);
        }
        c18475x542840cd.postDelayed(c18475x542840cd.f253435p, c18475x542840cd.f253429g);
    }
}
