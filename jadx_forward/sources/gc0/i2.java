package gc0;

/* loaded from: classes3.dex */
public final class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f351718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ db5.d5 f351721g;

    public i2(yz5.l lVar, java.lang.String str, gc0.p2 p2Var, db5.d5 d5Var) {
        this.f351718d = lVar;
        this.f351719e = str;
        this.f351720f = p2Var;
        this.f351721g = d5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$popupImage$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f351718d;
        java.lang.String str = this.f351719e;
        if (((java.lang.Boolean) lVar.mo146xb9724478(str)).booleanValue()) {
            gc0.p2 p2Var = this.f351720f;
            gc0.e1 e1Var = p2Var.f351781m;
            e1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            e1Var.f351682h = str;
            this.f351721g.dismiss();
            p2Var.f351776e = gc0.g2.f351707d;
            p2Var.f351775d = gc0.h2.f351713d;
        }
        yj0.a.h(this, "com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$popupImage$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
