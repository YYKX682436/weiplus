package hy0;

/* loaded from: classes5.dex */
public final class l implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f367396a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f367397b;

    public l(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367396a = jz5.h.b(new hy0.j(context));
        this.f367397b = jz5.h.b(new hy0.k(context));
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (context.f367583f == null) {
            ((hy0.i) ((jz5.n) this.f367396a).mo141623x754a37bb()).a(canvas, context);
        } else {
            ((hy0.g0) ((jz5.n) this.f367397b).mo141623x754a37bb()).a(canvas, context);
        }
    }
}
