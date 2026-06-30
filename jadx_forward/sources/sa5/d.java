package sa5;

/* loaded from: classes14.dex */
public abstract class d {
    public static final void a(android.view.View view, sa5.e animInAction, long j17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animInAction, "animInAction");
        animInAction.f486884d = view;
        animInAction.b(aVar, j17);
    }

    public static final void b(android.view.View view, sa5.f animOutAction, long j17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animOutAction, "animOutAction");
        animOutAction.f486884d = view;
        animOutAction.b(aVar, j17);
    }

    public static void c(android.view.View view, float f17, long j17, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = 0.0f;
        }
        if ((i17 & 2) != 0) {
            j17 = 300;
        }
        if ((i17 & 4) != 0) {
            aVar = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        a(view, new sa5.l(f17), j17, aVar);
    }

    public static void d(android.view.View view, int i17, long j17, yz5.a aVar, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = 4;
        }
        if ((i18 & 2) != 0) {
            j17 = 300;
        }
        if ((i18 & 4) != 0) {
            aVar = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        b(view, new sa5.m(i17), j17, aVar);
    }

    public static final void e(android.view.View view, float f17, int i17, long j17, long j18, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        sa5.n nVar = new sa5.n(java.lang.Float.valueOf(f17), null);
        nVar.f486884d = view;
        nVar.b(new sa5.c(view, j17, f17, j18, i17, aVar), j18);
    }
}
