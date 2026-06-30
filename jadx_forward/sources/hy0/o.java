package hy0;

/* loaded from: classes5.dex */
public final class o implements iy0.c, iy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f367447a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Path f367448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hy0.x f367449c;

    public o(hy0.x xVar, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367449c = xVar;
        this.f367447a = new android.graphics.RectF();
        this.f367448b = new android.graphics.Path();
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ex0.a0 a0Var = context.f367579b;
        java.util.Iterator it = a0Var.f338630g.f338713h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ex0.b bVar = (ex0.b) it.next();
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = bVar.f338701b;
            ex0.r n17 = a0Var.n();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3971x241f78, n17 != null ? n17.f338701b : null)) {
                f(canvas, context, bVar, false);
            }
        }
        ex0.r n18 = a0Var.n();
        ex0.b bVar2 = n18 instanceof ex0.b ? (ex0.b) n18 : null;
        if (bVar2 != null) {
            f(canvas, context, bVar2, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if ((r4.length() > 0 ? true : r2) == true) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.graphics.Canvas r22, hy0.z2 r23, ex0.b r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy0.o.f(android.graphics.Canvas, hy0.z2, ex0.b, boolean):void");
    }
}
