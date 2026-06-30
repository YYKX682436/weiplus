package bg2;

/* loaded from: classes2.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d1 f19928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(bg2.d1 d1Var) {
        super(0);
        this.f19928d = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = this.f19928d.f417141d.f417149i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.tencent.mm.R.id.f484260dk3) : null;
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertGuideBubbleController$showGuideBubble$bubble$2", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertGuideBubbleController$showGuideBubble$bubble$2", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f302826a;
    }
}
