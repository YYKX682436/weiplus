package qw3;

/* loaded from: classes4.dex */
public class p0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17104xbfbb140e f448722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17104xbfbb140e activityC17104xbfbb140e) {
        super(false);
        this.f448722d = activityC17104xbfbb140e;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitDetailUI", "click finish btn");
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.ui.LauncherUI"));
        intent.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17104xbfbb140e activityC17104xbfbb140e = this.f448722d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC17104xbfbb140e, arrayList.toArray(), "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17104xbfbb140e.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC17104xbfbb140e, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailUI$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
