package hy0;

/* loaded from: classes5.dex */
public final class n0 extends hy0.h0 implements iy0.b {

    /* renamed from: c, reason: collision with root package name */
    public final int f367424c;

    /* renamed from: d, reason: collision with root package name */
    public final float f367425d;

    /* renamed from: e, reason: collision with root package name */
    public final float f367426e;

    /* renamed from: f, reason: collision with root package name */
    public final int f367427f;

    /* renamed from: g, reason: collision with root package name */
    public final int f367428g;

    /* renamed from: h, reason: collision with root package name */
    public final int f367429h;

    /* renamed from: i, reason: collision with root package name */
    public final int f367430i;

    /* renamed from: j, reason: collision with root package name */
    public final int f367431j;

    /* renamed from: k, reason: collision with root package name */
    public final int f367432k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Rect f367433l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f367434m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f367435n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.RectF f367436o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.RectF f367437p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f367438q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f367439r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f367440s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f367441t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Path f367442u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.RectF f367443v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hy0.y0 f367444w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(hy0.y0 y0Var, android.content.Context context) {
        super(y0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367444w = y0Var;
        this.f367424c = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 2);
        this.f367425d = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 4);
        float f17 = 3;
        this.f367426e = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f17);
        this.f367427f = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 12);
        this.f367428g = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f17);
        this.f367429h = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f17);
        this.f367430i = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f17);
        this.f367431j = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 19);
        this.f367432k = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 16);
        this.f367433l = new android.graphics.Rect();
        this.f367434m = new android.graphics.Rect();
        this.f367435n = new android.graphics.RectF();
        this.f367436o = new android.graphics.RectF();
        this.f367437p = new android.graphics.RectF();
        this.f367438q = jz5.h.b(new hy0.m0(context));
        this.f367439r = jz5.h.b(new hy0.l0(context));
        this.f367440s = jz5.h.b(new hy0.k0(context));
        this.f367441t = jz5.h.b(new hy0.j0(context));
        this.f367442u = new android.graphics.Path();
        this.f367443v = new android.graphics.RectF();
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ex0.a0 a0Var = context.f367579b;
        java.util.Iterator it = a0Var.f338630g.f338712g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ex0.q qVar = (ex0.q) it.next();
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = qVar.f338701b;
            ex0.r n17 = a0Var.n();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c3971x241f78, n17 != null ? n17.f338701b : null)) {
                h(canvas, context, qVar, false);
            }
        }
        ex0.r n18 = a0Var.n();
        ex0.q qVar2 = n18 instanceof ex0.q ? (ex0.q) n18 : null;
        if (qVar2 != null) {
            h(canvas, context, qVar2, true);
        }
    }

    public final void g(android.graphics.Canvas canvas, android.graphics.RectF rectF) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        hy0.y0 y0Var = this.f367444w;
        float f17 = (((float) ((currentTimeMillis - y0Var.f367567u) % 800)) / ((float) 800)) * 360.0f;
        canvas.save();
        canvas.rotate(f17, rectF.centerX(), rectF.centerY());
        canvas.drawBitmap((android.graphics.Bitmap) ((jz5.n) y0Var.f367566t).mo141623x754a37bb(), (android.graphics.Rect) null, rectF, (android.graphics.Paint) null);
        canvas.restore();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v89 float, still in use, count: 2, list:
          (r0v89 float) from 0x0113: PHI (r0v91 float) = (r0v89 float), (r0v90 float), (r0v98 float) binds: [B:33:0x010f, B:31:0x0111, B:24:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          (r0v89 float) from 0x010d: CMP_G (r0v89 float), (0.0f float) A[WRAPPED]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:39:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.graphics.Canvas r38, hy0.z2 r39, ex0.q r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy0.n0.h(android.graphics.Canvas, hy0.z2, ex0.q, boolean):void");
    }
}
