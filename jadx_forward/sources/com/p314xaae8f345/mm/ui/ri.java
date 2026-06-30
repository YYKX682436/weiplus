package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class ri implements j41.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f291280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 f291281b;

    public ri(com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2, android.content.Context context) {
        this.f291281b = activityC21437xf483c2;
        this.f291280a = context;
    }

    @Override // j41.x
    public void a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleChatInfoUI", "doCloseConversation success");
        android.content.Context context = this.f291280a;
        db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hep), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.ui.qi qiVar = new com.p314xaae8f345.mm.ui.qi(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(qiVar, 2000L, false);
    }

    @Override // j41.x
    public void b(int i17, int i18, int i19, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SingleChatInfoUI", "doCloseConversation failed errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        android.content.Context context = this.f291280a;
        db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hen), com.p314xaae8f345.mm.R.raw.f79502x48ef2959);
    }
}
