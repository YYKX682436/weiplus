package if2;

/* loaded from: classes3.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f372647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f372648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f372649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, boolean z17, float f17) {
        super(0);
        this.f372647d = c14197x319b1b9e;
        this.f372648e = z17;
        this.f372649f = f17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if2.l0 l0Var;
        java.util.List<if2.d0> b17;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d703 : this.f372647d.m56799x73a45721()) {
            if2.b bVar = abstractC14196xf9d9d703 instanceof if2.b ? (if2.b) abstractC14196xf9d9d703 : null;
            if (bVar != null && (l0Var = bVar.f372636i) != null && (b17 = l0Var.b()) != null) {
                for (if2.d0 d0Var : b17) {
                    if (this.f372648e) {
                        if ((d0Var.f372638a.getAlpha() == 1.0f) && d0Var.f372638a.getVisibility() == 0) {
                        }
                    }
                    android.view.View view = d0Var.f372638a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(this.f372649f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleEventExtension$dispatchValueAnimator$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleEventExtension$dispatchValueAnimator$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
