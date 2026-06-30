package mz2;

/* loaded from: classes3.dex */
public class e2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f414648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f414649e;

    public e2(mz2.j2 j2Var, android.app.Activity activity, android.os.Bundle bundle) {
        this.f414648d = activity;
        this.f414649e = bundle;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent(this.f414648d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d.class);
        intent.putExtra("pwd", this.f414649e.getString("key_pwd1"));
        intent.putExtra("key_scene", 1);
        android.app.Activity activity = this.f414648d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
