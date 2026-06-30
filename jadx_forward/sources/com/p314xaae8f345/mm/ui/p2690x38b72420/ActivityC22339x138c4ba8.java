package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.VoipAddressUI */
/* loaded from: classes11.dex */
public class ActivityC22339x138c4ba8 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public java.util.List C;
    public boolean D = false;
    public boolean E = false;
    public java.lang.String F = "";
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d G = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.ui.contact.VoipAddressUI.1
        {
            this.f39173x3fe91575 = -797557590;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
            int i17 = c6231x4f3054ba.f136478g.f89948b;
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22339x138c4ba8 activityC22339x138c4ba8 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22339x138c4ba8.this;
            if (i17 == 7) {
                activityC22339x138c4ba8.finish();
                return false;
            }
            if (i17 != 8) {
                return false;
            }
            activityC22339x138c4ba8.finish();
            return false;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static void y7(android.content.Context context) {
        boolean z17 = 1 == com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VOIPCallType"), 0) ? 1 : 0;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22339x138c4ba8.class);
        intent.putExtra("Add_address_titile", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
        intent.putExtra("voip_video", z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/contact/VoipAddressUI", "inviteVoip", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/contact/VoipAddressUI", "inviteVoip", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11034, 1, java.lang.Integer.valueOf(!z17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.i0 i0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.i0();
        i0Var.f288295b = true;
        i0Var.f288294a = true;
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.h0(this, this.C, true, false, i0Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.f5(this, this.C, false, this.A);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        return new int[]{131072};
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        java.lang.String stringExtra = getIntent().getStringExtra("Add_address_titile");
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx) : stringExtra;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d) this.f287979d.getAdapter().getItem(i17);
        if (dVar == null || (str = dVar.f288383s) == null) {
            return;
        }
        this.F = str;
        if (this.E) {
            x7();
        } else {
            w7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        java.lang.String stringExtra = getIntent().getStringExtra("LauncherUI.Shortcut.LaunchType");
        this.E = getIntent().getBooleanExtra("voip_video", true);
        if (stringExtra != null) {
            this.D = true;
            if (stringExtra.equals("launch_type_voip")) {
                this.E = true;
            } else if (stringExtra.equals("launch_type_voip_audio")) {
                this.E = false;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.C = arrayList;
        arrayList.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b());
        this.C.addAll(c01.e2.i());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.G.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.G.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipAddressUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipAddressUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 19) {
            if (i17 != 82) {
                return;
            }
            if (iArr[0] == 0) {
                w7();
                return;
            } else {
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.ui.p2690x38b72420.nc(this), null);
                return;
            }
        }
        if (iArr[0] == 0) {
            x7();
            return;
        }
        int i18 = "android.permission.CAMERA".equals(strArr[0]) ? com.p314xaae8f345.mm.R.C30867xcad56011.hh8 : com.p314xaae8f345.mm.R.C30867xcad56011.hhn;
        if (iArr[0] == 0) {
            return;
        }
        db5.e1.C(this, getString(i18), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.ui.p2690x38b72420.lc(this), new com.p314xaae8f345.mm.ui.p2690x38b72420.mc(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void p7() {
        if (this.D) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
            intent.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/VoipAddressUI", "onBackBtnPress", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/contact/VoipAddressUI", "onBackBtnPress", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        mo48674x36654fab();
        finish();
    }

    public void w7() {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.RECORD_AUDIO", 82, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), this);
        if (a17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
            am.y00 y00Var = c6231x4f3054ba.f136478g;
            y00Var.f89948b = 5;
            y00Var.f89951e = this.F;
            y00Var.f89950d = this;
            int i17 = this.D ? 2 : 1;
            y00Var.f89952f = 3;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11033, java.lang.Integer.valueOf(i17), 2, 0);
            c6231x4f3054ba.e();
            mo48674x36654fab();
        }
    }

    public final void x7() {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.CAMERA", 19, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), this);
        if (a17) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a18 = j35.u.a(this, "android.permission.RECORD_AUDIO", 19, "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", java.lang.Boolean.valueOf(a18), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), this);
            if (a18) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
                am.y00 y00Var = c6231x4f3054ba.f136478g;
                y00Var.f89948b = 5;
                y00Var.f89951e = this.F;
                y00Var.f89950d = this;
                int i17 = this.D ? 2 : 1;
                y00Var.f89952f = 2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11033, java.lang.Integer.valueOf(i17), 1, 0);
                c6231x4f3054ba.e();
                mo48674x36654fab();
            }
        }
    }
}
