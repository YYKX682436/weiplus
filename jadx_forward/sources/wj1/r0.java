package wj1;

/* loaded from: classes14.dex */
public class r0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj1.t0 f528164d;

    public r0(wj1.t0 t0Var) {
        this.f528164d = t0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581;
        wj1.t0 t0Var = this.f528164d;
        t0Var.f528168d.f171094q.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "sendSms click");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45 c12703xefb74f45 = t0Var.f528168d;
        wj1.m0 m0Var = c12703xefb74f45.f171084d;
        if (m0Var != null) {
            r45.jc jcVar = c12703xefb74f45.f171086f;
            wj1.c0 c0Var = (wj1.c0) m0Var;
            c0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = c0Var.f528109a;
            g0Var.d(14943, activityC12702xc32382a5.f171065e, 7, activityC12702xc32382a5.f171072o.f463494s);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "sendSms");
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.qz5();
            lVar.f152198b = new r45.rz5();
            lVar.f152199c = "/cgi-bin/mmbiz-bin/userdata/sendsms";
            lVar.f152200d = 1762;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            r45.qz5 qz5Var = (r45.qz5) a17.f152243a.f152217a;
            qz5Var.f465907d = activityC12702xc32382a5.f171065e;
            qz5Var.f465908e = activityC12702xc32382a5.f171074q;
            qz5Var.f465909f = activityC12702xc32382a5.f171076s;
            qz5Var.f465910g = jcVar.f459225d;
            qz5Var.f465912i = jcVar.f459227f;
            qz5Var.f465911h = activityC12702xc32382a5.f171072o.f463494s;
            int i18 = activityC12702xc32382a5.f171079v;
            if ((i18 == 1 || i18 == 2) && (c12542x3a17e581 = activityC12702xc32382a5.A) != null && !c12542x3a17e581.f168939n) {
                java.lang.String str = c12542x3a17e581.f168932d;
                if (str == null) {
                    str = "";
                }
                qz5Var.f465913m = str;
            }
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).Ai(a17, new wj1.o(c0Var), activityC12702xc32382a5.m78765xba1c74cd());
        }
    }
}
