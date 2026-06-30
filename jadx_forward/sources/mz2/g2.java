package mz2;

/* loaded from: classes3.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f414658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f414659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 f414660f;

    public g2(mz2.j2 j2Var, android.app.Activity activity, android.os.Bundle bundle, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var) {
        this.f414658d = activity;
        this.f414659e = bundle;
        this.f414660f = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSoterService", "click faceid btn");
        android.content.Intent intent = new android.content.Intent(this.f414658d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d.class);
        intent.putExtra("pwd", this.f414659e.getString("key_pwd1"));
        intent.putExtra("key_scene", 1);
        android.app.Activity activity = this.f414658d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f414660f.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
