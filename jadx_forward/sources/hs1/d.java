package hs1;

/* loaded from: classes4.dex */
public class d implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f366098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f366099e;

    public d(java.util.LinkedList linkedList, java.util.List list) {
        this.f366098d = linkedList;
        this.f366099e = list;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.r9 r9Var = (r45.r9) oVar.f152244b.f152233a;
        java.util.LinkedList linkedList = this.f366098d;
        if (i17 != 0 || i18 != 0 || r9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Preload.BizAppMsgReportMgr", "[report batch]reportList:%d fail", java.lang.Integer.valueOf(linkedList.size()));
            ax4.a.a(55);
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.BizAppMsgReportMgr", "[report batch]reportList:%d", java.lang.Integer.valueOf(linkedList.size()));
        ax4.a.a(54);
        yq1.u0.wi().z0(this.f366099e);
        return 0;
    }
}
