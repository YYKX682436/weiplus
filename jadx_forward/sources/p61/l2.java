package p61;

/* loaded from: classes5.dex */
public class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 f433842d;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 activityC11366xcba74a33) {
        this.f433842d = activityC11366xcba74a33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33 activityC11366xcba74a33 = this.f433842d;
        if (activityC11366xcba74a33.f154564e.getText().toString() == null || activityC11366xcba74a33.f154564e.getText().toString().length() == 0) {
            dp.a.m125854x26a183b(activityC11366xcba74a33, activityC11366xcba74a33.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ag6), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(activityC11366xcba74a33.f154567h.getText().toString().trim());
        java.lang.String obj = activityC11366xcba74a33.f154564e.getText().toString();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(obj.replaceAll("[\\.\\-]", "").trim());
        activityC11366xcba74a33.f154568i = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactUI", "do next, send sms to self");
        java.lang.String str = activityC11366xcba74a33.f154568i;
        java.lang.String string = activityC11366xcba74a33.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahm);
        db5.e1.u(activityC11366xcba74a33.mo55332x76847179(), java.lang.String.format("%s\n%s", activityC11366xcba74a33.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahn), str), string, new p61.k2(activityC11366xcba74a33, str), null);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
