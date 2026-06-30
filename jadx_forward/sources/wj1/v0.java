package wj1;

/* loaded from: classes14.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45 f528172d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45 c12703xefb74f45) {
        this.f528172d = c12703xefb74f45;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "verify sms click");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45 c12703xefb74f45 = this.f528172d;
        wj1.m0 m0Var = c12703xefb74f45.f171084d;
        if (m0Var != null) {
            java.lang.String obj = c12703xefb74f45.f171094q.m78956xfb85ada3().toString();
            r45.jc jcVar = c12703xefb74f45.f171086f;
            wj1.c0 c0Var = (wj1.c0) m0Var;
            c0Var.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "verifyCode is null, err, return");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "verifySms");
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = new r45.by6();
                lVar.f152198b = new r45.cy6();
                lVar.f152199c = "/cgi-bin/mmbiz-bin/userdata/verifysmscode";
                lVar.f152200d = 1721;
                lVar.f152201e = 0;
                lVar.f152202f = 0;
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                r45.by6 by6Var = (r45.by6) a17.f152243a.f152217a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = c0Var.f528109a;
                by6Var.f452683d = activityC12702xc32382a5.f171065e;
                by6Var.f452684e = activityC12702xc32382a5.f171074q;
                by6Var.f452685f = activityC12702xc32382a5.f171076s;
                by6Var.f452686g = jcVar.f459225d;
                by6Var.f452687h = activityC12702xc32382a5.f171072o.f463494s;
                by6Var.f452688i = obj;
                by6Var.f452689m = activityC12702xc32382a5.f171077t;
                by6Var.f452690n = jcVar.f459227f;
                int i17 = activityC12702xc32382a5.f171079v;
                if ((i17 == 1 || i17 == 2) && (c12542x3a17e581 = activityC12702xc32382a5.A) != null && !c12542x3a17e581.f168939n) {
                    java.lang.String str = c12542x3a17e581.f168932d;
                    if (str == null) {
                        str = "";
                    }
                    by6Var.f452691o = str;
                }
                ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).Ai(a17, new wj1.p(c0Var), activityC12702xc32382a5.m78765xba1c74cd());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
