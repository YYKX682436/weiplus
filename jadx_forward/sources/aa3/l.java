package aa3;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final aa3.l f84085a = new aa3.l();

    public final void a(android.view.View view, aa3.e eVar) {
        android.view.animation.Animation animation = eVar.f84045b;
        if (animation != null) {
            animation.setAnimationListener(new aa3.f());
            view.post(new aa3.g(view));
            yz5.a aVar = eVar.f84046c;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            eVar.f84046c = null;
        }
        eVar.f84045b = null;
    }

    public final aa3.e b(android.view.View view) {
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f78273xad31abbe);
        aa3.e eVar = tag instanceof aa3.e ? (aa3.e) tag : null;
        if (eVar != null) {
            return eVar;
        }
        aa3.e eVar2 = new aa3.e(false, null, null, false, 15, null);
        view.setTag(com.p314xaae8f345.mm.R.id.f78273xad31abbe, eVar2);
        return eVar2;
    }

    public final void c(android.view.View view, yz5.a aVar) {
        if (view == null) {
            return;
        }
        aa3.e b17 = b(view);
        if ((view.getVisibility() == 8 || view.getVisibility() == 4) && !b17.f84044a) {
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } else if (!b17.f84044a || b17.f84047d) {
            a(view, b17);
            b17.f84044a = true;
            b17.f84047d = false;
            view.post(new aa3.i(view, b17, aVar));
        }
    }

    public final void d(android.view.View view, yz5.a aVar) {
        if (view == null) {
            return;
        }
        aa3.e b17 = b(view);
        if (view.getVisibility() == 0 && !b17.f84044a) {
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } else {
            if (b17.f84044a && b17.f84047d) {
                return;
            }
            a(view, b17);
            b17.f84044a = true;
            b17.f84047d = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/lite/keyboard/KeyboardAnimation", "showWithAnimation", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/lite/keyboard/KeyboardAnimation", "showWithAnimation", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.post(new aa3.k(view, b17, aVar));
        }
    }
}
