package vh0;

@j95.b
/* loaded from: classes3.dex */
public final class x1 extends i95.w implements vh0.z0 {
    public void wi(android.view.ViewGroup container, xj.m mVar, vh0.a1 a1Var) {
        android.view.View childAt;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        if (container.getChildCount() == 0) {
            childAt = com.p314xaae8f345.mm.ui.id.b(container.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0f, container, false);
            container.addView(childAt);
        } else {
            childAt = container.getChildAt(0);
        }
        childAt.setOnClickListener(new vh0.v1(a1Var, new p3321xbce91901.jvm.p3324x21ffc6bd.h0(), childAt, mVar));
        childAt.post(new vh0.w1(childAt));
    }
}
