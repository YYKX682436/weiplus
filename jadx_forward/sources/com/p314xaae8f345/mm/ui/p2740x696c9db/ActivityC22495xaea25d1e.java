package com.p314xaae8f345.mm.ui.p2740x696c9db;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI */
/* loaded from: classes11.dex */
public class ActivityC22495xaea25d1e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22495xaea25d1e f291492d;

    public static void T6(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22495xaea25d1e activityC22495xaea25d1e) {
        activityC22495xaea25d1e.finish();
        android.content.Intent intent = new android.content.Intent(activityC22495xaea25d1e.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
        intent.putExtra("Intro_Switch", true).addFlags(67108864);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC22495xaea25d1e.mo55332x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/ui/tools/AccountDeletedAlphaAlertUI", "kickOff", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/ui/tools/AccountDeletedAlphaAlertUI", "kickOff", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        f291492d = this;
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5177x8d056a0c().e();
        gm0.m.o();
        tm.a b17 = tm.a.b(getIntent().getStringExtra("errmsg"));
        if (b17 != null) {
            b17.c(this, new com.p314xaae8f345.mm.ui.p2740x696c9db.a(this), null);
        } else {
            db5.e1.G(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqm), null, false, new com.p314xaae8f345.mm.ui.p2740x696c9db.b(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (equals(f291492d)) {
            f291492d = null;
        }
        super.onDestroy();
    }
}
