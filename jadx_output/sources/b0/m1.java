package b0;

/* loaded from: classes14.dex */
public abstract class m1 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(p1.c r9, n0.e5 r10, n0.e5 r11, q1.f r12, b0.y1 r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m1.a(p1.c, n0.e5, n0.e5, q1.f, b0.y1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object b(p1.c cVar, jz5.l lVar, q1.f fVar, u26.y0 y0Var, boolean z17, b0.y1 y1Var, kotlin.coroutines.Continuation continuation) {
        float floatValue = ((java.lang.Number) lVar.f302834e).floatValue();
        p1.s sVar = (p1.s) lVar.f302833d;
        b0.y1 y1Var2 = b0.y1.Vertical;
        long a17 = y1Var == y1Var2 ? d1.f.a(0.0f, floatValue) : d1.f.a(floatValue, 0.0f);
        long j17 = sVar.f350881c;
        long e17 = d1.e.e(j17, d1.e.g(a17, java.lang.Math.signum(y1Var == y1Var2 ? d1.e.d(j17) : d1.e.c(j17))));
        y0Var.e(new b0.u(e17, null));
        if (z17) {
            floatValue *= -1;
        }
        y0Var.e(new b0.t(floatValue, e17, null));
        b0.x0 x0Var = new b0.x0(fVar, y1Var, y0Var, z17);
        long j18 = sVar.f350879a;
        return y1Var == y1Var2 ? b0.p0.j(cVar, j18, x0Var, continuation) : b0.p0.g(cVar, j18, x0Var, continuation);
    }

    public static final z0.t c(z0.t tVar, yz5.p stateFactory, yz5.l canDrag, b0.y1 orientation, boolean z17, c0.o oVar, yz5.a startDragImmediately, yz5.q onDragStarted, yz5.q onDragStopped, boolean z18) {
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(stateFactory, "stateFactory");
        kotlin.jvm.internal.o.g(canDrag, "canDrag");
        kotlin.jvm.internal.o.g(orientation, "orientation");
        kotlin.jvm.internal.o.g(startDragImmediately, "startDragImmediately");
        kotlin.jvm.internal.o.g(onDragStarted, "onDragStarted");
        kotlin.jvm.internal.o.g(onDragStopped, "onDragStopped");
        boolean z19 = androidx.compose.ui.platform.f3.f10562a;
        return z0.m.a(tVar, androidx.compose.ui.platform.e3.f10553d, new b0.l1(stateFactory, oVar, startDragImmediately, canDrag, onDragStarted, onDragStopped, orientation, z17, z18));
    }
}
