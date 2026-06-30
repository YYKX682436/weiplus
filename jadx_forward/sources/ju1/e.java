package ju1;

/* loaded from: classes9.dex */
public abstract class e {
    public static final android.graphics.drawable.Drawable a(int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(i17);
        android.graphics.drawable.ColorDrawable colorDrawable2 = new android.graphics.drawable.ColorDrawable(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
        int i18 = i17 & 16777215;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{(-16777216) | i18, i18 | 436207616});
        gradientDrawable.setGradientType(0);
        return new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{colorDrawable, gradientDrawable, colorDrawable2});
    }

    public static final void b(android.widget.ImageView imageView, java.lang.String str, int i17, int i18) {
        if (str == null || imageView == null) {
            return;
        }
        ju1.c cVar = new ju1.c(str, imageView);
        yo0.f fVar = new yo0.f();
        java.lang.String m17 = xt1.q.m(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "getPictureStoragePath(...)");
        fVar.f545612c = m17;
        fVar.f545611b = true;
        fVar.f545620k = false;
        fVar.f545614e = i17;
        fVar.f545615f = i18;
        fVar.f545610a = true;
        vo0.e.f520001b.h(str, imageView, fVar.a(), cVar);
    }
}
