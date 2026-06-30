package com.tencent.mm.plugin.base.stub;

/* loaded from: classes8.dex */
public class a1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f93718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXEntryActivity f93719e;

    public a1(com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity, com.tencent.mm.modelbase.m1 m1Var) {
        this.f93719e = wXEntryActivity;
        this.f93718d = m1Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "callback() called with: errType = [" + i17 + "], errCode = [" + i18 + "], errMsg = [" + str + "], rr = [" + oVar + "], scene = [" + m1Var + "]");
        com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity = this.f93719e;
        if (wXEntryActivity.f93701v.get() != null && !((com.tencent.mm.plugin.base.stub.WXEntryActivity) wXEntryActivity.f93701v.get()).isFinishing()) {
            ((com.tencent.mm.plugin.base.stub.WXEntryActivity) wXEntryActivity.f93701v.get()).d7();
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity2 = (com.tencent.mm.plugin.base.stub.WXEntryActivity) wXEntryActivity.f93701v.get();
                wXEntryActivity2.getClass();
                r45.ib0 ib0Var = (r45.ib0) oVar.f70711b.f70700a;
                if (ib0Var != null) {
                    java.util.LinkedList linkedList = ib0Var.f376898d;
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                        c01.n2.d().c("kWXEntryActivity_data_center_session_id", true).i("kWXEntryActivity_data_center_wework_msg_list", linkedList);
                        wXEntryActivity2.b7(this.f93718d, null);
                        return 0;
                    }
                }
                wXEntryActivity2.l7("");
                return 0;
            }
            ((com.tencent.mm.plugin.base.stub.WXEntryActivity) wXEntryActivity.f93701v.get()).h7(i17, i18, str);
        }
        return 0;
    }
}
