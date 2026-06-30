package hy0;

/* loaded from: classes.dex */
public abstract class n implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f367421a;

    /* renamed from: b, reason: collision with root package name */
    public final int f367422b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f367423c;

    public n(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367421a = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 30);
        this.f367422b = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 8);
        this.f367423c = jz5.h.b(new hy0.m(context));
    }

    public final float b() {
        return ((java.lang.Number) ((jz5.n) this.f367423c).mo141623x754a37bb()).floatValue();
    }
}
