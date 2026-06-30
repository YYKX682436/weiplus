package wa2;

/* loaded from: classes.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f525694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f525695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f525696f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, int i17) {
        super(0);
        this.f525694d = layoutManager;
        this.f525695e = f0Var;
        this.f525696f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) this.f525694d;
        int i17 = this.f525695e.f391649d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f525696f));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1161x57298f5d, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$genExitCallback$exitCallback$1$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1161x57298f5d.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1161x57298f5d, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$genExitCallback$exitCallback$1$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        return jz5.f0.f384359a;
    }
}
