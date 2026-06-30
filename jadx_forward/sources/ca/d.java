package ca;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final ca.c f121286a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f121287b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f121288c;

    /* renamed from: d, reason: collision with root package name */
    public ca.i f121289d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f121290e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(ca.c cVar) {
        this.f121286a = cVar;
        android.view.View view = (android.view.View) cVar;
        this.f121287b = view;
        view.setWillNotDraw(false);
        new android.graphics.Path();
        new android.graphics.Paint(7);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f121288c = paint;
        paint.setColor(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.graphics.Canvas r10) {
        /*
            r9 = this;
            ca.i r0 = r9.f121289d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L17
            float r0 = r0.f121297c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            r0 = r0 ^ r2
            android.graphics.Paint r8 = r9.f121288c
            ca.c r3 = r9.f121286a
            android.view.View r4 = r9.f121287b
            if (r0 == 0) goto L45
            r3.b(r10)
            int r0 = r8.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L30
            r0 = r2
            goto L31
        L30:
            r0 = r1
        L31:
            if (r0 == 0) goto L68
            r0 = 0
            r5 = 0
            int r3 = r4.getWidth()
            float r6 = (float) r3
            int r3 = r4.getHeight()
            float r7 = (float) r3
            r3 = r10
            r4 = r0
            r3.drawRect(r4, r5, r6, r7, r8)
            goto L68
        L45:
            r3.b(r10)
            int r0 = r8.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L54
            r0 = r2
            goto L55
        L54:
            r0 = r1
        L55:
            if (r0 == 0) goto L68
            r0 = 0
            r5 = 0
            int r3 = r4.getWidth()
            float r6 = (float) r3
            int r3 = r4.getHeight()
            float r7 = (float) r3
            r3 = r10
            r4 = r0
            r3.drawRect(r4, r5, r6, r7, r8)
        L68:
            android.graphics.drawable.Drawable r0 = r9.f121290e
            if (r0 == 0) goto L71
            ca.i r3 = r9.f121289d
            if (r3 == 0) goto L71
            r1 = r2
        L71:
            if (r1 == 0) goto L9c
            android.graphics.Rect r0 = r0.getBounds()
            ca.i r1 = r9.f121289d
            float r1 = r1.f121295a
            int r2 = r0.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 - r2
            ca.i r2 = r9.f121289d
            float r2 = r2.f121296b
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r3
            float r2 = r2 - r0
            r10.translate(r1, r2)
            android.graphics.drawable.Drawable r0 = r9.f121290e
            r0.draw(r10)
            float r0 = -r1
            float r1 = -r2
            r10.translate(r0, r1)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.d.a(android.graphics.Canvas):void");
    }

    public int b() {
        return this.f121288c.getColor();
    }

    public ca.i c() {
        ca.i iVar = this.f121289d;
        if (iVar == null) {
            return null;
        }
        ca.i iVar2 = new ca.i(iVar);
        if (iVar2.f121297c == Float.MAX_VALUE) {
            float f17 = iVar2.f121295a;
            float f18 = iVar2.f121296b;
            android.view.View view = this.f121287b;
            iVar2.f121297c = ga.a.a(f17, f18, 0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d() {
        /*
            r4 = this;
            ca.c r0 = r4.f121286a
            boolean r0 = r0.c()
            r1 = 0
            if (r0 == 0) goto L24
            ca.i r0 = r4.f121289d
            r2 = 1
            if (r0 == 0) goto L1f
            float r0 = r0.f121297c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            r0 = r0 ^ r2
            if (r0 != 0) goto L24
            r1 = r2
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.d.d():boolean");
    }

    public void e(android.graphics.drawable.Drawable drawable) {
        this.f121290e = drawable;
        this.f121287b.invalidate();
    }

    public void f(int i17) {
        this.f121288c.setColor(i17);
        this.f121287b.invalidate();
    }

    public void g(ca.i iVar) {
        android.view.View view = this.f121287b;
        if (iVar == null) {
            this.f121289d = null;
        } else {
            ca.i iVar2 = this.f121289d;
            if (iVar2 == null) {
                this.f121289d = new ca.i(iVar);
            } else {
                float f17 = iVar.f121295a;
                float f18 = iVar.f121296b;
                float f19 = iVar.f121297c;
                iVar2.f121295a = f17;
                iVar2.f121296b = f18;
                iVar2.f121297c = f19;
            }
            if (iVar.f121297c + 1.0E-4f >= ga.a.a(iVar.f121295a, iVar.f121296b, 0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight())) {
                this.f121289d.f121297c = Float.MAX_VALUE;
            }
        }
        view.invalidate();
    }
}
