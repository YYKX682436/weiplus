package cq1;

/* loaded from: classes8.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cq1.d0 f302904d;

    public x(cq1.d0 d0Var) {
        this.f302904d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/biz/scheme/LaunchMpBottomSheet$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cq1.d0 d0Var = this.f302904d;
        d0Var.b();
        cq1.w wVar = d0Var.f302881v;
        if (wVar != null) {
            eq1.w wVar2 = (eq1.w) wVar;
            android.content.Context context = wVar2.f337406a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizMpUtil", "launchApplication: handle schemeUrl: list is avaliable");
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699();
            java.lang.String str = wVar2.f337407b;
            if (r26.n0.D(str, "wx50a3272e1669f0c0://", false, 2, null)) {
                str = r26.i0.w(str, "wx50a3272e1669f0c0://", "", false);
            }
            c11272xd6622699.f33061xb2206a6f = str;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11272xd6622699);
            c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
            c11286x34a5504.f33125x9b39409a = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizMpUtil", "launchApplication: handle schemeUrl: launchAppByWeChat and result: " + ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(context, "wx50a3272e1669f0c0", c11286x34a5504, 2, null, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/biz/scheme/LaunchMpBottomSheet$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
