package oh1;

/* loaded from: classes4.dex */
public class h2 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f426759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f426760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oh1.j2 f426761f;

    public h2(oh1.j2 j2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f426761f = j2Var;
        this.f426759d = linkedList;
        this.f426760e = linkedList2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        r45.up3 up3Var = (r45.up3) oVar.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaUpdateableMsgService", "getUpdateableMsg errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        oh1.j2 j2Var = this.f426761f;
        if (i17 == 0 && i18 == 0 && (linkedList = up3Var.f469079d) != null && linkedList.size() > 0) {
            java.util.LinkedList linkedList2 = up3Var.f469079d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaUpdateableMsgService", "getUpdateableMsg response.updatable_msg_list.size:%d", java.lang.Integer.valueOf(linkedList2.size()));
            oh1.j2.a(j2Var, linkedList2);
            oh1.j2.b(j2Var, linkedList2, 0);
            oh1.j2.d(j2Var, linkedList2);
            j2Var.h();
        } else if (i17 == 4) {
            oh1.j2.e(j2Var, this.f426759d, this.f426760e);
            oh1.j2.f(j2Var);
        }
        return 0;
    }
}
