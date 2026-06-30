package wa2;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final wa2.b f525637d = new wa2.b();

    public b() {
        super(3);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.app.Activity activity = (android.app.Activity) obj;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        wa2.u uVar = wa2.u.f525714d;
        if (booleanValue) {
            uVar.getClass();
            android.content.Intent intent = activity.getIntent();
            if (intent != null) {
                if (intent.getBooleanExtra("key_intent_enable_drag_exit", false) && !intent.getBooleanExtra("key_intent_enable_enter_anim", true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ActivityToggleAnimator", "onlySupportDragCloseAnim insert GestureFrameLayout to root ");
                    android.view.View decorView = activity.getWindow().getDecorView();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    uVar.cj(activity, intent, (android.view.ViewGroup) decorView).setId(com.p314xaae8f345.mm.R.id.tct);
                    activity.overridePendingTransition(0, 0);
                } else if (intent.hasExtra("key_anim_intent_id")) {
                    activity.overridePendingTransition(0, 0);
                    android.view.View decorView2 = activity.getWindow().getDecorView();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView2, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView2;
                    long longExtra = intent.getLongExtra("key_intent_anim_duration", 280L);
                    android.view.View aj6 = uVar.aj(intent);
                    wa2.n0 cj6 = uVar.cj(activity, intent, viewGroup);
                    android.view.View m173377xc2a54588 = cj6.m173377xc2a54588();
                    android.content.Context context = aj6 != null ? aj6.getContext() : null;
                    android.app.Activity activity2 = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                    if (!(activity2 != null && activity2.isDestroyed())) {
                        if ((aj6 != null ? aj6.getContext() : null) != null) {
                            if (intent.getBooleanExtra("KEY_INTENT_FLUENT_VIDEO_ENTER", false)) {
                                intent.removeExtra("key_intent_animating_flag");
                                intent.removeExtra("KEY_INTENT_FLUENT_VIDEO_ENTER");
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList.add(java.lang.Float.valueOf(0.0f));
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(m173377xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator", "enterAnimation", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                m173377xc2a54588.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                                yj0.a.f(m173377xc2a54588, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator", "enterAnimation", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ActivityToggleAnimator", "check remove KEY_INTENT_ANIMATING_FLAG for fluent enter video.");
                            } else {
                                android.graphics.Rect rect = new android.graphics.Rect(0, 0, m173377xc2a54588.getContext().getResources().getDisplayMetrics().widthPixels, m173377xc2a54588.getContext().getResources().getDisplayMetrics().heightPixels);
                                android.graphics.Rect Vi = uVar.Vi(intent);
                                float Zi = uVar.Zi(rect, Vi, true);
                                float[] bj6 = uVar.bj(rect, Vi);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                                arrayList2.add(java.lang.Float.valueOf(0.0f));
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(m173377xc2a54588, arrayList2.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator", "initContentViewLocation", "(Landroid/content/Intent;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                m173377xc2a54588.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                                yj0.a.f(m173377xc2a54588, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator", "initContentViewLocation", "(Landroid/content/Intent;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                m173377xc2a54588.setTranslationX(bj6[0]);
                                m173377xc2a54588.setTranslationY(bj6[1]);
                                m173377xc2a54588.setScaleX(Zi);
                                m173377xc2a54588.setScaleY(Zi);
                                viewGroup.post(new wa2.g(m173377xc2a54588, intent, activity, aj6, longExtra, cj6, viewGroup));
                            }
                        }
                    }
                    intent.removeExtra("key_intent_animating_flag");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ActivityToggleAnimator", "check remove KEY_INTENT_ANIMATING_FLAG");
                }
            }
        } else {
            uVar.getClass();
            android.content.Intent intent2 = activity.getIntent();
            if (intent2 != null && intent2.hasExtra("key_anim_intent_id")) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(wa2.u.f525715e).remove(activity.getIntent().getStringExtra("key_anim_intent_id"));
            }
        }
        return jz5.f0.f384359a;
    }
}
