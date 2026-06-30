package ax1;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final ax1.x f15027a = new ax1.x();

    public final void a(android.content.Context context, android.view.View view, android.graphics.Bitmap bitmap, java.lang.String md5Key) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        kotlin.jvm.internal.o.g(md5Key, "md5Key");
        if (view == null) {
            return;
        }
        android.graphics.Bitmap e17 = n11.a.b().e(md5Key);
        if (e17 != null && !e17.isRecycled()) {
            pm0.v.X(new ax1.v(context, e17, view));
            return;
        }
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            view.post(new ax1.w(view, context, bitmap, md5Key));
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        ((ku5.t0) ku5.t0.f312615d).a(new ax1.u(bitmap, height, width, md5Key, context, view));
    }
}
