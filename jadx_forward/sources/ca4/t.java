package ca4;

/* loaded from: classes15.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f121549d;

    public t(ca4.b0 b0Var) {
        this.f121549d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/data/SnsAdQRHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdQRHelper", "createQRCodeMenuItem, onClick");
        ca4.b0 b0Var = this.f121549d;
        if (ca4.b0.a(b0Var) != null && ca4.b0.a(b0Var).i()) {
            ca4.b0.a(b0Var).u();
        }
        android.content.Intent intent = new android.content.Intent(ca4.b0.b(b0Var), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18009xc0007d67.class);
        intent.putExtra("action_type", 1);
        intent.putExtra("qrcodeStr", ca4.b0.c(b0Var));
        intent.putExtra("qrcodeType", ca4.b0.d(b0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        int i17 = b0Var.f121364e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        intent.putExtra("qrcodeVer", i17);
        intent.putExtra("aid", ca4.b0.e(b0Var).c());
        intent.putExtra("ad_scene", ca4.b0.e(b0Var).l());
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 11);
        android.content.Context b17 = ca4.b0.b(b0Var);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        b17.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(b17, "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (ca4.b0.b(b0Var) instanceof android.app.Activity) {
            ((android.app.Activity) ca4.b0.b(b0Var)).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        }
        b0Var.p(ca4.b0.c(b0Var), !android.text.TextUtils.isEmpty(ca4.b0.c(b0Var)));
        b0Var.m();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$3");
    }
}
