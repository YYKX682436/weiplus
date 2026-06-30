package qe5;

/* loaded from: classes12.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z f443705d;

    public q(qe5.z zVar) {
        this.f443705d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        qe5.z zVar = this.f443705d;
        if (zVar.f443756e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FileDownLoadBasicUIC", "onDownLoadImpl hasTryOpen");
            return;
        }
        boolean z17 = true;
        zVar.f443756e = true;
        kd5.e V6 = zVar.V6();
        if (V6 == null || (str = V6.f388426x) == null) {
            str = "";
        }
        kd5.e V62 = zVar.V6();
        java.lang.Integer valueOf = V62 != null ? java.lang.Integer.valueOf(V62.f388422t) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.File.FileDownLoadBasicUIC", "onDownLoadImpl appDataType = " + valueOf);
        if (valueOf == null || valueOf.intValue() != 0) {
            if ((((valueOf != null && valueOf.intValue() == 74) || (valueOf != null && valueOf.intValue() == 130)) || (valueOf != null && valueOf.intValue() == 131)) || (valueOf != null && valueOf.intValue() == 6)) {
                zVar.l7(str, valueOf.intValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FileDownLoadBasicUIC", "onDownLoadImpl");
            } else if (valueOf != null && valueOf.intValue() == 2) {
                if (zVar.Y6()) {
                    z17 = false;
                } else {
                    j75.f Q6 = zVar.Q6();
                    if (Q6 != null) {
                        Q6.B3(new kd5.q());
                    }
                }
                if (!z17) {
                    zVar.k7();
                }
            } else if (valueOf != null && valueOf.intValue() == 7) {
                android.content.Intent intent = new android.content.Intent();
                kd5.e V63 = zVar.V6();
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = V63 != null ? V63.f388410e : null;
                intent.putExtra("App_MsgId", f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
                intent.putExtra("App_MsgTalker", f9Var != null ? f9Var.Q0() : null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = zVar.P6();
                if (P6 != null) {
                    P6.setResult(-1, intent);
                    P6.finish();
                }
            } else {
                zVar.f7(0);
                j75.f Q62 = zVar.Q6();
                if (Q62 != null) {
                    Q62.B3(new kd5.w());
                }
                zVar.g7(8);
            }
        } else if (!zVar.l7(str, valueOf.intValue())) {
            zVar.g7(8);
            zVar.W6().c().setVisibility(8);
            kd5.e V64 = zVar.V6();
            java.lang.String str2 = V64 != null ? V64.f388426x : null;
            ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
            java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.e(str2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getMimeTypeByExt(...)");
            if (x51.t1.b(e17)) {
                zVar.W6().h().setVisibility(8);
                zVar.f7(8);
            } else {
                zVar.f7(0);
                j75.f Q63 = zVar.Q6();
                if (Q63 != null) {
                    Q63.B3(new kd5.w());
                }
            }
            zVar.i7();
        }
        j75.f Q64 = zVar.Q6();
        if (Q64 != null) {
            Q64.B3(new kd5.q());
        }
    }
}
