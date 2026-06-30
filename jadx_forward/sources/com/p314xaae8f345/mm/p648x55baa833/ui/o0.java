package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class o0 implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f145933a;

    public o0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5) {
        this.f145933a = activityC10332x8a1129f5;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        tm.a b17 = tm.a.b(str);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f145933a;
        if (b17 != null) {
            b17.c(activityC10332x8a1129f5, null, null);
            return;
        }
        if (i18 == -66) {
            db5.e1.s(activityC10332x8a1129f5, activityC10332x8a1129f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bo_), activityC10332x8a1129f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
        } else {
            java.lang.String string = activityC10332x8a1129f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.boa);
            if (str == null) {
                str = string;
            }
            db5.e1.s(activityC10332x8a1129f5, str, activityC10332x8a1129f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
        }
        activityC10332x8a1129f5.d1();
        activityC10332x8a1129f5.Z0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionCallbackFunc", "[delChatroomMember] onResult errType:%s errCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
