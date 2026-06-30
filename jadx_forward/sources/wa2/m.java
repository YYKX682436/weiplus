package wa2;

/* loaded from: classes3.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f525673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f525674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f525675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f525676g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f525677h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f525678i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f525679m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f525680n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.p f525681o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.app.Activity activity, long j17, yz5.a aVar, android.content.Intent intent, android.view.View view, wa2.n0 n0Var, long j18, android.widget.ImageView imageView, yz5.p pVar) {
        super(1);
        this.f525673d = activity;
        this.f525674e = j17;
        this.f525675f = aVar;
        this.f525676g = intent;
        this.f525677h = view;
        this.f525678i = n0Var;
        this.f525679m = j18;
        this.f525680n = imageView;
        this.f525681o = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        long j17 = this.f525674e;
        android.widget.ImageView imageView = this.f525680n;
        android.content.Intent intent = this.f525676g;
        android.view.View view2 = this.f525677h;
        if (view != null) {
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ActivityToggleAnimator", "invalid view size: " + view.getWidth() + 'X' + view.getHeight());
            } else {
                android.graphics.Bitmap a17 = wa2.x.a(view);
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ActivityToggleAnimator", "cannot create bitmap from view");
                } else {
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(view.getResources(), a17);
                    java.lang.String stringExtra = intent.getStringExtra("key_anim_intent_id");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    view.setTag(com.p314xaae8f345.mm.R.id.ehp, this.f525681o);
                    wa2.u uVar = wa2.u.f525714d;
                    uVar.getClass();
                    wa2.u.f525715e.put(stringExtra, new wa2.p0(bitmapDrawable, new java.lang.ref.WeakReference(view)));
                    intent.putExtra("key_intent_source_rect", wa2.x.d(view));
                    uVar.Ni(view2, intent);
                    android.graphics.Rect rect = (android.graphics.Rect) intent.getParcelableExtra("key_intent_source_rect");
                    if (rect == null) {
                        rect = new android.graphics.Rect();
                    }
                    intent.putExtra("KEY_INTENT_ENTER_ITEM_ID", j17);
                    imageView.setImageDrawable(bitmapDrawable);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(rect.width(), rect.height());
                    layoutParams.topMargin = rect.top;
                    layoutParams.leftMargin = rect.left;
                    imageView.setLayoutParams(layoutParams);
                }
            }
        }
        android.app.Activity activity = this.f525673d;
        if (j17 != activity.getIntent().getLongExtra("KEY_INTENT_ENTER_ITEM_ID", -1L)) {
            this.f525675f.mo152xb9724478();
            activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc, com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd);
        } else {
            intent.putExtra("key_intent_animating_flag", 2);
            wa2.u uVar2 = wa2.u.f525714d;
            android.view.View aj6 = uVar2.aj(intent);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            view2.getDrawingRect(rect2);
            android.graphics.Rect Vi = uVar2.Vi(intent);
            float Zi = uVar2.Zi(rect2, Vi, true);
            float[] bj6 = uVar2.bj(rect2, Vi);
            android.view.View view3 = this.f525677h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1", "invoke", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1", "invoke", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wa2.n0 n0Var = this.f525678i;
            float alpha = n0Var.m173376x12263380().getAlpha();
            android.view.ViewPropertyAnimator animate = view2.animate();
            if (animate != null) {
                animate.cancel();
            }
            android.view.ViewPropertyAnimator scaleY = view2.animate().translationX(bj6[0]).translationY(bj6[1]).scaleX(Zi).scaleY(Zi);
            android.view.ViewPropertyAnimator animate2 = view2.animate();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(animate2, "animate(...)");
            android.view.ViewPropertyAnimator updateListener = scaleY.setListener(new wa2.a0(animate2, wa2.h.f525657d)).setUpdateListener(new wa2.i(n0Var, alpha));
            long j18 = this.f525679m;
            updateListener.setDuration(j18).start();
            android.graphics.Rect d17 = wa2.x.d(view2);
            float Zi2 = uVar2.Zi(Vi, d17, false);
            float[] bj7 = uVar2.bj(d17, Vi);
            imageView.setVisibility(0);
            imageView.setTranslationX(-bj7[0]);
            imageView.setTranslationY(-bj7[1]);
            imageView.setScaleX(Zi2);
            imageView.setScaleY(Zi2);
            imageView.setAlpha(1.0f);
            android.view.ViewPropertyAnimator animate3 = imageView.animate();
            if (animate3 != null) {
                animate3.cancel();
            }
            android.view.ViewPropertyAnimator updateListener2 = imageView.animate().scaleX(1.0f).scaleY(1.0f).translationY(1.0f).translationX(1.0f).setUpdateListener(wa2.j.f525662d);
            android.view.ViewPropertyAnimator animate4 = view2.animate();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(animate4, "animate(...)");
            updateListener2.setListener(new wa2.a0(animate4, new wa2.l(aj6, this.f525680n, this.f525675f, this.f525673d, this.f525676g))).setDuration(j18).start();
        }
        return jz5.f0.f384359a;
    }
}
