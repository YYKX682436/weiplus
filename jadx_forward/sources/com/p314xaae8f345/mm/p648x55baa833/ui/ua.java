package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class ua implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.wa f146113a;

    public ua(com.p314xaae8f345.mm.p648x55baa833.ui.wa waVar) {
        this.f146113a = waVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 activityC10362xd5e3feb2 = this.f146113a.f146156d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC10362xd5e3feb2.E;
        if (u3Var != null && u3Var.isShowing()) {
            activityC10362xd5e3feb2.E.dismiss();
        }
        tm.a b17 = tm.a.b(fVar.f152150c);
        if (b17 != null) {
            b17.c(activityC10362xd5e3feb2, null, null);
        } else if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            if (fVar.f152152e.mo808xfb85f7b0() == 941) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(activityC10362xd5e3feb2.f145453s, activityC10362xd5e3feb2.f145452r);
                Li.l1(Li.F | 128);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(Li.I0(), Li);
                activityC10362xd5e3feb2.C.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562596jr);
                activityC10362xd5e3feb2.C.setTextColor(activityC10362xd5e3feb2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560750t5));
                activityC10362xd5e3feb2.C.setText(activityC10362xd5e3feb2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573806fw3));
                activityC10362xd5e3feb2.C.setEnabled(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 23L, 1L, true);
            }
        } else if (fVar.f152152e.mo808xfb85f7b0() == 941) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = 941;
            objArr[1] = java.lang.Integer.valueOf(fVar.f152149b);
            objArr[2] = java.lang.Integer.valueOf(fVar.f152148a);
            java.lang.String str = fVar.f152150c;
            if (str == null) {
                str = "";
            }
            objArr[3] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeAccessVerifyInfoUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", objArr);
            db5.e1.s(activityC10362xd5e3feb2.mo55332x76847179(), activityC10362xd5e3feb2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571328bw), activityC10362xd5e3feb2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
        }
        return null;
    }
}
