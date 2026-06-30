package oj5;

/* loaded from: classes14.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f427439a = jz5.h.b(oj5.s.f427418d);

    public static final p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        java.lang.reflect.Field declaredField = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.class.getDeclaredField("e");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(c1163xf1deaba4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Recycler");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.z2) obj;
    }

    public static final java.util.ArrayList b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        n3.t1 t1Var = new n3.t1(c1163xf1deaba4);
        while (t1Var.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = c1163xf1deaba4.m0((android.view.View) t1Var.next());
            if (m07 != null) {
                arrayList.add(m07);
            }
        }
        return arrayList;
    }

    public static final void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, oj5.b observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7946xf939df19 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(observer.f427368a, mo7946xf939df19)) {
            observer.a(mo7946xf939df19);
            observer.f427368a = mo7946xf939df19;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 a17 = a(c1163xf1deaba4);
        oj5.a aVar = new oj5.a(observer, c1163xf1deaba4);
        java.lang.reflect.Field declaredField = p012xc85e97e9.p103xe821e364.p104xd1075a44.z2.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(a17, aVar);
    }

    public static oj5.r d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, boolean z17, oj5.b0 b0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            z17 = true;
        }
        boolean z18 = z17;
        if ((i19 & 8) != 0) {
            b0Var = new oj5.b0();
        }
        oj5.b0 viewPool = b0Var;
        if ((i19 & 16) != 0) {
            n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("AsyncBindViewHandler");
            n3Var.m77789xc5a5549d(false);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 asyncHandler = n3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewPool, "viewPool");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(asyncHandler, "asyncHandler");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicViewCacheEx", "supportAsyncBindView");
        oj5.r rVar = new oj5.r(c1163xf1deaba4, i17, i18, z18, viewPool, asyncHandler);
        c1163xf1deaba4.m7975xc632c4e4(rVar);
        return rVar;
    }

    public static boolean e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, java.util.List viewTypeCount, oj5.b0 b0Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            b0Var = new oj5.b0();
        }
        oj5.b0 viewPool = b0Var;
        if ((i17 & 4) != 0) {
            n3Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) f427439a).mo141623x754a37bb();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 asyncHandler = n3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewTypeCount, "viewTypeCount");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewPool, "viewPool");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(asyncHandler, "asyncHandler");
        c1163xf1deaba4.m7971xa810ec34(viewPool);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        c1163xf1deaba4.post(new oj5.u(c1163xf1deaba4, c0Var, h0Var, asyncHandler));
        c(c1163xf1deaba4, new oj5.w(h0Var, asyncHandler, viewTypeCount, c0Var, viewPool, c1163xf1deaba4));
        return true;
    }
}
