package y83;

/* loaded from: classes14.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16156xf944aa02 f541518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f541519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f541520f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16156xf944aa02 activityC16156xf944aa02, java.util.ArrayList arrayList, int i17) {
        this.f541518d = activityC16156xf944aa02;
        this.f541519e = arrayList;
        this.f541520f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object obj = this.f541519e.get(this.f541520f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.p1788x633fb29.C16152x604567c3 c16152x604567c3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.p1788x633fb29.C16152x604567c3) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16156xf944aa02.f224644o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.ActivityC16156xf944aa02 activityC16156xf944aa02 = this.f541518d;
        activityC16156xf944aa02.getClass();
        r45.u44 u44Var = new r45.u44();
        u44Var.f468553d = c16152x604567c3.f224633g;
        u44Var.f468554e = c16152x604567c3.f224631e;
        u44Var.f468555f = c16152x604567c3.f224632f;
        u44Var.f468556g = c16152x604567c3.f224634h;
        u44Var.f468557h = c16152x604567c3.f224630d;
        activityC16156xf944aa02.f224651m = u44Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchCardLayout");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.p1789x625ef69.C16153xf0d27e3c) view).f224635d) {
            db5.e1.A(activityC16156xf944aa02.mo55332x76847179(), activityC16156xf944aa02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7i), "", activityC16156xf944aa02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7h), activityC16156xf944aa02.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g7g), new y83.f(activityC16156xf944aa02), null);
        } else {
            r45.u44 u44Var2 = activityC16156xf944aa02.f224651m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u44Var2);
            activityC16156xf944aa02.U6(u44Var2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
