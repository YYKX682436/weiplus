package wj1;

/* loaded from: classes14.dex */
public class n implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wj1.c0 f528147a;

    public n(wj1.c0 c0Var) {
        this.f528147a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.j
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581;
        wj1.c0 c0Var = this.f528147a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14943, c0Var.f528109a.f171065e, 4, c0Var.f528109a.f171072o.f463494s);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.jh6();
            lVar.f152198b = new r45.kh6();
            lVar.f152199c = "/cgi-bin/mmbiz-bin/userdata/submitauthorizeuserid";
            lVar.f152200d = 1721;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            r45.jh6 jh6Var = (r45.jh6) a17.f152243a.f152217a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = c0Var.f528109a;
            jh6Var.f459347d = activityC12702xc32382a5.f171065e;
            jh6Var.f459348e = activityC12702xc32382a5.f171074q;
            jh6Var.f459349f = str;
            jh6Var.f459350g = activityC12702xc32382a5.f171072o.f463494s;
            int i17 = activityC12702xc32382a5.f171079v;
            if ((i17 == 1 || i17 == 2) && (c12542x3a17e581 = activityC12702xc32382a5.A) != null && !c12542x3a17e581.f168939n) {
                java.lang.String str2 = c12542x3a17e581.f168932d;
                if (str2 == null) {
                    str2 = "";
                }
                jh6Var.f459351h = str2;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC12702xc32382a5.f171083z;
            if (u3Var != null && !u3Var.isShowing()) {
                c0Var.f528109a.f171083z.show();
            }
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).Ai(a17, new wj1.m(this, str), c0Var.f528109a.m78765xba1c74cd());
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a52 = c0Var.f528109a;
            int i18 = activityC12702xc32382a52.f171079v;
            if (i18 == 1 || i18 == 2) {
                activityC12702xc32382a52.setResult(0);
                c0Var.f528109a.finish();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "verifyOk:%b", java.lang.Boolean.valueOf(z17));
    }
}
