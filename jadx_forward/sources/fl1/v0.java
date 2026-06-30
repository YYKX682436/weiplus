package fl1;

/* loaded from: classes4.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f345415g;

    public v0(fl1.c1 c1Var, android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f345415g = c1Var;
        this.f345412d = context;
        this.f345413e = str;
        this.f345414f = str2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.c1 c1Var = this.f345415g;
        c1Var.c(4, 1);
        android.widget.RatingBar ratingBar = c1Var.f345272k;
        int rating = ratingBar != null ? (int) ratingBar.getRating() : 0;
        c1Var.getClass();
        if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = "wxbfac0b7aca45dd68";
            b1Var.f398545a = "gh_af145dc05189@app";
            b1Var.f398549c = 0;
            b1Var.f398565k = 1147;
            b1Var.f398555f = java.lang.String.format("/pages/edit/edit.html?appid=%s&appName=%s&score=%s", this.f345413e, this.f345414f, java.lang.Integer.valueOf(rating));
            b1Var.f398570o = new fl1.j0(c1Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(this.f345412d, b1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
