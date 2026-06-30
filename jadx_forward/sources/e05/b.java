package e05;

/* loaded from: classes9.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19550xb0b9025c f327705d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19550xb0b9025c activityC19550xb0b9025c) {
        this.f327705d = activityC19550xb0b9025c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19550xb0b9025c activityC19550xb0b9025c = this.f327705d;
        boolean z17 = false;
        if (!activityC19550xb0b9025c.f270048d.n()) {
            db5.t7.m123882x26a183b(activityC19550xb0b9025c, com.p314xaae8f345.mm.R.C30867xcad56011.f575039ki3, 0).show();
        } else if (!activityC19550xb0b9025c.f270050f.n()) {
            db5.t7.m123882x26a183b(activityC19550xb0b9025c, com.p314xaae8f345.mm.R.C30867xcad56011.kh_, 0).show();
        } else if (activityC19550xb0b9025c.f270049e.n()) {
            z17 = true;
        } else {
            db5.t7.m123882x26a183b(activityC19550xb0b9025c, com.p314xaae8f345.mm.R.C30867xcad56011.kim, 0).show();
        }
        if (z17) {
            activityC19550xb0b9025c.m83106x57340563().d(activityC19550xb0b9025c.f270048d.m83183xfb85ada3(), activityC19550xb0b9025c.f270053i.f261192s, activityC19550xb0b9025c.f270049e.m83183xfb85ada3(), activityC19550xb0b9025c.f270053i.f261195v, java.lang.Boolean.FALSE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
