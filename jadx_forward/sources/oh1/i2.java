package oh1;

/* loaded from: classes4.dex */
public class i2 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f426763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f426764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oh1.j2 f426765f;

    public i2(oh1.j2 j2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this.f426765f = j2Var;
        this.f426763d = linkedList;
        this.f426764e = linkedList2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        r45.bd3 bd3Var = (r45.bd3) oVar.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaUpdateableMsgService", "GetChatToolMsg errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        oh1.j2 j2Var = this.f426765f;
        if (i17 != 0 || i18 != 0 || (linkedList = bd3Var.f452208d) == null || linkedList.size() <= 0) {
            if (i17 != 4) {
                return 0;
            }
            oh1.j2.e(j2Var, this.f426763d, this.f426764e);
            oh1.j2.f(j2Var);
            return 0;
        }
        java.util.LinkedList linkedList2 = bd3Var.f452208d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaUpdateableMsgService", "GetChatToolMsg response.updatable_msg_list.size:%d", java.lang.Integer.valueOf(linkedList2.size()));
        oh1.j2.a(j2Var, linkedList2);
        oh1.j2.b(j2Var, linkedList2, 1);
        oh1.j2.d(j2Var, linkedList2);
        j2Var.h();
        return 0;
    }
}
