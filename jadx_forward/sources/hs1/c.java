package hs1;

/* loaded from: classes4.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f366096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.p9 f366097e;

    public c(int i17, r45.p9 p9Var) {
        this.f366096d = i17;
        this.f366097e = p9Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.r9 r9Var = (r45.r9) oVar.f152244b.f152233a;
        int i19 = this.f366096d;
        r45.p9 p9Var = this.f366097e;
        if (i17 == 0 && i18 == 0 && r9Var != null) {
            if (i19 > 0) {
                ax4.a.a(57);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]url:%s", p9Var.f464394d);
            ax4.a.a(51);
        } else if (i18 != 50001) {
            if (i19 > 0) {
                ax4.a.a(58);
            }
            ax4.a.a(52);
            if (yq1.u0.wi().mo880xb970c2b9(new hs1.a(p9Var))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync], insert fail");
            }
        } else if (i19 < 3) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(p9Var);
            com.p314xaae8f345.mm.p944x882e457a.z2.d(hs1.e.a(linkedList, 0).a(), new hs1.c(i19 + 1, p9Var), false);
        } else {
            ax4.a.a(52);
            ax4.a.a(59);
            if (yq1.u0.wi().mo880xb970c2b9(new hs1.a(p9Var))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync]");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.BizAppMsgReportMgr", "[report sync], insert fail");
            }
        }
        return 0;
    }
}
