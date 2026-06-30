package gu1;

/* loaded from: classes15.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13042x42c001 f357443d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13042x42c001 activityC13042x42c001) {
        this.f357443d = activityC13042x42c001;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13042x42c001 activityC13042x42c001 = this.f357443d;
        eu1.f fVar = activityC13042x42c001.f176257z;
        if (eu1.f.b() && eu1.f.c()) {
            activityC13042x42c001.K = 2;
        } else if (eu1.f.c()) {
            activityC13042x42c001.K = 3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11582, "OperChangeOtherCity ", 0, 0, "", "", "");
        xt1.t0.Di().b("key_share_card_show_type", java.lang.Integer.valueOf(activityC13042x42c001.K));
        android.widget.BaseAdapter baseAdapter = activityC13042x42c001.f176165e;
        if (baseAdapter instanceof gu1.k) {
            gu1.k kVar = (gu1.k) baseAdapter;
            kVar.f357427q = activityC13042x42c001.K;
            kVar.f();
        }
        activityC13042x42c001.f176255x.a();
        activityC13042x42c001.f176257z.getClass();
        eu1.f.f338285c = true;
        yj0.a.h(this, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
