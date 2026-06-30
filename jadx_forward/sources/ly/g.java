package ly;

/* loaded from: classes13.dex */
public abstract class g {
    public static final int a(int i17, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return (int) android.util.TypedValue.applyDimension(1, i17, context.getResources().getDisplayMetrics());
    }

    public static final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                return (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getBaseContext(...)");
        }
        return null;
    }

    public static void c(android.view.ViewGroup viewGroup, long j17, android.view.animation.Interpolator interpolator, yz5.a aVar, yz5.a aVar2, yz5.l lVar, java.util.List excludeViews, yz5.a action, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = 300;
        }
        if ((i17 & 2) != 0) {
            interpolator = new android.view.animation.AccelerateDecelerateInterpolator();
        }
        if ((i17 & 4) != 0) {
            aVar = null;
        }
        if ((i17 & 8) != 0) {
            aVar2 = null;
        }
        if ((i17 & 16) != 0) {
            lVar = null;
        }
        if ((i17 & 32) != 0) {
            excludeViews = kz5.p0.f395529d;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interpolator, "interpolator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(excludeViews, "excludeViews");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        try {
            p012xc85e97e9.p112x993b6d55.C1173xe703c6a5 c1173xe703c6a5 = new p012xc85e97e9.p112x993b6d55.C1173xe703c6a5();
            c1173xe703c6a5.f93916f = j17;
            c1173xe703c6a5.f93917g = interpolator;
            java.util.Iterator it = excludeViews.iterator();
            while (it.hasNext()) {
                c1173xe703c6a5.r((android.view.View) it.next(), true);
            }
            c1173xe703c6a5.a(new ly.f(aVar, lVar, aVar2, c1173xe703c6a5));
            u4.g1.a(viewGroup, c1173xe703c6a5);
            action.mo152xb9724478();
        } catch (java.lang.Exception e17) {
            if (lVar != null) {
                lVar.mo146xb9724478(e17);
            }
            action.mo152xb9724478();
        }
    }

    public static final void d(android.view.View view, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view.getContext(), "getContext(...)");
        gradientDrawable.setCornerRadius(a(i17, r1));
        gradientDrawable.setColor(i18);
        view.setBackground(gradientDrawable);
    }
}
