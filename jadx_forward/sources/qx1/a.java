package qx1;

/* loaded from: classes12.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx1.a f448809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f448810e;

    public a(qx1.q qVar, mx1.a aVar) {
        this.f448810e = qVar;
        this.f448809d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionLocation.k(view.getContext(), null)) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        nx1.d.q().z(-1, false, true);
        boolean f17 = u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null));
        qx1.q qVar = this.f448810e;
        if (f17) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity activity = (android.app.Activity) qVar.f448841b.getContext();
            ((sb0.f) jVar).getClass();
            if (!j35.u.d(activity, "android.permission.ACCESS_FINE_LOCATION", true)) {
                if (((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                    tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
                    android.app.Activity activity2 = (android.app.Activity) qVar.f448841b.getContext();
                    ((sb0.f) jVar2).getClass();
                    j35.u.i(activity2, "android.permission.ACCESS_FINE_LOCATION", 64);
                } else {
                    c71.b.c((android.app.Activity) qVar.f448841b.getContext(), qVar.f448841b.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573932gh2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()), 30764, true);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else {
            tb0.j jVar3 = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity activity3 = (android.app.Activity) qVar.f448841b.getContext();
            ((sb0.f) jVar3).getClass();
            boolean a17 = j35.u.a(activity3, "android.permission.ACCESS_FINE_LOCATION", 64, null, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorFooterPanel", "summerper checkPermission checkLocation[%b]", java.lang.Boolean.valueOf(a17));
            if (!a17) {
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
        intent.putExtra("map_view_type", 3);
        j45.l.n(qVar.f448841b.getContext(), ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, 4098);
        this.f448809d.q0(4096L);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
