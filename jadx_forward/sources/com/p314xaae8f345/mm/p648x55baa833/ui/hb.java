package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class hb implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f145744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 f145745b;

    public hb(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 activityC10364x5bffdef3, java.util.LinkedList linkedList) {
        this.f145745b = activityC10364x5bffdef3;
        this.f145744a = linkedList;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 activityC10364x5bffdef3 = this.f145745b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC10364x5bffdef3.f145466h;
        if (u3Var != null && u3Var.isShowing()) {
            activityC10364x5bffdef3.f145466h.dismiss();
        }
        tm.a b17 = tm.a.b(fVar.f152150c);
        if (b17 != null) {
            b17.c(activityC10364x5bffdef3, null, null);
        } else if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3.T6(activityC10364x5bffdef3, this.f145744a);
            activityC10364x5bffdef3.f145465g.notifyDataSetChanged();
        } else if (fVar.f152152e.mo808xfb85f7b0() == 3677) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = 774;
            objArr[1] = java.lang.Integer.valueOf(fVar.f152149b);
            objArr[2] = java.lang.Integer.valueOf(fVar.f152148a);
            java.lang.String str = fVar.f152150c;
            if (str == null) {
                str = "";
            }
            objArr[3] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", objArr);
            db5.e1.s(activityC10364x5bffdef3.mo55332x76847179(), activityC10364x5bffdef3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bo6), activityC10364x5bffdef3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
        }
        return null;
    }
}
