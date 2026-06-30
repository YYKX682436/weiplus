package fl1;

/* loaded from: classes7.dex */
public final class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.h1 f345345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.p1 f345346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f345347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f345348g;

    public n1(fl1.h1 h1Var, fl1.p1 p1Var, yz5.l lVar, int i17) {
        this.f345345d = h1Var;
        this.f345346e = p1Var;
        this.f345347f = lVar;
        this.f345348g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.h1 h1Var = this.f345345d;
        h1Var.f345317f = true;
        fl1.p1 p1Var = this.f345346e;
        p1Var.j(true, h1Var);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : p1Var.f345376e) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            fl1.h1 h1Var2 = (fl1.h1) obj;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            int i19 = this.f345348g;
            if (i19 != i17) {
                if (h1Var2 != null && h1Var2.f345317f) {
                    h1Var2.f345317f = false;
                    arrayList2.add(java.lang.Integer.valueOf(i19));
                }
            }
            i17 = i18;
        }
        this.f345347f.mo146xb9724478(arrayList2);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
