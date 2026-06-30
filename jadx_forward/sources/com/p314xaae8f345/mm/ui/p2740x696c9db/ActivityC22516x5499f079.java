package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.NewTaskUI */
/* loaded from: classes14.dex */
public class ActivityC22516x5499f079 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22516x5499f079 f291666i;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f291667e = null;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.i5 f291668f = new com.p314xaae8f345.mm.ui.p2740x696c9db.i5();

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f291669g = null;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f291670h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.ui.tools.NewTaskUI.1
        {
            this.f39173x3fe91575 = -1399051904;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x46542370) {
            am.gj gjVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x465423702 = c5690x46542370;
            if (c5690x465423702 == null || (gjVar = c5690x465423702.f136016g) == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTaskUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f88301a, gjVar.f88302b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f88301a);
            intent.putExtra("key_disaster_url", gjVar.f88302b);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/tools/NewTaskUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/tools/NewTaskUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTaskUI", "onCreate :%d", java.lang.Integer.valueOf(hashCode()));
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569701j3);
        c01.d9.e().a(701, this);
        c01.d9.e().a(252, this);
        f291666i = this;
        com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = new com.p314xaae8f345.mm.p957x53236a1b.v0(0, "", "", "");
        c01.d9.e().g(v0Var);
        this.f291669g = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.gic), true, true, new com.p314xaae8f345.mm.ui.p2740x696c9db.w7(this, v0Var));
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTaskUI", "onDestroy :%d", java.lang.Integer.valueOf(hashCode()));
        if (equals(f291666i)) {
            f291666i = null;
        }
        android.app.ProgressDialog progressDialog = this.f291669g;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f291669g.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db c21463x46cf9db = this.f291667e;
        if (c21463x46cf9db != null && (j0Var = c21463x46cf9db.f278731n) != null) {
            j0Var.dismiss();
            c21463x46cf9db.f278731n = null;
        }
        c01.d9.e().q(701, this);
        c01.d9.e().q(252, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f291670h.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f291670h.mo48813x58998cd();
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTaskUI", "onSceneEnd :%d  [%d,%d,%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f291669g;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f291669g.dismiss();
        }
        if (i17 == 4 && i18 == -3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTaskUI", "summerauth MM_ERR_PASSWORD need kick out acc ready[%b]", java.lang.Boolean.valueOf(gm0.j1.a()));
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d.a(f291666i, i17, i18, new android.content.Intent().setClass(f291666i, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str)) {
                return;
            }
        }
        if (i17 != 4 || (i18 != -6 && i18 != -311 && i18 != -310)) {
            f291666i = null;
            finish();
            return;
        }
        boolean z17 = m1Var instanceof com.p314xaae8f345.mm.p957x53236a1b.v0;
        com.p314xaae8f345.mm.ui.p2740x696c9db.i5 i5Var = this.f291668f;
        if (z17) {
            com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = (com.p314xaae8f345.mm.p957x53236a1b.v0) m1Var;
            i5Var.f292017e = v0Var.N();
            i5Var.f292016d = v0Var.K();
            i5Var.f292014b = v0Var.M();
            i5Var.f292015c = v0Var.L();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTaskUI", "onSceneEnd dkwt imgSid:" + i5Var.f292014b + " img len" + i5Var.f292016d.length + " " + fp.k.c());
        }
        if (this.f291667e == null) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.i5 i5Var2 = this.f291668f;
            this.f291667e = bb5.j.a(this, com.p314xaae8f345.mm.R.C30867xcad56011.hxl, i5Var2.f292017e, i5Var2.f292016d, i5Var2.f292014b, i5Var2.f292015c, new com.p314xaae8f345.mm.ui.p2740x696c9db.y7(this), new com.p314xaae8f345.mm.ui.p2740x696c9db.z7(this), new com.p314xaae8f345.mm.ui.p2740x696c9db.a8(this), i5Var2);
        } else {
            java.lang.String str2 = i5Var.f292014b;
            int length = i5Var.f292016d.length;
            fp.k.c();
            this.f291667e.b(i5Var.f292017e, i5Var.f292016d, i5Var.f292014b, i5Var.f292015c);
        }
    }
}
