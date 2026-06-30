package fl1;

/* loaded from: classes4.dex */
public class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f345419e;

    public w0(fl1.c1 c1Var, android.content.Context context) {
        this.f345419e = c1Var;
        this.f345418d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.c1 c1Var = this.f345419e;
        android.widget.RatingBar ratingBar = c1Var.f345272k;
        if (ratingBar != null) {
            int rating = (int) ratingBar.getRating();
            c1Var.getClass();
            r45.et6 et6Var = new r45.et6();
            et6Var.f455257d = c1Var.f345262a;
            et6Var.f455258e = 3;
            r45.ll0 ll0Var = new r45.ll0();
            et6Var.f455259f = ll0Var;
            ll0Var.f461103d = rating;
            c1Var.f345264c = rating;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "saveEvaluateScore, userName:%s, score:%d", c1Var.f345262a, java.lang.Integer.valueOf(rating));
            c1Var.j(et6Var);
            android.content.Context context = this.f345418d;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571653lh), 0).show();
            c1Var.f345263b = true;
            c1Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
