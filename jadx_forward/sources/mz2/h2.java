package mz2;

/* loaded from: classes3.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.h f414665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f414666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f414667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 f414668g;

    public h2(mz2.j2 j2Var, com.p314xaae8f345.mm.p2802xd031a825.h hVar, android.os.Bundle bundle, android.app.Activity activity, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var) {
        this.f414665d = hVar;
        this.f414666e = bundle;
        this.f414667f = activity;
        this.f414668g = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSoterService", "click fingerprint btn");
        if (this.f414665d != null) {
            android.os.Bundle bundle = this.f414666e;
            bundle.putBoolean("key_show_guide", false);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtras(bundle);
            j45.l.j(this.f414667f, com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.f47003xb618721a, ".ui.FingerPrintAuthTransparentUI", intent, null);
        }
        this.f414668g.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
