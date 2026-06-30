package aa3;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final aa3.l f2552a = new aa3.l();

    public final void a(android.view.View view, aa3.e eVar) {
        android.view.animation.Animation animation = eVar.f2512b;
        if (animation != null) {
            animation.setAnimationListener(new aa3.f());
            view.post(new aa3.g(view));
            yz5.a aVar = eVar.f2513c;
            if (aVar != null) {
                aVar.invoke();
            }
            eVar.f2513c = null;
        }
        eVar.f2512b = null;
    }

    public final aa3.e b(android.view.View view) {
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.keyboard_animation_state);
        aa3.e eVar = tag instanceof aa3.e ? (aa3.e) tag : null;
        if (eVar != null) {
            return eVar;
        }
        aa3.e eVar2 = new aa3.e(false, null, null, false, 15, null);
        view.setTag(com.tencent.mm.R.id.keyboard_animation_state, eVar2);
        return eVar2;
    }

    public final void c(android.view.View view, yz5.a aVar) {
        if (view == null) {
            return;
        }
        aa3.e b17 = b(view);
        if ((view.getVisibility() == 8 || view.getVisibility() == 4) && !b17.f2511a) {
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (!b17.f2511a || b17.f2514d) {
            a(view, b17);
            b17.f2511a = true;
            b17.f2514d = false;
            view.post(new aa3.i(view, b17, aVar));
        }
    }

    public final void d(android.view.View view, yz5.a aVar) {
        if (view == null) {
            return;
        }
        aa3.e b17 = b(view);
        if (view.getVisibility() == 0 && !b17.f2511a) {
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            if (b17.f2511a && b17.f2514d) {
                return;
            }
            a(view, b17);
            b17.f2511a = true;
            b17.f2514d = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/lite/keyboard/KeyboardAnimation", "showWithAnimation", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/lite/keyboard/KeyboardAnimation", "showWithAnimation", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.post(new aa3.k(view, b17, aVar));
        }
    }
}
