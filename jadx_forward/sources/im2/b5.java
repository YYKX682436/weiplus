package im2;

/* loaded from: classes3.dex */
public final class b5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f373791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.a84 f373792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373793f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373794g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f373795h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373796i;

    public b5(im2.h6 h6Var, r45.a84 a84Var, java.lang.String str, java.lang.String str2, ya2.b2 b2Var, java.lang.String str3) {
        this.f373791d = h6Var;
        this.f373792e = a84Var;
        this.f373793f = str;
        this.f373794g = str2;
        this.f373795h = b2Var;
        this.f373796i = str3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin$applyCoAuthorAfterUi$sheetClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f373791d.f195201d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ya2.b2 b2Var = this.f373795h;
        java.lang.String m176700xe5e0d2a0 = b2Var != null ? b2Var.m176700xe5e0d2a0() : null;
        if (m176700xe5e0d2a0 == null) {
            m176700xe5e0d2a0 = "";
        }
        if (m176700xe5e0d2a0.length() == 0) {
            m176700xe5e0d2a0 = this.f373796i;
        }
        qe2.l.d(context, this.f373792e, this.f373793f, this.f373794g, m176700xe5e0d2a0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin$applyCoAuthorAfterUi$sheetClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
