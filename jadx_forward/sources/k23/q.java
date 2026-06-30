package k23;

/* loaded from: classes12.dex */
public abstract class q extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final k23.d0 f385188d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f385189e;

    /* renamed from: f, reason: collision with root package name */
    public final em.i0 f385190f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f385191g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f385192h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f385193i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f385194m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f385195n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k23.d0 params, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f385188d = params;
        this.f385189e = activity;
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(mo141834x2ee31f5b(), this);
        this.f385190f = new em.i0(this);
        this.f385191g = jz5.h.b(k23.o.f385168d);
        this.f385192h = jz5.h.b(new k23.l(this));
        this.f385193i = jz5.h.b(new k23.i(this));
        this.f385194m = jz5.h.b(new k23.d(this));
        this.f385195n = jz5.h.b(new k23.n(this));
    }

    /* renamed from: getEnterValueAnimation */
    private final java.util.List<android.animation.ValueAnimator> m141829x29078ed5() {
        return (java.util.List) ((jz5.n) this.f385194m).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getEnterValueAnimationV1 */
    public final java.util.List<android.animation.ValueAnimator> m141830x55f3830() {
        return (java.util.List) ((jz5.n) this.f385193i).mo141623x754a37bb();
    }

    /* renamed from: getEnterValueAnimationV2 */
    private final java.util.List<android.animation.ValueAnimator> m141831x55f3831() {
        return (java.util.List) ((jz5.n) this.f385192h).mo141623x754a37bb();
    }

    /* renamed from: getHideValueAnimation */
    private final java.util.List<android.animation.ValueAnimator> m141832x3b8d68eb() {
        return (java.util.List) ((jz5.n) this.f385195n).mo141623x754a37bb();
    }

    public abstract void b(java.util.List list);

    public abstract void c();

    public final void d() {
        c();
        java.util.Iterator<T> it = m141829x29078ed5().iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) it.next()).start();
        }
    }

    public final void e(yz5.a aVar) {
        f();
        int i17 = 0;
        for (java.lang.Object obj : m141832x3b8d68eb()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) obj;
            valueAnimator.removeAllListeners();
            if (i17 == 0) {
                valueAnimator.addListener(new k23.p(aVar));
            }
            valueAnimator.start();
            i17 = i18;
        }
    }

    public final void f() {
        java.util.Iterator<T> it = m141829x29078ed5().iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) it.next()).cancel();
        }
        java.util.Iterator<T> it6 = m141832x3b8d68eb().iterator();
        while (it6.hasNext()) {
            ((android.animation.ValueAnimator) it6.next()).cancel();
        }
    }

    /* renamed from: getActivity */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m141833x19263085() {
        return this.f385189e;
    }

    /* renamed from: getLayoutId */
    public abstract int mo141834x2ee31f5b();

    /* renamed from: getParams */
    public final k23.d0 m141835x29c21c7c() {
        return this.f385188d;
    }

    /* renamed from: getScreenHeight */
    public final int m141836xe946cf29() {
        return ((java.lang.Number) ((jz5.n) this.f385191g).mo141623x754a37bb()).intValue();
    }

    /* renamed from: getVb */
    public final em.i0 m141837x5db1ca2() {
        return this.f385190f;
    }

    /* renamed from: setRecognizedText */
    public final void m141838x6fea3ce5(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        em.i0 i0Var = this.f385190f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c17 = i0Var.c();
        c17.setText(text);
        int lineCount = c17.getLineCount();
        android.view.View view = i0Var.f335946a;
        if (lineCount == 0 || c17.getLineCount() <= c17.getHeight() / c17.getLineHeight()) {
            if (i0Var.f335952g == null) {
                i0Var.f335952g = view.findViewById(com.p314xaae8f345.mm.R.id.f568815ve4);
            }
            android.view.View view2 = i0Var.f335952g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "setRecognizedText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "setRecognizedText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setGravity(48);
            return;
        }
        if (i0Var.f335952g == null) {
            i0Var.f335952g = view.findViewById(com.p314xaae8f345.mm.R.id.f568815ve4);
        }
        android.view.View view3 = i0Var.f335952g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "setRecognizedText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView", "setRecognizedText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setGravity(80);
    }

    /* renamed from: setSemiCircleContainerHeight */
    public final void m141839x650f6d08(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSFloatingRecognizingPanelView", "setSemiCircleContainerHeight(" + i17 + ')');
        em.i0 i0Var = this.f385190f;
        if (i0Var.f335953h == null) {
            i0Var.f335953h = (android.widget.FrameLayout) i0Var.f335946a.findViewById(com.p314xaae8f345.mm.R.id.v37);
        }
        android.view.ViewGroup.LayoutParams layoutParams = i0Var.f335953h.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.height = i17;
        if (i0Var.f335953h == null) {
            i0Var.f335953h = (android.widget.FrameLayout) i0Var.f335946a.findViewById(com.p314xaae8f345.mm.R.id.v37);
        }
        i0Var.f335953h.setLayoutParams(layoutParams2);
    }

    /* renamed from: setSoundWave */
    public final void m141840xefb9e266(int i17) {
        this.f385190f.e().i(i17);
    }

    /* renamed from: setTips */
    public final void m141841x765082ba(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 f17 = this.f385190f.f();
        if (z17) {
            f17.setTextColor(f17.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            f17.setText(f17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozz));
        } else {
            f17.setTextColor(f17.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
            f17.setText(f17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozy));
        }
    }
}
