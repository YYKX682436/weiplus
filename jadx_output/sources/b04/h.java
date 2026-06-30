package b04;

/* loaded from: classes4.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.z f16901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f16902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.m7 f16903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f16904g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.m7 f16905h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f16906i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.m7 f16907m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b04.z f16908n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f16909o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f16910p;

    public h(kv.z zVar, android.widget.ImageView imageView, com.tencent.mm.storage.m7 m7Var, android.widget.ImageView imageView2, com.tencent.mm.storage.m7 m7Var2, android.widget.ImageView imageView3, com.tencent.mm.storage.m7 m7Var3, b04.z zVar2, android.widget.ImageView imageView4, android.view.View view) {
        this.f16901d = zVar;
        this.f16902e = imageView;
        this.f16903f = m7Var;
        this.f16904g = imageView2;
        this.f16905h = m7Var2;
        this.f16906i = imageView3;
        this.f16907m = m7Var3;
        this.f16908n = zVar2;
        this.f16909o = imageView4;
        this.f16910p = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.String str = this.f16903f.field_talker;
        kv.z zVar = this.f16901d;
        android.widget.ImageView imageView = this.f16902e;
        ((com.tencent.mm.feature.avatar.w) zVar).Ai(imageView, str, null);
        com.tencent.mm.storage.m7 m7Var = this.f16905h;
        java.lang.String str2 = m7Var.field_talker;
        android.widget.ImageView imageView2 = this.f16904g;
        ((com.tencent.mm.feature.avatar.w) zVar).Ai(imageView2, str2, null);
        com.tencent.mm.storage.m7 m7Var2 = this.f16907m;
        java.lang.String str3 = m7Var2.field_talker;
        android.widget.ImageView imageView3 = this.f16906i;
        ((com.tencent.mm.feature.avatar.w) zVar).Ai(imageView3, str3, null);
        b04.z zVar2 = this.f16908n;
        java.util.Set set = zVar2.f16959s;
        java.lang.String field_talker = m7Var.field_talker;
        kotlin.jvm.internal.o.f(field_talker, "field_talker");
        set.add(field_talker);
        java.util.Set set2 = zVar2.f16959s;
        java.lang.String field_talker2 = m7Var2.field_talker;
        kotlin.jvm.internal.o.f(field_talker2, "field_talker");
        set2.add(field_talker2);
        imageView.setTranslationX(zVar2.Y6(0));
        imageView2.setTranslationX(zVar2.Y6(1));
        imageView3.setTranslationX(zVar2.Y6(2));
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setAlpha(1.0f);
        imageView.setPivotX(zVar2.f16965y / 2.0f);
        imageView.setPivotY(zVar2.f16965y / 2.0f);
        android.widget.ImageView imageView4 = this.f16909o;
        imageView4.setVisibility(8);
        imageView4.setScaleX(1.0f);
        imageView4.setScaleY(1.0f);
        imageView4.setAlpha(1.0f);
        android.view.View view = this.f16910p;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$animateRotation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$animateRotation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$animateRotation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$animateRotation$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        zVar2.f16962v = null;
    }
}
