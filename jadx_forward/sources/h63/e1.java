package h63;

/* loaded from: classes7.dex */
public final class e1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h63.z0 f360759a;

    public e1(h63.z0 z0Var) {
        this.f360759a = z0Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.util.List<r45.rz1> list = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(list, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.protocal.protobuf.FinderLiveMemberListInfo>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.rz1 rz1Var : list) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16056x72b57895 c16056x72b57895 = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16056x72b57895(null, 0);
            c16056x72b57895.f223558d = rz1Var.m75945x2fec8307(0);
            c16056x72b57895.f223559e = rz1Var.m75939xb282bd08(1);
            arrayList.add(c16056x72b57895);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16055x610e3697 c16055x610e3697 = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16055x610e3697(null);
        c16055x610e3697.f223557d = arrayList;
        p60.p pVar = (p60.p) this.f360759a;
        pVar.getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = pVar.f433724a;
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433701d, null, 0, c16055x610e3697, 6, null));
        }
    }
}
