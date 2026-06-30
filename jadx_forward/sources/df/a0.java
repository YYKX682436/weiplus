package df;

/* loaded from: classes7.dex */
public interface a0 {
    static /* synthetic */ void c(df.a0 a0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchToImage");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        a0Var.h(z17);
    }

    void a(boolean z17);

    void b(boolean z17);

    void d(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079, java.lang.Runnable runnable);

    void e();

    void f(df.d dVar);

    void g();

    void h(boolean z17);

    void i(android.content.Context context);

    void j(android.view.ViewGroup viewGroup);

    default void k(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 renderMode, java.lang.Runnable finish) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderMode, "renderMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finish, "finish");
    }

    void l();

    void m();

    /* renamed from: setBackgroundColor */
    void mo124125x67f06213(int i17);
}
