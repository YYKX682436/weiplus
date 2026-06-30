package mn2;

/* loaded from: classes10.dex */
public final class z0 extends mn2.a0 {
    @Override // mn2.a0, zo0.i
    public hp0.g a(cp0.n targetView, vo0.h reaper, jp0.f input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        hp0.g a17 = super.a(targetView, reaper, input);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) a17.f364446a;
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return a17;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3325xe03a0797.p3326xc267989b.l.f(null, new mn2.y0(h0Var, bitmap, targetView, null), 1, null);
        return new hp0.g(h0Var.f391656d);
    }
}
