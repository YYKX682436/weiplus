package e05;

/* loaded from: classes9.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19551x72ba7da1 f327707d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19551x72ba7da1 activityC19551x72ba7da1) {
        this.f327707d = activityC19551x72ba7da1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletCheckIdentityUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19551x72ba7da1 activityC19551x72ba7da1 = this.f327707d;
        java.lang.String m83183xfb85ada3 = activityC19551x72ba7da1.f270054d.m83183xfb85ada3();
        java.lang.String m83183xfb85ada32 = activityC19551x72ba7da1.f270055e.m83183xfb85ada3();
        activityC19551x72ba7da1.getClass();
        boolean z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83183xfb85ada3)) {
            db5.t7.m123882x26a183b(activityC19551x72ba7da1, com.p314xaae8f345.mm.R.C30867xcad56011.kjv, 0).show();
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83183xfb85ada32) || m83183xfb85ada32.length() < 4 || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19551x72ba7da1.f270056f) && !activityC19551x72ba7da1.f270055e.n())) {
            db5.t7.m123882x26a183b(activityC19551x72ba7da1, com.p314xaae8f345.mm.R.C30867xcad56011.kia, 0).show();
        } else {
            z17 = true;
        }
        if (z17) {
            activityC19551x72ba7da1.m83106x57340563().d(m83183xfb85ada3, m83183xfb85ada32);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletCheckIdentityUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
