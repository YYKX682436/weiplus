package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class va implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.wa f64607a;

    public va(com.tencent.mm.chatroom.ui.wa waVar) {
        this.f64607a = waVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI = this.f64607a.f64623d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = seeAccessVerifyInfoUI.E;
        if (u3Var != null && u3Var.isShowing()) {
            seeAccessVerifyInfoUI.E.dismiss();
        }
        tm.a b17 = tm.a.b(fVar.f70617c);
        if (b17 != null) {
            b17.c(seeAccessVerifyInfoUI, null, null);
        } else if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            if (fVar.f70619e.getType() == 774) {
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(seeAccessVerifyInfoUI.f63920s, seeAccessVerifyInfoUI.f63919r);
                Li.l1(Li.F | 128);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(Li.I0(), Li);
                seeAccessVerifyInfoUI.C.setBackgroundResource(com.tencent.mm.R.drawable.f481063jr);
                seeAccessVerifyInfoUI.C.setTextColor(seeAccessVerifyInfoUI.getResources().getColor(com.tencent.mm.R.color.f479217t5));
                seeAccessVerifyInfoUI.C.setText(seeAccessVerifyInfoUI.getString(com.tencent.mm.R.string.f492273fw3));
                seeAccessVerifyInfoUI.C.setEnabled(false);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 23L, 1L, true);
            }
        } else if (fVar.f70619e.getType() == 774) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = 774;
            objArr[1] = java.lang.Integer.valueOf(fVar.f70616b);
            objArr[2] = java.lang.Integer.valueOf(fVar.f70615a);
            java.lang.String str = fVar.f70617c;
            if (str == null) {
                str = "";
            }
            objArr[3] = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.SeeAccessVerifyInfoUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", objArr);
            db5.e1.s(seeAccessVerifyInfoUI.getContext(), seeAccessVerifyInfoUI.getString(com.tencent.mm.R.string.f489795bw), seeAccessVerifyInfoUI.getString(com.tencent.mm.R.string.f490573yv));
        }
        return null;
    }
}
