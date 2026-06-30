package vh0;

/* loaded from: classes3.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh0.a1 f518502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f518503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xj.m f518504f;

    public u1(vh0.a1 a1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, xj.m mVar) {
        this.f518502d = a1Var;
        this.f518503e = h0Var;
        this.f518504f = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/YuanBaoAdTipService$attachAdTipView$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vh0.a1 a1Var = this.f518502d;
        if (a1Var != null) {
            a1Var.b();
        }
        db5.d5 d5Var = (db5.d5) this.f518503e.f391656d;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        xj.m mVar = this.f518504f;
        if (mVar != null && (str = mVar.f536286a) != null) {
            ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).aj(str);
        }
        yj0.a.h(this, "com/tencent/mm/feature/yuanbao/YuanBaoAdTipService$attachAdTipView$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
