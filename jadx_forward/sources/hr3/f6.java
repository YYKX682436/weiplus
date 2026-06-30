package hr3;

/* loaded from: classes.dex */
public class f6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f365076e;

    public f6(hr3.t6 t6Var, java.lang.String str) {
        this.f365076e = t6Var;
        this.f365075d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + this.f365075d));
        hr3.t6 t6Var = this.f365076e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(t6Var.f365535d, intent, true, false)) {
            try {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = t6Var.f365535d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo$16", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo$16", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContactWidgetBizInfo", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
