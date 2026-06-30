package s61;

/* loaded from: classes9.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11379x123ccf34 f484926d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11379x123ccf34 activityC11379x123ccf34) {
        this.f484926d = activityC11379x123ccf34;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/RecoverAccountUI1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7160xdeb98c4c c7160xdeb98c4c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7160xdeb98c4c();
        c7160xdeb98c4c.f144649d = 3;
        c7160xdeb98c4c.k();
        gm0.j1.d().g(new r61.d1(this.f484926d.f154705e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11379x123ccf34 activityC11379x123ccf34 = this.f484926d;
        activityC11379x123ccf34.f154704d = db5.e1.Q(activityC11379x123ccf34, null, activityC11379x123ccf34.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), false, false, null);
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/RecoverAccountUI1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
