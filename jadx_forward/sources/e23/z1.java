package e23;

/* loaded from: classes9.dex */
public class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f328538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f328539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a2 f328540f;

    public z1(e23.a2 a2Var, android.widget.LinearLayout linearLayout, android.content.Context context) {
        this.f328540f = a2Var;
        this.f328538d = linearLayout;
        this.f328539e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/item/FTSWXPayRelatedFuncDataItem$FTSWXPayServiceNotifyContentViewItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) this.f328538d.getTag()).intValue();
        e23.a2 a2Var = this.f328540f;
        if (a2Var.f328309b.f328331q.size() > intValue && intValue >= 0) {
            r45.vx5 vx5Var = (r45.vx5) a2Var.f328309b.f328331q.get(intValue);
            android.content.Context context = this.f328539e;
            if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15610xa65f7d9f) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15610xa65f7d9f activityC15610xa65f7d9f = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15610xa65f7d9f) context;
                activityC15610xa65f7d9f.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "jump to wxpay module, name: %s, controlinfo type: %s", vx5Var.f470179d, java.lang.Integer.valueOf(vx5Var.f470180e.f454680d));
                r45.e90 e90Var = vx5Var.f470180e;
                if (e90Var != null && e90Var.f454680d == 2 && e90Var.f454682f != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("key_not_goto_launcher_ui_when_back", true);
                    o05.l lVar = (o05.l) i95.n0.c(o05.l.class);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15610xa65f7d9f.mo55332x76847179();
                    r45.yt5 yt5Var = vx5Var.f470180e.f454682f;
                    ((ps4.g) lVar).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.c(mo55332x76847179, yt5Var, bundle);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/item/FTSWXPayRelatedFuncDataItem$FTSWXPayServiceNotifyContentViewItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
