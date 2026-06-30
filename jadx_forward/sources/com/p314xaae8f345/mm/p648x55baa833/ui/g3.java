package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public final class g3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 f145706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145707b;

    public g3(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 activityC10343x243c08b1, java.lang.String str) {
        this.f145706a = activityC10343x243c08b1;
        this.f145707b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 activityC10343x243c08b1 = this.f145706a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC10343x243c08b1.f145298i;
        if (u3Var != null && u3Var.isShowing()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = activityC10343x243c08b1.f145298i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u3Var2);
            u3Var2.dismiss();
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1.U6(activityC10343x243c08b1, this.f145707b);
            return null;
        }
        if (fVar.f152152e.mo808xfb85f7b0() != 259) {
            return null;
        }
        int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1.f145292q;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = 774;
        objArr[1] = java.lang.Integer.valueOf(fVar.f152149b);
        objArr[2] = java.lang.Integer.valueOf(fVar.f152148a);
        java.lang.String str = fVar.f152150c;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupAdminManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", objArr);
        db5.e1.s(activityC10343x243c08b1.mo55332x76847179(), activityC10343x243c08b1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bo6), activityC10343x243c08b1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
        return null;
    }
}
