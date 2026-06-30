package a0;

/* loaded from: classes14.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f178a = 30;

    /* renamed from: b, reason: collision with root package name */
    public static final z0.t f179b;

    /* renamed from: c, reason: collision with root package name */
    public static final z0.t f180c;

    static {
        int i17 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        f179b = b1.d.a(pVar, new a0.z2());
        f180c = b1.d.a(pVar, new a0.a3());
    }

    public static final void a(long j17, boolean z17) {
        if (z17) {
            if (!(p2.c.g(j17) != Integer.MAX_VALUE)) {
                throw new java.lang.IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        } else {
            if (!(p2.c.h(j17) != Integer.MAX_VALUE)) {
                throw new java.lang.IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        }
    }

    public static final z0.t b(z0.t tVar, boolean z17) {
        kotlin.jvm.internal.o.g(tVar, "<this>");
        return tVar.k(z17 ? f180c : f179b);
    }

    public static final a0.m3 c(int i17, n0.o oVar, int i18, int i19) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-1464256199);
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        w0.x xVar = a0.m3.f226f;
        a0.m3 m3Var = (a0.m3) w0.g.a(new java.lang.Object[0], a0.m3.f226f, null, new a0.b3(i17), y0Var, 72, 4);
        y0Var.o(false);
        return m3Var;
    }

    public static z0.t d(z0.t tVar, a0.m3 state, boolean z17, b0.q1 q1Var, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        boolean z19 = z17;
        if ((i17 & 4) != 0) {
            q1Var = null;
        }
        b0.q1 q1Var2 = q1Var;
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(state, "state");
        boolean z27 = androidx.compose.ui.platform.f3.f10562a;
        return z0.m.a(tVar, androidx.compose.ui.platform.e3.f10553d, new a0.h3(true, state, z19, q1Var2, z18));
    }
}
