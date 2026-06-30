package b04;

/* loaded from: classes4.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.z f98434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f98435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.m7 f98436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f98437g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.m7 f98438h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f98439i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.m7 f98440m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b04.z f98441n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f98442o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f98443p;

    public h(kv.z zVar, android.widget.ImageView imageView, com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var, android.widget.ImageView imageView2, com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var2, android.widget.ImageView imageView3, com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var3, b04.z zVar2, android.widget.ImageView imageView4, android.view.View view) {
        this.f98434d = zVar;
        this.f98435e = imageView;
        this.f98436f = m7Var;
        this.f98437g = imageView2;
        this.f98438h = m7Var2;
        this.f98439i = imageView3;
        this.f98440m = m7Var3;
        this.f98441n = zVar2;
        this.f98442o = imageView4;
        this.f98443p = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.String str = this.f98436f.f66376x114ef53e;
        kv.z zVar = this.f98434d;
        android.widget.ImageView imageView = this.f98435e;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai(imageView, str, null);
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var = this.f98438h;
        java.lang.String str2 = m7Var.f66376x114ef53e;
        android.widget.ImageView imageView2 = this.f98437g;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai(imageView2, str2, null);
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var2 = this.f98440m;
        java.lang.String str3 = m7Var2.f66376x114ef53e;
        android.widget.ImageView imageView3 = this.f98439i;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai(imageView3, str3, null);
        b04.z zVar2 = this.f98441n;
        java.util.Set set = zVar2.f98492s;
        java.lang.String field_talker = m7Var.f66376x114ef53e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
        set.add(field_talker);
        java.util.Set set2 = zVar2.f98492s;
        java.lang.String field_talker2 = m7Var2.f66376x114ef53e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker2, "field_talker");
        set2.add(field_talker2);
        imageView.setTranslationX(zVar2.Y6(0));
        imageView2.setTranslationX(zVar2.Y6(1));
        imageView3.setTranslationX(zVar2.Y6(2));
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setAlpha(1.0f);
        imageView.setPivotX(zVar2.f98498y / 2.0f);
        imageView.setPivotY(zVar2.f98498y / 2.0f);
        android.widget.ImageView imageView4 = this.f98442o;
        imageView4.setVisibility(8);
        imageView4.setScaleX(1.0f);
        imageView4.setScaleY(1.0f);
        imageView4.setAlpha(1.0f);
        android.view.View view = this.f98443p;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$animateRotation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$animateRotation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$animateRotation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$animateRotation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        zVar2.f98495v = null;
    }
}
