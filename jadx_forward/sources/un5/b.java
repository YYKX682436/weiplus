package un5;

/* loaded from: classes15.dex */
public class b implements on5.b, qn5.b, android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f511025d;

    /* renamed from: e, reason: collision with root package name */
    public final tn5.g f511026e;

    /* renamed from: f, reason: collision with root package name */
    public int f511027f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f511028g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f511029h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f511030i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f511031m;

    public b(android.view.View outView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outView, "outView");
        this.f511025d = outView;
        this.f511026e = e();
        this.f511028g = true;
        this.f511029h = true;
        this.f511030i = outView;
        this.f511031m = outView;
    }

    @Override // on5.b
    public android.animation.ValueAnimator.AnimatorUpdateListener a(int i17) {
        if (i17 == 0) {
            return null;
        }
        if ((i17 >= 0 || !this.f511030i.canScrollVertically(1)) && (i17 <= 0 || !this.f511030i.canScrollVertically(-1))) {
            return null;
        }
        this.f511027f = i17;
        return this;
    }

    public boolean b() {
        return this.f511029h && this.f511026e.a(this.f511031m);
    }

    public boolean c() {
        return this.f511028g && this.f511026e.b(this.f511031m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0 == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View d(android.view.View r11, android.graphics.PointF r12, android.view.View r13) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof android.view.ViewGroup
            if (r0 == 0) goto L7c
            if (r12 == 0) goto L7c
            r0 = r11
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getChildCount()
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>()
        L12:
            if (r1 <= 0) goto L7c
            int r2 = r1 + (-1)
            android.view.View r9 = r0.getChildAt(r2)
            tn5.g r2 = r10.f511026e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r9)
            float r5 = r12.x
            float r6 = r12.y
            r3 = r11
            r4 = r9
            r7 = r8
            boolean r2 = r2.e(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L79
            boolean r11 = r9 instanceof p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe
            if (r11 != 0) goto L61
            boolean r11 = r9 instanceof on5.g
            r0 = 0
            if (r11 == 0) goto L36
            goto L5f
        L36:
            boolean r11 = r9 instanceof on5.g
            r1 = 1
            if (r11 == 0) goto L3c
            goto L51
        L3c:
            boolean r11 = r9 instanceof android.widget.AbsListView
            if (r11 != 0) goto L53
            boolean r11 = r9 instanceof android.widget.ScrollView
            if (r11 != 0) goto L53
            boolean r11 = r9 instanceof n3.o0
            if (r11 != 0) goto L53
            boolean r11 = r9 instanceof android.webkit.WebView
            if (r11 != 0) goto L53
            boolean r11 = r9 instanceof n3.e0
            if (r11 == 0) goto L51
            goto L53
        L51:
            r11 = r0
            goto L54
        L53:
            r11 = r1
        L54:
            if (r11 != 0) goto L5e
            boolean r11 = r9 instanceof p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe
            if (r11 != 0) goto L5e
            boolean r11 = r9 instanceof n3.i0
            if (r11 == 0) goto L5f
        L5e:
            r0 = r1
        L5f:
            if (r0 != 0) goto L75
        L61:
            float r11 = r8.x
            float r0 = r8.y
            r12.offset(r11, r0)
            android.view.View r9 = r10.d(r9, r12, r13)
            float r11 = r8.x
            float r11 = -r11
            float r13 = r8.y
            float r13 = -r13
            r12.offset(r11, r13)
        L75:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r9)
            return r9
        L79:
            int r1 = r1 + (-1)
            goto L12
        L7c:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: un5.b.d(android.view.View, android.graphics.PointF, android.view.View):android.view.View");
    }

    public tn5.g e() {
        return new tn5.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(on5.f r17) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: un5.b.f(on5.f):void");
    }

    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        try {
            float scaleY = (intValue - this.f511027f) * this.f511030i.getScaleY();
            android.view.View view = this.f511030i;
            if (view instanceof android.widget.AbsListView) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.AbsListView");
                ((android.widget.AbsListView) view).scrollListBy((int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (java.lang.Throwable unused) {
        }
        this.f511027f = intValue;
    }
}
