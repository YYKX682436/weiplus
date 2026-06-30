package r2;

/* loaded from: classes14.dex */
public final class f implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r2.o f450242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1.w f450243b;

    public f(r2.o oVar, u1.w wVar) {
        this.f450242a = oVar;
        this.f450243b = wVar;
    }

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        r2.o oVar = this.f450242a;
        android.view.ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layoutParams);
        oVar.measure(makeMeasureSpec, r2.o.a(oVar, 0, i17, layoutParams.height));
        return oVar.getMeasuredWidth();
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        r2.o oVar = this.f450242a;
        android.view.ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layoutParams);
        oVar.measure(r2.o.a(oVar, 0, i17, layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        return oVar.getMeasuredHeight();
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        r2.o oVar = this.f450242a;
        android.view.ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layoutParams);
        oVar.measure(r2.o.a(oVar, 0, i17, layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        return oVar.getMeasuredHeight();
    }

    @Override // s1.t0
    public s1.u0 d(s1.x0 measure, java.util.List measurables, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        int j18 = p2.c.j(j17);
        r2.o oVar = this.f450242a;
        if (j18 != 0) {
            oVar.getChildAt(0).setMinimumWidth(p2.c.j(j17));
        }
        if (p2.c.i(j17) != 0) {
            oVar.getChildAt(0).setMinimumHeight(p2.c.i(j17));
        }
        int j19 = p2.c.j(j17);
        int h17 = p2.c.h(j17);
        android.view.ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layoutParams);
        int a17 = r2.o.a(oVar, j19, h17, layoutParams.width);
        int i17 = p2.c.i(j17);
        int g17 = p2.c.g(j17);
        android.view.ViewGroup.LayoutParams layoutParams2 = oVar.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layoutParams2);
        oVar.measure(a17, r2.o.a(oVar, i17, g17, layoutParams2.height));
        return s1.v0.b(measure, oVar.getMeasuredWidth(), oVar.getMeasuredHeight(), null, new r2.e(oVar, this.f450243b), 4, null);
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List measurables, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        r2.o oVar = this.f450242a;
        android.view.ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layoutParams);
        oVar.measure(makeMeasureSpec, r2.o.a(oVar, 0, i17, layoutParams.height));
        return oVar.getMeasuredWidth();
    }
}
