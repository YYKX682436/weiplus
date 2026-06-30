package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public final class i9 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8 f145763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f145764b;

    public i9(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8 activityC10358xb91848f8, java.util.LinkedList linkedList) {
        this.f145763a = activityC10358xb91848f8;
        this.f145764b = linkedList;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p648x55baa833.ui.b9 b9Var = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8.f145388u;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomSpecialFollowMemberManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", objArr);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8 activityC10358xb91848f8 = this.f145763a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC10358xb91848f8.f145397o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8.T6(activityC10358xb91848f8, this.f145764b);
            return null;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC10358xb91848f8.mo55332x76847179();
        java.lang.String str2 = fVar.f152150c;
        java.lang.String string = activityC10358xb91848f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574941k22);
        if (str2 == null) {
            str2 = string;
        }
        db5.e1.s(mo55332x76847179, str2, activityC10358xb91848f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
        return null;
    }
}
