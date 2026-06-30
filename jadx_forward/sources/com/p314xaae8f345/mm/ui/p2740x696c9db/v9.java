package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class v9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f292380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f292381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.u9 f292382f;

    public v9(com.p314xaae8f345.mm.ui.p2740x696c9db.u9 u9Var, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, android.graphics.Bitmap bitmap) {
        this.f292382f = u9Var;
        this.f292380d = c11286x34a5504;
        this.f292381e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "load image from url success");
        android.graphics.Bitmap bitmap = this.f292381e;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f292380d;
        c11286x34a5504.m48468xb4dcc327(bitmap);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
        req.f32866x7fa0d2de = null;
        req.f33049x38eb0007 = c11286x34a5504;
        android.os.Bundle bundle = new android.os.Bundle();
        req.mo48427x792022dd(bundle);
        bundle.putInt(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a);
        bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8, "com.tencent.mm.openapi");
        com.p314xaae8f345.mm.ui.p2740x696c9db.u9 u9Var = this.f292382f;
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18 = u9Var.f292351b;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC22523xb066d18.mo55332x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.f291684w;
        android.content.Intent o76 = activityC22523xb066d18.o7(mo55332x76847179, com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.class);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d182 = u9Var.f292351b;
        o76.putExtra("Select_Conv_NextStep", activityC22523xb066d182.o7(activityC22523xb066d182.mo55332x76847179(), com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.class).putExtras(bundle).putExtra("animation_pop_in", true));
        o76.addFlags(268435456).addFlags(32768);
        u9Var.f292351b.d7(o76);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d183 = u9Var.f292351b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(o76);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC22523xb066d183, arrayList.toArray(), "com/tencent/mm/ui/tools/ShareImgUI$8$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC22523xb066d183.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC22523xb066d183, "com/tencent/mm/ui/tools/ShareImgUI$8$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        u9Var.f292351b.finish();
    }
}
