package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class aa implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 f145569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145570b;

    public aa(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0, java.lang.String str) {
        this.f145569a = activityC10359x5d5d51f0;
        this.f145570b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = 447;
        objArr[1] = java.lang.Integer.valueOf(fVar.f152149b);
        objArr[2] = java.lang.Integer.valueOf(fVar.f152148a);
        java.lang.String str = fVar.f152150c;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", objArr);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0 = this.f145569a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC10359x5d5d51f0.f145411n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC10359x5d5d51f0.mo55332x76847179();
            java.lang.String str2 = fVar.f152150c;
            java.lang.String string = activityC10359x5d5d51f0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574941k22);
            if (str2 == null) {
                str2 = string;
            }
            db5.e1.s(mo55332x76847179, str2, activityC10359x5d5d51f0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
            return null;
        }
        java.util.ArrayList arrayList = activityC10359x5d5d51f0.f145410m;
        java.util.Iterator it = arrayList.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.z3) next).d1().equals(this.f145570b)) {
                it.remove();
            }
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb.C10384xdee394bd W6 = activityC10359x5d5d51f0.W6();
        if (W6 == null) {
            return null;
        }
        W6.N(arrayList);
        return null;
    }
}
