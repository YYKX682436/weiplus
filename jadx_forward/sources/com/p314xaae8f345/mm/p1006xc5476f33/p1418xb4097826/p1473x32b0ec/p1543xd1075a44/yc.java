package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class yc {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f201964h = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rc f201965a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f201966b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.PopupWindow f201967c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f201968d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f201969e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f201970f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f201971g;

    public yc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rc builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f201965a = builder;
        android.view.View inflate = android.view.LayoutInflater.from(builder.f201152a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cfy, (android.view.ViewGroup) null);
        this.f201966b = inflate;
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -1, -2, true);
        this.f201967c = popupWindow;
        this.f201968d = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a4x);
        this.f201969e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a4q);
        this.f201970f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qbn);
        popupWindow.setOutsideTouchable(builder.f201163l);
    }

    public final void a(android.widget.ImageView imageView, int i17) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
        android.graphics.drawable.LayerDrawable layerDrawable = drawable2 instanceof android.graphics.drawable.LayerDrawable ? (android.graphics.drawable.LayerDrawable) drawable2 : null;
        if (layerDrawable != null && (drawable = layerDrawable.getDrawable(0)) != null) {
            drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(this.f201965a.f201157f, android.graphics.PorterDuff.Mode.SRC_IN));
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = i17 - (imageView.getWidth() / 2);
        }
    }

    public final void b(android.view.View attachView, p3325xe03a0797.p3326xc267989b.y0 scope) {
        android.graphics.drawable.Drawable mutate;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachView, "attachView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rc rcVar = this.f201965a;
        if ((rcVar.f201159h.length() == 0) || !attachView.isShown()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCommonGuideWidget", "showWidget msg: " + rcVar.f201159h + " isShown: " + attachView.isShown() + " attachView = " + attachView);
            return;
        }
        boolean z17 = rcVar.f201160i.length() > 0;
        java.util.HashMap hashMap = f201964h;
        if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hashMap.get(rcVar.f201160i), java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCommonGuideWidget", "showWidget has call show, key: " + rcVar.f201160i);
            return;
        }
        hashMap.put(rcVar.f201160i, java.lang.Boolean.TRUE);
        java.lang.String str = rcVar.f201159h;
        android.widget.TextView textView = this.f201970f;
        textView.setText(str);
        android.graphics.drawable.Drawable background = textView.getBackground();
        if (background != null && (mutate = background.mutate()) != null) {
            mutate.setTint(rcVar.f201157f);
        }
        textView.setTextColor(rcVar.f201158g);
        this.f201966b.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uc(this, attachView));
        p3325xe03a0797.p3326xc267989b.l.d(scope, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xc(attachView, this, null), 3, null);
    }
}
