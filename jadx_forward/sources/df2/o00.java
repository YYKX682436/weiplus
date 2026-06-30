package df2;

/* loaded from: classes3.dex */
public final class o00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.q00 f312444d;

    public o00(df2.q00 q00Var) {
        this.f312444d = q00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/VisitorCastScreenController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f409257f, 1);
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        df2.q00 q00Var = this.f312444d;
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).qk(((mm2.e1) q00Var.m56788xbba4bfc0(mm2.e1.class)).f410521r)) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8h));
        } else {
            if2.b.Y6(q00Var, qo0.b.f446884f4, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/VisitorCastScreenController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
