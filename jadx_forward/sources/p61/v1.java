package p61;

/* loaded from: classes5.dex */
public class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11363xeff3735d f433926d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11363xeff3735d activityC11363xeff3735d) {
        this.f433926d = activityC11363xeff3735d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11363xeff3735d activityC11363xeff3735d = this.f433926d;
        java.lang.String trim = activityC11363xeff3735d.f154534e.getText().toString().trim();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            db5.e1.i(activityC11363xeff3735d, com.p314xaae8f345.mm.R.C30867xcad56011.ahp, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC11363xeff3735d.mo48674x36654fab();
        s61.l1 l1Var = s61.l1.BINDMOBILE;
        if (activityC11363xeff3735d.f154541o == 3) {
            l1Var = s61.l1.CHANGEMOBILE;
        }
        if (activityC11363xeff3735d.f154542p == null) {
            activityC11363xeff3735d.f154542p = new s61.m1(l1Var, activityC11363xeff3735d, new p61.a2(activityC11363xeff3735d));
        }
        s61.m1 m1Var = activityC11363xeff3735d.f154542p;
        m1Var.f484911o = activityC11363xeff3735d.f154537h;
        int i17 = activityC11363xeff3735d.f154541o;
        m1Var.f484910n = i17 == 0 || i17 == 3;
        m1Var.e(activityC11363xeff3735d.f154535f, trim, 2, "");
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
